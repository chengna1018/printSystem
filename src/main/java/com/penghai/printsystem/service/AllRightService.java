package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.AllRight;
import com.penghai.printsystem.dao.AllRightMapper;
import com.sun.beans.editors.IntegerEditor;

@Service
public class AllRightService {
	@Autowired
	private AllRightMapper allRightMapper;
	
	public List<AllRight> getAllRight(Integer pid){
		 List<AllRight> allRightProduct=allRightMapper.selectAll(pid);
		 return allRightProduct;
	}
}
