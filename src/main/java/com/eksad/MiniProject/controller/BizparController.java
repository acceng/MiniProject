package com.eksad.MiniProject.controller;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eksad.MiniProject.dao.BizparRepository;
import com.eksad.MiniProject.exception.DataNotFoundException;
import com.eksad.MiniProject.model.Bizpar;
import com.eksad.MiniProject.model.Employee;

@RequestMapping("/home")
@RestController
public class BizparController {

	@Autowired
	private BizparRepository bizparRepo;
	
	@GetMapping("/getId")
	public List<Bizpar>GetAllId(){
		return bizparRepo.findAll();
	}
	
}
