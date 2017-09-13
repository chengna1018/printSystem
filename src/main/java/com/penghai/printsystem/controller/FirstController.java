package com.penghai.printsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.penghai.printsystem.bo.First;
import com.penghai.printsystem.bo.FirstBulkInk;
import com.penghai.printsystem.bo.FirstChip;
import com.penghai.printsystem.bo.FirstDecoder;
import com.penghai.printsystem.bo.FirstInkCartridge;
import com.penghai.printsystem.bo.FirstPrintHead;
import com.penghai.printsystem.bo.FirstRight;
import com.penghai.printsystem.bo.FirstSetter;
import com.penghai.printsystem.bo.FirstSpareParts;
import com.penghai.printsystem.service.FirstBulkInkService;
import com.penghai.printsystem.service.FirstChipService;
import com.penghai.printsystem.service.FirstDecoderService;
import com.penghai.printsystem.service.FirstInkCartridgeService;
import com.penghai.printsystem.service.FirstPrintHeadService;
import com.penghai.printsystem.service.FirstRightService;
import com.penghai.printsystem.service.FirstService;
import com.penghai.printsystem.service.FirstSetterService;
import com.penghai.printsystem.service.FitsrSparePartsService;
import com.penghai.printsystem.controller.BaseController;;

@Controller
public class FirstController extends BaseController {
	@Autowired
	private FirstService firstService;
	@Autowired
	FirstRightService firstRightService;
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
	

