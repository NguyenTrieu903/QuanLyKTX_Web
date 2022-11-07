<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url value="/admin/room/update" var="update"></c:url>
<div style="margin-left: 200px">
		<div class="w3-container">
			<h2>Cập nhật trạng thái</h2>
		</div>
		<form role="form" action="${update}" method="post" enctype="multipart/form-data">
		<div class="form-group"> 
			<div class="form-group">
				<label for="formGroupExampleInput">Mã phòng</label> 
				<input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input" value="${roommodel.maphong}" name="maphong">
			</div>
			<label>Tình trạng</label> 
			<c:if test="${roommodel.tinhtrang == 1}"> <input type="text" class="form-control" value="Hoạt động" name="tinhtrang" /> 
			</c:if>
			<c:if test="${roommodel.tinhtrang == 0}"> <input type="text" class="form-control" value="Sửa chữa" name="tinhtrang" /> 
			</c:if>
		</div>
		<button type="submit" class="btn btn-default">Edit</button>
		<button type="reset" class="btn btn-primary">Reset</button>
	</form>
</div>
</body>
</html>