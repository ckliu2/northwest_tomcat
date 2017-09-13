<%@ include file="/common/taglibs.jsp"%>

<ww:set name="ls" value="%{weightsByOutputEquipmentJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>