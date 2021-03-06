<%@ include file="/common/taglibs.jsp"%>

<ww:set name="myprofit" value="%{getProfitList()}"/>
<ww:set name="admin" value="%{standcostAdmin()}"/>  


<form name="form"  method="post" action="profitList.html">

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key='profit.list'/> </td>
      </tr>
      
      <tr>
        <td>
       
        <a href="#" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-print'" id="reportButton">報表及設定</a>
           <div id="mm1" style="width:auto;">     
              <div data-options="iconCls:'icon-setting'" onclick="javascript:window.open('customerStandardCostList.html')">客戶標準成本設定</div> 
              <div class="menu-sep"></div> 
              <div data-options="iconCls:'icon-print'" onclick="prints()">列印營業額報表(By 客戶)</div> 
              <div data-options="iconCls:'icon-print'" onclick="prints3()">列印營業額報表(By 業務)</div> 
              <div class="menu-sep"></div>
              
              <div data-options="iconCls:'icon-print'" onclick="prints1()">列印標準成本統計報表</div> 
              <div data-options="iconCls:'icon-print'" onclick="prints2()">列印應收帳款明細表(請選擇起訖日、客戶)</div>
              <div class="menu-sep"></div>
              <div data-options="iconCls:'icon-print'" onclick="prints4()">平均標準成本/單價</div>  
           </div>   
            
        </td>
      </tr>
      
      
      
      <tr class="cActionButtonLine">
        <td>
        
         
          	訂單編號/銷貨單
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
          
          修改標準成本
          <input name="scost" type="checkbox" id="checkbox" value="1" />
          
          
          
          
          <input type="submit" value="<fmt:message key="common.search"/>" class="cButton">
          
          
                      	
                          	
          <!-- 	
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-print'" onclick="javascript:prints()">列印營業額報表(By 客戶)</a>
       
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-print'" onclick="javascript:prints1()">列印標準成本統計報表</a>
        	
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-print'" onclick="javascript:prints2()">列印應收帳款明細表(請選擇起訖日、客戶)</a>
        	-->
        	
        	
<br>


<ww:if test="profitSum != null">  
<font size="4px">
<div align="center">
<fmt:message key="profit.salesCost"/>:${profitSum.salesCostSumStr}  / <fmt:message key="profit.purchase"/>:${profitSum.purchaseSumStr} / 費用單:${profitSum.profitFeeSumStr} / <fmt:message key="profit.salesPrice"/>:${profitSum.salesPriceSumStr}  /  <fmt:message key="profit.profit"/>:${profitSum.profitSumStr} / <fmt:message key="profit.profitPerc"/>:${profitSum.profitPerc}
</div>
</font>
</ww:if>
          
        </td>
      </tr>
      <tr>
        <td>

<c:set var="count" value="0" />
<display:table name="myprofit" class="list" cellspacing="1" requestURI="profitList.html" id="row" export="true" pagesize="${GLOBAL_pagesize}" sort="list"  >
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
    

   <ww:if test="${admin} == true">	
    <display:column title="設定標準成本" media="html"> 
    	  <a href="standardCostList.html?profit.salesNo=${row.salesNo}" target="_blank">
        <img src="${ctx}/images/settings.png" border="0"/>
        </a>
    </display:column> 
   </ww:if> 
    
      
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
	 function prints()
	 {
	 	var startDate=$('#startDate').val();
	 	var endDate=$('#endDate').val();
	 	if (startDate == '' || endDate == '' ) {
      $.messager.alert('系統訊息', '請選擇起訖日為必填欄位!', 'error');
      return false;
    }                    
	 	var urls='http://192.168.1.222/?rpt=5&startDate='+startDate+'&endDate='+endDate;	
	 	window.open(urls);
	 }
	 
	 function prints1()
	 {
	 	var projectNo=$('#projectNo').val();
	 	var startDate=$('#startDate').val();
	 	var endDate=$('#endDate').val();
	 	var urls='http://192.168.1.222/?rpt=12&saleNo='+projectNo+'&startDate='+startDate+'&endDate='+endDate;
	 	//alert('prints startDate='+startDate);
	 	window.open(urls);
	 }
	 
	 function prints2(){
	  var start=$('#startDate').val();
	 	var end=$('#endDate').val();
	 	var customerId=$('#allCustomer').val();
	 	//alert(start+'--'+end+'--'+customerId);
	 
	                if (start == '' || end == '' || customerId == '') {
                     $.messager.alert('系統訊息', '請選擇起訖日、客戶為必填欄位!', 'error');
                     return false;
                   }    
           
	                 $.ajax({
                      url: 'CIPReport001JSON.html',
                      type: "POST",        
                      data: {'start':start,'end':end,'customerId':customerId}, 
                      dataType:'text',
                      success: function(data) {          	            
        	             //alert('print');
        	             window.open('http://192.168.1.222/?rpt=20');
                      }
                    }); 
                   
                    
	 }
	 
	 function prints3()
	 {
	 	var startDate=$('#startDate').val();
	 	var endDate=$('#endDate').val();
	 	if (startDate == '' || endDate == '' ) {
      $.messager.alert('系統訊息', '請選擇起訖日為必填欄位!', 'error');
      return false;
    }                    
	 	var urls='http://192.168.1.222/?rpt=22&startDate='+startDate+'&endDate='+endDate;	
	 	window.open(urls);
	 }
	 
	  function prints4()
	 {
	 	var startDate=$('#startDate').val();
	 	var endDate=$('#endDate').val();
	 	if (startDate == '' || endDate == '' ) {
      $.messager.alert('系統訊息', '請選擇起訖日為必填欄位!', 'error');
      return false;
    }                    
	 	var urls='http://192.168.1.222/?rpt=26&startDate='+startDate+'&endDate='+endDate;	
	 	window.open(urls);
	 }
</script>	


