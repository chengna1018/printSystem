package com.penghai.printsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstDecoder;
import com.penghai.printsystem.dao.DecoderMapper;

@Service
public class FirstDecoderService {
	@Autowired
	private DecoderMapper decoderMapper;
	
	//取出前4个产品
	public List<FirstDecoder> getFourDecoder(){
		List<FirstDecoder> decoderList=decoderMapper.selectDecoder();
		return decoderList;
	}
	
	//取出所有产品
	public List<FirstDecoder> getAllDecoder(){
		List<FirstDecoder> allDecoderList=decoderMapper.selectAllDecoder();
		return allDecoderList;
	}
	
}
