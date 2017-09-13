<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./resources/css/moreproduct.css">
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="all_product"></div>
	<script type="text/javascript">
		var allLeft='${allProduct}';
		//console.log(allLeft);
		var allProduct=$.parseJSON(allLeft);
	
		var allProducts='${allRight}';
		//console.log(allProducts);
		var allRight=$.parseJSON(allProducts);
		//console.log(allRight);
		
		var content="";
		content=content+"<div style='height:auto;width:100%;min-width:1200px;z-index:999;'>"+
			"<div id='header' style='height:150px;width:100%;min-width:1200px;''><h3>Print Parts Products</h3></div>"+
			"<div id='maincontainer'><div class='part'><div id='lpart'>";
		
		for(var i=0;i<allProduct.length;i++){
			var id=allProduct[i].id;
			var pname=allProduct[i].pname;
			content=content+"<div class='top'>"+pname+"</div>";
			
			for(var j=0;j<allRight.length;j++){
				//var pname=allRight[j].pname;
				var product=allRight[j].product;
				//var picture=allRight[j].picture;
				var pid=allRight[j].pid;
				
				if(id==pid){
					content=content+"<ul><li>"+product+"</li></ul>";
				}
			}	
				content=content+"</div><div id='rpart'><table><tr>";
			for(var m=0;m<allRight.length;m++){
				var picture=allRight[m].picture;
				var product=allRight[m].product;
				content=content+"<td><img style='weight:250px;height:170px;border:1px solid gray;' src='./resources/image/"+picture+".png'><br/>"+product+"</td>"
				if(m%3==0){
					content=content+"</tr><tr>";
				}
			}
					/* for(var n=1;n<=allProduct[i].length;n++){
						content=content+"<tr><td><img src='.resources/image/"+picture+"'.png></td>"
						if(n==3){
							content=content+"<br/><br/>";
						}
					} */
					content=content+"</tr></table></div>"
		}
		
			content=content+"</div></div></div>";
	
	$('#all_product').html(content);
	</script>
	
	
</body>
</html>