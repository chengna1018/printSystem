package com.penghai.printsystem.dao;

import java.util.List;

import com.penghai.printsystem.bo.AllRight;

public interface AllRightMapper {
	public List<AllRight> selectAll(Integer pid);
}
