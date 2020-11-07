<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 리스트</title>
</head>
<body>
    <h1>게시물 리스트</h1>

    <div>총 게시물 수 : ${totalCount}</div>

    <c:forEach items="${articles}" var="article">
        <div>
            번호 :
            <a href="detail?id=${article.id}">${article.id}</a>
            <br />
            작성날짜 : ${article.regDate}
            <br />
            갱신날짜 : ${article.updateDate}
            <br />
            제목 :
            <a href="detail?id=${article.id}">${article.title}</a>
            <br />
            작업 :
            <a onclick="if ( confirm('삭제하시겠습니까?') == false ) return false;" href="doDelete?id=${article.id}">삭제</a>
            <a href="modify?id=${article.id}">수정</a>
        </div>
        <hr />
    </c:forEach>

    <div>
        <a href="write">글쓰기</a>
    </div>

</body>
</html>