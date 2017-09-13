package com.penghai.printsystem.dao;

import java.util.List;

import com.penghai.printsystem.bo.FirstSetter;

public interface SetterMapper {
	//取出前4个产品
	public List<FirstSetter> selectSetter();
	
	//取出所有产品
	public List<FirstSetter> selectAllSetter();
}
