<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-1.8.2.js" type="text/javascript"></script>
        <script src="js/jquery-ui.min.js" type="text/javascript"></script>
        <script type="text/javascript">

        
        $(document).ready(function(){
        	$("#t1").val("hello");
        	
        	$("#b1").click(function(){
        		$("#t2").val("yoyo");
        		location.href = "user/login.do?id=2"
        
        		
        	});
        	
        	$("#b2").click(function(){
        		$.ajax({
                    type:"POST",
                    url:"user/ajax.do",
                    contentType: "application/json",
                    data:{},
                    dataType:"json",
                    success:function(data){
                        $("#t2").val(data.age);
                    },
                    error:function(status){
                        alert("#b2 error");
                    }
                });
        	});
        	
        	$("#b3").click(function(){
        		if($("#tb2").length > 0){
        			//alert("tb2 exist");
        		}
        		else{
                    $("#p2").append("<table border=1 id='tb2'></table>")
        		}
        	    var trnum = $("#tb2").find("tr").length;
        	    var $newtr = $("<tr></tr>");
        	    $newtr.attr("id", "id"+trnum);
        	    $("#tb2").append($newtr);
                
        	    var $newtd1 = $("<td></td>");
        	    $newtd1.attr("id", "id"+trnum +"1");
        	    $newtd1.text(trnum);
                $newtr.append($newtd1);

        	});
        	
        	

        });
        
        
		</script>
		
        <title>JSP Page</title>
    </head>
    <body>

	<p id="p1">
	<input type="text" id="t1"/>
	<input type="text" id="t2"/>
	<input type="text" id="t3"/>
	
	<input type="button" id="b1" value="change"/>
	<input type="button" id="b2" value="ajax"/>
	<input type="button" id="b3" value="dom"/>
	</p>
	
    <p id="p2">
    
    </p>
	
    </body>
</html>