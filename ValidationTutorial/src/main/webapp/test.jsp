<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/update" method="POST">
	    아이디 : <input type="text" name="id" readonly/> <br/>
	    비밀번호 : <input type="text" name="pw"/> <br/>
	    등급 :<input type="text" name="grade" readonly/> <br/>
	    
	    <input type="submit" value="수정하기"/>
	</form>

</body>
</html>