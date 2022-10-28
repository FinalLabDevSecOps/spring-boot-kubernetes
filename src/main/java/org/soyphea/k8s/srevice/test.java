protected void test (HttpServletRequest req, HttpServletResponse resp) throws IOException {
  String location = req.getParameter("url");
  resp.sendRedirect(location); // Noncompliant
}
