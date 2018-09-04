package com.alib.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alib.java.mapper.MerchantMapper;
import com.alib.java.model.Merchant;

/** 
 * 参考网站:思路
 * https://www.cnblogs.com/ityouknow/p/7594801.html
 * jpa命名规范
 * https://www.cnblogs.com/toSeeMyDream/p/6170790.html
 *  */
//@RequestMapping("/")
@Controller
public class MerchantController {

	@Autowired
	private MerchantMapper mm;
	
	@RequestMapping("list")
    public ModelAndView list(Model model) {
		List<Merchant> list = mm.findAll();
		model.addAttribute("list",list);
        return new ModelAndView("list");
    }
	@RequestMapping("toedit")
	public ModelAndView getMerById(long id,Model model) {
		Merchant mer = mm.findById(id);
		model.addAttribute("merchant",mer);
		return new ModelAndView("update");
	}
	@RequestMapping("todel")
	public String delete(Merchant mer) {
		//System.out.println(mer.getId()+"--------------------");
		mm.deleteById(mer.getId());
		return "redirect:list";
	}
	@RequestMapping("add")
	public String addMerchant(Merchant merchant) {
		//System.out.println("++++++++++++");
		System.out.println(merchant.toString());
		mm.toadd(merchant.getName(),merchant.getCountry(),merchant.getThvalue());
		return "redirect:list";
	}
	@RequestMapping("update")
	public String updateMerchant(Merchant merchant) {
		System.out.println("++++++++++++");
		//System.out.println(merchant.toString());
		mm.updateStatusById(merchant.getName(),merchant.getCountry(),merchant.getThvalue(),merchant.getId());
		return "redirect:list";
	}
	/**  */
}
