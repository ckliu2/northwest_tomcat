package org.apache.jsp.northwest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.fckeditor.*;
import javax.servlet.http.HttpSession;

public final class productSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody;
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
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.release();
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
      out.write("<form name=\"form1\"  method=\"POST\" action=\"productSelectPrint.html\"  target=\"_blank\">\r\n");
      out.write("\r\n");
      out.write("  <table border=\"0\" cellspacing=\"1\" class=\"cContentTable\">\r\n");
      out.write("    <tr class=\"cActionButtonLine\">\r\n");
      out.write("      <td colspan=\"2\">\r\n");
      out.write("      <input type=\"text\" name=\"productStr\" id=\"productStr\"/>\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("\" class=\"cButton\" onClick=\"javascript:search();\">      \r\n");
      out.write("      &nbsp;&nbsp;&nbsp;      \r\n");
      out.write("      ");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(":<input type=\"text\" name=\"quantity\" class=\"cInputTextFieldShort2\" />\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("      ");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_page_context))
        return;
      out.write(":<input type=\"text\" name=\"remark\" class=\"cInputTextFieldLong\" />     \r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\" class=\"cButton\" onClick=\"javascript:wprint();\">\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("\" class=\"cButton\" onClick=\"javascript:wclear();\">\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>    \r\n");
      out.write("    \r\n");
      out.write("     <tr>\r\n");
      out.write("\r\n");
      out.write("        <td class=\"cInputColumn\">\r\n");
      out.write("            <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th align=\"center\"><span style=\"font-size:10pt\">");
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f7(_jspx_page_context))
        return;
      out.write("</style></th>\r\n");
      out.write("                <th>&nbsp;</th>\r\n");
      out.write("                <th align=\"center\"><span style=\"font-size:10pt\">");
      if (_jspx_meth_fmt_005fmessage_005f8(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("</style></th>\r\n");
      out.write("            </tr><tr>\r\n");
      out.write("            <td >\r\n");
      out.write("               \r\n");
      out.write("                ");
      if (_jspx_meth_ww_005fselect_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                       \r\n");
      out.write("                </td><td>\r\n");
      out.write("                <input type=\"button\" value=\">>\" class=\"cSelectButton\" onclick=\"moveAll1(allProduct, selectedProduct);\"><br>\r\n");
      out.write("                <input type=\"button\" value=\">\"  class=\"cSelectButton\" onclick=\"moveOne1(allProduct, selectedProduct);\"><br>\r\n");
      out.write("                <input type=\"button\" value=\"<\"  class=\"cSelectButton\" onclick=\"sclear(selectedProduct);\"><br>\r\n");
      out.write("                <input type=\"button\" value=\"<<\"  class=\"cSelectButton\" onclick=\"sclearAll(selectedProduct);\"><br>\r\n");
      out.write("            \r\n");
      out.write("                <!--\r\n");
      out.write("                <input type=\"button\" value=\"<\"  class=\"cSelectButton\" onclick=\"moveOne1(selectedProduct, allProduct);\"><br>\r\n");
      out.write("                <input type=\"button\" value=\"<<\" class=\"cSelectButton\" onclick=\"moveAll1(selectedProduct, allProduct);\"><br>\r\n");
      out.write("                -->\r\n");
      out.write("            </td>\r\n");
      out.write("            \r\n");
      out.write("            <td align=\"center\">\r\n");
      out.write("            \r\n");
      out.write("                ");
      if (_jspx_meth_ww_005fselect_005f1(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("              \r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </table>\r\n");
      out.write("        </td>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <tr class=\"cActionButtonLine\">\r\n");
      out.write("      <td colspan=\"2\">\r\n");
      out.write("      \r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>  \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write(" function search(){\r\n");
      out.write(" \tvar productStr=$('#productStr').val(); \t \r\n");
      out.write("  $('#allProduct').empty(); \r\n");
      out.write("  $.ajax({\r\n");
      out.write("    url: 'findProductJSON.html',\r\n");
      out.write("    dataType: \"json\",\r\n");
      out.write("    type: \"POST\",\r\n");
      out.write("    data: {\r\n");
      out.write("        \"key\": productStr\r\n");
      out.write("    },\r\n");
      out.write("    success: function(rows) {    \t    \t\r\n");
      out.write("    \trows.forEach(function (item, index) {\r\n");
      out.write("    \t\t console.log(index,item.id,item.name);\r\n");
      out.write("    \t\t $(\"#allProduct\").append(new Option(item.name, item.id)); \r\n");
      out.write("    \t});    \t\r\n");
      out.write("    }\r\n");
      out.write("   });   \r\n");
      out.write(" }\t\r\n");
      out.write("\t\r\n");
      out.write(" function wprint(){\r\n");
      out.write(" \tmySelectAll(document.form1.productIds);\r\n");
      out.write(" \tform1.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function wclear(){\r\n");
      out.write("\tdocument.all.productIds.options.length = 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function sclear(xto){\t\r\n");
      out.write("\txto.options.remove(xto.selectedIndex);\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function sclearAll(xto){\t\r\n");
      out.write("  xto.options.length=0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function moveOne1(xfrom, xto)\r\n");
      out.write("{\r\n");
      out.write("\tvar addText='';\r\n");
      out.write("\tvar quantity=document.all.quantity.value;\r\n");
      out.write("\tvar remark=document.all.remark.value;\r\n");
      out.write("\tif(remark==''){\r\n");
      out.write("\t\tremark='.';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(quantity!=''){\r\n");
      out.write("\t\taddText+=' * '+quantity;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(\"");
      if (_jspx_meth_fmt_005fmessage_005f10(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f11(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t  return false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(remark!=''){\r\n");
      out.write("\t\taddText+=' ( '+remark +' ) ' ;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\tif (xfrom == null || xto == null) return;\r\n");
      out.write("\r\n");
      out.write("\tif (xfrom.selectedIndex < 0) return;\r\n");
      out.write("\tvar opt;\r\n");
      out.write("\tvar newOpt;\r\n");
      out.write("\tvar idx = 0;\r\n");
      out.write("\tvar next = true;\r\n");
      out.write("\r\n");
      out.write("\twhile (next) {\r\n");
      out.write("\t\topt = xfrom.options[idx];\r\n");
      out.write("\t\tif (opt.selected)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tnewOpt = document.createElement(\"OPTION\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  newOpt.text = opt.text + addText;\r\n");
      out.write("\t\t  //newOpt.text = opt.value + '#'+quantity+'#'+remark;\r\n");
      out.write("\t\t  newOpt.value = opt.value + '#'+quantity+'#'+remark;\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\txto.add(newOpt);\r\n");
      out.write("\t\t\txfrom.options.remove(idx);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tidx++;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif ((xfrom.options.length-1) < idx)\r\n");
      out.write("\t\t\tnext = false;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tnext = true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function moveAll1(xfrom, xto)\r\n");
      out.write("{\r\n");
      out.write("\tvar addText='';\r\n");
      out.write("\tvar quantity=document.all.quantity.value;\r\n");
      out.write("\tvar remark=document.all.remark.value;\r\n");
      out.write("  if(remark==''){\r\n");
      out.write("\t\tremark='.';\r\n");
      out.write("\t}\r\n");
      out.write("\tif(quantity!=''){\r\n");
      out.write("\t\taddText+=' * '+quantity;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(remark!=''){\r\n");
      out.write("\t\taddText+=' ( '+remark +' ) ' ;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif (xfrom == null || xto == null) return;\r\n");
      out.write("\r\n");
      out.write("\tvar newOpt;\r\n");
      out.write("\tvar opt;\r\n");
      out.write("\tvar txt;\r\n");
      out.write("\tvar val;\r\n");
      out.write("\tvar idx = 0;\r\n");
      out.write("\tvar next = (xfrom.options.length > 0);\r\n");
      out.write("\r\n");
      out.write("\twhile (next) {\r\n");
      out.write("\t\topt = xfrom.options[idx];\r\n");
      out.write("\t\tnewOpt = document.createElement(\"OPTION\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tnewOpt.text = opt.text + addText;\r\n");
      out.write("\t\t//newOpt.text = opt.value + '#'+quantity+'#'+remark;\r\n");
      out.write("\t\tnewOpt.value = opt.value + '#'+quantity+'#'+remark;\r\n");
      out.write("\t\txto.add(newOpt);\r\n");
      out.write("\t\txfrom.options.remove(idx);\r\n");
      out.write("\t\tidx = 0;\r\n");
      out.write("\t\tnext = (xfrom.options.length > 0);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(null);
      // /northwest/productSelect.jsp(10,34) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("common.search");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
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
      // /northwest/productSelect.jsp(12,6) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("billDetail.quantity");
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
      // /northwest/productSelect.jsp(14,6) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("common.remark");
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
      // /northwest/productSelect.jsp(16,34) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("common.print");
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
      // /northwest/productSelect.jsp(18,34) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("common.clear");
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
      // /northwest/productSelect.jsp(27,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("common.available");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent(null);
      // /northwest/productSelect.jsp(27,101) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("product.name");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent(null);
      // /northwest/productSelect.jsp(29,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("common.selected");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent(null);
      // /northwest/productSelect.jsp(29,100) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("product.name");
      int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:select
    com.opensymphony.webwork.views.jsp.ui.SelectTag _jspx_th_ww_005fselect_005f0 = (com.opensymphony.webwork.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.SelectTag.class);
    try {
      _jspx_th_ww_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fselect_005f0.setParent(null);
      // /northwest/productSelect.jsp(33,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setId("allProduct");
      // /northwest/productSelect.jsp(33,16) name = list type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setList("productList");
      // /northwest/productSelect.jsp(33,16) name = listKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListKey("id");
      // /northwest/productSelect.jsp(33,16) name = listValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setListValue("productName");
      // /northwest/productSelect.jsp(33,16) name = multiple type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setMultiple("true");
      // /northwest/productSelect.jsp(33,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setSize("50");
      // /northwest/productSelect.jsp(33,16) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f0.setCssClass("cQueryFieldList3");
      int _jspx_eval_ww_005fselect_005f0 = _jspx_th_ww_005fselect_005f0.doStartTag();
      if (_jspx_th_ww_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fselect_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fselect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:select
    com.opensymphony.webwork.views.jsp.ui.SelectTag _jspx_th_ww_005fselect_005f1 = (com.opensymphony.webwork.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.SelectTag.class);
    try {
      _jspx_th_ww_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fselect_005f1.setParent(null);
      // /northwest/productSelect.jsp(56,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setName("productIds");
      // /northwest/productSelect.jsp(56,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setId("selectedProduct");
      // /northwest/productSelect.jsp(56,16) name = list type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setList("object_ProductList");
      // /northwest/productSelect.jsp(56,16) name = listKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setListKey("id");
      // /northwest/productSelect.jsp(56,16) name = listValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setListValue("productName");
      // /northwest/productSelect.jsp(56,16) name = multiple type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setMultiple("true");
      // /northwest/productSelect.jsp(56,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setSize("50");
      // /northwest/productSelect.jsp(56,16) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fselect_005f1.setCssClass("cQueryFieldList3");
      int _jspx_eval_ww_005fselect_005f1 = _jspx_th_ww_005fselect_005f1.doStartTag();
      if (_jspx_th_ww_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fww_005fselect_0026_005fsize_005fname_005fmultiple_005flistValue_005flistKey_005flist_005fid_005fcssClass_005fnobody.reuse(_jspx_th_ww_005fselect_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f10.setParent(null);
      // /northwest/productSelect.jsp(139,9) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("billDetail.quantity");
      int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f11.setParent(null);
      // /northwest/productSelect.jsp(139,49) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("common.required");
      int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
    }
    return false;
  }
}
