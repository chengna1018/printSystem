package com.penghai.printsystem.service;
import java.util.List;

/**
 * 第一页右边墨盒包含的所有产品的业务
 * @author Administrator
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstInkCartridge;
import com.penghai.printsystem.dao.InkCartridgeMapper;


@Service
public class FirstInkCartridgeService {
	@Autowired
	private InkCartridgeMapper inkCartridgeMapper;
	
	//取出前4个产品
	public List<FirstInkCartridge> getFourInkCartridge(){
		List<FirstInkCartridge> inkCartridgeList=inkCartridgeMapper.selectInkCartridge();
		return inkCartridgeList;
	}
	
	//取出所有产品
	public List<FirstInkCartridge> getAllInkCartridge(){
		List<FirstInkCartridge> allInkCartridge=inkCartridgeMapper.selectAllInkCartridge();
		return allInkCartridge;
		
	}
}
