package cn.pao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pao.service.IOrderService;

@Controller
public class OrderController {
	
	@Autowired
	private IOrderService orderService;


	@RequestMapping("/house_list")
	public String houselist(){
		return null;
		
	}
}
