<%@ include file="/common/taglibs.jsp"%>
2222
<ww:set name="myprofit" value="%{getProfitList2()}"/>

<form name="form"  method="post" action="profitList.html">

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key='profit.list'/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        
         
          	專案/訂單編號
          	:<ww:textfield name="projectNo" value="%{projectNo}"  cssClass="cInputTextFieldShort" />
          
          <fmt:message key='profit.customer'/>:     
                <ww:select name="customerId" id="allCustomer"
                headerKey=""
                headerValue="%{getText('common.pleaseSelect')+getText('profit.customer')}..."
                list="customerList"
                listKey="id"
                listValue="id+'-'+name"
                cssClass="cQueryFieldList"                              
                /> 
          <fmt:message key='profit.customer.query'/>:
          
          <textarea name="input"  
          oninput="queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');"
          onPropertyChange="queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');"  
          cols="10"  rows="1"></textarea>                      
          
          <fmt:message key='profit.Intervaly'/>:   

            <ww:datepicker cssClass="cInputTextFieldTiny" name="startDate" id="startDate" value="%{startDate}" language="zh" format="%Y%m%d" />            
            ~
            <ww:datepicker cssClass="cInputTextFieldTiny" name="endDate" id="endDate" value="%{endDate}" language="zh" format="%Y%m%d" />            
         <br>
         
          <fmt:message key='profit.salesmen'/>:
           <ww:select name="salesmenId" 
                headerKey=""
                headerValue="%{getText('common.pleaseSelect')+getText('profit.salesmen')}..."
                list="salesmenList"
                listKey="id"
                listValue="name"
                cssClass="cQueryFieldList"                              
             /> 
          
          
          
          
          
          <input type="submit" value="<fmt:message key="common.search"/>" class="cButton">
<br>


<ww:if test="profitSum != null">  
<font size="4px">
<div align="center">
<fmt:message key="profit.salesCost"/>:${profitSum.salesCostSumStr}  / <fmt:message key="profit.purchase"/>:${profitSum.purchaseSumStr} / <fmt:message key="profit.salesPrice"/>:${profitSum.salesPriceSumStr}  /  <fmt:message key="profit.profit"/>:${profitSum.profitSumStr} / <fmt:message key="profit.profitPerc"/>:${profitSum.profitPerc}
</div>
</font>
</ww:if>
          
        </td>
      </tr>
      <tr>
        <td>

<c:set var="count" value="0" />
<display:table name="myprofit" class="list" cellspacing="1" requestURI="profitList.html" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list" partialList="true" size="${RESULT_SIZE}">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <%--	
    <display:column property="projectNo" sortable="true" titleKey="profit.id" style="text-align:left" />   
    
    <display:column property="billNo" sortable="true" title="訂單編號" style="text-align:left" />
    
    
    <display:column property="salesNo" sortable="true" titleKey="profit.salesNo" style="text-align:left" />
    
    <display:column property="billDate" sortable="true" titleKey="profit.Intervaly" style="text-align:left" />   
    
    <display:column property="projectName" sortable="true" titleKey="bill.projectName" style="text-align:left" />
    <display:column property="customer.id" sortable="true" titleKey="customer.id" />         
    <display:column property="customer.name" sortable="true" titleKey="profit.customer" /> 
    <display:column property="salesmen.name" sortable="true" titleKey="profit.salesmen" />        	
    <display:column property="billDate" sortable="true" titleKey="common.date" />   
    <display:column property="salesCost" sortable="true" titleKey="profit.salesCost" decorator="com.base.web.displaytag.ThousandsDecorator"/>  
    <display:column property="purchase" sortable="true" titleKey="profit.purchase" decorator="com.base.web.displaytag.ThousandsDecorator"/>  
    <display:column property="salesPrice" sortable="true" titleKey="profit.salesPrice" decorator="com.base.web.displaytag.ThousandsDecorator"/>  
    
    <display:column property="discount" sortable="true" titleKey="profit.discount" decorator="com.base.web.displaytag.ThousandsDecorator"/>  
    
    <display:column property="profit" sortable="true" titleKey="profit.profit" decorator="com.base.web.displaytag.ThousandsDecorator"/>  
    <display:column property="profitPerc" sortable="true" titleKey="profit.profitPerc" /> 
    <display:column title="">
        <a href="profitDetail.html?profit.salesNo=${row.salesNo}" target="_blank">
        <img src="${ctx}/images/GridView.gif" border="0"/>
        </a>
    </display:column>  
    --%>
    
    <display:column title="標準成本">
    	${row.salesNo}
        <a href="profitDetail.html?profit.salesNo=" target="_blank">
        <img src="${ctx}/images/GridView.gif" border="0"/>
        </a>
    </display:column> 
      
    <display:column title="">
      ${row.remark}
    </display:column>      
    <c:set var="count" value="${count+1}" />
</display:table>

        </td>
    </tr>
      
</table>

</form>