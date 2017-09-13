package com.penghai.printsystem.service;
/**
 * 第一个页面右边供墨系统中包含的所有产品的业务层
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.printsystem.bo.FirstBulkInk;
import com.penghai.printsystem.dao.BulkInkMapper;

@Service
public class FirstBulkInkService {

	@Autowired
	private BulkInkMapper bulkInk;
	
	//返回前四条记录
	public List<FirstBulkInk> getFourBulkInk(){
		List<FirstBulkInk> bulkInkList=bulkInk.selectBulkInk();
		return bulkInkList;
	}
	
	//返回所有记录
	public List<FirstBulkInk> getAllBulkInk(){
		List<FirstBulkInk> allBulkInkList=bulkInk.selectAllBulkInk();
		return allBulkInkList;
	}
	
}
