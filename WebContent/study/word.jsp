<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/font-awesome.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">

<style type="text/css">
body{
	background-image:url(${pageContext.request.contextPath}/images/c27d45464e4655b4a4253d9a0c529c37.jpg)
}
h1,table{
	color:black;
}
</style>
</head>
<body>
	<div class="container">

		<table border="0" width="900px">
			<tr>
				<h1>
					LIST
					<s:property value="currPage" />
					<small>今日事，今日毕！</small>
				</h1>
			</tr>
			<tr>
				<td align="align"><a class='btn btn-success btn-sm'> 加入生词表
						<span class="glyphicon glyphicon-plus" aria-hidden="true">
					</span>
				</a> <a class='btn btn-success btn-sm remove'> 速记 <span
						class="glyphicon glyphicon-eye-open" aria-hidden="true"> </span>
				</a> <a class='btn btn-success btn-sm'> 我记住了 <span
						class="glyphicon glyphicon-ok" aria-hidden="true"> </span>
				</a></td>
			</tr>
		</table>
		<br />
		<s:iterator value="list" var="w">
			<div class="panel panel-success">
				<div class="panel-heading">
					<div class="row">
						<div class="col-md-1" style="font-weight:bold">
							<s:property value="#w.englishWord" />
						</div>
						<div class="col-md-5" align="center">
							/
							<s:property value="#w.pa" />
							/
						</div>
						<div class="col-md-3">
							<s:property value="#w.chineseWord" />
						</div>
						<div class="col-md-3">
							<a class="btn btn-success btn-sm" id="pron"
								href="<s:property value="#w.pron" />"> <span
								class="glyphicon glyphicon-volume-down pronpic"
								aria-hidden="true"> <!-- 								<BGSOUND SRC="#" autostart=true loop=false id="pronsound"/> -->
							</span>
							</a>
							<!-- 加入生词表 href="word_save.action?id=<s:property value="#w.id" />"-->
							&nbsp<a class='btn btn-success btn-sm  add'
								onclick='saveWord(<s:property value="#w.id" />)' target='blank'> <span
								class="glyphicon glyphicon-plus" aria-hidden="true"> </span>
							</a> &nbsp<a class='btn btn-success btn-sm removepart'> <span
								class="glyphicon glyphicon-eye-open unsee" aria-hidden="true">
							</span>
							</a> &nbsp<a class='btn btn-success btn-sm removeall'> <span
								class="glyphicon glyphicon-ok" aria-hidden="true"> </span>
							</a>
						</div>
					</div>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-6">
							<p>

								<s:property value="#w.englishInstance1" />
							</p>
							<p>
								<s:property value="#w.chineseInstance1" />
							</p>
						</div>
						<div class='col-md-6'>
							<p>

								<s:property value="#w.englishInstance2" />
							</p>
							<p>
								<s:property value="#w.chineseInstance2" />
							</p>
						</div>
					</div>
				</div>
			</div>
		</s:iterator>
		<br />
		<table border="0" cellspacing="0" cellpadding="0" width="900px">
			<tr>
				<td align="right"><span> 第<s:property value="currPage" />/<s:property
							value="totalPage" />页
				</span> &nbsp;&nbsp; <span> 总记录数：<s:property value="totalCount" />&nbsp;&nbsp;
						每页显示:<s:property value="pageSize" /></span>&nbsp;&nbsp; <span> <s:if
							test="currPage != 1">
							<a href="word_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a
								href="word_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
               </s:if> <s:if test="currPage != totalPage">
							<a
								href="word_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                    <a
								href="word_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]<s:property
									value="totalPage" /></a>&nbsp;&nbsp;
               </s:if>
				</span></td>
			</tr>
		</table>
	</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"
	type="text/javascript"></script>
<script type="text/javascript">
//  $("#pron").click(function() {
// 	alert($(".pronpic").children(".pronlabel:eq(0)").text())
// 	$("bgsound").attr('src',$(".pronpic").children(".pronlabel:eq(0)").text());
// 	alert($("bgsound").attr('src'))
// })
function saveWord(id) {
	$.ajax({
		url:'${pageContext.request.contextPath}/save.action?id='+id,
		type : 'GET',
		dataType : 'JSON',
		success : function(result) {
			if(result[0]==0){
				alert('请先登录！')
			}else if(result[0]==2){
				alert('已添加')
			}
		}		
	})
}
$(".removepart").click(function(){
	$(this).closest('.panel-heading').next(".panel-body").toggle();
	$(this).toggleClass('btn-success')
})
$(".removeall").click(function(){
	$(this).closest('.panel').hide();
})
$(".remove").click(function(){
	$(".panel-body").hide();
})
$(".add").click(function(){
	$(this).toggleClass('btn-success')
})
</script>
</html>