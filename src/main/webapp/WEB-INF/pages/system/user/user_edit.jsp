<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>" />
    <title>${WEBNAME}</title>
   	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="This is my page" />
	<link rel="stylesheet" type="text/css" href="./plugin/easyui/themes/icon.css" />
   	<c:if test="${userSession.systemUser.userSkin != ''}">
	    <link rel="stylesheet" type="text/css" href="./plugin/easyui/themes/${userSession.systemUser.userSkin}/easyui.css" />
	</c:if>
	<c:if test="${empty userSession || empty userSession.systemUser.userSkin || userSession.systemUser.userSkin == null}">
	    <link rel="stylesheet" type="text/css" href="./plugin/easyui/themes/default/easyui.css" />
	</c:if>
	<link rel="stylesheet" type="text/css" href="./commons/css/form.css" />
    <script type="text/javascript" src="./plugin/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="./plugin/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="./plugin/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="./plugin/easyui/jquery.easyui.validate.js"></script>
    <script type="text/javascript" src="./plugin/md5/jquery.md5.js"></script>
    <script type="text/javascript" src="./commons/js/formatterUtil.js"></script>
	<script type="text/javascript" src="./commons/js/message.js"></script>
  	<script type="text/javascript">
	  	var index = "${systemUserDTO.userStatus}";
	  	var userSex = "${systemUserDTO.userSex}";
	  	var userSkin = "${systemUserDTO.userSkin}";
  		$(document).ready(function(){
  			// ?????????????????????????????????????????????????????????
			
			//???????????????
			loadSelectData("util_status",$("#userStatus"),index);
			//???????????????
			loadSelectData("user_sex",$("#userSex"),userSex);
			loadSelectDataTemp("user_themes",$("#themesSelect"),userSkin);
			
			//???????????????
			$("#themesSelect").combobox({
				onSelect: function(param){
					$("#themes").css("background-color",param.dictionaryCode);
				}
			});
		});
  		/*??????????????????*/
  		function loadSelectDataTemp(type,select,index){
  			$.post("dictionary/getCode.json", { dictionaryType: type },
  					   function(data){
  						 var obj = new Object();
  						 obj.dictionaryName = "?????????";
  						 obj.dictionaryCode = "";
  					     data.unshift(obj);
  					     $(select).combobox({
  						        data:data,
  						        valueField:"dictionaryCode",
  						        textField:"dictionaryName",
  						        panelHeight:200,
  						        onLoadSuccess:function(){
  						        	for(var i = 0;i<data.length;i++ ){
  						        		if(data[i].dictionaryName == index){
  						        			//????????????
  		  								    $(this).combobox("select",data[i].dictionaryCode);
  		  									$("#themes").css("background-color",data[i].dictionaryCode);
  						        			break;
  						        		}
  						        	}
  						        	
  						        }
  						    });
  				 });
  		}
  		
		/*???????????????????????????*/
		function update(){
			var param = getSystemParam();
			var url = "user/updateUser.json?param="+param;
			$("#userSkin").val($("#themesSelect").combobox("getText"));
			if($("#paramForm").form("validate") == false){
				return;
			}
			//????????????
			$.post(url, $("#paramForm").serialize(),function(data){
			    if(data.result == 1){
			    	parent.info("????????????","???????????????????????????");
					parent.exit();
					parent.searchUser();
				}else{
					info("????????????","???????????????????????????");
					return;
				}
			   }, "json");
		}
		
	</script>
  </head>
