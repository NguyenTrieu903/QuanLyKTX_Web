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
					<tr>
						<td>${roommodel.maphong}</td>
						<td>${roommodel.giaphong}</td>
						<td>${roommodel.sosinhvienhientai}</td>
						<td>${roommodel.sosinhvientoida}</td>
						<td>
							<c:if test="${roommodel.tinhtrang == 1}">
								Hoạt động
							</c:if>
							<c:if test="${roommodel.tinhtrang == 0}">
								Sửa chữa
							</c:if>
						</td>
						<td>
							<a href="<c:url value='/admin/room/delete?maphong=${roommodel.maphong}'/>" class="center">Xóa</a>
							|
							<a href="<c:url value='/admin/room/update?maphong=${roommodel.maphong}'/>" class="center">Cập nhật</a>
							|
							<a href="<c:url value='/admin/room/debt?maphong=${roommodel.maphong}'/>" class="center">Thông tin nợ</a>
						</td>
					</tr>
			</tbody>
		</table>
		<a href="<c:url value='/admin/room/add'/>">Thêm</a>
	</div>
</body>