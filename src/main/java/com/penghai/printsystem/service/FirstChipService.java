package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstChip;
import com.penghai.printsystem.dao.ChipMapper;

@Service
public class FirstChipService {
	@Autowired
	private ChipMapper chipMapper;
	
	//取出前4个产品
	public List<FirstChip> getFourChip(){
		List<FirstChip> chipList=chipMapper.selectChip();
		return chipList;
	}
	//取出所有产品
	public List<FirstChip> getAllChip(){
		List<FirstChip> chipAllList=chipMapper.selectAllChip();
		return chipAllList;
	}
}
