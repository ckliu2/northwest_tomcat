<%@ include file="/common/unsecureTaglibs.jsp"%>
 
<div align="center" class="barcodeLabel">正航訂單測試</div>

<a href="orderBillList.html">回到正航訂單測試清單</a>
<table width="100%" border="1">
  <tr>
    <td width="70%">

<form name="form1" action="saveOrdBill.html" method="post"> 
    <ww:hidden name="orderBill.id" value="${orderBill.id}"/>
    <ww:hidden name="orderBill.flag" value="2"/>
            
    <table width="100%" border="1" class="cContentTable">
      <tr>
        <td class="cInputCaption"><span class="cRequired">*</span>訂單日期:
          <ww:textfield name="orderBill.billDate" value="%{orderBill.billDate}" cssClass="cInputTextFieldTiny" maxlength="8"/>
        </td>
        <td class="cInputCaption"><span class="cRequired">*</span>專案號碼:
           <input type="text" name="project.id" id="projectId" value="${orderBill.project.id}" class="cInputTextFieldShort" readonly="true" required/>
        </td>
        
        <td class="cInputCaption"><span class="cRequired">*</span>專案名稱:
          <input type="text" name="project.projectName" value="${orderBill.project.projectName}" class="cInputTextFieldShort" required/>
        </td>
      </tr>
      <tr>
        <td class="cInputCaption"><span class="cRequired">*</span>客戶編號:
            <ww:select name="orderBill.customerId" 
               headerKey=""
               headerValue="%{getText('common.pleaseSelect')}..."
               list="customerList"
               listKey="id"
               listValue="name"
               cssClass="cInputListField"
            />
        </td>
        <td class="cInputCaption"></td>
        <td class="cInputCaption"></td>
      </tr>
      <tr>
        <td colspan="3" class="cInputCaption">送貨地點:
         <ww:textfield name="orderBill.addressID" value="%{orderBill.addressID}" cssClass="cInputTextFieldTiny" />
         <ww:textfield name="orderBill.zipCode" value="%{orderBill.zipCode}" cssClass="cInputTextFieldTiny" />
         <ww:textfield name="orderBill.custAddress" value="%{orderBill.custAddress}" cssClass="cInputTextField" />
        </td>        
      </tr>
      <tr>
        <td class="cInputCaption">聯絡人員:<ww:textfield name="orderBill.linkMan" value="%{orderBill.linkMan}" cssClass="cInputTextFieldShort" /></td>
        <td class="cInputCaption">職稱:<ww:textfield name="orderBill.linkManProf" value="%{orderBill.linkManProf}" cssClass="cInputTextFieldShort" /></td>
        <td class="cInputCaption">電話:<ww:textfield name="orderBill.linkTelephone" value="%{orderBill.linkTelephone}" cssClass="cInputTextFieldShort" /></td>
      </tr>
      
      
      <tr>
        <td class="cInputCaption"><span class="cRequired">*</span>業務人員:
            <ww:select name="orderBill.salesManId" 
               headerKey=""
               headerValue="%{getText('common.pleaseSelect')}..."
               list="salesmenList"
               listKey="id"
               listValue="name"
               cssClass="cInputListField"
            />
        </td>
        <td class="cInputCaption">製單人員:
            <ww:select name="orderBill.makerId" 
               headerKey=""
               headerValue="%{getText('common.pleaseSelect')}..."
               list="makerList"
               listKey="id"
               listValue="name"
               cssClass="cInputListField"
            />
       
        </td>
        <td class="cInputCaption"> 
        </td>
      </tr>
      
      
      
      <tr>
        <td colspan="3" class="cInputCaption">
         <div align="center">
          <input type="submit" name="button" value="儲存" class="cButton"/>
        </div>
       </td>
      </tr>
      
    </table>

</form>    
    
    </td>
    <td rowspan="2" align="left" valign="top">



