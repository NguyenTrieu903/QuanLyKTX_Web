<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url value="/admin/" var="URL"></c:url>
<c:url value="/admin" var="HOME"></c:url>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: 200px">
	<h3 class="w3-bar-item">Admin</h3>
	<a href="${URL}room" class="w3-bar-item w3-button">Quản lý phòng</a>
	<a href="${URL}pay" class="w3-bar-item w3-button">Thanh toán phí</a> 
	<a href="#" class="w3-bar-item w3-button">Quản lý hóa đơn</a>
</div>

<!-- Page Content -->
<div style="margin-left: 200px">
	<div class="w3-container w3-teal">
		<div>
			<a href="${HOME}">Trang chủ</a>
		</div>
		
	</div>
</div>
