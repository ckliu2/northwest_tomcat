<%@ include file="/common/unsecureTaglibs.jsp"%>
<ww:set name="ls" value="%{recipientDBJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>