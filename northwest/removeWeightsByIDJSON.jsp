<%@ include file="/common/taglibs.jsp"%>

<ww:set name="ls" value="%{removeWeightsByIDJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>