<form name="form2" id="form2" action="saveOrdBillSub.html" method="post"> 
    <ww:hidden name="orderBill.id" value="${orderBill.id}"/>
    <ww:hidden name="ordBillSub.id" value="${ordBillSub.id}"/>
    <ww:hidden name="ordBillSub.flag" value="2"/>
    
    <table width="100%" border="0">
      <tr>
        <td colspan="2"><div align="center">品名明細</div></td>
        </tr>
      <tr>
      
      <tr>
        <td class="cInputCaption2">項次</td>
        <td class="cInputCaption2">
           <input type="text" name="ordBillSub.rowNO" id="ordBillSubRowNO" value="${ordBillSub.rowNO}" class="cInputTextFieldTiny" />
        </td>
      </tr>
      
        <td width="32%" class="cInputCaption2">
         產品編號/名稱:
        </td>
        <td width="68%" class="cInputCaption2">
        
          <input class="easyui-combobox" name="ordBillSub.productId" id="productId"  style="width:150px;" 
           data-options="
				   url: 'ordBillSubProductJSON.html?productNo=${ordBillSub.productId}',
				   method: 'get',
				   valueField: 'id',
				   textField: 'text',
				   panelWidth: 150,
				   panelHeight: 'auto'
			    ">
        
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">實際寬(cm)</td>
        <td class="cInputCaption2">
         <input type="text" name="ordBillSub.width"  id="ordBillSubWidth" value="${ordBillSub.width}" class="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">實際高(cm)</td>
        <td class="cInputCaption2"><ww:textfield name="ordBillSub.heigh" value="%{ordBillSub.heigh}" cssClass="cInputTextFieldTiny" /></td>
      </tr>
      <tr>
        <td class="cInputCaption2">可見寬(cm)</td>
        <td class="cInputCaption2"><ww:textfield name="ordBillSub.vwidth" value="%{ordBillSub.vwidth}" cssClass="cInputTextFieldTiny" /></td>
      </tr>
      <tr>
        <td class="cInputCaption2">可見高(cm)</td>
        <td class="cInputCaption2"><ww:textfield name="ordBillSub.vheigh" value="%{ordBillSub.vheigh}" cssClass="cInputTextFieldTiny" /></td>
      </tr>
      <tr>
        <td class="cInputCaption2">進位法</td>
        <td class="cInputCaption2">
           <ww:select name="ordBillSub.crementId"                
               list="crementList"
               listKey="id"
               listValue="caption_"
               cssClass="cInputListField"
            />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">計算式顯示</td>
        <td class="cInputCaption2">
          <ww:textfield name="ordBillSub.calcDisp" value="%{ordBillSub.calcDisp}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">計算面積</td>
        <td class="cInputCaption2"> 
          <ww:textfield name="ordBillSub.calcArea" value="%{ordBillSub.calcArea}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">每張單價</td>
        <td class="cInputCaption2">        
         <ww:textfield name="ordBillSub.paperPrice" value="%{ordBillSub.paperPrice}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">張數</td>
        <td class="cInputCaption2">
         <ww:textfield name="ordBillSub.paperCount" value="%{ordBillSub.paperCount}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">單價</td>
        <td class="cInputCaption2">
          <ww:textfield name="ordBillSub.sprice" value="%{ordBillSub.sprice}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">金額</td>
        <td class="cInputCaption2">
           <ww:textfield name="ordBillSub.amount" value="%{ordBillSub.amount}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">交易數量</td>
        <td class="cInputCaption2">
         <ww:textfield name="ordBillSub.squantity" value="%{ordBillSub.squantity}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">基本數量</td>
        <td class="cInputCaption2">
         <ww:textfield name="ordBillSub.quantity" value="%{ordBillSub.quantity}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">輔助數量</td>
        <td class="cInputCaption2">
         <ww:textfield name="ordBillSub.equantity" value="%{ordBillSub.equantity}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">(含稅金額)</td>
        <td class="cInputCaption2">
           <span id="amountTax"></span>
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">預交貨日</td>
        <td class="cInputCaption2">
           <ww:textfield name="ordBillSub.preInDate" value="%{ordBillSub.preInDate}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">贈品</td>
        <td class="cInputCaption2">
          <ww:checkbox name="ordBillSub.isGift" cssClass="cCheckboxField" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">(未出數量)</td>
        <td class="cInputCaption2">
          <ww:textfield name="ordBillSub.qtyRemain" value="%{ordBillSub.qtyRemain}" cssClass="cInputTextFieldTiny" />
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">細項描述</td>
        <td class="cInputCaption2">
          <ww:textarea name="ordBillSub.detail" value="%{ordBillSub.detail}" cols="15" rows="4"/>
        </td>
      </tr>
      <tr>
        <td class="cInputCaption2">分錄備註</td>
        <td class="cInputCaption2">
        
         <ww:textarea name="ordBillSub.itemRemark" value="%{ordBillSub.itemRemark}" cols="15" rows="4" />
        </td>
      </tr>
      
      <tr>
        <td colspan="2" class="cInputCaption2">     
        <div align="center">   
          <input type="submit" name="saveOrdBillSubButton" id="saveOrdBillSubButton" value="新增/修改品項" class="cButton" />
        </div>  
        </td>       
      </tr>
      
    </table>

