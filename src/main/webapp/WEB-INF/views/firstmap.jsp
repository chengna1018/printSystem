<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<% String path=request.getContextPath();
	String basePath=request.getScheme()+"://"
		+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="./resources/css/p2.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<title>打印机展示</title>
</head>
<body>
	<div id="all_printers"></div>
	

	<script type="text/javascript">
		var firstStrL='${firstPageL}';
		var firstStrBulkInk='${firstPageBulkInk}';
		var firstStrInkCartridge='${firstPageInkCartridge}';
		
		
		var firstPageL=$.parseJSON(firstStrL);
		
		var firstPageInkCartridge=$.parseJSON(firstStrInkCartridge);
		//alert("******"+firstPageInkCartridge);
		var firstPageBulkInk=$.parseJSON(firstStrBulkInk);
		//alert("&&&&&"+firstPageBulkInk);
		
		var firstStrChip='${firstPageChip}';
		var firstPageChip=$.parseJSON(firstStrChip);
		//alert("%%%%%%"+firstPageChip);
		var firstStrSetter='${firstPageSetter}';
		var firstPageSetter=$.parseJSON(firstStrSetter);
		
		var firstStrDecoder='${firstPageDecoder}';
		var firstPageDecoder=$.parseJSON(firstStrDecoder);
		//console.log(firstPageDecoder);
		
		var firstStrPrintHead='${firstPagePrintHead}';
		//console.log("@@@@@@@@@"+firstStrPrintHead.toString());
		var firstPagePrintHead=$.parseJSON(firstStrPrintHead);
		//console.log("^^^^^^^^"+firstPagePrintHead);
		
		var firstStrSpareParts='${firstPageSpareParts}';
		var firstPageSpareParts=$.parseJSON(firstStrSpareParts);
		
		var content="";
		content=content+"<div style='height:150px;width:100%;min-width:1200px;z-index:999;background-color:#369;'>"+
		"<div id='header' style='height:150px;width:100%;min-width:1200px;'>"+
		"<h3>Print Parts Products</h3></div></div>"+
		"<div id='mainContainer'><div id='lContainer'>";

		for(var i=0;i<firstPageL.length;i++){
			var id=firstPageL[i].id;
			var pname=firstPageL[i].pname;
			var desc=firstPageL[i].desc;
			var picture=firstPageL[i].picture;
			var pid=firstPageL[i].pid;
			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
			content=content+"<div class='partpic'><h3>"+desc+"</h3>"+
			"<div class='partpicimage'><img src='./resources/image/"+picture+".jpg'/></div>"+
			"<ul><li><a href='"+url+"'>"+pname+"</a></li></ul></div>";
			
		}
		content=content+"</div>";
		content=content+"<div class='clear'></div>"+
        "<div id='rContainer'><div class='rpart'>";
        for(var i=0;i<firstPageL.length;i++){
        	content=content+"<div class='rpartpicimage'>";
        	var id=firstPageL[i].id;
        	var pnameL=firstPageL[i].pname;
        	var pid=firstPageL[i].pid;
        	var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
        	content=content+"<h3>"+pnameL+"<a class='more' href='"+url+"'>更多</a></h3>";
        	for(var j=0;j<4;j++){
        		//var id=firstPageInkCartridge[j].id;
        		var product=firstPageInkCartridge[j].product;
    			var pid=firstPageInkCartridge[j].pid;
    			if(id==pid){
    				var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
    			}
    			
        	}
        	content=content+"</div>";
        	for(var j=0;j<4;j++){
        		//var id=firstPageBulkInk[j].id;
        		var product=firstPageBulkInk[j].product;
        		var pid=firstPageBulkInk[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	for(var j=0;j<4;j++){
        		//var id=firstPageChip[j].id;
        		var product=firstPageChip[j].product;
        		var pid=firstPageChip[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	for(var j=0;j<4;j++){
        		//var id=firstPageSetter[j].id;
        		var product=firstPageSetter[j].product;
        		var pid=firstPageSetter[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	for(var j=0;j<4;j++){
        		//var id=firstPageDecoder[j].id;
        		var product=firstPageDecoder[j].product;
        		var pid=firstPageDecoder[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	for(var j=0;j<2;j++){
        		//var id=firstPagePrintHead[j].id;
        		var product=firstPagePrintHead[j].product;
        		var pid=firstPagePrintHead[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	for(var j=0;j<4;j++){
        		//var id=firstPageSpareParts[j].id;
        		var product=firstPageSpareParts[j].product;
        		var desc=firstPageSpareParts[j].desc;
        		var picture=firstPageSpareParts[j].picture;
        		var pid=firstPageSpareParts[j].pid;
        		if(id==pid){
        			var url = '<%=request.getContextPath()%>/moreproduct?id='+id;
    				content=content+"<ul><li><a href='http://www.baidu.com'>"+product+"</a></li></ul>";
        		}
        	}
        	
        	
        }
		content=content+"</div></div>";
        
		$('#all_printers').html(content);
	</script>
			

</body>	
</html>