<body class="easyui-layout" style="padding:0px;margin:0px;" >  
    <div data-options="region:'center',title:'????????????',iconCls:'icon-user-add'" >
 	  <div style="width:100%;height:auto;padding:3px 0px 3px 0px;;text-align:right;">
    	<a id="" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="update()">???&nbsp;???</a>
    	<a id="" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-factory'" onclick="parent.exit();">???&nbsp;???</a>&nbsp;&nbsp;  
  	  </div>
   		<div id="form_div" class="easyui-panel" data-options="iconCls:'icon-user-list',title:'????????????????????????'" border="true"  noheader="true"  fit="true" style="width:100%;height:100%;margin:0px;padding:0px 0px 32px 0px;text-align:center;">
   		 	<div  class="easyui-panel" noborder="true" border="false" style="width:100%;height:100%;padding:0px;margin:0px;">
	   		 <form id="paramForm" method="post" name="paramForm" action="">  
	   			<div style="margin-top:15px;">
	   				<label for="userId">????????????:</label>
					<input class="easyui-textbox" type="text" style="width:70%;height:32px;padding:10px" value="${systemUserDTO.userId}" data-options="editable:false,disabled:true,prompt:'?????????????????????'">
					<input type="hidden" id="userId" name="userId" value="${systemUserDTO.userId}" />
				</div>
				<div style="margin-top:15px;">
					<label for="userName">????????????:</label>
					<input class="easyui-textbox"  type="text" style="width:70%;height:32px;padding:10px" name="userName" value="${systemUserDTO.userName}"  data-options="prompt:'?????????????????????',required:true,validType: ['CN_EN_NO[]','length[2,10]']">
				</div>
	   			<div style="margin-top:15px;">
	   				 <label for="userIdentity">????????????:</label>
					<input class="easyui-textbox" type="text" style="width:70%;height:32px;padding:10px" name="userIdentity" value="${systemUserDTO.userIdentity}" data-options="prompt:'?????????????????????',required:true,validType:'IDCARD[]'">
				</div>
				<div style="margin-top:15px">
					<label for="userPhone">????????????:</label>
					<input class="easyui-numberbox" type="text" style="width:70%;height:32px;padding:10px" name="userPhone" value="${systemUserDTO.userPhone}" data-options="prompt:'?????????????????????',validType:'phone[]'">
				</div>
	   			<div style="margin-top:15px">
	   				<label for="userSex">??????:</label>
					<select id="userSex" class="easyui-combobox"  name="userSex" style="width:70%;padding:10px;height:32px"  data-options="panelHeight:'auto',editable:false,validType:'OPTION[]'">  
					    <option value="">?????????</option> 
					</select>  
				</div>
				<div style="margin-top:15px">
					<label for="userAge">??????:</label>
					<input class="easyui-numberbox" type="text" style="width:70%;height:32px;padding:10px" name="userAge" value="${systemUserDTO.userAge}" data-options="precision:0,validType:'length[1,3]',prompt:'???????????????'">
				</div>
	   			<div style="margin-top:15px">
					<label for="userStatus">????????????:</label>
					<select id="userStatus" class="easyui-combobox"  name="userStatus" style="width:70%;padding:10px;height:32px" data-options="panelHeight:'auto',editable:false,required:true,validType:'OPTION[]'">  
					    <option value="">?????????</option> 
					</select>  
				</div>
	   			<div style="margin-top:15px">
					<label for="userMail">????????????:</label>
					<input class="easyui-textbox trimBlank" type="text" style="width:70%;height:32px;padding:10px" name="userMail" value="${systemUserDTO.userMail}" data-options="prompt:'?????????????????????',validType:'email[]'">
				</div>
	   			<div style="margin-top:15px">
					<label for="userSkin">
						<span id="themes" style="border:1px solid white; width:32px; heiht:32px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					??????:</label>
					<select id="themesSelect" class="easyui-combobox"   data-options="panelHeight:'auto',editable:false,editable:false,validType:'OPTION[]'"  name="themes" style="width:70%;padding:10px;height:32px">  
					   <option value="">?????????</option>  
					</select>  
					<input type="hidden" value="default" name="userSkin" value="${systemUserDTO.userSkin}" id="userSkin" />
				</div>
				<div style="margin-top:15px;">
					<label for="userAddress">????????????:</label>
					<input class="easyui-textbox" type="text" style="width:70%;height:32px;padding:10px" id="userAddress" name="userAddress" value="${systemUserDTO.userAddress}" data-options="prompt:'?????????????????????',validType: ['maxLength[500]','CN_EN_NO[]']">
				</div>
				<div style="margin-top:15px;">&nbsp;</div>
				<div style="margin-top:15px;">&nbsp;</div>
			</form>
		</div>
    </div>
    </div>
    <iframe id="other" name="other" src=""  style="padding:0px;margin:0px;display:none;"></iframe>  
</body>  
</html>
