/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-11-16 03:05:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/../Footer/footer.jsp", Long.valueOf(1605170053964L));
    _jspx_dependants.put("jar:file:/C:/apache-tomcat-9.0.38/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("file:/C:/apache-tomcat-9.0.38/lib/standard.jar", Long.valueOf(1576913834000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"HTML Study\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Bruce\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>회원가입!!!!</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url('common.css');\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header>h1 {\r\n");
      out.write("text-align:center;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 940px;\r\n");
      out.write("\ttop: 100px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfont-size: 2em;\r\n");
      out.write("\tmargin-block-start: 0.67em;\r\n");
      out.write("\tmargin-block-end: 0.67em;\r\n");
      out.write("\tmargin-inline-start: 0px;\r\n");
      out.write("\tmargin-inline-end: 0px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header form {\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header form table {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\theight: 600px;\r\n");
      out.write("\ttop: 200px;\r\n");
      out.write("\tborder: 1px solid white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<h1 align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"../main/main.jsp\">Meet<br>Meat</a>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<form align=\"center\" method=\"post\" action=\"memberRegisterOK.do\">\r\n");
      out.write("\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>이름*</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"name\" id=\"name\" size=\"20\"required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>아이디*</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"id\" id=\"id\" size=\"20\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>닉네임</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"nickname\" size=\"20\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>비밀번호*</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pw\" id=\"pw\" size=\"20\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>비밀번호 확인*</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pw2\" id=\"pw\" size=\"20\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" name=\"email\" size=\"20\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>주소*</td>\r\n");
      out.write("\t\t\t\t\t<td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"sample4_postcode\" placeholder=\"우편번호\" name=\"postcode\" readonly> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"sample4_execDaumPostcode()\" value=\"우편번호 찾기\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"sample4_roadAddress\" placeholder=\"도로명주소\" name=\"roadAddress\"> <br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"sample4_jibunAddress\" placeholder=\"지번주소\" name=\"jibunAddress\">\r\n");
      out.write("\t\t\t\t\t\t<span id=\"guide\" style=\"color: white; display: none\"></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"sample4_detailAddress\" placeholder=\"상세주소\" name=\"detailAddress\"> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"sample4_extraAddress\" placeholder=\"참고항목\" name=\"extraAddress\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>생년월일</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"YY\" name=\"birthYear\" size=\"5\" max=\"4\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"MM\" name=\"birthMonth\" size=\"5\" max=\"12\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"DD\" name=\"birthDate\"size=\"5\" max=\"31\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>전화번호</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"cellphone\" size=\"20\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>성별구분</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"male\">남 &nbsp;<input type=\"radio\" name=\"gender\" value=\"female\">여\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"회원가입\"> <input type=\"reset\" value=\"취소\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script src= \"../js/memberRegister.js\"></script>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- <main>\r\n");
      out.write("\r\n");
      out.write("\t</main>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"HTML Study\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Bruce\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url('common.css');\r\n");
      out.write(".footBox{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".footBox1{\r\n");
      out.write("\twidth:80%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul{\r\n");
      out.write("\t display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul li{\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul p{\r\n");
      out.write("}\r\n");
      out.write(".footBox2 {\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul{\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul li{\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul a img{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write(" <hr>\r\n");
      out.write(" <div class=\"footBox\">\r\n");
      out.write(" <div class=\"footBox1\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                <p><b>공지사항</b></p> \r\n");
      out.write("                <p>미트미트 개인정보처리방침 개정 안내</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>광고문의</b></p>\r\n");
      out.write("                   <p>kudam92@naver.com</p> \r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                    <p><b>사업장</b></p>\r\n");
      out.write("                   <p>서울 강남구 테헤란로5길 24 5층 504호</p> \r\n");
      out.write("               </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>전화문의</b></p>\r\n");
      out.write("                   <p>010-7147-7814</p> \r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write(" </div>    \r\n");
      out.write("\t\t<div class=\"footBox2\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/\"><img src=\"../img/facebook.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/\"><img src=\"../img/instagram.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.twitter.com/\"><img src=\"../img/twitter.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("\t-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
