<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{saveFreightJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>