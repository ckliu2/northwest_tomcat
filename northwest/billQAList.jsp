<%@ include file="/common/taglibs.jsp"%>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" >[ ${bill.id} ] <fmt:message key="billQA.list"/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
          <button onclick="location.href='editBillQA.html?bill.id=${bill.id}'" class="cButton"><fmt:message key="common.new"/></button>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="billQAList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />   
    <display:column property="id" sortable="true" title="編號" style="text-align:left" />
    <display:column property="bill.id" sortable="true" title="訂單編號" style="text-align:left" />
    <display:column property="bill.customer.name" sortable="true" title="客戶" style="text-align:left" />    	
    <display:column property="question" sortable="true" titleKey="billQA.question" style="text-align:left" />
    <display:column property="answer" sortable="true" titleKey="billQA.answer" style="text-align:left" />
    	
    <display:column sortable="true" title="通知人員" style="text-align:left">   
     ${row.notificationMembers}
    </display:column>
    
    <display:column sortable="true" titleKey="common.createdDate" style="text-align:left">   
     <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${row.createdDate}" />
    </display:column>   
    <display:column titleKey="common.action">
         <a href="editBillQA.html?billQA.id=<c:out value="${row.id}&bill.id=${row.bill.id}"/>"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
         <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.id}" /><fmt:message key="common.confirmDelete2"/>', 'form1', 'billQA.id', '${row.id}')"><fmt:message key="common.delete"/></a>
    </display:column>
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
            <button onclick="location.href='editBillQA.html?bill.id=${bill.id}'" class="cButton"><fmt:message key="common.new"/></button>
       </td>
      </tr>
</table>
<form name="form1" action="saveBillQA.html">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="billQA.id" value="">
    <select name="selectedBillQAIds" multiple="true" style="display:none"></select>
</form>
