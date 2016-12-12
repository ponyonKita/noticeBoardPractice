package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class SampleController4 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE called but redirect to /doE ........");
		
		rttr.addFlashAttribute("msg", "This is Message!! with redirected");
		return "redict:/doF";
		
	}
	
	@RequestMapping("/doE")
	public void doF(@ModelAttribute String msg){

		logger.info("doF called......." + msg);
		
	}
	

}