</form>

    
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    
    <display:table name="ordBillSubList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    
    <display:column property="rowNO" sortable="true" title="序號"/>
    
    <display:column title="產品編號/名稱">
     ${row.product.id} <br> ${row.product.productName} 
    </display:column>
    <display:column property="width" sortable="true" title="實際寬(cm)" style="text-align:left" />
    
   
    <display:column property="heigh" sortable="true" title="實際高(cm)" style="text-align:left" />
    <display:column property="vwidth" sortable="true" title="可見寬(cm)" style="text-align:left" />
    <display:column property="vheigh" sortable="true" title="可見高(cm)" style="text-align:left" />

    <display:column titleKey="common.action">    
      <a href="editOrderBill.html?orderBill.id=${row.orderBill.id}&ordBillSub.id=${row.id}"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
      <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.id}" /><fmt:message key="common.confirmDelete2"/>', 'form3', 'ordBillSub.id', '${row.id}')"><fmt:message key="common.delete"/></a>
    </display:column>
   
</display:table>
    
    </td>
  </tr>
</table>

<form name="form3" action="saveOrdBillSub.html">
    <input type="hidden" name="orderBill.id" value="${orderBill.id}">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="ordBillSub.id" value="">   
</form>


<script>
var orderBillId='${orderBill.id}';
var ordBillSubId='${ordBillSub.id}';
 if(orderBillId==''){
 	$("#saveOrdBillSubButton").attr("disabled",true); 
 	prjno();
 }
 
 if(ordBillSubId==''){ 	
 	 rowno();
 }
 
  function rowno(){
  $.ajax({
  url: 'ordBillSubRowNo.html',
  type: "POST",      
  data: {"orderBill.id":orderBillId},  
  dataType: "json",
  success: function(data) {
  	var rowNo=data.rowNO;  
  	//alert("rowNo="+rowNo);
  	$("#ordBillSubRowNO").val(rowNo); 
  }
 });	
} 
	
 function prjno(){
 $.ajax({
  url: 'orderBillCurrentProjectNo.html',
  type: "POST",      
  dataType: "json",
  success: function(data) {
  	var pno=data.projectNo;  
  	//alert("pno="+pno);
  	$("#projectId").val(pno); 
  }
 });	
} 

/*
jQuery.validator.setDefaults({
  debug: true,
  success: "valid"
});
$("#form2").validate({
  rules: {
    ordBillSubWidth: {
      required: true,
      number: true
    }
  }
});
*/
 
</script> 

