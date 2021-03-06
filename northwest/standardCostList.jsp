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


<form id="form1" name="form1" method="post" action="saveStandardCost.html">	
<input type="hidden" name="standardCost.salesNo" value="${profit.salesNo}"/>	
<input type="hidden" name="standardCost.id" value="${standardCost.id}"/>

<table border="0" cellspacing="1" >
      <tr>
        <td class="cContentTitle" >        	
         <fmt:message key='profit.id'/>:${profit.projectNo}<BR><fmt:message key='profit.salesNo'/>:${profit.salesNo}	
        </td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        	
        	 <input class="easyui-combobox" id="productId" name="standardCost.productId" style="width:450px" required="true" data-options="prompt:'新增品項'"></input>
           &nbsp;&nbsp;         
        	 <input class="easyui-textbox" id="cost" name="standardCost.cost" value="${standardCost.cost}" style="width:100px" required="true" data-options="prompt:'新增標準成本'"></input>
        	 &nbsp;&nbsp;  
        	 <input type="button" name="button" value="新增/修改" onclick="submitForm()"/>
      
         </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="standardCostList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column property="product.id" sortable="true" title="產品編號" style="text-align:left"/>
    <display:column property="product.productName" sortable="true" title="產品名稱" style="text-align:left"/>
    <display:column property="cost" sortable="true" title="標準成本" />
    <display:column titleKey="common.action">
       <a href="standardCostList.html?profit.salesNo=${row.salesNo}&standardCost.id=${row.id}"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
       <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/>${row.product.id}-${row.product.productName}<fmt:message key="common.confirmDelete2"/>', 'form2', 'standardCost.id', '${row.id}')"><fmt:message key="common.delete"/></a>
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

<form name="form2" action="saveStandardCost.html">
	  <input type="hidden" name="standardCost.salesNo" value="${profit.salesNo}"/>
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="standardCost.id" value="">  
</form>




<script>
	
	 $(document).ready(function () {
	 	
	 	
	 	$("#productId").combobox({
      	method: 'get',
      	url: 'productJSON.html?product.id=${standardCost.product.id}',
      	width:300,
        panelHeight:'auto',       
        valueField:'value',
        textField:'text',            
        mode:'remote',  
        required:true,      
        onChange:function(oldVal, newVal) {   
         var url="productJSON.html?keyword="+oldVal;  
         $('#productId').combobox('reload', url); 
        },        
        onSelect:function(item) {          
          //alert(item.value + "---" + item.text);    
        }          
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

	 
	 
	function submitForm(){
    var productId=$('#productId').combobox('getValue');		
    var cost=$('#cost').val();		
    //alert('productId='+productId+'---cost='+cost+'---'+checknum(cost));
    if(checknum(cost)==0 && productId!='')
    {
    	form1.submit();
    }else{
    	alert('品項及標準成本為必填欄位!\n標準成本為數值欄位');
    }	
    
	} 
	
</script>	