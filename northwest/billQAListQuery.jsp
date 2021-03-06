<%@ include file="/common/taglibs.jsp"%>

<script type="text/javascript" src="/northwest/webwork/jscalendar/calendar.js"></script>
<script type="text/javascript" src="/northwest/webwork/jscalendar/lang/calendar-zh.js"></script>
<script type="text/javascript" src="/northwest/webwork/jscalendar/calendar-setup.js"></script>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" >訂單QA一覽表 (最多顯示300筆)</td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        	<form name="form1" action="billQAListQuery.html" method="post">
        		
        		客戶編號/名稱關鍵字 :
        		
        		<input type="input" class="cInputTextFieldTiny"
            oninput="queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');"
            onPropertyChange="queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');"
           /> 
                   
                <ww:select name="customerId" id="allCustomer"
                headerKey=""
                headerValue="%{getText('common.pleaseSelect')+getText('customer.name')}..."
                list="customerList"
                listKey="id"
                listValue="id+'-'+name"
                cssClass="cQueryFieldList"                              
                />
    
            &nbsp;&nbsp;  
 
            訂單編號 : <ww:textfield name="billno" value="%{billno}"  cssClass="cInputTextFieldShort" />
            	
           &nbsp;&nbsp;  
           
           訂單起訖日 : 
           <input type="text" name="startDate" id="startDate" class="cInputTextFieldTiny" maxlength="8" value="${startDate}"/>
           <a href="#" id="startDate_button"><img src="/northwest/webwork/jscalendar/img.gif" width="16" height="16" border="0" alt="Click Here to Pick up the date"></a>
              <script type="text/javascript">
               Calendar.setup({
               inputField     :    "startDate",
               ifFormat       :    "%Y%m%d",
               button         :    "startDate_button",
               step           :    1
              });
              </script>

              ~
          <input type="text" name="endDate" id="endDate" class="cInputTextFieldTiny" maxlength="8" value="${endDate}"/>
          <a href="#" id="endDate_button"><img src="/northwest/webwork/jscalendar/img.gif" width="16" height="16" border="0" alt="Click Here to Pick up the date"></a>
          <script type="text/javascript">
               Calendar.setup({
               inputField     :    "endDate",
               ifFormat       :    "%Y%m%d",
               button         :    "endDate_button",
               step           :    1
              });
          </script>
          	
            <input type="submit" value="<fmt:message key="common.search"/>" class="cButton">	
          	
          	</form>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="billQAListQuery" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />   
    <display:column property="id" sortable="true" title="編號" style="text-align:left" />
    <display:column property="bill.id" sortable="true" title="訂單編號" style="text-align:left" />
    <display:column property="bill.billDate" sortable="true" title="訂單日期" style="text-align:left" />
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
         <a href="editBillQA.html?query=1&billQA.id=<c:out value="${row.id}&bill.id=${row.bill.id}"/>"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
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

