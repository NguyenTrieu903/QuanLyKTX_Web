<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/common/taglib.jsp"%>
<c:url value="/admin/room/" var="URL"></c:url>
<body>
	<div style="margin-left: 200px">
		<div class="w3-container">
			<h2>Quản lý phòng</h2>
		</div>
		<form class="example" action="${URL}search" method="get"
			style="margin: auto; max-width: 300px">
			<input type="text" placeholder="Search.." name="maphong">
			<button type="submit">
				<i class="fa fa-search"></i>
			</button>
		</form>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Mã phòng</th>
					<th scope="col">Giá phòng</th>
					<th scope="col">Số sinh viên hiện tại</th>
					<th scope="col">Số sinh viên tối đa</th>
					<th scope="col">Tình trạng</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomlist}" var="room">
					<tr>
						<td>${room.maphong}</td>
						<td>${room.giaphong}</td>
						<td>${room.sosinhvienhientai}</td>
						<td>${room.sosinhvientoida}</td>
						<td>
							<c:if test="${room.tinhtrang == 1}">
								Hoạt động
							</c:if>
							<c:if test="${room.tinhtrang == 0}">
								Sửa chữa
							</c:if>
						</td>
						<td>
							<a href="<c:url value='/admin/room/delete?maphong=${room.maphong}'/>" class="center">Xóa</a>
							|
							<a href="<c:url value='/admin/room/update?maphong=${room.maphong}'/>" class="center">Cập nhật</a>
							|
							<a href="<c:url value='/admin/room/debt?maphong=${room.maphong}'/>" class="center">Thông tin nợ</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="<c:url value='/admin/room/add'/>">Thêm</a>
	</div>
</body>
