<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/define.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/common.css">
<title>Insert title here</title>

</head>
<body>
	<div id="header">
		<h1>ショッピングサイト</h1>
		<sec:authorize access="hasRole('ROLE_MEMBER')">
		<div style="text-align: right;">
			<sec:authentication property="principal.member.lastName" />
			<sec:authentication property="principal.member.firstName" />様

			<form:form action="/logout" name="logoutForm" id="logoutForm" style="display:inline-flex">
				<a href="javascript:logoutForm.submit()">ログアウト</a>
			</form:form>
			<a href="/passwordChange/input">パスワード変更</a>
		</div>
		</sec:authorize>
		<sec:authorize access="!hasRole('ROLE_MEMBER')">
			<p>
				<a href="/login">ログイン</a>
			</p>
		</sec:authorize>
	</div>
	<div id="nav">
		<ul>
			<li><a href="/">トップ</a></li>
			<li><a href="/cart/index">カート(<c:out value="${cartDto.bookList.size()}"/>)</a></li>
			<li><a href="/order/list">注文履歴</a></li>
		</ul>
	</div>
    <p style="margin:auto;width:200px;"><c:out value="${message}"/></p>
