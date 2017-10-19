package org.apache.jsp.northwest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.fckeditor.*;
import javax.servlet.http.HttpSession;

public final class report10_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/common/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    response.addHeader("Pragma", "no-cache");
    response.setHeader("Cache-control", "no-store");
    response.setHeader("Cache-control", "no-cache");
    response.setDateHeader("Expires", 0);

    response.setContentType("text/html;charset=UTF-8");

	com.common.util.Util.IMAGE_CONTEXT_ROOT_PATH = "/northwest";

	
//	java.io.File f = new java.io.File(request.getSession().getServletContext().getRealPath("/"));
//	String ff = f.getAbsolutePath();

   //System.out.println("........" + request.getSession().getServletContext().getServletContextName());     
   
      
    if (request.getSession().getAttribute("user") == null) 
    {
       // response.sendRedirect(com.common.util.Util.IMAGE_CONTEXT_ROOT_PATH );
    }

      out.write('\r');
      out.write('\n');

if (false) {

      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("   // alert before session end\r\n");
      out.write("   var remainingseconds=");
      out.print( request.getSession().getMaxInactiveInterval());
      out.write(";\r\n");
      out.write("   var url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/common/timeout.jsp\";\r\n");
      out.write("   var tid;\r\n");
      out.write("   var hWnd;\r\n");
      out.write("   var warn=0;\r\n");
      out.write("\r\n");
      out.write("   function timeoutcheck () {\r\n");
      out.write("      remainingseconds=remainingseconds-1;\r\n");
      out.write("      if (remainingseconds>0) {\r\n");
      out.write("         tid=setTimeout(\"timeoutcheck()\", 1*1000);\r\n");
      out.write("         if (remainingseconds<65) {\r\n");
      out.write("            if (remainingseconds>6) {\r\n");
      out.write("               window.defaultStatus=\"Session 時間 : 倒數 \"+ (remainingseconds-5) +\" 秒\";\r\n");
      out.write("            } else if (remainingseconds>=5) {\r\n");
      out.write("               window.defaultStatus=\"Session 時間 : 倒數 \"+ (remainingseconds-5) +\" 秒\";\r\n");
      out.write("            }\r\n");
      out.write("            if (!warn) {\r\n");
      out.write("               warn=1;\r\n");
      out.write("               \r\n");
      out.write("               hWnd = window.open(url,\"_timeoutwarning\",\"width=400,height=140,resizable=no,scrollbars=no\");\r\n");
      out.write("               hWnd.focus();\r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("      } else {\r\n");
      out.write("         window.defaultStatus=\"Session 時間結束\";\r\n");
      out.write("         clearTimeout(tid);\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   function sessioncheck () {\r\n");
      out.write("      if (remainingseconds>0) {\r\n");
      out.write("         return true;\r\n");
      out.write("      } else {\r\n");
      out.write("         alert(\"很抱歉, 您的作業階段已經逾時, 請重新登入\");\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   timeoutcheck();\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
 
}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"w\" class=\"easyui-window\" title=\"Modal Window\" data-options=\"modal:true,closed:true,iconCls:'icon-save'\" style=\"width:600px;height:500px;padding:10px;\"></div>\r\n");
      out.write("       \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<form name=\"form1\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"1\" class=\"cContentTable\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"cContentTitle\" colspan=\"3\" >產品/客戶/售價</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("           <tr>\r\n");
      out.write("            <td class=\"cContentTitle\" colspan=\"3\" >\r\n");
      out.write("              <a href=\"#\" class=\"easyui-linkbutton\" iconcls=\"icon-print\" onclick=\"mquery()\">查詢</a>\t\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"134\" class=\"cInputCaption\">");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td width=\"524\" colspan=\"2\" class=\"cInputColumn\">           \r\n");
      out.write("              ");
      if (_jspx_meth_ww_005fdatepicker_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ~\r\n");
      out.write("              ");
      if (_jspx_meth_ww_005fdatepicker_005f1(_jspx_page_context))
        return;
      out.write("            \r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"134\" class=\"cInputCaption\">客戶</td>\r\n");
      out.write("            <td width=\"524\" colspan=\"2\" class=\"cInputColumn\">  \r\n");
      out.write("            \t         \r\n");
      out.write("            <input class=\"easyui-combobox\" name=\"customers\" id=\"customers\" style=\"width:100%;\" data-options=\"\r\n");
      out.write("                    url:'findCustomerByJSON.html?q=',\r\n");
      out.write("                    method:'get',\r\n");
      out.write("                    valueField:'id',\r\n");
      out.write("                    textField:'name',                  \r\n");
      out.write("                    multiple:true,\r\n");
      out.write("                    panelHeight:'auto',\r\n");
      out.write("                    label: 'Language:',\r\n");
      out.write("                    labelPosition: 'top'\r\n");
      out.write("                    \">\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td nowrap class=\"cInputCaption\">產品(s)</td>\r\n");
      out.write("            <td width=\"50%\" class=\"cInputColumn\"><table>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th colspan=\"3\" align=\"center\"><div align=\"left\" class=\"cLabel\">");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(":\r\n");
      out.write("                   <input type=\"text\" name=\"productKeyWord\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productKeyWord}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" \r\n");
      out.write("                    onPropertyChange=\"queryKeyWord2(this.value, 'allProduct', 'findProductByJSON.html', 'q');\" \r\n");
      out.write("                    oninput=\"queryKeyWord2(this.value, 'allProduct', 'findProductByJSON.html', 'q');\"\r\n");
      out.write("                   />\r\n");
      out.write("                </div></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th align=\"center\"><span style=\"font-size:10pt\">");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </style></th>\r\n");
      out.write("                <th>&nbsp</th>\r\n");
      out.write("                <th align=\"center\"><span style=\"font-size:10pt\">");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </style></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>                \r\n");
      out.write("                   <select name=\"allProduct\" id=\"allProduct\" multiple=\"true\" size=\"8\" Class=\"cQueryFieldList\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td><input type=\"button\" value=\">>\" class=\"cSelectButton\" onClick=\"moveAll(allProduct, selectedProduct);\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"button\" value=\">\"  class=\"cSelectButton\" onClick=\"moveOne(allProduct, selectedProduct);\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"button\" value=\"<\"  class=\"cSelectButton\" onClick=\"moveOne(selectedProduct, allProduct);\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"button\" value=\"<<\" class=\"cSelectButton\" onClick=\"moveAll(selectedProduct, allProduct);\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"center\">           \r\n");
      out.write("                   ");
      if (_jspx_meth_ww_005fselect_005f0(_jspx_page_context))
        return;
      out.write("              \r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            </td>\r\n");
      out.write("            \r\n");
      out.write("            <td width=\"50%\" class=\"cInputColumn\">\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("    <td>\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write("</table>  \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write(" function mquery(){\r\n");
      out.write(" \tonSubmit();\r\n");
      out.write("  var startDate=$('#startDate').val();\r\n");
      out.write("  var endDate=$('#endDate').val();\r\n");
      out.write("  var products = $('#selectedProduct').val();   \r\n");
      out.write("  var customers = $('#customers').combobox('getValues'); \r\n");
      out.write("   \r\n");
      out.write("\tif (startDate == '' || endDate == '' || products == null  || customers == '') {\r\n");
      out.write("      $.messager.alert('系統訊息', '請選擇起訖日、產品、客戶為必填欄位!', 'error');\r\n");
      out.write("      return false;\r\n");
      out.write("  }        \r\n");
      out.write("   var myurl='http://192.168.1.222/?rpt=27&sdate='+startDate+'&edate='+endDate+'&customerIds='+customers+'&products='+products;       \r\n");
      out.write("   window.open(myurl);  \r\n");
      out.write("     \r\n");
      out.write("   //$('#report').attr(\"src\", myurl);\r\n");
      out.write("   \r\n");
      out.write(" }\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write(" function onSubmit(){\r\n");
      out.write("   mySelectAll(document.form1.selectedProduct);\t\r\n");
      out.write("   mySelectAll(document.form1.selectedCustomer);\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" function detail(productId){ \r\n");
      out.write("  $('#w').window('open');      \t\r\n");
      out.write("  $('#w').window('setTitle', productId+'明細');\r\n");
      out.write("  $('#w').window('refresh', 'profitProductDetail.html?startDate=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&endDate=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&product.id='+productId );\r\n");
      out.write("     \r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /common/taglibs.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("datePattern");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_005fset_005f0.doInitBody();
        }
        do {
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_c_005fset_005f0, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
      // /common/taglibs.jsp(12,25) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("date.format");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /common/taglibs.jsp(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx");
      // /common/taglibs.jsp(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(null);
      // /northwest/report10.jsp(29,50) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("product.analysis.timeduring");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fdatepicker_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:datepicker
    com.opensymphony.webwork.views.jsp.ui.DatePickerTag _jspx_th_ww_005fdatepicker_005f0 = (com.opensymphony.webwork.views.jsp.ui.DatePickerTag) _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.DatePickerTag.class);
    try {
      _jspx_th_ww_005fdatepicker_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fdatepicker_005f0.setParent(null);
      // /northwest/report10.jsp(31,14) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setCssClass("cInputTextFieldShort");
      // /northwest/report10.jsp(31,14) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setName("startDate");
      // /northwest/report10.jsp(31,14) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setId("startDate");
      // /northwest/report10.jsp(31,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setValue("%{startDate}");
      // /northwest/report10.jsp(31,14) name = language type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setLanguage("zh");
      // /northwest/report10.jsp(31,14) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setFormat("%Y%m%d");
      int _jspx_eval_ww_005fdatepicker_005f0 = _jspx_th_ww_005fdatepicker_005f0.doStartTag();
      if (_jspx_th_ww_005fdatepicker_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fdatepicker_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fdatepicker_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:datepicker
    com.opensymphony.webwork.views.jsp.ui.DatePickerTag _jspx_th_ww_005fdatepicker_005f1 = (com.opensymphony.webwork.views.jsp.ui.DatePickerTag) _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.DatePickerTag.class);
    try {
      _jspx_th_ww_005fdatepicker_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fdatepicker_005f1.setParent(null);
      // /northwest/report10.jsp(33,14) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setCssClass("cInputTextFieldShort");
      // /northwest/report10.jsp(33,14) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setName("endDate");
      // /northwest/report10.jsp(33,14) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setId("endDate");
      // /northwest/report10.jsp(33,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setValue("%{endDate}");
      // /northwest/report10.jsp(33,14) name = language type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setLanguage("zh");
      // /northwest/report10.jsp(33,14) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setFormat("%Y%m%d");
      int _jspx_eval_ww_005fdatepicker_005f1 = _jspx_th_ww_005fdatepicker_005f1.doStartTag();
      if (_jspx_th_ww_005fdatepicker_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fdatepicker_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(null);
      // /northwest/report10.jsp(58,80) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("product.keyword");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent(null);
      // /northwest/report10.jsp(66,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("common.available");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent(null);
      // /northwest/report10.jsp(66,101) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("product.id");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent(null);
      // /northwest/report10.jsp(69,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("common.selected");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent(null);
      // /northwest/report10.jsp(69,100) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("product.id");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:select
    com.opensymphony.webwork.views.jsp.ui.SelectTag _jspx_th_ww_005fselect_005f0 = (com.opensymphony.webwork.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.SelectTag.class);
    try {
      _jspx_th_ww_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fselect_005f0.setParent(null);
      // /northwest/report10.jsp(86,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setName("selectedProductIds");
      // /northwest/report10.jsp(86,19) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setId("selectedProduct");
      // /northwest/report10.jsp(86,19) name = list type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setList("productList");
      // /northwest/report10.jsp(86,19) name = listKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListKey("id");
      // /northwest/report10.jsp(86,19) name = listValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListValue("id+'-'+productName");
      // /northwest/report10.jsp(86,19) name = multiple type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setMultiple("true");
      // /northwest/report10.jsp(86,19) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setSize("8");
      // /northwest/report10.jsp(86,19) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setCssClass("cQueryFieldList");
      int _jspx_eval_ww_005fselect_005f0 = _jspx_th_ww_005fselect_005f0.doStartTag();
      if (_jspx_th_ww_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fselect_005f0);
    }
    return false;
  }
}