	@RequestMapping("/")
	public String selectFirst() {
		//取出第一页左边的所有产品，放到json串中
		
		List<First> printinks = firstService.getAllFirstPage();
		//List<First> printinks = firstService.getAllFirst();
		JSONArray jsonArrayL = new JSONArray();
		for (First f : printinks) {
			JSONObject jsonObjectL = new JSONObject();
			jsonObjectL.put("id", f.getId());
			jsonObjectL.put("pname", f.getPname());
			jsonObjectL.put("desc", f.getDesc());
			jsonObjectL.put("picture", f.getPicture());
			jsonObjectL.put("pid", f.getPid());
			jsonArrayL.add(jsonObjectL);
		}
		request.setAttribute("firstPageL", jsonArrayL);
		//取出第一页右边的所有产品，放到json串中
		List<FirstRight> rightprintinks = firstRightService.getPartFirstRight();
		JSONArray jsonArrayR = new JSONArray();
		for (FirstRight r : rightprintinks) {
			JSONObject jsonObjectR = new JSONObject();
			jsonObjectR.put("id", r.getId());
			jsonObjectR.put("pname", r.getPname());
			jsonObjectR.put("product", r.getProduct());
			jsonObjectR.put("pid", r.getPid());
			jsonArrayR.add(jsonObjectR);

		}
		request.setAttribute("firstPageR", jsonArrayR);
		//取出第一页右边供墨系统中的前4个产品，放到json串中
		List<FirstBulkInk> bulkinksystem = firstBulkInkService.getFourBulkInk();
		JSONArray jsonArrayBulkInk = new JSONArray();
		for (FirstBulkInk bulk : bulkinksystem) {
			JSONObject jsonObjectBulkInk = new JSONObject();
			jsonObjectBulkInk.put("id", bulk.getId());
			jsonObjectBulkInk.put("product", bulk.getProduct());
			jsonObjectBulkInk.put("desc", bulk.getDesc());
			jsonObjectBulkInk.put("picture", bulk.getPicture());
			jsonObjectBulkInk.put("pid", bulk.getPid());
			jsonArrayBulkInk.add(jsonObjectBulkInk);
		}
		request.setAttribute("firstPageBulkInk", jsonArrayBulkInk);
		//取出第一页右边墨盒中的所有产品，放到json串中
		List<FirstInkCartridge> inkcartridge=firstInkCartridgeService.getFourInkCartridge();
		JSONArray jsonArrayInkCartridge=new JSONArray();
		for(FirstInkCartridge f:inkcartridge){
			JSONObject jsonObjectInkCartridge=new JSONObject();
			jsonObjectInkCartridge.put("id", f.getId());
			jsonObjectInkCartridge.put("product", f.getProduct());
			jsonObjectInkCartridge.put("desc", f.getDesc());
			jsonObjectInkCartridge.put("picture", f.getPicture());
			jsonObjectInkCartridge.put("pid", f.getPid());
			jsonArrayInkCartridge.add(jsonObjectInkCartridge);
		}
		request.setAttribute("firstPageInkCartridge", jsonArrayInkCartridge);
		//取出第一页右边打印机芯片中的所有产品，转化成JSON串
		List<FirstChip> chip=firstChipService.getFourChip();
		JSONArray jsonArrayChip=new JSONArray();
		for(FirstChip c:chip){
			JSONObject jsonObjectChip=new JSONObject();
			jsonObjectChip.put("id", c.getId());
			jsonObjectChip.put("product", c.getProduct());
			jsonObjectChip.put("desc", c.getDesc());
			jsonObjectChip.put("picture", c.getPicture());
			jsonObjectChip.put("pid", c.getPid());
			jsonArrayChip.add(jsonObjectChip);
		}
		request.setAttribute("firstPageChip", jsonArrayChip);
		//取出第一页右边芯片复位器中的所有产品，转化成JSON串
		List<FirstSetter> setter=firstSetterService.getFourSetter();
		JSONArray jsonArraySetter=new JSONArray();
		for(FirstSetter s:setter){
			JSONObject jsonObjectSetter=new JSONObject();
			jsonObjectSetter.put("id", s.getId());
			jsonObjectSetter.put("product", s.getProduct());
			jsonObjectSetter.put("desc", s.getDesc());
			jsonObjectSetter.put("picture", s.getPicture());
			jsonObjectSetter.put("pid", s.getPid());
			jsonArraySetter.add(jsonObjectSetter);
		}
		request.setAttribute("firstPageSetter", jsonArraySetter);
		//取出第一页右边芯片解密卡中的所有产品，转化成JSON串
		List<FirstDecoder> decoder=firstDecoderService.getFourDecoder();
		JSONArray jsonArrayDecoder=new JSONArray();
		for(FirstDecoder d:decoder){
			JSONObject jsonObjectDecoder=new JSONObject();
			jsonObjectDecoder.put("id", d.getId());
			jsonObjectDecoder.put("product", d.getProduct());
			jsonObjectDecoder.put("desc", d.getDesc());
			jsonObjectDecoder.put("picture", d.getPicture());
			jsonObjectDecoder.put("pid", d.getPid());
			jsonArrayDecoder.add(jsonObjectDecoder);
		}
		request.setAttribute("firstPageDecoder", jsonArrayDecoder);
		//取出第一页右边打印机喷头中的所有产品，转化成JSON串
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
		request.setAttribute("firstPagePrintHead", jsonArrayPrintHead);
		//取出第一页右边打印机配件中的所有产品，转化成JSON串
		List<FirstSpareParts> sparePartsList=fitsrSparePartsService.getFourSpareParts();
		JSONArray jsonArraySpareParts=new JSONArray();
		for(FirstSpareParts sp:sparePartsList){
			JSONObject jsonObjectSpareParts=new JSONObject();
			jsonObjectSpareParts.put("id", sp.getId());
			jsonObjectSpareParts.put("product", sp.getProduct());
			jsonObjectSpareParts.put("desc", sp.getDesc());
			jsonObjectSpareParts.put("picture", sp.getPicture());
			jsonObjectSpareParts.put("pid", sp.getPid());
			jsonArraySpareParts.add(jsonObjectSpareParts);
		}
		request.setAttribute("firstPageSpareParts", jsonArraySpareParts);
		//System.out.println("777777777"+jsonArraySpareParts);
		return "firstmap";

	}

}
