package cn.pao.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.pao.pojo.TUser;
import cn.pao.service.IAdminUserService;
import cn.pao.service.IUserService;
import cn.pao.util.Md5;
import cn.pao.util.PageBean;

@Controller
public class AdminUserController {
	
	@Autowired
	public IAdminUserService adminUserService;
	
	@RequestMapping("/showUserMsg")
	public ModelAndView showUserMsg(int page) throws Exception{
		PageBean<TUser> pageBean = adminUserService.findUserList(page);
		//System.out.println(userList.size());
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageBean", pageBean);
		mav.setViewName("userManage");
		return mav;
	}
	
	@RequestMapping("/delUser")
	public String delUser(int userId, RedirectAttributes redirectAttributes) throws Exception{
		adminUserService.delUserById(userId);
		redirectAttributes.addAttribute("page", 1);
		return "redirect:/showUserMsg";
	}
	
	@RequestMapping("batchDelUser")
	public String batchDelUser(String userIds, RedirectAttributes redirectAttributes) throws Exception{
		String[] ids = userIds.split(",");
		adminUserService.batchDelUserById(ids);
		redirectAttributes.addAttribute("page", 1);
		return "redirect:/showUserMsg";
	}
	
	//模糊查询
	@RequestMapping("searchUser")
	public ModelAndView searchUser(int page, String userName) throws Exception{
		PageBean<TUser> pageBean = adminUserService.searchUser(page, userName);
		//List<TUser> userList = adminUserService.searchUser(page, userName);
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageBean", pageBean);
		mav.setViewName("userManage");
		return mav;
	}
}
