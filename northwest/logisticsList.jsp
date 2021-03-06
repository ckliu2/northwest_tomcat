<%@ include file="/common/taglibs.jsp"%>

<table id="dg" class="easyui-datagrid" title="快遞單一覽表(至多顯示300筆)" style="width:100%;height:auto" toolbar="#toolbar" showFooter="true" 
       rownumbers="true"
       data-options="singleSelect:false,collapsible:true,url:'logisticsListJSON.html',method:'get'"       
       >
       
       <thead data-options="frozen:true">
            <tr>
                <th data-options="field:'ck',checkbox:true,width:30"></th>   
         	      <th data-options="field:'code'" sortable="true">條碼</th>      
         	      <th data-options="field:'freight'">貨運公司</th>
                <th data-options="field:'billno'">訂單編號</th>     
                <th data-options="field:'otherBills'">其他訂單</th>  
                <th data-options="field:'customer'">客戶</th>   
                <th data-options="field:'saleman'">業務</th>   
            </tr>
        </thead>
        
       <thead>
         <tr>      
          <th data-options="field:'sender'">寄件人</th> 
          <th data-options="field:'senderPhone'">寄件人電話</th>     
          <th data-options="field:'senderAddress'">寄件人地址</th>             
          <th data-options="field:'recipient'">收件人</th>  
          <th data-options="field:'recipientPhone'">收件人電話</th>   
          <th data-options="field:'recipientAddress'">收件人地址</th>   
          <th data-options="field:'serviceDate'">送達日期</th>   
          <th data-options="field:'time'">送達時段</th>     
          <th data-options="field:'memo'">備註</th>       
          <th data-options="field:'createdUser'">建檔人</th>   
          <th data-options="field:'member'">最後修改人</th> 
          <th data-options="field:'lastModifiedDate'">最後修改日</th> 
        </tr>
       </thead> 
      </table> 
      
<div id="toolbar">       
	  <input name="keyword" id="keyword" class="easyui-textbox" data-options="prompt:'輸入訂單、其他訂單、條碼編號、貨運公司、收件人、寄件人'" style="width:400px" />
	  
	  <input id="startDate" type="text" class="easyui-datebox" editable="true" data-options="formatter:myformatter,parser:myparser,prompt:'送達日(開始)'" />
	  <input id="endDate" type="text" class="easyui-datebox"  editable="true" data-options="formatter:myformatter,parser:myparser,prompt:'送達日(結束)'" />
	  
    <a href="#" class="easyui-linkbutton" iconcls="icon-search" plain="true" onclick="doSearch()">查詢</a>                    
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="edit()">新增/編輯</a>
	  <a href="#" class="easyui-linkbutton" iconcls="icon-remove" plain="true" onclick="del()">刪除</a> 		     
	  <a href="#" class="easyui-linkbutton" iconcls="icon-print" plain="true" onclick="printx()">列印</a> 	   
	  <a href="#" class="easyui-linkbutton" iconcls="icon-excel" plain="true" onclick="excel()">匯入</a>      
</div>

<div id="myevent2" class="easyui-window" data-options="resizable:false,modal:true,closed:true,shadow:false,iconCls:'icon-view',border:'thin',cls:'c6'" style="width:60%;height:auto;padding:10px;top:1px"></div>
<div class="progress"></div>  
  
