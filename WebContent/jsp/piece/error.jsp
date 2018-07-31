<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page pageEncoding="UTF-8" isErrorPage="true" %>
<c:set var="exception" value="${requestScope['javax.servlet.error.exception']}"/>
<jsp:scriptlet>
exception.printStackTrace(response.getWriter());
</jsp:scriptlet>