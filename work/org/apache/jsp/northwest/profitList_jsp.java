package org.apache.jsp.northwest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.fckeditor.*;
import javax.servlet.http.HttpSession;

public final class profitList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fclass_005fcellspacing;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyle_005fsortable_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fclass_005fcellspacing = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyle_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fdatepicker_0026_005fvalue_005fname_005flanguage_005fid_005fformat_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fclass_005fcellspacing.release();
    _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyle_005fsortable_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle.release();
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
      if (_jspx_meth_ww_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ww_005fset_005f1(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"form\"  method=\"post\" action=\"profitList.html\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\" cellspacing=\"1\" class=\"cContentTable\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"cContentTitle\" >");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write(" </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td ><span class=\"cLabel\"><a href=\"customerStandardCostList.html\" target=\"_blank\">[客戶標準成本設定] </a></span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <tr class=\"cActionButtonLine\">\r\n");
      out.write("        <td>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("          \t訂單編號/銷貨單\r\n");
      out.write("          \t:");
      if (_jspx_meth_ww_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(":     \r\n");
      out.write("                ");
      if (_jspx_meth_ww_005fselect_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      out.write(":\r\n");
      out.write("          \r\n");
      out.write("          <textarea name=\"input\"  \r\n");
      out.write("          oninput=\"queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');\"\r\n");
      out.write("          onPropertyChange=\"queryKeyWord(this.value, 'allCustomer', 'findCustomer.html', 'keyword');\"  \r\n");
      out.write("          cols=\"10\"  rows=\"1\"></textarea>                      \r\n");
      out.write("          \r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_page_context))
        return;
      out.write(":   \r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_ww_005fdatepicker_005f0(_jspx_page_context))
        return;
      out.write("            \r\n");
      out.write("            ~\r\n");
      out.write("            ");
      if (_jspx_meth_ww_005fdatepicker_005f1(_jspx_page_context))
        return;
      out.write("            \r\n");
      out.write("         <br>\r\n");
      out.write("         \r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_page_context))
        return;
      out.write(":\r\n");
      out.write("           ");
      if (_jspx_meth_ww_005fselect_005f1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("          \r\n");
      out.write("          修改標準成本\r\n");
      out.write("           <input name=\"scost\" type=\"checkbox\" id=\"checkbox\" value=\"1\" />\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <input type=\"submit\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("\" class=\"cButton\">\r\n");
      out.write("          \t\r\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("          <a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-print'\" onclick=\"javascript:prints()\">列印營業額報表</a>\r\n");
      out.write("          \r\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("          <a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-print'\" onclick=\"javascript:prints1()\">列印標準成本統計報表</a>\r\n");
      out.write("        \t\r\n");
      out.write("        \t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("        \t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-print'\" onclick=\"javascript:prints2()\">列印應收帳款明細表(請選擇起訖日、客戶)</a>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_ww_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_005ftable_005f0 = (org.displaytag.tags.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fclass_005fcellspacing.get(org.displaytag.tags.TableTag.class);
      try {
        _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
        _jspx_th_display_005ftable_005f0.setParent(null);
        // /northwest/profitList.jsp(93,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setName(new String("myprofit"));
        // /northwest/profitList.jsp(93,0) name = class type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setClass("list");
        // /northwest/profitList.jsp(93,0) name = cellspacing type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setCellspacing("1");
        // /northwest/profitList.jsp(93,0) name = requestURI type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setRequestURI("profitList.html");
        // /northwest/profitList.jsp(93,0) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setUid("row");
        // /northwest/profitList.jsp(93,0) name = export type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setExport(true);
        // /northwest/profitList.jsp(93,0) name = pagesize type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setPagesize(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${GLOBAL_pagesize}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
        // /northwest/profitList.jsp(93,0) name = sort type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_display_005ftable_005f0.setSort("list");
        int _jspx_eval_display_005ftable_005f0 = _jspx_th_display_005ftable_005f0.doStartTag();
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Object row = null;
          java.lang.Integer row_rowNum = null;
          if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_display_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_display_005ftable_005f0.doInitBody();
          }
          row = (java.lang.Object) _jspx_page_context.findAttribute("row");
          row_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("row_rowNum");
          do {
            out.write("\r\n");
            out.write("    ");
            if (_jspx_meth_display_005fsetProperty_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("\t\t\r\n");
            out.write("    \t\r\n");
            out.write("    \t\r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("   \r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("    \r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f3(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f4(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("   \r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f5(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f6(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("         \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f7(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write(" \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f8(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("        \t\r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f9(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("   \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f10(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f11(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f12(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f13(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f14(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f15(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write(" \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f16(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("  \r\n");
            out.write("    \r\n");
            out.write("\r\n");
            out.write("   ");
            if (_jspx_meth_ww_005fif_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write(" \r\n");
            out.write("    \r\n");
            out.write("      \r\n");
            out.write("    ");
            if (_jspx_meth_display_005fcolumn_005f18(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write("      \r\n");
            out.write("    ");
            if (_jspx_meth_c_005fset_005f3(_jspx_th_display_005ftable_005f0, _jspx_page_context))
              return;
            out.write('\r');
            out.write('\n');
            int evalDoAfterBody = _jspx_th_display_005ftable_005f0.doAfterBody();
            row = (java.lang.Object) _jspx_page_context.findAttribute("row");
            row_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("row_rowNum");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_display_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005fsort_005frequestURI_005fpagesize_005fname_005fid_005fexport_005fclass_005fcellspacing.reuse(_jspx_th_display_005ftable_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("      \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script> \r\n");
      out.write("\t function prints()\r\n");
      out.write("\t {\r\n");
      out.write("\t \tvar startDate=$('#startDate').val();\r\n");
      out.write("\t \tvar endDate=$('#endDate').val();\r\n");
      out.write("\t \tvar urls='http://192.168.1.222/?rpt=5&startDate='+startDate+'&endDate='+endDate;\r\n");
      out.write("\t \t//alert('prints startDate='+startDate);\r\n");
      out.write("\t \twindow.open(urls);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function prints1()\r\n");
      out.write("\t {\r\n");
      out.write("\t \tvar projectNo=$('#projectNo').val();\r\n");
      out.write("\t \tvar startDate=$('#startDate').val();\r\n");
      out.write("\t \tvar endDate=$('#endDate').val();\r\n");
      out.write("\t \tvar urls='http://192.168.1.222/?rpt=12&saleNo='+projectNo+'&startDate='+startDate+'&endDate='+endDate;\r\n");
      out.write("\t \t//alert('prints startDate='+startDate);\r\n");
      out.write("\t \twindow.open(urls);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function prints2(){\r\n");
      out.write("\t  var start=$('#startDate').val();\r\n");
      out.write("\t \tvar end=$('#endDate').val();\r\n");
      out.write("\t \tvar customerId=$('#allCustomer').val();\r\n");
      out.write("\t \t//alert(start+'--'+end+'--'+customerId);\r\n");
      out.write("\t \r\n");
      out.write("\t                if (start == '' || end == '' || customerId == '') {\r\n");
      out.write("                     $.messager.alert('系統訊息', '請選擇起訖日、客戶為必填欄位!', 'error');\r\n");
      out.write("                     return false;\r\n");
      out.write("                   }    \r\n");
      out.write("           \r\n");
      out.write("\t                 $.ajax({\r\n");
      out.write("                      url: 'CIPReport001JSON.html',\r\n");
      out.write("                      type: \"POST\",        \r\n");
      out.write("                      data: {'start':start,'end':end,'customerId':customerId}, \r\n");
      out.write("                      dataType:'text',\r\n");
      out.write("                      success: function(data) {          \t            \r\n");
      out.write("        \t             //alert('print');\r\n");
      out.write("        \t             window.open('http://192.168.1.222/?rpt=20');\r\n");
      out.write("                      }\r\n");
      out.write("                    }); \r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("\t }\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_ww_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:set
    com.opensymphony.webwork.views.jsp.SetTag _jspx_th_ww_005fset_005f0 = (com.opensymphony.webwork.views.jsp.SetTag) _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody.get(com.opensymphony.webwork.views.jsp.SetTag.class);
    try {
      _jspx_th_ww_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fset_005f0.setParent(null);
      // /northwest/profitList.jsp(3,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fset_005f0.setName("myprofit");
      // /northwest/profitList.jsp(3,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fset_005f0.setValue("%{getProfitList()}");
      int _jspx_eval_ww_005fset_005f0 = _jspx_th_ww_005fset_005f0.doStartTag();
      if (_jspx_th_ww_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ww_005fset_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:set
    com.opensymphony.webwork.views.jsp.SetTag _jspx_th_ww_005fset_005f1 = (com.opensymphony.webwork.views.jsp.SetTag) _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody.get(com.opensymphony.webwork.views.jsp.SetTag.class);
    try {
      _jspx_th_ww_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fset_005f1.setParent(null);
      // /northwest/profitList.jsp(4,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fset_005f1.setName("admin");
      // /northwest/profitList.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fset_005f1.setValue("%{standcostAdmin()}");
      int _jspx_eval_ww_005fset_005f1 = _jspx_th_ww_005fset_005f1.doStartTag();
      if (_jspx_th_ww_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fset_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ww_005fset_005f1);
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
      // /northwest/profitList.jsp(11,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("profit.list");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:textfield
    com.opensymphony.webwork.views.jsp.ui.TextFieldTag _jspx_th_ww_005ftextfield_005f0 = (com.opensymphony.webwork.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fww_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.TextFieldTag.class);
    try {
      _jspx_th_ww_005ftextfield_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005ftextfield_005f0.setParent(null);
      // /northwest/profitList.jsp(25,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005ftextfield_005f0.setName("projectNo");
      // /northwest/profitList.jsp(25,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005ftextfield_005f0.setValue("%{projectNo}");
      // /northwest/profitList.jsp(25,12) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005ftextfield_005f0.setCssClass("cInputTextFieldShort");
      int _jspx_eval_ww_005ftextfield_005f0 = _jspx_th_ww_005ftextfield_005f0.doStartTag();
      if (_jspx_th_ww_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.reuse(_jspx_th_ww_005ftextfield_005f0);
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
      // /northwest/profitList.jsp(27,10) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("profit.customer");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:select
    com.opensymphony.webwork.views.jsp.ui.SelectTag _jspx_th_ww_005fselect_005f0 = (com.opensymphony.webwork.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.SelectTag.class);
    try {
      _jspx_th_ww_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fselect_005f0.setParent(null);
      // /northwest/profitList.jsp(28,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setName("customerId");
      // /northwest/profitList.jsp(28,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setId("allCustomer");
      // /northwest/profitList.jsp(28,16) name = headerKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setHeaderKey("");
      // /northwest/profitList.jsp(28,16) name = headerValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setHeaderValue("%{getText('common.pleaseSelect')+getText('profit.customer')}...");
      // /northwest/profitList.jsp(28,16) name = list type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setList("customerList");
      // /northwest/profitList.jsp(28,16) name = listKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListKey("id");
      // /northwest/profitList.jsp(28,16) name = listValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListValue("id+'-'+name");
      // /northwest/profitList.jsp(28,16) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setCssClass("cQueryFieldList");
      int _jspx_eval_ww_005fselect_005f0 = _jspx_th_ww_005fselect_005f0.doStartTag();
      if (_jspx_th_ww_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fselect_005f0);
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
      // /northwest/profitList.jsp(36,10) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("profit.customer.query");
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
      // /northwest/profitList.jsp(43,10) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("profit.Intervaly");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
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
      // /northwest/profitList.jsp(45,12) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setCssClass("cInputTextFieldTiny");
      // /northwest/profitList.jsp(45,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setName("startDate");
      // /northwest/profitList.jsp(45,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setId("startDate");
      // /northwest/profitList.jsp(45,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setValue("%{startDate}");
      // /northwest/profitList.jsp(45,12) name = language type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f0.setLanguage("zh");
      // /northwest/profitList.jsp(45,12) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      // /northwest/profitList.jsp(47,12) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setCssClass("cInputTextFieldTiny");
      // /northwest/profitList.jsp(47,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setName("endDate");
      // /northwest/profitList.jsp(47,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setId("endDate");
      // /northwest/profitList.jsp(47,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setValue("%{endDate}");
      // /northwest/profitList.jsp(47,12) name = language type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fdatepicker_005f1.setLanguage("zh");
      // /northwest/profitList.jsp(47,12) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_fmt_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent(null);
      // /northwest/profitList.jsp(50,10) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("profit.salesmen");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fselect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:select
    com.opensymphony.webwork.views.jsp.ui.SelectTag _jspx_th_ww_005fselect_005f1 = (com.opensymphony.webwork.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.SelectTag.class);
    try {
      _jspx_th_ww_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fselect_005f1.setParent(null);
      // /northwest/profitList.jsp(51,11) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setName("salesmenId");
      // /northwest/profitList.jsp(51,11) name = headerKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setHeaderKey("");
      // /northwest/profitList.jsp(51,11) name = headerValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setHeaderValue("%{getText('common.pleaseSelect')+getText('profit.salesmen')}...");
      // /northwest/profitList.jsp(51,11) name = list type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setList("salesmenList");
      // /northwest/profitList.jsp(51,11) name = listKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setListKey("id");
      // /northwest/profitList.jsp(51,11) name = listValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setListValue("name");
      // /northwest/profitList.jsp(51,11) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setCssClass("cQueryFieldList");
      int _jspx_eval_ww_005fselect_005f1 = _jspx_th_ww_005fselect_005f1.doStartTag();
      if (_jspx_th_ww_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fheaderValue_005fheaderKey_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fselect_005f1);
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
      // /northwest/profitList.jsp(66,38) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("common.search");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_005fif_005f0 = (com.opensymphony.webwork.views.jsp.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    try {
      _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fif_005f0.setParent(null);
      // /northwest/profitList.jsp(79,0) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fif_005f0.setTest("profitSum != null");
      int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
      if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_ww_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_ww_005fif_005f0.doInitBody();
        }
        do {
          out.write("  \r\n");
          out.write("<font size=\"4px\">\r\n");
          out.write("<div align=\"center\">\r\n");
          if (_jspx_meth_fmt_005fmessage_005f7(_jspx_th_ww_005fif_005f0, _jspx_page_context))
            return true;
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.salesCostSumStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("  / ");
          if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_ww_005fif_005f0, _jspx_page_context))
            return true;
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.purchaseSumStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" / 費用單:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.profitFeeSumStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write('/');
          out.write(' ');
          if (_jspx_meth_fmt_005fmessage_005f9(_jspx_th_ww_005fif_005f0, _jspx_page_context))
            return true;
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.salesPriceSumStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("  /  ");
          if (_jspx_meth_fmt_005fmessage_005f10(_jspx_th_ww_005fif_005f0, _jspx_page_context))
            return true;
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.profitSumStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write('/');
          out.write(' ');
          if (_jspx_meth_fmt_005fmessage_005f11(_jspx_th_ww_005fif_005f0, _jspx_page_context))
            return true;
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profitSum.profitPerc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("</div>\r\n");
          out.write("</font>\r\n");
          int evalDoAfterBody = _jspx_th_ww_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_ww_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
      // /northwest/profitList.jsp(82,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("profit.salesCost");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
      // /northwest/profitList.jsp(82,70) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("profit.purchase");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
      // /northwest/profitList.jsp(82,172) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("profit.salesPrice");
      int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
      // /northwest/profitList.jsp(82,245) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("profit.profit");
      int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
      // /northwest/profitList.jsp(82,308) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("profit.profitPerc");
      int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f2.setParent(null);
      // /northwest/profitList.jsp(92,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f2.setVar("count");
      // /northwest/profitList.jsp(92,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f2.setValue(new String("0"));
      int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
      if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fsetProperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:setProperty
    org.displaytag.tags.SetPropertyTag _jspx_th_display_005fsetProperty_005f0 = (org.displaytag.tags.SetPropertyTag) _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.get(org.displaytag.tags.SetPropertyTag.class);
    try {
      _jspx_th_display_005fsetProperty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005fsetProperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(94,4) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fsetProperty_005f0.setName("paging.banner.placement");
      // /northwest/profitList.jsp(94,4) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fsetProperty_005f0.setValue("bottom");
      int _jspx_eval_display_005fsetProperty_005f0 = _jspx_th_display_005fsetProperty_005f0.doStartTag();
      if (_jspx_th_display_005fsetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fsetProperty_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_display_005fsetProperty_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f0 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(96,4) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f0.setTitle("");
      // /northwest/profitList.jsp(96,4) name = media type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f0.setMedia("html");
      int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
      if (_jspx_eval_display_005fcolumn_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_005fcolumn_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005fcolumn_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005fcolumn_005f0.doInitBody();
        }
        do {
          out.write(" \r\n");
          out.write("    \t");
          if (_jspx_meth_ww_005fif_005f1(_jspx_th_display_005fcolumn_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_display_005fcolumn_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005fcolumn_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.reuse(_jspx_th_display_005fcolumn_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005fcolumn_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_005fif_005f1 = (com.opensymphony.webwork.views.jsp.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    try {
      _jspx_th_ww_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005fcolumn_005f0);
      // /northwest/profitList.jsp(97,5) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fif_005f1.setTest((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.standcost} == true", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
      if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_ww_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_ww_005fif_005f1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    \t <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/images/news.gif\" width='30'/>\r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_ww_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_ww_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f1 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f1.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(103,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f1.setProperty("projectNo");
      // /northwest/profitList.jsp(103,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f1.setSortable(true);
      // /northwest/profitList.jsp(103,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f1.setTitleKey("profit.id");
      // /northwest/profitList.jsp(103,4) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f1.setStyle("text-align:left");
      int _jspx_eval_display_005fcolumn_005f1 = _jspx_th_display_005fcolumn_005f1.doStartTag();
      if (_jspx_th_display_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f2 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f2.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(105,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f2.setProperty("billNo");
      // /northwest/profitList.jsp(105,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f2.setSortable(true);
      // /northwest/profitList.jsp(105,4) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f2.setTitle("訂單編號");
      // /northwest/profitList.jsp(105,4) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f2.setStyle("text-align:left");
      int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
      if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fstyle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f3 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f3.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(108,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f3.setProperty("salesNo");
      // /northwest/profitList.jsp(108,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f3.setSortable(true);
      // /northwest/profitList.jsp(108,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f3.setTitleKey("profit.salesNo");
      // /northwest/profitList.jsp(108,4) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f3.setStyle("text-align:left");
      int _jspx_eval_display_005fcolumn_005f3 = _jspx_th_display_005fcolumn_005f3.doStartTag();
      if (_jspx_th_display_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f4 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f4.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(110,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f4.setProperty("billDate");
      // /northwest/profitList.jsp(110,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f4.setSortable(true);
      // /northwest/profitList.jsp(110,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f4.setTitleKey("profit.Intervaly");
      // /northwest/profitList.jsp(110,4) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f4.setStyle("text-align:left");
      int _jspx_eval_display_005fcolumn_005f4 = _jspx_th_display_005fcolumn_005f4.doStartTag();
      if (_jspx_th_display_005fcolumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f5 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f5.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(112,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f5.setProperty("projectName");
      // /northwest/profitList.jsp(112,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f5.setSortable(true);
      // /northwest/profitList.jsp(112,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f5.setTitleKey("bill.projectName");
      // /northwest/profitList.jsp(112,4) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f5.setStyle("text-align:left");
      int _jspx_eval_display_005fcolumn_005f5 = _jspx_th_display_005fcolumn_005f5.doStartTag();
      if (_jspx_th_display_005fcolumn_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fstyle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f6 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f6.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(113,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f6.setProperty("customer.id");
      // /northwest/profitList.jsp(113,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f6.setSortable(true);
      // /northwest/profitList.jsp(113,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f6.setTitleKey("customer.id");
      int _jspx_eval_display_005fcolumn_005f6 = _jspx_th_display_005fcolumn_005f6.doStartTag();
      if (_jspx_th_display_005fcolumn_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f7 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f7.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(114,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f7.setProperty("customer.name");
      // /northwest/profitList.jsp(114,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f7.setSortable(true);
      // /northwest/profitList.jsp(114,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f7.setTitleKey("profit.customer");
      int _jspx_eval_display_005fcolumn_005f7 = _jspx_th_display_005fcolumn_005f7.doStartTag();
      if (_jspx_th_display_005fcolumn_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f8 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f8.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(115,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f8.setProperty("salesmen.name");
      // /northwest/profitList.jsp(115,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f8.setSortable(true);
      // /northwest/profitList.jsp(115,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f8.setTitleKey("profit.salesmen");
      int _jspx_eval_display_005fcolumn_005f8 = _jspx_th_display_005fcolumn_005f8.doStartTag();
      if (_jspx_th_display_005fcolumn_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f9 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f9.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(116,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f9.setProperty("billDate");
      // /northwest/profitList.jsp(116,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f9.setSortable(true);
      // /northwest/profitList.jsp(116,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f9.setTitleKey("common.date");
      int _jspx_eval_display_005fcolumn_005f9 = _jspx_th_display_005fcolumn_005f9.doStartTag();
      if (_jspx_th_display_005fcolumn_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f10 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f10.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(117,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f10.setProperty("salesCost");
      // /northwest/profitList.jsp(117,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f10.setSortable(true);
      // /northwest/profitList.jsp(117,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f10.setTitleKey("profit.salesCost");
      // /northwest/profitList.jsp(117,4) name = decorator type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f10.setDecorator("com.base.web.displaytag.ThousandsDecorator");
      int _jspx_eval_display_005fcolumn_005f10 = _jspx_th_display_005fcolumn_005f10.doStartTag();
      if (_jspx_th_display_005fcolumn_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f11 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f11.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(118,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f11.setProperty("purchase");
      // /northwest/profitList.jsp(118,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f11.setSortable(true);
      // /northwest/profitList.jsp(118,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f11.setTitleKey("profit.purchase");
      // /northwest/profitList.jsp(118,4) name = decorator type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f11.setDecorator("com.base.web.displaytag.ThousandsDecorator");
      int _jspx_eval_display_005fcolumn_005f11 = _jspx_th_display_005fcolumn_005f11.doStartTag();
      if (_jspx_th_display_005fcolumn_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f12 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f12.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(119,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f12.setProperty("salesPrice");
      // /northwest/profitList.jsp(119,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f12.setSortable(true);
      // /northwest/profitList.jsp(119,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f12.setTitleKey("profit.salesPrice");
      // /northwest/profitList.jsp(119,4) name = decorator type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f12.setDecorator("com.base.web.displaytag.ThousandsDecorator");
      int _jspx_eval_display_005fcolumn_005f12 = _jspx_th_display_005fcolumn_005f12.doStartTag();
      if (_jspx_th_display_005fcolumn_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f13 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f13.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(121,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f13.setProperty("discount");
      // /northwest/profitList.jsp(121,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f13.setSortable(true);
      // /northwest/profitList.jsp(121,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f13.setTitleKey("profit.discount");
      // /northwest/profitList.jsp(121,4) name = decorator type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f13.setDecorator("com.base.web.displaytag.ThousandsDecorator");
      int _jspx_eval_display_005fcolumn_005f13 = _jspx_th_display_005fcolumn_005f13.doStartTag();
      if (_jspx_th_display_005fcolumn_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f14 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f14.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(123,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f14.setProperty("profit");
      // /northwest/profitList.jsp(123,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f14.setSortable(true);
      // /northwest/profitList.jsp(123,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f14.setTitleKey("profit.profit");
      // /northwest/profitList.jsp(123,4) name = decorator type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f14.setDecorator("com.base.web.displaytag.ThousandsDecorator");
      int _jspx_eval_display_005fcolumn_005f14 = _jspx_th_display_005fcolumn_005f14.doStartTag();
      if (_jspx_th_display_005fcolumn_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fdecorator_005fnobody.reuse(_jspx_th_display_005fcolumn_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f15 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f15.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(124,4) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f15.setProperty("profitPerc");
      // /northwest/profitList.jsp(124,4) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f15.setSortable(true);
      // /northwest/profitList.jsp(124,4) name = titleKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f15.setTitleKey("profit.profitPerc");
      int _jspx_eval_display_005fcolumn_005f15 = _jspx_th_display_005fcolumn_005f15.doStartTag();
      if (_jspx_th_display_005fcolumn_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitleKey_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f16 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f16.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(125,4) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f16.setTitle("");
      // /northwest/profitList.jsp(125,4) name = media type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f16.setMedia("html");
      int _jspx_eval_display_005fcolumn_005f16 = _jspx_th_display_005fcolumn_005f16.doStartTag();
      if (_jspx_eval_display_005fcolumn_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_005fcolumn_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005fcolumn_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005fcolumn_005f16.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("        <a href=\"profitDetail.html?profit.salesNo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.salesNo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"_blank\">\r\n");
          out.write("        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/images/GridView.gif\" border=\"0\"/>\r\n");
          out.write("        </a>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_display_005fcolumn_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005fcolumn_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005fcolumn_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.reuse(_jspx_th_display_005fcolumn_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_005fif_005f2 = (com.opensymphony.webwork.views.jsp.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    try {
      _jspx_th_ww_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(132,3) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fif_005f2.setTest((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin} == true", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_ww_005fif_005f2 = _jspx_th_ww_005fif_005f2.doStartTag();
      if (_jspx_eval_ww_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_ww_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_ww_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_ww_005fif_005f2.doInitBody();
        }
        do {
          out.write("\t\r\n");
          out.write("    ");
          if (_jspx_meth_display_005fcolumn_005f17(_jspx_th_ww_005fif_005f2, _jspx_page_context))
            return true;
          out.write(" \r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_ww_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_ww_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_ww_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f17 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f17.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f2);
      // /northwest/profitList.jsp(133,4) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f17.setTitle("設定標準成本");
      // /northwest/profitList.jsp(133,4) name = media type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f17.setMedia("html");
      int _jspx_eval_display_005fcolumn_005f17 = _jspx_th_display_005fcolumn_005f17.doStartTag();
      if (_jspx_eval_display_005fcolumn_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_005fcolumn_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005fcolumn_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005fcolumn_005f17.doInitBody();
        }
        do {
          out.write(" \r\n");
          out.write("    \t  <a href=\"standardCostList.html?profit.salesNo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.salesNo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"_blank\">\r\n");
          out.write("        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/images/settings.png\" border=\"0\"/>\r\n");
          out.write("        </a>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_display_005fcolumn_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005fcolumn_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005fcolumn_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fmedia.reuse(_jspx_th_display_005fcolumn_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f18 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle.get(org.displaytag.tags.ColumnTag.class);
    try {
      _jspx_th_display_005fcolumn_005f18.setPageContext(_jspx_page_context);
      _jspx_th_display_005fcolumn_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(141,4) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_display_005fcolumn_005f18.setTitle("備註");
      int _jspx_eval_display_005fcolumn_005f18 = _jspx_th_display_005fcolumn_005f18.doStartTag();
      if (_jspx_eval_display_005fcolumn_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_display_005fcolumn_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005fcolumn_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005fcolumn_005f18.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_display_005fcolumn_005f18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005fcolumn_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005fcolumn_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle.reuse(_jspx_th_display_005fcolumn_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
      // /northwest/profitList.jsp(144,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f3.setVar("count");
      // /northwest/profitList.jsp(144,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
      if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    }
    return false;
  }
}
