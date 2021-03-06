<%@ include file="/common/taglibs.jsp"%>

<table border="0" cellspacing="1" class="cContentTable1">
      <tr>
        <td class="cContentTitle" >正航訂單測試</td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editOrderBill.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
         </ww:if>
        <ww:else>
            <button onclick="location.href='editOrderBill.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="orderBillList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column property="billNo" sortable="true" title="訂單編號"/>
    <display:column property="project.projectName" sortable="true" title="專案名稱"/>
    <display:column property="customer.name" sortable="true" title="客戶名稱"/>
    <display:column property="billDate" sortable="true" title="訂購日期" />
    
    
    <display:column titleKey="common.action">     
      <a href="editOrderBill.html?orderBill.id=${row.id}"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
    </display:column>
    <c:set var="count" value="${count+1}" />
   
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editOrderBill.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editOrderBill.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
</table>

