package com.alib.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alib.java.mapper.MerchantMapper;
import com.alib.java.model.Merchant;

@RestController
public class IndexController {
	
	@RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("list");
    }
	@RequestMapping("toadd")
	public ModelAndView add() {
		return new ModelAndView("add");
	}
	
}
