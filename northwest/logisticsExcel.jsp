<%@ include file="/common/taglibs.jsp"%>
<ww:form name="productForm" action="logisticExcelExportJSON.html" method="POST" enctype="multipart/form-data">
            <table cellpadding="5">            	
                <tr>
                    <td>貨運公司:</td>
                    <td>
                        <ww:select name="logistics.freightCompanyId" id="freightCompanyId" 
                        list="freightCompanyList"
                        listKey="id"
                        listValue="valueTw"
                        cssClass="cInputListField"
                        />
                    </td>
                </tr>
        
                 <tr>
                    <td>匯入檔案:</td>
                    <td>                    	
                    	 <ww:file cssClass="cInputTextFieldLong" cssStyle="height:20px;" name="fileExcel" accept="application/vnd.ms-excel" />
                   </td>
                 </tr>
                    
            </table>
            
            <div style="text-align:left;padding:5px">           
             <input type="submit" value="匯入" class="cButton" />
            </div>
        
        </form>        
        
</ww:form>        