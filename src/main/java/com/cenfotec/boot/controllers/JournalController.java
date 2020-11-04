package com.cenfotec.boot.controllers;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cenfotec.boot.repository.JournalRepository;

import antlr.collections.List;

@Controller
public class JournalController {
	
	@Autowired JournalRepository repo;  
	@RequestMapping("/") public String index(Model model){  model.addAttribute("journal", repo.findAll());  return "index";  }

	
}


