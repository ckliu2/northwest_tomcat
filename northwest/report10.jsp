<%@ include file="/common/taglibs.jsp"%>



<div id="w" class="easyui-window" title="Modal Window" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:600px;height:500px;padding:10px;"></div>
       
 

<form name="form1" method="post">
	


<table width="100%" border="0">
  <tr>
    <td><table width="100%" border="0">
      <tr>
        <td><table width="100%" border="0" cellspacing="1" class="cContentTable">
          <tr>
            <td class="cContentTitle" colspan="3" >產品/客戶/售價</td>
          </tr>
          
           <tr>
            <td class="cContentTitle" colspan="3" >
              <a href="#" class="easyui-linkbutton" iconcls="icon-print" onclick="mquery()">查詢</a>	
            </td>
          </tr>
          
          <tr>
            <td width="134" class="cInputCaption"><fmt:message key="product.analysis.timeduring"/></td>
            <td width="524" colspan="2" class="cInputColumn">           
              <ww:datepicker cssClass="cInputTextFieldShort" name="startDate" id="startDate" value="%{startDate}" language="zh" format="%Y%m%d" />
              ~
              <ww:datepicker cssClass="cInputTextFieldShort" name="endDate" id="endDate" value="%{endDate}" language="zh" format="%Y%m%d" />            
            </td>
          </tr>
          
          <tr>
            <td width="134" class="cInputCaption">客戶</td>
            <td width="524" colspan="2" class="cInputColumn">  
            	         
            <input class="easyui-combobox" name="customers" id="customers" style="width:80%;" data-options="
                    url:'findCustomerByJSON.html?q=',
                    method:'get',
                    valueField:'id',
                    textField:'name',                  
                    multiple:true,
                    panelHeight:'auto',
                   
                    labelPosition: 'top'
                    ">
            </td>
          </tr>
          
          <tr>
            <td nowrap class="cInputCaption">產品(s)</td>
            <td width="50%" class="cInputColumn"><table>
              <tr>
                <th colspan="3" align="center"><div align="left" class="cLabel"><fmt:message key="product.keyword"/>:
                   <!--
                   <input type="text" name="productKeyWord" value="${productKeyWord}" 
                    onPropertyChange="queryKeyWord2(this.value, 'allProduct', 'findProductByJSON.html', 'q');" 
                    oninput="queryKeyWord2(this.value, 'allProduct', 'findProductByJSON.html', 'q');"
                   />
                   -->
                   
                    <input type="text" name="productKeyWord" id="productKeyWord"/>
                     &nbsp;&nbsp;&nbsp;
                    <input type="button" value="<fmt:message key="common.search"/>" class="cButton" onClick="javascript:search();">      
     
                   
                </div></th>
              </tr>
              <tr>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.available"/><fmt:message key="product.id"/>
                  </style></th>
                <th>&nbsp</th>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.selected"/><fmt:message key="product.id"/>
                  </style></th>
              </tr>
              <tr>
                <td>                
                   <select name="allProduct" id="allProduct" multiple="true" size="8" Class="cQueryFieldList"/>
                </td>
                <td><input type="button" value=">>" class="cSelectButton" onClick="moveAll(allProduct, selectedProduct);">
                    <br>
                    <input type="button" value=">"  class="cSelectButton" onClick="moveOne(allProduct, selectedProduct);">
                    <br>
                    <input type="button" value="<"  class="cSelectButton" onClick="moveOne(selectedProduct, allProduct);">
                    <br>
                    <input type="button" value="<<" class="cSelectButton" onClick="moveAll(selectedProduct, allProduct);">
                    <br>
                </td>
                <td align="center">           
                   <ww:select name="selectedProductIds" id="selectedProduct"
                   list="productList"
                   listKey="id"
                   listValue="id+'-'+productName"
                   multiple="true"
                   size="8"
                   cssClass="cQueryFieldList"
                />              
                </td>
              </tr>
            </table>
            
            </td>
            
            <td width="50%" class="cInputColumn">
            	
            	
            </td>
          </tr>
          
    <td>
    	
    	
    </td>
   </tr>
  </table>
  </td>
 </tr>
 
</table>  
</form>









<script>
	
 function mquery(){
 	onSubmit();
  var startDate=$('#startDate').val();
  var endDate=$('#endDate').val();
  var products = $('#selectedProduct').val();   
  var customers = $('#customers').combobox('getValues'); 
   
	if (startDate == '' || endDate == '' || products == null  || customers == '') {
      $.messager.alert('系統訊息', '請選擇起訖日、產品、客戶為必填欄位!', 'error');
      return false;
  }        
   var myurl='http://192.168.1.222/?rpt=27&sdate='+startDate+'&edate='+endDate+'&customerIds='+customers+'&products='+products;       
   window.open(myurl);  
     
   //$('#report').attr("src", myurl);
   
 }	
	
	
 function onSubmit(){
   mySelectAll(document.form1.selectedProduct);	
   mySelectAll(document.form1.selectedCustomer);
 }
 
 function search(){
 	var productStr=$('#productKeyWord').val(); 	 
  $('#allProduct').empty(); 
  $.ajax({
    url: 'findProductByJSON.html',
    dataType: "json",
    type: "POST",
    data: {
        "q": productStr
    },
    success: function(rows) {    	    	
    	rows.forEach(function (item, index) {
    		 console.log(index,item.id,item.name);
    		 $("#allProduct").append(new Option(item.id+'-'+item.name, item.id)); 
    	});    	
    }
   });   
 }	
 
</script>

