package com.ly.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/goods/")
public class Controllers {
	  @RequestMapping("selectactivity")
	   public String selectactivy(Model moder)
	   {
	
		   return "login";
	   }

}
