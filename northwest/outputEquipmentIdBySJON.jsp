﻿<%@ include file="/common/unsecureTaglibs.jsp"%>
<ww:set name="ls" value="%{outputEquipmentIdBySJON()}"/>  
<c:out value="${ls}" escapeXml="false"/>