package com.penghai.printsystem.dao;

import java.util.List;

import com.penghai.printsystem.bo.FirstSpareParts;

public interface SparePartsMapper {
	//取出前4件产品
	public List<FirstSpareParts> selectSpareParts();
	//取出所有产品
	public List<FirstSpareParts> selectAllSpareParts();
}
