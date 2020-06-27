package com.Gy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Gy.beans.It;
import com.Gy.beans.It2;
import com.Gy.mapper.ItMapper;

@Service
public class ItServiceImpl implements ItService {
	@Resource
	private ItMapper mapper;


	public List<It> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.findAll(map);
	}



	public List<It2> selIt2() {
		// TODO Auto-generated method stub
		
		return mapper.selIt2();
	}


	public void addIt(It it) {
		// TODO Auto-generated method stub
		mapper.addIt(it);
	}



	public void delIt(Integer id) {
		// TODO Auto-generated method stub
		mapper.delIt(id);
	}



	public List<It> selIt(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selIt(id);
	}



	public void update(It it) {
		// TODO Auto-generated method stub
		mapper.update(it);
	}
}
