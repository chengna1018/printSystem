package com.penghai.printsystem.dao;
/**
 * 第一个页面左边的产品类的接口
 */

import java.util.List;

import com.penghai.printsystem.bo.First;


public interface FirstMapper {
	public List<First> getFirst(Integer id);
	
	public List<First> getFirstPage();
}
