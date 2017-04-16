<%@ include file="/common/taglibs.jsp"%>
<link rel="stylesheet" type="text/css" href="${ctx}/css/displaytag.css" />  

<ww:set name="product" value="%{getProductById()}"/>	
<ww:set name="profitdetails" value="%{getProfitDetailListByProduct()}"/>
	

<display:table name="profitdetails" class="list" pagesize="20" cellspacing="1" id="row" export="true"> 
	  <display:column property="profitNo.salesNo"  sortable="true" title="銷貨單號" />
    <display:column property="item"  sortable="true" title="項次" />	
    	
    <%--	
    <display:column sortable="true" titleKey="product.name2">
      ${row.product.id}-${row.product.productName}
    </display:column>    
    <display:column property="item"  sortable="true" title="項次" />	
    	
    <display:column property="salesPrice"  sortable="true" title="售價" />	
    <display:column property="purchasePrice"  sortable="true" title="採購金額" />	
        	
    <display:column property="salesCost"  sortable="true" title="標準成本" />	
    <display:column property="profit"  sortable="true" title="利潤" />		
    	
    <display:column property="profitPerc"  sortable="true" title="利潤率" />	 
    
    --%>
    	
</display:table>
   
