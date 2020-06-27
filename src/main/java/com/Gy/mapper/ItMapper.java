package com.Gy.mapper;

import java.util.List;
import java.util.Map;

import com.Gy.beans.It;
import com.Gy.beans.It2;

public interface ItMapper {

	public List<It> findAll(Map<String, Object> map);
	public List<It2> selIt2();

	public void addIt(It it);
	public void delIt(Integer id);
	public List<It> selIt(Integer id);
	public void update(It it);

}
