package com.project.Bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viikko2.exercise2.domain.Friend;


@Controller
public class BookController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String Book(Model model) {
		return null;
		
	}	
	@RequestMapping(value = "/booklist", method = RequestMethod.POST)
	public String friendSubmit(@ModelAttribute Friend name, Model model) {
		
		
		List<Friend> list = new ArrayList<Friend>();		
		list.add(name);
		
		model.addAttribute("friends", list);
		
		return "booklist";
	}
}