<script>  
	
 function printx(){   	
 	var freights=getSelPrintFreight();
 	var divs = jQuery.unique(getSelPrint()); 	
 	var c=consecutive(getSelCode());
 	
 	if(divs.length>1){
 		$.messager.alert('系統訊息', '一次只能選取一個貨運公司列印!', 'error');
    return false;
 	}
 	
 	if(c===false){
 		$.messager.alert('系統訊息', '列印必須是連號!', 'error');
    return false;
 	}
 	
 	if(divs.toString()==='其他'){
 		$.messager.alert('系統訊息', '其他貨運公司不能列印!', 'error');
    return false;
 	}
 	
 	
 	var billno=getSelBillNo();
 	var randomId=Math.random().toString(36).replace(/[^a-z]+/g, '').substr(0, 30);
 	var pdfUrl='http://192.168.1.222/workOrders/'+billno+'.pdf'; 	
  var id=getSel().toString();
 
  var purl='http://192.168.1.222/?'+freights[0].toString()+'&id='+id+'&randomId='+randomId+'&billno='+billno;
  console.log(purl);
  
  $.ajax({
        url: purl,
        type: 'get',        
        beforeSend: function(){           
           progress();
        },
        complete:function()
		    {
			    window.open(pdfUrl);			  
		    }
    });    
  //alert(purl);  
 	//window.open(purl);
 }  
 
 
 
 
 
 function progress(){
            var win = $.messager.progress({
                title:'Please waiting',
                msg:'資料處理中，請稍後.........'
            });
            setTimeout(function(){
                $.messager.progress('close');
            },5000)
        }
 
 
 function edit(){   	
 	var id=getSel().toString();
 	//alert('id='+id);
  $('#myevent2').window('open');
  $('#myevent2').window('setTitle', '快遞單'); 
  $('#myevent2').window('refresh', 'editLogistics.html?logistics.id='+id);       
 }   
 
 function excel(){
 	/*
 	$('#myevent2').window('open');
  $('#myevent2').window('setTitle', '匯入快遞單'); 
  $('#myevent2').window('refresh', 'logisticsExcel.html');    
  */
  window.open('logisticsExcel.html');	
 }
 
 
 function del(){   	
 	var ids=getSel().toString();
 	if (getSel().length ===0) {
        $.messager.alert('系統訊息', '至少選擇一項，進行編輯!', 'error');
        return false;
   }
   
   $.ajax({
    url: 'deleteLogisticsJSON.html',
    type: 'GET',
    data: {
      'ids': ids
    },
    error: function(xhr) {
    	$.messager.alert('系統訊息', '刪除失敗!', 'error');
    },
    success: function(response) {
       	doSearch();   
    }
  });
  
 }  
 
 function doSearch() {
            	  var keyword=$('#keyword').textbox('getText');
            	  var startDate=$('#startDate').datebox('getValue');
            	  var endDate=$('#endDate').datebox('getValue');
            	  var myurl='logisticsListJSON.html?keyword='+keyword+'&startDate='+startDate+'&endDate='+endDate;
            	  //alert(myurl);
            	  
                $('#dg').datagrid({
                	  url:myurl
                })
            }
 
 function getSel() {
                var checkedItems = $('#dg').datagrid('getChecked');
                var names = [];
                $.each(checkedItems, function(index, item) {
                    names.push(item.id);
                    names.join(",");
                });
                return names;
            }
 
  function getSelCode() {
                var checkedItems = $('#dg').datagrid('getChecked');
                var names = [];
                $.each(checkedItems, function(index, item) {
                    names.push(item.code);
                    names.join(",");
                });
                return names;
            }
 
 function getSelPrintFreight() {
                var checkedItems = $('#dg').datagrid('getChecked');
                var names = [];
                $.each(checkedItems, function(index, item) {
                    names.push(item.freightRPT);
                    names.join(",");
                });
                return names;
            }
            
 function getSelPrint() {
                var checkedItems = $('#dg').datagrid('getChecked');
                var names = [];
                $.each(checkedItems, function(index, item) {
                    names.push(item.freight);
                    names.join(",");
                });
                return names;
            }
 
 
  function getSelBillNo() {
                var checkedItems = $('#dg').datagrid('getChecked');
                var billno = '';
                $.each(checkedItems, function(index, item) {
                    billno=item.billno;
                });
                return billno;
            }
 
            
            
function consecutive(codes) {
 //alert('codes.length='+codes.length);	
 var codes=codes.sort();
 for (var j = 0; j < codes.length - 1; j++) {
 	var c=codes[j + 1]-codes[j];
 	if(c>1)	return false;
 }
 return true;
}
                        
</script>        