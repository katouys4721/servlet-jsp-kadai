<%@ page contentType="text/html; charset=UTF-8"%>

<html>
	<body>
		<a href="<%= request.getContextPath() %>/sj?name=侍太郎">名前「侍太郎」をServletに送信</a>
		
		<%
		String userName = (String) request.getAttribute("name");
		
		if(userName != null){
		%>
		
		<h3>Servletからデータを受信しました：<%= userName %>さん、こんにちは！</h3>
		
		<%
		}
		%>
	</body>
</html>