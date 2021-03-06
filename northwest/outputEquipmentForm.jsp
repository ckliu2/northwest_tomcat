<%@ include file="/common/taglibs.jsp"%>

<ww:form name="outputEquipmentForm" action="saveOutputEquipment" method="POST">
  <ww:hidden name="outputEquipment.id" value="${outputEquipment.id}"/>
  <table border="0" cellspacing="1" class="cContentTable">
    <tr><td class="cContentTitle" colspan="2" ><fmt:message key="outputEquipment.form"/></td></tr>
    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="outputEquipment.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="outputEquipment.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>
      </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="outputEquipment.name"/></td>
        <td class="cInputColumn">
            <ww:textfield name="outputEquipment.name" value="%{outputEquipment.name}" maxlength="30" cssClass="cInputTextFieldLong" />
        </td>
    </tr>
    
    <tr><td class="cInputCaption"><fmt:message key="outputEquipment.maxChi"/></td>
        <td class="cInputColumn">
            <ww:textfield name="outputEquipment.maxChi" value="%{outputEquipment.maxChi}" cssClass="cInputTextFieldTiny" /><span class="cInputValidationError"><ww:property value="showHtmlErrorMessage('outputEquipment.maxChi')"/></span>
        </td>
    </tr>
    
    <tr><td class="cInputCaption"><fmt:message key="outputEquipment.hourChi"/></td>
        <td class="cInputColumn">
            <ww:textfield name="outputEquipment.hourChi" value="%{outputEquipment.hourChi}" cssClass="cInputTextFieldTiny" /><span class="cInputValidationError"><ww:property value="showHtmlErrorMessage('outputEquipment.hourChi')"/></span>
        </td>
    </tr>
    
    
    <tr><td class="cInputCaption">權重設定</td>
        <td class="cInputColumn">
        	
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" onclick="addWeight()">新增權重</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" onclick="removeWeight()">移除權重</a>
        	
        <div id="aa" class="easyui-accordion" style="width:100%;height:auto;">
         
        </div>
        
        
        </td>
    </tr>
    

    <tr><td class="cInputCaption"><fmt:message key="outputEquipment.memo"/></td>
        <td class="cInputColumn">
            <ww:textarea name="outputEquipment.memo" value="%{outputEquipment.memo}" cssClass="cInputTextArea" cols="60" rows="6" />        </td>
        </td>
    </tr>

    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="outputEquipment.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="outputEquipment.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>
      </td>
    </tr>
  </table>
</ww:form>

<script>
	
 function weights(){	
	$.ajax({
      url: 'weightsByOutputEquipmentJSON.html',
      type: "POST",
      dataType: "json",
      data: {
       "outputEquipment.id": "${outputEquipment.id}"
      },
      success: function(data) {        
        $.each(data, function( index, item ) {
          console.log( index,item );
          
          var iframeUrl='editWeights.html?outputEquipment.id=${outputEquipment.id}&weights.id='+item.weightsId;
          
          $('#aa').accordion('add',{
                title: index+1 +' . ['+item.title+']--材質權重:['+item.productClassWeight+']--墨水權重:['+item.inkWeight+']',
                weightsId: item.weightsId,
                content: '<div style="padding:10px"><iframe width="100%" height="300px" src="'+iframeUrl+'"></div>'
            });
          
          
        });             
      }
     });
	}
	
 weights();
	

function addWeight(){	
  var iframeUrl='editWeights.html?outputEquipment.id=${outputEquipment.id}&weights.id=';
  $('#aa').accordion('add',{
       title:'權重',
       weightsId:1,
       content:'<div style="padding:10px"><iframe width="100%" height="300px" src="'+iframeUrl+'"></div>'
  });  
}
	
	function removeWeight(){
		var pp = $('#aa').accordion('getSelected');
    if (pp){
       var index = $('#aa').accordion('getPanelIndex',pp);
       var weightsId = pp.panel('options').weightsId;
       var title = pp.panel('options').title;
       //alert(index+'--'+weightsId+'--'+title);
       
      $.ajax({
         url: 'removeWeightsByIDJSON.html',
         type: "POST",
         dataType: "text",
         data: {
          "weights.id": weightsId
         },
         success: function(data) { 
         	  window.location.reload();
         }
        });
	     }       
     }
     
     
	
	
</script>	
