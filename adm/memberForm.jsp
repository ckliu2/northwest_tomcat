<%@ include file="/common/taglibs.jsp"%>

<ww:form name="memberForm" action="saveMember" method="POST" enctype="multipart/form-data" onsubmit="onSubmit()">
  <ww:hidden name="member.id" value="${member.id}"/>
  <table border="0" cellspacing="1" class="cContentTable">
    <tr><td class="cContentTitle" colspan="2" ><fmt:message key="member.form"/></td></tr>
    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="member.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="member.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>

      </td>
    </tr>   

    <tr><td class="cInputCaption"><fmt:message key="common.loginId"/><span class="cRequired">*</span></td>
        <td class="cInputColumn">
           ${member.id}
        </td>
    </tr>
    
        <tr><td class="cInputCaption"><fmt:message key="member.password"/></td>
        <td class="cInputColumn">            
            ${member.idNo}
        </td>
    </tr> 
 
    <tr><td class="cInputCaption"><fmt:message key="member.name"/><span class="cRequired">*</span></td>
        <td class="cInputColumn">
            ${member.name} </td>
    </tr>

    <tr><td class="cInputCaption"><fmt:message key="member.phone"/></td>
        <td class="cInputColumn">
         ${member.phone}
        </td>
    </tr>
    
    <tr><td class="cInputCaption"><fmt:message key="member.group"/></td>
        <td class="cInputColumn">
            <table>
            <tr>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.available"/><fmt:message key="member.group"/></style></th>
                <th>&nbsp;</th>
                <th align="center"><span style="font-size:10pt"><fmt:message key="common.selected"/><fmt:message key="member.group"/></style></th>
            </tr><tr>
            <td >
                <ww:select id="allGroup"
                list="groupList"
                listKey="id"
                listValue="caption_"
                multiple="true"
                size="8"
                cssClass="cQueryFieldList"
                />
                </td><td>
                <input type="button" value=">>" class="cSelectButton" onclick="moveAll(allGroup, selectedGroup);"><br>
                <input type="button" value=">"  class="cSelectButton" onclick="moveOne(allGroup, selectedGroup);"><br>
                <input type="button" value="<"  class="cSelectButton" onclick="moveOne(selectedGroup, allGroup);"><br>
                <input type="button" value="<<" class="cSelectButton" onclick="moveAll(selectedGroup, allGroup);"><br>
            </td>
            
            <td align="center">
                <ww:select name="groupIds" id="selectedGroup"
                list="object_groupList"
                listKey="id"
                listValue="caption_"
                multiple="true"
                size="8"
                cssClass="cQueryFieldList"
                />                 
            </td>
            </tr>
            
            
            </table>
        </td>
    </tr>
    
    
  
    
    <tr class="cActionButtonLine">
      <td colspan="2">
        <input type=button onclick="javascript:history.back()" class="cButton" value="<fmt:message key="common.back"/>" >
        <ww:if test="recordEditable == true">
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton">&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton">&nbsp;
            <ww:if test="member.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>" class="cButton">
            </ww:if>
        </ww:if>
        <ww:else>
            <input type="submit" value="<fmt:message key="common.save"/>" class="cButton" DISABLED>&nbsp;
            <input type="reset" value="<fmt:message key="common.reset"/>" class="cButton" DISABLED>&nbsp;
            <ww:if test="member.id != null">
              <input type="submit" name="delete" onClick="javascript:return confirm('<fmt:message key="common.confirmDelete"/>')" value="<fmt:message key="common.delete"/>"  class="cButton" DISABLED>
            </ww:if>
        </ww:else>
      </td>
    </tr>
  </table>
</ww:form>

<script>
function onSubmit() {
    mySelectAll(document.memberForm.groupIds);
    return true;
}
mySelectAll(document.memberForm.groupIds);
</script>


