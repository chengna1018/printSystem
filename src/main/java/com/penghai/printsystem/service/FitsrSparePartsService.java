package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstSpareParts;
import com.penghai.printsystem.dao.SparePartsMapper;

@Service
public class FitsrSparePartsService {
	@Autowired
	private SparePartsMapper sparePartsMapper;
	
	//取出前四件产品
	public List<FirstSpareParts> getFourSpareParts(){
		 List<FirstSpareParts> sparePartsList=sparePartsMapper.selectSpareParts();
		 return sparePartsList;
	}
	
	//取出所有产品
	public List<FirstSpareParts> getAllSpareParts(){
		List<FirstSpareParts> allSparePartsList=sparePartsMapper.selectAllSpareParts();
		return allSparePartsList;
	}
}
