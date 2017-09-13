package com.penghai.printsystem.dao;

/**
 * 第一个页面右边的显示供墨系统中包含的产品的接口
 */
import java.util.List;


import com.penghai.printsystem.bo.FirstBulkInk;

public interface BulkInkMapper {
	public List<FirstBulkInk> selectBulkInk();
	
	public List<FirstBulkInk> selectAllBulkInk();
}
