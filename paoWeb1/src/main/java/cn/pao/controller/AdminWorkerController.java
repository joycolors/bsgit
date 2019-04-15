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
import cn.pao.pojo.TWorker;
import cn.pao.service.IAdminUserService;
import cn.pao.service.IAdminWorkerService;
import cn.pao.service.IUserService;
import cn.pao.util.Md5;
import cn.pao.util.PageBean;

@Controller
public class AdminWorkerController {
	
	@Autowired
	public IAdminWorkerService adminWorkerService;
	
	@RequestMapping("/showWorkerMsg")
	public ModelAndView showWorkerMsg(int page) throws Exception{
		System.out.println("page="+page);
		PageBean<TWorker> pageBean = adminWorkerService.findWorkerList(page);
		//System.out.println(userList.size());
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageBean", pageBean);
		mav.setViewName("workerManage");
		return mav;
	}
	
	@RequestMapping("/delWorker")
	public String delWorker(int workerId, RedirectAttributes redirectAttributes) throws Exception{
		adminWorkerService.delWorkerById(workerId);
		redirectAttributes.addAttribute("page", 1);
		return "redirect:/showWorkerMsg";
	}
	
	@RequestMapping("batchDelWorker")
	public String batchDelUser(String workerIds, RedirectAttributes redirectAttributes) throws Exception{
		String[] ids = workerIds.split(",");
		adminWorkerService.batchDelWorkerById(ids);
		redirectAttributes.addAttribute("page", 1);
		return "redirect:/showWorkerMsg";
	}
	
	//模糊查询
	@RequestMapping("searchWorker")
	public ModelAndView searchWorker(int page, String workerName) throws Exception{
		PageBean<TWorker> pageBean = adminWorkerService.searchWorker(page, workerName);
		//List<TUser> userList = adminUserService.searchUser(page, userName);
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageBean", pageBean);
		mav.setViewName("workerManage");
		return mav;
	}
	
	//进入新增飞人用户界面
	@RequestMapping("addWorkerPage")
	public String addWorkerPage() throws Exception {
		return "addWorker";
	}
	
	//注册飞人用户
	@RequestMapping("adminWorkerRegist")
	public String regist(@RequestParam("worker_name")String username, @RequestParam("worker_pwd")String password, RedirectAttributes redirectAttributes) throws Exception{
		//System.out.println(username + "------"+password);
		
		Md5 md5 = new Md5();
		TWorker worker = new TWorker();
		worker.setWorkerName(username);
		worker.setWorkerPwd(md5.EncoderByMd5(password));
		worker.setWorkerCreditsNum(0);
		adminWorkerService.regist(worker);
		redirectAttributes.addAttribute("page", 1);
		return "redirect:/showWorkerMsg";
	}
}
