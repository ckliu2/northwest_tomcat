<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{findMemberByJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>