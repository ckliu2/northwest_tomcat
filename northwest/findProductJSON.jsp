<%@ include file="/common/unsecureTaglibs.jsp"%>
<ww:set name="ls" value="%{findProductJSON()}"/>  
<c:out value="${ls}" escapeXml="false"/>