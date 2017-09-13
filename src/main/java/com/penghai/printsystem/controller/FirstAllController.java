package com.penghai.printsystem.controller;
/**
 * 点击“更多”时，出现查询商品的全部
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.penghai.printsystem.bo.FirstBulkInk;
import com.penghai.printsystem.bo.FirstChip;
import com.penghai.printsystem.bo.FirstDecoder;
import com.penghai.printsystem.bo.FirstInkCartridge;
import com.penghai.printsystem.bo.FirstPrintHead;
import com.penghai.printsystem.bo.FirstSetter;
import com.penghai.printsystem.bo.FirstSpareParts;
import com.penghai.printsystem.service.FirstBulkInkService;
import com.penghai.printsystem.service.FirstChipService;
import com.penghai.printsystem.service.FirstDecoderService;
import com.penghai.printsystem.service.FirstInkCartridgeService;
import com.penghai.printsystem.service.FirstPrintHeadService;
import com.penghai.printsystem.service.FirstSetterService;
import com.penghai.printsystem.service.FitsrSparePartsService;

@Controller
public class FirstAllController extends BaseController{

	@Autowired
	private FirstBulkInkService firstBulkInkService;
	@Autowired
	private FirstInkCartridgeService firstInkCartridgeService;
	@Autowired
	private FirstChipService firstChipService;
	@Autowired
	private FirstSetterService firstSetterService;
	@Autowired 
	private FirstDecoderService firstDecoderService;
	@Autowired
	private FirstPrintHeadService firstPrintHeadService;
	@Autowired 
	private FitsrSparePartsService fitsrSparePartsService;
	
	@RequestMapping("/second")
	
	public String clickMore(){
		//取得供墨系统的所有产品
		List<FirstBulkInk> allBulkInk=firstBulkInkService.getAllBulkInk();
		JSONArray jsonArrayBulkInk=new JSONArray();
		for(FirstBulkInk f:allBulkInk){
			JSONObject jsonObjectBulkInnk=new JSONObject();
			jsonObjectBulkInnk.put("id", f.getId());
			jsonObjectBulkInnk.put("product", f.getProduct());
			jsonObjectBulkInnk.put("pid", f.getPid());
			jsonArrayBulkInk.add(jsonObjectBulkInnk);
		}
		request.setAttribute("allBulkInk", jsonArrayBulkInk);
		
		//取得墨盒的所有产品
		List<FirstInkCartridge> allInkCartridge=firstInkCartridgeService.getAllInkCartridge();
		JSONArray jsonArrayInkCartridge=new JSONArray();
		for(FirstInkCartridge ic:allInkCartridge){
			JSONObject jsonObjectInkCartridge=new JSONObject();
			jsonObjectInkCartridge.put("id", ic.getId());
			jsonObjectInkCartridge.put("product", ic.getProduct());
			jsonObjectInkCartridge.put("pid", ic.getPid());
			jsonArrayInkCartridge.add(jsonObjectInkCartridge);
		}
		request.setAttribute("allInkCartridge", jsonArrayInkCartridge);
		
		//取得打印机芯片的所有产品
		List<FirstChip> allFirstChip=firstChipService.getAllChip();
		JSONArray jsonArrayChip=new JSONArray();
		for(FirstChip c:allFirstChip){
			JSONObject jsonObjectChip=new JSONObject();
			jsonObjectChip.put("id", c.getId());
			jsonObjectChip.put("product", c.getProduct());
			jsonObjectChip.put("pid", c.getPid());
			jsonArrayChip.add(jsonObjectChip);
		}
		request.setAttribute("allChip", jsonArrayChip);
		
		//取出复位器的所有产品
		List<FirstSetter> allSetterList=firstSetterService.getAllSetter();
		JSONArray jsonArraySetter=new JSONArray();
		for(FirstSetter ss:allSetterList){
			JSONObject jsonObjectSetter=new JSONObject();
			jsonObjectSetter.put("id", ss.getId());
			jsonObjectSetter.put("product", ss.getProduct());
			jsonObjectSetter.put("pid", ss.getPid());
			jsonArraySetter.add(jsonObjectSetter);
		}
		request.setAttribute("allSetter", jsonArraySetter);
		
		//取出解密卡的所有产品
		List<FirstDecoder> allDecoderList=firstDecoderService.getAllDecoder();
		JSONArray jsonArrayDecoder=new JSONArray();
		for(FirstDecoder dd:allDecoderList){
			JSONObject jsonObjectDecoder=new JSONObject();
			jsonObjectDecoder.put("id", dd.getId());
			jsonObjectDecoder.put("product", dd.getProduct());
			jsonObjectDecoder.put("pid", dd.getPid());
			jsonArrayDecoder.add(jsonObjectDecoder);
		}
		request.setAttribute("allDecoder", jsonArrayDecoder);
		//取出打印机喷头的所有产品，但是这里只有3件
		List<FirstPrintHead> printHeads=firstPrintHeadService.getAllPrintHead();
		JSONArray jsonArrayPrintHead=new JSONArray();
		for(FirstPrintHead h:printHeads){
			JSONObject jsonObjectPrintHead=new JSONObject();
			jsonObjectPrintHead.put("id", h.getId());
			jsonObjectPrintHead.put("product", h.getProduct());
			jsonObjectPrintHead.put("desc", h.getDesc());
			jsonObjectPrintHead.put("picture", h.getPicture());
			jsonObjectPrintHead.put("pid", h.getPid());
			jsonArrayPrintHead.add(jsonObjectPrintHead);
		}
		request.setAttribute("allPrintHead", jsonArrayPrintHead);
		
		//取出打印机配件的所有产品
		List<FirstSpareParts> allSpareParts=fitsrSparePartsService.getAllSpareParts();
		JSONArray jsonArraySpareParts=new JSONArray();
		for(FirstSpareParts sp:allSpareParts){
			JSONObject jsonObjectSpareParts=new JSONObject();
			jsonObjectSpareParts.put("id", sp.getId());
			jsonObjectSpareParts.put("product", sp.getProduct());
			jsonObjectSpareParts.put("pid", sp.getPid());
			jsonArraySpareParts.add(jsonObjectSpareParts);
		}
		request.setAttribute("allSpareParts", jsonArraySpareParts);
		
		return "second";
		
	}
	

	
}
