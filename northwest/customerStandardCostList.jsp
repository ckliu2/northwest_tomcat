<%@ include file="/common/taglibs.jsp"%>
<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css" />
<link rel="stylesheet" type="text/css" href="${ctx}/css/displaytag.css" />  

<!---easyui-->
<script src="${ctx}/scripts/common.js"></script>
<script src="${ctx}/scripts/jquery-1.7.2.js"></script> 
<link rel="stylesheet" type="text/css" href="${ctx}/css/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctx}/css/icon.css">
<script type="text/javascript" src="${ctx}/scripts/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${ctx}/scripts/easyui-lang-zh_CN.js"></script>


<form id="form1" name="form1" method="post" action="saveCustomerStandardCost.html">	

<input type="hidden" name="customerStandardCost.id" value="${customerStandardCost.id}"/>

<table border="0" cellspacing="1" >
      <tr>
        <td class="cContentTitle" >        	
         利潤報表-客戶標準成本設定	
        </td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        	 <input class="easyui-combobox" id="customerId" name="customerStandardCost.customerId" style="width:450px" required="true" data-options="prompt:'客戶'"></input>
           &nbsp;&nbsp;
        	 <input class="easyui-combogrid" id="productIds" name="productIds" style="width:450px" required="true" data-options="prompt:'產品編號'"></input>
           &nbsp;&nbsp;         
        	 <input class="easyui-textbox" id="cost" name="customerStandardCost.cost" value="${customerStandardCost.cost}" style="width:100px" required="true" data-options="prompt:'標準成本'"></input>
        	 &nbsp;&nbsp; 
        	 <ww:radio name="submitId" id="submitId"
               list="submitList"
               listKey="id"
               listValue="value"
               cssClass="cInputListField"
            /> 
        	 
        	 
        	
        	 
        	 &nbsp;&nbsp;
        	 
        	 
        	 <input type="button" name="button" value="送出" onclick="submitForm()"/>
      
         </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="customerStandardCostList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="50" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    
    
    <display:column property="customer.id" sortable="true" title="客戶編號" style="text-align:left"/>
    <display:column property="customer.name" sortable="true" title="客戶名稱" style="text-align:left"/>
    
    <display:column property="product.id" sortable="true" title="產品編號" style="text-align:left"/>
    <display:column property="product.productName" sortable="true" title="產品名稱" style="text-align:left"/>
    <display:column property="cost" sortable="true" title="標準成本" />
    <display:column titleKey="common.action">
       <a href="javascript:remove('${row.id}')"><fmt:message key="common.delete"/></a>
    </display:column>
  
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
        
        </td>
      </tr>
</table>

</form> 

<form name="form2" action="saveCustomerStandardCost.html">
	  <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="customerStandardCost.id" value="">  
</form>




<script>
	
	 $(document).ready(function () {
	 	
	 	
	 	$("#customerId").combobox({
      	method: 'get',
      	url: 'customerJSON.html?customer.id=${customerStandardCost.customerId}',
      	width:200,
        panelHeight:'auto',       
        valueField:'value',
        textField:'text',            
        mode:'remote',  
        required:true,      
        onChange:function(oldVal, newVal) {   
         var url="customerJSON.html?keyword="+oldVal;  
         $('#customerId').combobox('reload', url); 
        }        
    });  

    
	 });
	 
	 
	  $(function(){
 	
            $('#productIds').combogrid({              
                url: 'productJSON.html',
                idField:'value',
                textField:'text',
                mode:'remote',
                multiple: true,
                fitColumns:true,
                columns:[[
                     {field:'ck',checkbox:true},
                     {field:'value',title:'產品編號'},
                     {field:'text',title:'產品名稱'}     
                ]]                 
            });
            
        });
	 
	 
 function checknum(str){
 	var reg=new RegExp('^\\d+(\\.\\d+)?$');
 	if(reg.test(str)){
 		return 0;
 	}else{
 		return 1;
 	} 
 }

	 
	function remove(id)
	{
		//alert('id='+id);
		$.ajax({
             url: 'saveCustomerStandardCost.html',
             type: "POST",        
             data: {"customerStandardCost.id":id,"delete":'yes'}, 
             dataType: "json",
             success: function(data) {              
             	 window.location="customerStandardCostList.html?customer.id="+data.customerId;             	 
            }
           }); 
	} 
	 
	function submitForm(){
		var customerId=$('#customerId').combobox('getValue');	   
    var productIds = $('#productIds').combogrid('getValues').toString();
    var cost=$('#cost').val();	
  
    var submitId = $('input[name=submitId]:checked').val();
    //alert('submitId='+submitId);
    if(submitId==1)
    {
    	window.location="customerStandardCostList.html?customer.id="+customerId;
    }else{
    
    if(checknum(cost)==0 && productIds!=''  && customerId!='')
    {
    	//form1.submit();
    	
    	$.ajax({
             url: 'saveCustomerStandardCost.html',
             type: "POST",        
             data: {"customerStandardCost.customerId":customerId,"productIds":productIds,"customerStandardCost.cost":cost}, 
             dataType: "json",
             success: function(data) { 
             	 //alert(data.customerId);
             	 window.location="customerStandardCostList.html?customer.id="+data.customerId;
             	 
            }
           }); 
    	
    	
    	
    	
    	
    }else{
    	alert('客戶、品項、標準成本為必填欄位!\n標準成本為數值欄位');
    }	
    
   }
	} 
	
</script>	