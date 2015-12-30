<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证码</title>
<script type="text/javascript" src="./js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="./lhgdialog/lhgdialog.min.js?self=true&skin=chrome"></script>
<script type="text/javascript">
  	$(function(){
  	 	$("#btn_courseware").click(function(){
  	 		$.dialog({
  	 			title:"课件下载",
  	 		    width: '800px',
  	 		 	height: 400,
  	 		    content: 'url:waresdown.jsp',
  	 		    max: false,
  	 		    min: false
  	 		});
  	 		
  	 		
              /*    	var dialog = $("#test").dialog({
                    title:"课件下载",
                    width: '800px',
                    height: 400,
                    content: 'url:waresdown.jsp'
                }); */
            })
         });
   </script>
</head>
<body>
	<input type="button" id="btn_courseware" value="data">
	<div id="test">
</body>
</html>
