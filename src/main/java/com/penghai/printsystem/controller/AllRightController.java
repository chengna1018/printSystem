package com.penghai.printsystem.controller;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.penghai.printsystem.bo.AllRight;
import com.penghai.printsystem.bo.First;
import com.penghai.printsystem.service.AllRightService;
import com.penghai.printsystem.service.FirstService;

@Controller
public class AllRightController extends BaseController{
	@Autowired
	private AllRightService allRightService;
	@Autowired FirstService firstService;
	
	
	@RequestMapping("/moreproduct")
	public String select(){
		//取得右边的所有产品
		Integer eid=Integer.parseInt(request.getParameter("id"));
		List<AllRight> allRights=allRightService.getAllRight(eid);
		JSONArray arrayAllRight=new JSONArray();
		for(AllRight ar:allRights){
			JSONObject objectAllRight=new JSONObject();
			objectAllRight.put("id", ar.getId());
			objectAllRight.put("pname", ar.getPname());
			objectAllRight.put("product", ar.getProduct());
			objectAllRight.put("picture", ar.getPicture());
			objectAllRight.put("pid", ar.getPid());
			arrayAllRight.add(objectAllRight);
		}
		request.setAttribute("allRight", arrayAllRight);
		
		//取得所有产品的大类
		Integer peid=Integer.parseInt(request.getParameter("id"));
		List<First> allProduct=firstService.getAllFirst(peid);
		//List<First> allProduct=firstService.getAllFirst();
		JSONArray arrayFirst=new JSONArray();
		for(First ff:allProduct){
			JSONObject objectFirst=new JSONObject();
			objectFirst.put("id", ff.getId());
			objectFirst.put("pname", ff.getPname());
			objectFirst.put("picture", ff.getPicture());
			objectFirst.put("pid", ff.getPid());
			arrayFirst.add(objectFirst);
		}
		request.setAttribute("allProduct", arrayFirst);
		return "moreproduct";
	}
}
