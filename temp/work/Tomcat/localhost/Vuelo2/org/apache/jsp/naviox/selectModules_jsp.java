/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2022-11-02 01:37:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.Collection;
import org.openxava.util.Is;
import org.openxava.util.Strings;
import org.openxava.util.Locales;
import org.openxava.application.meta.MetaModule;

public final class selectModules_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1667345014799L));
    _jspx_dependants.put("jar:file:/C:/Users/Zuriel%20PC/Desktop/openxava-6.6.3/workspace/Vuelo2/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("jar:file:/C:/Users/Zuriel%20PC/Desktop/openxava-6.6.3/workspace/Vuelo2/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1667345014809L));
    _jspx_dependants.put("/naviox/getModulesList.jsp", Long.valueOf(1667345014842L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1667345013938L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.openxava.util.Strings");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.util.Locales");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("org.openxava.application.meta.MetaModule");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

String searchWord = request.getParameter("searchWord");
searchWord = searchWord == null?"":Strings.removeAccents(searchWord.toLowerCase()); 
Collection modulesList = null;
boolean bookmarkModules = false;

      out.write('\n');

if ("true".equals(request.getParameter("fixedModules"))) {
	modulesList = modules.getFixedModules(request); 
}
else if ("true".equals(request.getParameter("bookmarkModules"))) {
	modulesList = modules.getBookmarkModules(request); 
	bookmarkModules = true;
}
else {
	modulesList = modules.getRegularModules(request); 
}

      out.write(' ');
      out.write('\n');

String smodulesLimit = request.getParameter("modulesLimit");
int modulesLimit = smodulesLimit == null?30:Integer.parseInt(smodulesLimit); 
int counter = 0; 
boolean loadMore = false;
for (Iterator it= modulesList.iterator(); it.hasNext();) {
	if (counter == modulesLimit) {
		loadMore = true; 
		break;
	}
	MetaModule module = (MetaModule) it.next();
	String selected = module.getName().equals(modules.getCurrent(request))?"selected":"";
	String label = module.getLabel(Locales.getCurrent()); 
	String description = module.getDescription(Locales.getCurrent());
	String normalizedLabel = Strings.removeAccents(label.toLowerCase()); 
	String normalizedDescription = Strings.removeAccents(description.toLowerCase());
	if (!Is.emptyString(searchWord) && !normalizedLabel.contains(searchWord) && !normalizedDescription.contains(searchWord)) continue;
	counter++;

      out.write("\n");
      out.write("\t<a href=\"");
      out.print(modules.getModuleURI(request, module));
      out.write("?init=true\" title=\"");
      out.print(description);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.write("\n");
      out.write("\t<div id=\"");
      out.print(module.getName());
      out.write("_module\" class=\"module-row ");
      out.print(selected);
      out.write("\" onclick=\"$('#");
      out.print(module.getName());
      out.write("_loading').show()\">\t\n");
      out.write("\t\t<div class=\"module-name\">\n");
      out.write("\t\t\t");
      out.print(label);
      out.write("\n");
      out.write("\t\t\t");
 if (bookmarkModules) { 
      out.write("\n");
      out.write("\t\t\t<i class=\"mdi mdi-star bookmark-decoration\"></i>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t<i id=\"");
      out.print(module.getName());
      out.write("_loading\" class=\"mdi mdi-autorenew module-loading spin\" style=\"float: right; display:none;\"></i>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t</a>\n");
      out.write("\t\n");
	
}

if (loadMore) {

      out.write("\n");
      out.write("\t<a  href=\"javascript:naviox.displayAllModulesList('");
      out.print(searchWord);
      out.write("')\">\n");
      out.write("\t<div id=\"more_modules\" class=\"module-row\" onclick=\"$('#loading_more_modules').show(); $('#load_more_modules').hide();\">\n");
      out.write("\t<span id=\"loading_more_modules\" style=\"display:none;\">\n");
      out.write("\t");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("...\n");
      out.write("\t<i class=\"mdi mdi-autorenew module-loading spin\" style=\"float: right;\"></i>\n");
      out.write("\t</span>\n");
      out.write("\t<span id=\"load_more_modules\">\n");
      out.write("\t");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("...\n");
      out.write("\t</span>\t\n");
      out.write("\t</div>\t\n");
      out.write("\t</a>\n");

}

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f0_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /naviox/selectModules.jsp(58,1) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f0.setKey("loading");
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      _jspx_th_xava_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f1_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f1.setParent(null);
      // /naviox/selectModules.jsp(62,1) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f1.setKey("load_more_modules");
      int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
      if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      _jspx_th_xava_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f1_reused);
    }
    return false;
  }
}
