<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{freightIdByJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>