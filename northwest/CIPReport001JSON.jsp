<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{CIPReport001JSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>
