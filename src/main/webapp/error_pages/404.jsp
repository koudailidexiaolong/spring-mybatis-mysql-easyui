<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE>
<html>
<head>
    <title>${WEBNAME}</title>
   	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="This is my page" />
	<!-- easyui #FF8E1A-->
	<link rel="stylesheet" type="text/css" href="../plugin/easyui/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="../plugin/easyui/themes/default/easyui.css" />
    <script type="text/javascript"  src="../plugin/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../plugin/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../plugin/easyui/locale/easyui-lang-zh_CN.js"></script>
  </head>
  <body class="easyui-layout" style="text-align: center;" onkeydown="onkeydowns(event)" >  
    <div data-options="region:'center'" style="padding-top:13%;background-color:#ADD8E6; background-position:center;width: 100%;height: 100%;background-size: cover;" align="center">
    	<div id="cc" class="easyui-layout"  style="width:450px;height:290px;position: relative;">  
   			<div data-options="region:'center',title:'404',iconCls:'icon-user-list'" noheader="true" border="false" style="padding:0px;text-align: center;background-color:#ADD8E6;">
					<img alt="404" src="../commons/images/404-error.png" style="width: auto;height: auto">
   			</div>  
		</div> 
    </div>

</body>  
	<script type="text/javascript">
		
	</script>
</html>
