<%@ include file="/common/taglibs.jsp"%>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key="outputEquipment.list"/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        	
        	
         <button onclick="location.href='editOutputEquipment.html'" class="cButton"><fmt:message key="common.new"/></button>
          &nbsp;&nbsp;&nbsp;&nbsp;<button onclick="myCheckSubmitCopy('form1', <ww:property value="outputEquipmentList.size()"/>, 'selectedOutputEquipmentId', 'copyOutputEquipment.html', '<fmt:message key="common.mustSelectOne"/>', '<fmt:message key="common.mustSelectOnlyOne"/>')" class="cButton"><fmt:message key="common.copy"/></button>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-print'" onclick="javascript:prints()">列印Barcode輸出清單</a>
          
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="1" />
<display:table name="outputEquipmentList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column titleKey="common.select">
        <input type="checkbox" id="selectedOutputEquipmentId_<c:out value="${count}"/>" name="selectedOutputEquipmentId" value="<c:out value="${row.id}"/>">
    </display:column>
    <display:column titleKey="common.id">
     ${count}
    </display:column>
    <display:column property="name" sortable="true" titleKey="outputEquipment.name" style="text-align:left" />
    <display:column property="maxChi" sortable="true" titleKey="outputEquipment.maxChi" style="text-align:left" />
    <display:column property="hourChi" sortable="true" titleKey="outputEquipment.hourChi" style="text-align:left" />
    <display:column property="memo" sortable="true" titleKey="outputEquipment.memo" style="text-align:left" />
    <display:column titleKey="common.action">
        <ww:if test="recordEditable == true">
            <a href="editOutputEquipment.html?outputEquipment.id=<c:out value="${row.id}"/>"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
            <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.name}" /><fmt:message key="common.confirmDelete2"/>', 'form1', 'outputEquipment.id', '${row.id}')"><fmt:message key="common.delete"/></a>
        </ww:if>
        <ww:else>
           <a href="editOutputEquipment.html?outputEquipment.id=<c:out value="${row.id}"/>"><fmt:message key="common.view"/></a>&nbsp;&nbsp;
        </ww:else>
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
<form name="form1" action="saveOutputEquipment.html">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="outputEquipment.id" value="">
    <select name="selectedOutputEquipmentIds" multiple="true" style="display:none"></select>
</form>

<script>
	 function prints(){
	  var urls='http://192.168.1.222/?rpt=21';	 
	 	window.open(urls);
	 }
</script>	