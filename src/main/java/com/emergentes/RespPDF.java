package com.emergentes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *DYLAN REYNALDO NINA CHAMBI
 */
@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.pdf");
        PrintWriter out = response.getWriter();
        try{
            out.println("<html>");
            out.println("<body>");
            out.println("PETER");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }finally{
            out.close();
        }
    }


}
