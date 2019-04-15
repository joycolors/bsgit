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
import cn.pao.pojo.TWorker;
import cn.pao.service.IUserService;
import cn.pao.service.IWorkerService;
import cn.pao.util.Md5;

@Controller
public class WorkerController {
	
	@Autowired
	private IWorkerService workerService;

	@RequestMapping("/workerLoginPage")
	public String loginPage() throws Exception {
		
		return "workerLogin";
	}
	
	@RequestMapping("/workerRegist")
	public String regist(@RequestParam("worker_name")String username, @RequestParam("worker_pwd")String password) throws Exception{
		System.out.println(username + "------"+password);
		
		Md5 md5 = new Md5();
		TWorker worker = new TWorker();
		worker.setWorkerName(username);
		worker.setWorkerPwd(md5.EncoderByMd5(password));
		worker.setWorkerCreditsNum(0);
		Integer wid = workerService.rigist(worker);
		return "forward:workerLoginPage.action";
	}
	
	@RequestMapping("/workerLogin")
	public ModelAndView login(HttpSession session, @Param("workername")String workername, @Param("password")String password) throws Exception{
		System.out.println(workername + " login " + password);
		TWorker worker = new TWorker();
		worker.setWorkerName(workername);
		Md5 md5 = new Md5();
		worker.setWorkerPwd(md5.EncoderByMd5(password));
		//System.out.println(md5.EncoderByMd5(password));
		worker = workerService.login(worker);
		ModelAndView mav = new ModelAndView();
		if(worker == null) { 
			mav.addObject("errorMsg", "用户名或密码错误");
			mav.setViewName("workerLogin");
			return mav;
		}
		Date last_login_date = worker.getWorkerThisLoginTime();
		//System.out.println(last_login_date);
		Date this_login_date = new Date();
		worker.setWorkerLastLoginTime(last_login_date);
		worker.setWorkerThisLoginTime(this_login_date);
		workerService.updateLoginTime(worker);
		//mav.addObject("user", user);
		session.setAttribute("worker", worker);
		mav.setViewName("workerLogin");
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/findByWorkername",method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String findByWorkername(String workername) throws Exception {
		//System.out.println(username);
		TWorker existWorker = workerService.findByWorkername(workername);
		if(existWorker != null) {
			//閺屻儴顕楅崚鎷岊嚉閻€劍鍩�:閻€劍鍩涢崥宥呭嚒鐎涙ê婀�
			return "<font color='red'>用户名已存在</font>";
		}else {
			//濞屸剝鐓￠崚鎷岊嚉閻€劍鍩�:閻€劍鍩涢崥宥呭讲娴犮儰濞囬悽锟�
			//System.out.println(user.getUsername());
			return "<font color='green'>用户名可以使用</font>";
		}
	}
	
	
}
