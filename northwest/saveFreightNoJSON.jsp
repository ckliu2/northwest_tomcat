<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{saveFreightNoJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>