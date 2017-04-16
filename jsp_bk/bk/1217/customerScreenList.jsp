<%@ include file="/common/taglibs.jsp"%>
<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css" />
<script type="text/javascript" src="${ctx}/scripts/list.js"></script>
<script type="text/javascript" src="${ctx}/scripts/common.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx}/css/displaytag.css" />


<table width="100%" border="0">
  <tr>
    <td align="left" valign="top">

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key="customerScreen.list"/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editCustomerScreen.html?customerdetail.id=${customerdetail.id}'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
       </ww:if>
        <ww:else>
            <button onclick="location.href='editCustomerScreen.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="1" />
<display:table name="customerScreenList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column titleKey="common.select">
        ${count}
    </display:column>  
    <display:column property="customerDetail.customer.name" sortable="true" titleKey="customer.name" style="text-align:left"/>    
    <display:column property="customerDetail.counter" sortable="true" titleKey="customerdetail.counter" style="text-align:left"/>    
    <display:column property="name" sortable="true" titleKey="customerScreen.name" style="text-align:left" />
    <display:column property="memo" sortable="true" titleKey="customerScreen.memo" style="text-align:left" />
    <display:column titleKey="customerScreen.customerScreenFiles">
           <c:forEach var="files" items="${row.customerScreenFiles}">
                <img src="${ctx}/upload/customerScreen/${row.id}/${files.fileName}" width="50" height="50"/> 
           </c:forEach>  
    </display:column>      
    
    <display:column titleKey="common.action">
        <ww:if test="recordEditable == true">
            <a href="editCustomerScreen.html?customerScreen.id=<c:out value="${row.id}"/>&customerdetail.id=${customerdetail.id}"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
            <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.name}" /><fmt:message key="common.confirmDelete2"/>', 'form1', 'customerScreen.id', '${row.id}')"><fmt:message key="common.delete"/></a>
        </ww:if>
        <ww:else>
           <a href="editCustomerScreen.html?customerScreen.id=<c:out value="${row.id}"/>"><fmt:message key="common.view"/></a>&nbsp;&nbsp;
        </ww:else>
    </display:column>
   
    
    
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editCustomerScreen.html?customerdetail.id=${customerdetail.id}'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editCustomerScreen.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
</table>
<form name="form1" action="saveCustomerScreen.html">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="customerScreen.id" value="">
    <input type="hidden" name="customerdetail.id" value="${customerdetail.id}">
    <select name="selectedCustomerScreenIds" multiple="true" style="display:none"></select>
</form>



    </td>
  </tr>
</table>