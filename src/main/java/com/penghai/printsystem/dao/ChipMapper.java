package com.penghai.printsystem.dao;

import java.util.List;

import com.penghai.printsystem.bo.FirstChip;

public interface ChipMapper {
	public List<FirstChip> selectChip();//取出前4个产品
	
	public List<FirstChip> selectAllChip();//取出所有产品
}
