package com.green.displayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("EEEE 'the' dd 'of' MMMM',' yyyy");
		Date date = new Date();
		System.out.println(format.format(date));
		model.addAttribute("date", format.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm aa");
		Date time = new Date();
		model.addAttribute("time", format.format(time));
		return "time.jsp";
	}
}
