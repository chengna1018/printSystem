package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstSetter;
import com.penghai.printsystem.dao.SetterMapper;

@Service
public class FirstSetterService {
	@Autowired
	private SetterMapper setterMapper;
	
	//取出前4个产品
	public List<FirstSetter> getFourSetter(){
		List<FirstSetter> setterList=setterMapper.selectSetter();
		return setterList;
	}
	
	//取出所有产品
	public List<FirstSetter> getAllSetter(){
		List<FirstSetter> allSetterList=setterMapper.selectAllSetter();
		return allSetterList;
	}
}
