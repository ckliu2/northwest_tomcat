<%@ include file="/common/unsecureTaglibs.jsp"%>
<ww:set name="ls" value="%{logisticsLastCodeJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>