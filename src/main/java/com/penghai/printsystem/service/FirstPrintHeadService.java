package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstPrintHead;
import com.penghai.printsystem.dao.PrintHeadMapper;

@Service
public class FirstPrintHeadService {
	@Autowired
	private PrintHeadMapper printHeadMapper;
	
	public List<FirstPrintHead> getAllPrintHead(){
		List<FirstPrintHead> printHeadList=printHeadMapper.selectPrintHead();
		return printHeadList;
	}
}
