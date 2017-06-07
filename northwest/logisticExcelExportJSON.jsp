<%@ include file="/common/unsecureTaglibs.jsp"%>
<ww:set name="ls" value="%{logisticExcelExportJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>