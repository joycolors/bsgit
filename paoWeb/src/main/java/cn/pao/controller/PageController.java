package cn.pao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
 
	@RequestMapping("/")
	public String showIndex(){
		return "login1";
	}
	
/*	@RequestMapping("/house_list")
	public String showHouseList(){
		return "house_list";
	}*/
	
	/*@RequestMapping("/house_edit")
	public String showHouseEdit(){
		return "house_edit";
	}*/
}
