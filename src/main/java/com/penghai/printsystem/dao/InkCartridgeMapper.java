package com.penghai.printsystem.dao;
/**
 * 第一页右边墨盒中的所有产品
 */
import java.util.List;

import com.penghai.printsystem.bo.FirstInkCartridge;

public interface InkCartridgeMapper {
	public List<FirstInkCartridge> selectInkCartridge();//取出前四个产品
	
	public List<FirstInkCartridge> selectAllInkCartridge();//取出所有产品
}
