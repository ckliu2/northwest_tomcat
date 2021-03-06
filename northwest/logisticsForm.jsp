<%@ include file="/common/taglibs.jsp"%>

<ww:set name="logistics" value="%{getLogisticsById()}"/> 



        <form id="ff" method="post">
            <table cellpadding="5">
            	
                <tr>
                    <td>貨運公司:</td>
                    <td>
                        <ww:select name="logistics.freightCompanyId" id="freightCompanyId" onchange="getLastCode()"
                        list="freightCompanyList"
                        listKey="id"
                        listValue="valueTw"
                        cssClass="cInputListField"
                        />
                    </td>
                </tr>
            	
            	  <tr>
                    <td>條碼編號:</td>
                    <td>
                        <input class="easyui-textbox" type="text" id="code"  data-options="required:true" value="${logistics.code}" style="width:400px"></input>
                    </td>
                </tr>
                
                
            	  <tr>
                    <td>訂單編號:</td>
                    <td>
                        <input id="billId" class="easyui-combobox" data-options="prompt:'訂單編號'" style="width:400px"  />
                    </td>
                </tr>
                
                <tr>
                    <td>其他訂單:</td>
                    <td>                     
                        <input class="easyui-textbox" type="text" id="otherBills" value="${logistics.otherBills}" style="width:400px"></input>
                    </td>
                </tr>
                
                <tr>
                    <td>備註:</td>
                    <td><input class="easyui-textbox" type="text" id="memo"  data-options="multiline:true" value="${logistics.memo}" style="width:400px;height:60px"></input></td>
                </tr>
                
                <tr>
                    <td>客戶:</td>
                    <td><span id='customer'/></td>
                </tr>
                <tr>
                    <td>業務:</td>
                    <td><span id='saleman'/></td>
                </tr>
                <tr>
                    <td>寄件人:</td>
                    <td>
                    	<input id="sender" class="easyui-combogrid" data-options="prompt:'請輸入寄件人...'" style="width:400px" value="${logistics.sender}" />
                    </td>
                </tr>
                <tr>
                    <td>寄件人電話:</td>
                    <td><input class="easyui-textbox" type="text" id="senderPhone" data-options="required:true" value="${logistics.senderPhone}" style="width:400px"></input></td>
                </tr>    
                <tr>
                    <td>寄件人地址:</td>
                    <td><input class="easyui-textbox" type="text" id="senderAddress"  data-options="required:true" value="${logistics.senderAddress}" style="width:400px"></input></td>
                </tr>          
                
                <tr>
                    <td>收件人:</td>
                    <td>
                    	<input id="recipient" class="easyui-combogrid" data-options="prompt:'請輸入收件人...'" style="width:400px" value="${logistics.recipient}" />
                    </td>
                </tr>
                <tr>
                    <td>收件人電話:</td>
                    <td><input class="easyui-textbox" type="text" id="recipientPhone"  data-options="required:true" value="${logistics.recipientPhone}" style="width:400px"></input></td>
                </tr>    
                <tr>
                    <td>收件人地址:</td>
                    <td><input class="easyui-textbox" type="text" id="recipientAddress"  data-options="required:true,multiline:true" value="${logistics.recipientAddress}" style="width:400px;height:60px"></input></td>
                </tr>     
                
                <tr>
                    <td>工作單備註:
                    	<br>
                      <a href="#" class="easyui-linkbutton" iconcls="icon-copy" plain="true" onclick="copy()">複製到地址</a> 	
                    </td>
                    <td>
                     <input class="easyui-textbox" type="text" id="addressMemo"  data-options="multiline:true"  style="width:400px;height:60px"></input>
    	             </td>
                </tr>  
                
                <tr>
                    <td>指定送達日:</td>
                    <td>
                     <input class="easyui-datebox" name="serviceDate" id="serviceDate" value="${logistics.serviceDate}"   style="width:100px" editable="false" data-options="formatter:myformatter,parser:myparser" /> 
    	             </td>
                </tr>
                
                 
                <tr>
                    <td>指定送達時段:</td>
                    <td>
                    	 <ww:select name="logistics.timeId" id="timeId" 
                        list="logisticsTimeList"
                        listKey="id"
                        listValue="valueTw"
                        cssClass="cInputListField"
                      />
                    </td>
                </tr>  
                
                <tr>
                    <td>最後修改日:</td>
                    <td><span id='lastModifiedDate'/></td>
                </tr>
                
                 <tr>
                    <td>建檔日:</td>
                    <td><span id='createdDate'/></td>
                 </tr>
                 
                 <tr>
                    <td>建檔人:</td>
                    <td><span id='member'/></td>
                 </tr>
                    
            </table>
        </form>        
        <div style="text-align:left;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-save" onclick="submitForm()">儲存</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-clear" onclick="clearForm()">清除</a>
        </div>

<script>
$('#member').html('${logistics.member.name}');	
$('#customer').html('${logistics.bill.customer.name}');
$('#saleman').html('${logistics.bill.customer.saleman.name}');	
$('#lastModifiedDate').html('<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${logistics.lastModifiedDate}" />');	
$('#createdDate').html('<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${logistics.createdDate}" />');	
$('#recipient').combogrid({      
                idField:'id',
                textField:'text',
                mode:'remote',         
                fitColumns:true,          
                columns:[[
                    {field:'ck',checkbox:true},
                    {field:'recipient',title:'收件人'},
                    {field:'recipientPhone',title:'收件人電話'},
                    {field:'recipientAddress',title:'收件人地址',align:'right'}
                ]]  
                , 
                onChange:function(oldVal, newVal) {                  	         
                    var url="recipientDBJSON.html?keyword="+oldVal;                                  
                    $('#recipient').combogrid('grid').datagrid('reload',url);                              
                },
                onSelect: function(index,row){
                     //alert(row.sender);
                     $('#recipient').textbox('setValue',row.recipient);
                     $('#recipientPhone').textbox('setValue',row.recipientPhone);
                     $('#recipientAddress').textbox('setValue',row.recipientAddress);          
                           
                }               
            });



