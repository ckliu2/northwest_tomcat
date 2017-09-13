<%@ include file="/common/taglibs.jsp"%>
<script src="${ctx}/scripts/jquery-1.7.2.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css" />

<ww:form name="weightsForm" action="saveWeights" method="POST">
  <ww:hidden name="weights.id" value="${weights.id}"/>
  <ww:hidden name="weights.outputEquipmentId" value="${outputEquipment.id}"/>
  <table border="0" cellspacing="1" class="cContentTable">
    <tr class="cActionButtonLine">
      <td colspan="2">
      	
      	<input type="submit" value="<fmt:message key="common.save"/>" class="cButton">
      
      </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="weights.productClassWeight"/></td>
        <td class="cInputColumn">
            <ww:textfield name="weights.productClassWeight" value="%{weights.productClassWeight}" cssClass="cInputTextFieldTiny" /><span class="cInputValidationError"><ww:property value="showHtmlErrorMessage('weights.productClassWeight')"/></span>
        </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="weights.inkWeight"/></td>
        <td class="cInputColumn">
            <ww:textfield name="weights.inkWeight" value="%{weights.inkWeight}" cssClass="cInputTextFieldTiny" /><span class="cInputValidationError"><ww:property value="showHtmlErrorMessage('weights.inkWeight')"/></span>
        </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="weights.productClasses"/></td>
        <td class="cInputColumn">
        	<span id="productclasses">
            <ww:checkboxlist name="productClassesIds" 
               list="productClassesList"
               listKey="id"
               listValue="className"
               value = "%{productClassesIds}"
            />
          </span>  
        </td>
    </tr>
    
    <tr class="cActionButtonLine">
      <td colspan="2">
    
      </td>
    </tr>

    
  </table>
</ww:form>



<script>
	
 var reload=${reload};
 if(reload==1){
 	//alert('reload');
   window.parent.location.reload();	
 }
	
addBR('productClassesIds','productclasses');

function addBR(elementId,beforeParent){
	var obj = document.getElementsByName(elementId);
	for ( var i = 1; i < obj.length; i++) { 
	  var p = document.getElementById(beforeParent);  
	  var br = document.createElement("br");   
    p.insertBefore(br, obj[i]); 
  }
}



</script>
	
	
