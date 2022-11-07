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
	<div style="margin-left: 200px">
		<div class="w3-container">
			<h2>Thông tin nợ</h2>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Mã hóa đơn</th>
					<th scope="col">Tiền điện</th>
					<th scope="col">Tiền nước</th>
					<th scope="col">Mã phòng</th>
					<th scope="col">Ngày tạo</th>
					<th scope="col">Trạng thái</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ListInvoice}" var="invoice">
					<tr>
						<td>${invoice.mahd}</td>
						<td>${invoice.maphong}</td>
						<td>${invoice.tiendien}</td>
						<td>${invoice.tiennuoc}</td>
						<td>${invoice.ngaytao}</td>
						<td>
							<c:if test="${invoice.trangthai == 1}">
								Chưa thanh toán
							</c:if>
							<c:if test="${invoice.trangthai == 0}">
								Đã thanh toán
							</c:if>
						</td>
						<td>
							<a href="<c:url value='/admin/room/update?maphong=${room.maphong}'/>" class="center">Cập nhật</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
		
</body>
</html>