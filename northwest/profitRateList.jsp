<%@ include file="/common/taglibs.jsp"%>

<ww:set name="myprofit1" value="%{getProfitRateList()}"/>


<form name="form"  method="post" action="profitRateList.html">

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key='profit.list'/> </td>
      </tr>
     
      <tr class="cActionButtonLine">
        <td>
            <fmt:message key='profit.Intervaly'/>:  
            	 
            <ww:datepicker cssClass="cInputTextFieldTiny" name="startDate" id="startDate" value="%{startDate}" language="zh" format="%Y%m%d" />            
            ~
            <ww:datepicker cssClass="cInputTextFieldTiny" name="endDate" id="endDate" value="%{endDate}" language="zh" format="%Y%m%d" />            
            
            <ww:select name="tag"               
               list="choice"
               listKey="id"
               listValue="value"
               cssClass="cInputListField"
            />
            
            利潤率 :           
            <ww:textfield name="profitPerc" value="%{profitPerc}" cssClass="cInputTextFieldTiny" />
            
            <input type="submit" value="查詢"/>
            
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" value="利潤報表即時運算(需要約一小時時間)" onclick="reca()"/>
            
        </td>
      </tr>
      <tr>
        <td>

<c:set var="count" value="0" />
<display:table name="myprofit1" class="list" cellspacing="1" requestURI="profitRateList.html" id="row" export="true" pagesize="${GLOBAL_pagesize}" sort="list"  >
    <display:setProperty name="paging.banner.placement" value="bottom" />
    
    <display:column title="" media="html"> 
    	<ww:if test="${row.standcost} == true">
    	 <img src="${ctx}/images/news.gif" width='30'/>
      </ww:if>
    </display:column>		
    	
    	
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
    <display:column title="" media="html">
        <a href="profitDetail.html?profit.salesNo=${row.salesNo}" target="_blank">
        <img src="${ctx}/images/GridView.gif" border="0"/>
        </a>
    </display:column>  
    

  

    <display:column title="備註">
      ${row.remark}
    </display:column>   
    
   
       
    <c:set var="count" value="${count+1}" />
</display:table>

        </td>
    </tr>
      
</table>

</form>


<script>
	function reca(){
		alert('執行中，請耐心等待...');
		
			 $.ajax({
             url: 'calculateProfitJSON.html',
             type: "POST",     
             async: true, 
             dataType: "json",
             success: function(data) { 
             	 alert('successful');
            }
           }); 
           
	}
</script>	




