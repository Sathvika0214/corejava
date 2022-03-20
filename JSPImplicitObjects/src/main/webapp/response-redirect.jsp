<meta charset="UTF-8">
<title>Get Header Example</title>
</head>
<body>

<%
        String office = request.getParameter("office");
        if (office != null)
                out.println("value of Office obtained :" + office + "<br>");
        else
                out.println("No value of Office found<br>");
%>

</body>
</html>
