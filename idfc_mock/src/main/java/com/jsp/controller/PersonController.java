package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.PersonDao;
import com.jsp.dto.PersonDto;



@Controller
public class PersonController {

	@Autowired
	PersonDto personDto;

	@Autowired
	PersonDao personDao;

	@RequestMapping("/insert")
	public ModelAndView insert() {
		ModelAndView modelAndView = new ModelAndView("insert.jsp");
		modelAndView.addObject("key1", personDto);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/inserting")
	public String inserting(PersonDto personDto) {
		personDao.insert(personDto);
		return "yes yes data inserted succesfullyyy......";
	}

	@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView modelAndView = new ModelAndView("fetch.jsp");
		modelAndView.addObject("key2", personDto);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/fetching")
	public ModelAndView fetching(String email) {

		PersonDto personDto = personDao.fetch(email);
		ModelAndView andView = new ModelAndView("display.jsp");
		andView.addObject("key3", personDto);
		return andView;

	}
}
