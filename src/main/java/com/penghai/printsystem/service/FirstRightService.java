package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstRight;
import com.penghai.printsystem.dao.FirstRightMapper;

@Service
public class FirstRightService {
	
	@Autowired
	private FirstRightMapper firstRight;
	
	public List<FirstRight> getPartFirstRight(){
		List<FirstRight> partFirstRight=firstRight.getProductById();
		return partFirstRight;
	}
}
