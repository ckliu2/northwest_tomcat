<%@ include file="/common/taglibs.jsp"%>

<ww:form name="billQAForm" action="saveBillQA" method="POST" onsubmit="onSubmit()">
  <ww:hidden name="billQA.id" value="${billQA.id}"/>
  <ww:hidden name="billQA.billId" value="${bill.id}"/>	
  <ww:hidden name="query" value="${query}"/>  	
  <table border="0" cellspacing="1" class="cContentTable">
    <tr><td class="cContentTitle" colspan="2" ><fmt:message key="billQA.form"/></td></tr>
    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="billQA.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="billQA.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>
      </td>
    </tr>
    
    <tr><td class="cInputCaption">訂單編號</td>
        <td class="cInputColumn">
            ${bill.id}
        </td>
    </tr>
    
    <tr><td class="cInputCaption">客戶</td>
        <td class="cInputColumn">
            ${bill.customer.name}
        </td>
    </tr>
    
    <tr><td class="cInputCaption"><fmt:message key="billQA.question"/></td>
        <td class="cInputColumn">       
            <ww:textarea name="billQA.question" value="%{billQA.question}" cssClass="cInputTextArea" cols="60" rows="6" /> 
        </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="billQA.answer"/></td>
        <td class="cInputColumn">            	
            <ww:textarea name="billQA.answer" value="%{billQA.answer}" cssClass="cInputTextArea" cols="60" rows="6" /> 
        </td>
    </tr>
    
    <tr><td class="cInputCaption">請輸入通知人員關鍵字</td>
        <td class="cInputColumn">            	
            <input type="text" 
             name="input"  
             oninput="queryKeyWord2(this.value, 'allMember', 'findMemberByJSON.html', 'q');"
             onPropertyChange="queryKeyWord2(this.value, 'allMember', 'findMemberByJSON.html', 'q');"  
             onClick="javascript:clearText();"
             Class="cInputTextFieldTiny"
            >  
        </td>
    </tr>
    
    <tr><td class="cInputCaption">通知人員</td>
        <td class="cInputColumn">
            <table>
            <tr>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.available"/>通知人員</style></th>
                <th>&nbsp</th>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.selected"/>通知人員</style></th>
            </tr><tr>
            <td >
                <ww:select id="allMember"
                list="memberList"
                listKey="id"
                listValue="name+'('+email+')'"
                multiple="true"
                size="8"
                cssClass="cQueryFieldList"
                /></td><td>
                <input type="button" value=">>" class="cSelectButton" onclick="moveAll(allMember, selectedMember);"><br>
                <input type="button" value=">"  class="cSelectButton" onclick="moveOne(allMember, selectedMember);"><br>
                <input type="button" value="<"  class="cSelectButton" onclick="moveOne(selectedMember, allMember);"><br>
                <input type="button" value="<<" class="cSelectButton" onclick="moveAll(selectedMember, allMember);"><br>
            </td><td align="center">
                <ww:select name="notificationsIds" id="selectedMember"
                list="object_memberList"
                listKey="id"
                listValue="name+'('+email+')'"
                multiple="true"
                size="8"
                cssClass="cQueryFieldList"
                />
            </td>
            </tr>
            </table>        
          </td>
    </tr>
    
    <tr><td class="cInputCaption"><fmt:message key="common.lastModifiedDate"/></td>
        <td class="cInputColumn">
            <span class="cLabel"><ww:property value="billQA.lastModifiedDate" /></span>
        </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="common.createdDate"/></td>
        <td class="cInputColumn">
            <span class="cLabel"><ww:property value="billQA.createdDate" /></span>
        </td>
    </tr>

    

    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="billQA.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="billQA.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>
      </td>
    </tr>
  </table>
</ww:form>

<script>
function onSubmit() {
    mySelectAll(document.billQAForm.notificationsIds);
    return true;
}

function clearText(){  	 
   document.all.input.value="";
   document.all.input.onfocus();
 }
</script>
