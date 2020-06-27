package com.Gy.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Gy.beans.It;
import com.Gy.beans.It2;
import com.Gy.service.ItService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ItController {
	@Resource
	private ItService ser;
	@RequestMapping("list")
	public String findAll(String bt,Model model,@RequestParam(name="pageNum",defaultValue = "1") Integer pageNum) {
		PageHelper.startPage(pageNum, 2);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("tbt", bt);
		List<It> list = ser.findAll(map);
		PageInfo<It> info = new PageInfo<It>(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		return "list";
		
	}
	@RequestMapping("selIt")
	public String selIt(Model model) {
		List<It2> list= ser.selIt2();
		model.addAttribute("list", list);
		return "add";
		
	}
	@RequestMapping("add")
	public String add(It it) {
		ser.addIt(it);
		return "redirect:list";
		
	}
	@RequestMapping("del")
	public String del(Integer id) {
		ser.delIt(id);
		return "redirect:list";
		
	}
	@RequestMapping("up")
	public String show(Integer id,Model model) {
		List<It> list =ser.selIt(id);
		model.addAttribute("li", list);
		List<It2> list2= ser.selIt2();
		model.addAttribute("list", list2);
		return "update";
		
	}
	@RequestMapping("update")
	public String update(It it) {
		ser.update(it);
		return "redirect:list";
	}

	
	
}
