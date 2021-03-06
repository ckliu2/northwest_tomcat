<%@ include file="/common/taglibs.jsp"%>

<ww:set name="p" value="%{getProfitDetailList()}"/>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key='profit.id'/>:${profit.projectNo}<BR><fmt:message key='profit.salesNo'/>:${profit.salesNo}</td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
          <fmt:message key='common.remark'/> : ${profit.remark}
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="p" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:column property="item" sortable="true" titleKey="profitDetail.item" />    
   
    
    <display:column property="product.id" sortable="true" titleKey="product.id" style="text-align:left" />
    
    <display:column property="product.productName" sortable="true" titleKey="product.name1" style="text-align:left" />
   
    <display:column property="unit1" sortable="true" title="才" />
    <display:column property="unit2" sortable="true" title="平方米" />
    <display:column property="unit3" sortable="true" title="平方英吋" />
    
    
    
    <display:column property="salesDetail" sortable="true" titleKey="profitDetail.salesDetail" style="text-align:left" />
    
     
    <display:column property="salesItemMark" sortable="true" titleKey="profitDetail.salesItemMark" style="text-align:left" />
   
    <display:column property="descript" sortable="true" titleKey="billDetail.itemRemark" />
   
    <display:column property="salesPrice" sortable="true" titleKey="profit.salesPrice" decorator="com.base.web.displaytag.ThousandsDecorator"/>
    
    <display:column property="salesCost" sortable="true" titleKey="profit.salesCost" decorator="com.base.web.displaytag.ThousandsDecorator"/>
    
    <display:column property="buyNo" sortable="true" titleKey="profitDetail.buyNo" />
    <display:column property="company" sortable="true" titleKey="profitDetail.company" />
    <display:column property="purchasePrice" sortable="true" titleKey="profitDetail.purchasePrice" decorator="com.base.web.displaytag.ThousandsDecorator"/>
    
     
    <display:column property="purchaseDetail" sortable="true" titleKey="profitDetail.purchaseDetail" style="text-align:left" />
    <display:column property="purchaseItemMark" sortable="true" titleKey="profitDetail.purchaseItemMark" style="text-align:left" />
    
    <display:column property="discount" sortable="true" title="折讓金額" decorator="com.base.web.displaytag.ThousandsDecorator"/>
    
    
    <display:column property="profit" sortable="true" titleKey="profit.profit" decorator="com.base.web.displaytag.ThousandsDecorator"/>
    <display:column property="profitPerc" sortable="true" titleKey="profit.profitPerc" />
    
   
    
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
    
    
      
      <tr class="cActionButtonLine">
        <td>
        
        <table width="30%" border="0">
         <tr>
           <td>    
             <display:table name="profitFee" class="list" cellspacing="1" requestURI="" id="row" >
                <display:column property="id" titleKey="profitFee.id"/>  
                <display:column property="bill.id" titleKey="profit.id"/> 
                <display:column property="billDate"  titleKey="profitFee.billDate" />
                <display:column property="localtotal"  titleKey="profitFee.localtotal" />
                <display:column property="localtax"  titleKey="profitFee.localtax" style="width:20%"/>
                <display:column property="sumfee"  titleKey="profitFee.sumfee" style="width:20%"/>
             </display:table>           
           </td>
        </tr>
        </table>
        
             
        </td>
      </tr>    
      
     
      
      
</table>

