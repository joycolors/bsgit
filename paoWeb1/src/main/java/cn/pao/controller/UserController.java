package cn.pao.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.pao.pojo.TUser;
import cn.pao.service.IUserService;
import cn.pao.util.Md5;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/loginPage")
	public ModelAndView loginPage() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("userLogin");
		return modelAndView;
	}
	
	@RequestMapping("/regist")
	public String regist(@RequestParam("user_name")String username, @RequestParam("user_pwd")String password) throws Exception{
		System.out.println(username + "------"+password);
		
		Md5 md5 = new Md5();
		TUser user = new TUser();
		user.setUserName(username);
		user.setUserPwd(md5.EncoderByMd5(password));
		Integer uid = userService.rigist(user);
		return "forward:loginPage.action"; 
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session, @Param("username")String username, @Param("password")String password) throws Exception{
		System.out.println(username + " login " + password);
		TUser user = new TUser();
		user.setUserName(username);
		Md5 md5 = new Md5();
		user.setUserPwd(md5.EncoderByMd5(password));
		//System.out.println(md5.EncoderByMd5(password));
		user = userService.login(user);
		ModelAndView mav = new ModelAndView();
		if(user == null) { 
			mav.addObject("errorMsg", "用户名或密码错误");
			mav.setViewName("userLogin");
			return mav;
		}
		Date last_login_date = user.getUserThisLoginTime();
		//System.out.println(last_login_date);
		Date this_login_date = new Date();
		user.setUserLastLoginTime(last_login_date);
		user.setUserThisLoginTime(this_login_date);
		userService.updateLoginTime(user);
		//mav.addObject("user", user);
		session.setAttribute("user", user);
		mav.setViewName("index");
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/findByUsername",method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String findByUsername(String username) throws Exception {
		//System.out.println(username);
		TUser existUser = userService.findByUsername(username);
		if(existUser != null) {
			//鏌ヨ鍒拌鐢ㄦ埛:鐢ㄦ埛鍚嶅凡瀛樺湪
			return "<font color='red'>用户名已存在</font>";
		}else {
			//娌℃煡鍒拌鐢ㄦ埛:鐢ㄦ埛鍚嶅彲浠ヤ娇鐢�
			//System.out.println(user.getUsername());
			return "<font color='green'>用户名可以使用</font>";
		}
	}
	
	
}
