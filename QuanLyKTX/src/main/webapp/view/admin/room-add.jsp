<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/common/taglib.jsp"%>
<c:url value="/admin/room/" var="URL"></c:url>
<body>
	<div style="margin-left: 200px">
		<div class="w3-container">
			<h2>Thêm phòng</h2>
		</div>
		<div style="text-align: center ,border: 5px solid #FFFF00">
			<form role="form" action="${URL}add" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="formGroupExampleInput">Mã phòng</label> 
				<input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input" name="maphong">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Giá phòng</label> 
				<input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="giaphong">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Số sinh viên hiện tại</label> 
				<input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="sosinhvienhientai">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Số sinh viên tối đa</label> 
				<input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="sosinhvientoida">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Tình trạng</label> 
				<input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="tinhtrang">
			</div>
			<button type="submit" class="btn btn-primary">Thêm</button>
			<button type="reset" class="btn btn-primary">Hủy</button>
		</form>
		</div>
	</div>
</body>