<%@ include file="/common/taglibs.jsp"%>
<ww:set name="ls" value="%{getUserOwnStepList()}"/>  
<c:out value="${ls}" escapeXml="false"/>