<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Iata un nr(sunt din JSP): <% /*double nr = Math.random();
					   request.getSession().setAttribute("JSP Nr", nr);//cheie(string) si valoare
						Double nrDinServlet = (Double) request.getSession().getAttribute("servlet Nr");
						if(nrDinServlet == null)
								nrDinServlet= 0d;//cast nr la double 
		
						Double nrDinJsp = (Double) request.getSession().getAttribute("JSP Nr");//va fi setat si calculat in JSP
						if(nrDinJsp == null)
							nrDinJsp= 0d;
						out.write(Double.toString(nrDinServlet));*/%><br/>
						<%//out.write(Double.toString(nrDinJsp));
						out.write(Double.toString((Double)request.getAttribute("Nr")));%></p> <!-- out e o variabila predefinita de jsp = streamul de iesire -->
</body>
</html>