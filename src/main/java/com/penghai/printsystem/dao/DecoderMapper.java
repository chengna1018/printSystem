package com.penghai.printsystem.dao;

import java.util.List;

import com.penghai.printsystem.bo.FirstDecoder;

public interface DecoderMapper {
	//取出前4个产品
	public List<FirstDecoder> selectDecoder();
	
	//取出所有产品
	public List<FirstDecoder> selectAllDecoder();
}
