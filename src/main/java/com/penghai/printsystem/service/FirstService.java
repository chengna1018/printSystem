package com.penghai.printsystem.service;

/**
 * 第一个页面左边的所有产品类的业务层
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.First;
import com.penghai.printsystem.dao.FirstMapper;

@Service
public class FirstService {
	
	@Autowired
	private FirstMapper firstMapper;
	
	public List<First> getAllFirst(Integer id){
		List<First> firstPage=firstMapper.getFirst(id);
		return firstPage;
	}
	
	public List<First> getAllFirstPage(){
		List<First> allFirstPage=firstMapper.getFirstPage();
		return allFirstPage;
	}
}