<ww:if test="${logistics.code == null}">
  getLastCode();
</ww:if>



$('#sender').combogrid({      
                idField:'id',
                textField:'text',
                mode:'remote',         
                fitColumns:true,          
                columns:[[
                    {field:'ck',checkbox:true},
                    {field:'sender',title:'寄件人'},
                    {field:'senderPhone',title:'寄件人電話'},
                    {field:'senderAddress',title:'寄件人地址',align:'right'}
                ]]  
                , 
                onChange:function(oldVal, newVal) {                  	         
                    var url="senderDBJSON.html?keyword="+oldVal;                                  
                    $('#sender').combogrid('grid').datagrid('reload',url);                              
                },
                onSelect: function(index,row){
                     //alert(row.sender);
                     $('#sender').textbox('setValue',row.sender);
                     $('#senderPhone').textbox('setValue',row.senderPhone);
                     $('#senderAddress').textbox('setValue',row.senderAddress);                   
                }               
            });


function getLastCode(){	
	var freightCompanyId=$('#freightCompanyId').val();
	 $.ajax({
             url: 'logisticsLastCodeJSON.html',
             type: "POST",        
             data: {
             	 "logistics.freightCompanyId":freightCompanyId
             	}, 
             success: function(data) {            
             	$('#code').textbox('setValue',$.trim(data));            	     	
            }
    });		
}

function copy(){	
	var addressMemo=$('#addressMemo').textbox('getValue');
	$('#recipientAddress').textbox('setValue',addressMemo);       
}





function submitForm(){
	 var memo=$('#memo').textbox('getValue'); 	 
	 var otherBills=$('#otherBills').textbox('getValue');
	 var code=$('#code').textbox('getValue');
	 var billId=$('#billId').combobox('getValue');
	 var sender=$('#sender').textbox('getValue');	 
	 var senderPhone=$('#senderPhone').textbox('getValue');
	 var senderAddress=$('#senderAddress').textbox('getValue');	 
	 var recipient=$('#recipient').textbox('getValue');
	 var recipientPhone=$('#recipientPhone').textbox('getValue');
	 var recipientAddress=$('#recipientAddress').textbox('getValue');
	 var serviceDate=$('#serviceDate').datebox('getValue');
	 var timeId=$('#timeId').val();
	 var freightCompanyId=$('#freightCompanyId').val();
	 
	 //alert('freightCompanyId='+freightCompanyId);
	 
	 var c=0,error='';
   
	 if(code ===''){
         error+='條碼編號為必填欄位<br>';
         c++;
   }
   
   if(billId ===''){
         error+='訂單編號為必填欄位<br>';
         c++;
   }
   
   if(sender ===''){
         error+='寄件人為必填欄位<br>';
         c++;
   }
   
   if(senderPhone ===''){
         error+='寄件人電話為必填欄位<br>';
         c++;
   }
   
   if(senderAddress ===''){
         error+='寄件人地址為必填欄位<br>';
         c++;
   }
   
   if(recipient ===''){
         error+='收件人為必填欄位<br>';
         c++;
   }
   
   if(recipientPhone ===''){
         error+='收件人電話為必填欄位<br>';
         c++;
   }
   
   if(recipientAddress ===''){
         error+='收件人地址為必填欄位<br>';
         c++;
   }
   
   if(serviceDate ===''){
         error+='指定送達日為必填欄位<br>';
         c++;
   }
   
 	  if(error !=='')
 	  {
 	  	$.messager.alert('系統訊息','以下請修正下列資訊<br>'+error,'error').window({  
         width:400      
      });  
      return false;
 	  }
	 
	  $.ajax({
             url: 'saveLogisticsJSON.html',
             type: "POST",        
             data: {
             	"logistics.id":'${logistics.id}',"logistics.code":code,"logistics.billId":billId,"logistics.sender":sender,"logistics.senderPhone":senderPhone,
             	"logistics.senderAddress":senderAddress,"logistics.recipient":recipient,"logistics.recipientPhone":recipientPhone,
             	"logistics.recipientAddress":recipientAddress,"serviceDate":serviceDate,"logistics.timeId":timeId,
             	"logistics.otherBills":otherBills,"logistics.freightCompanyId":freightCompanyId,"logistics.memo":memo
             	}, 
             success: function(data) { 
             	doSearch();    
             	$('#myevent2').window('close');                      	     	
            }
    });	
}

function clearForm(){
            $('#ff').form('clear');
}



$("#billId").combobox({
	      url: 'billJSON.html?billNo=${logistics.billId}',     
      	method: 'get',   
        valueField:'id',
        textField:'text',   
        delay:1500,    
        onChange:function(oldVal, newVal) {             	
           var murl="billJSON.html?billNo="+oldVal;   
           $('#billId').combobox('reload', murl);    
                    
        },
        onSelect:function(item) {          	
        	var billId='${logistics.billId}';
        	if(billId!==item.id){    
        	 $('#customer').html(item.customer);     
        	 $('#saleman').html(item.saleman);    
           //$('#recipientAddress').textbox('setValue',item.remark);  
           $('#addressMemo').textbox('setValue',item.remark);         
         }      
        }  
             
    });



</script>

