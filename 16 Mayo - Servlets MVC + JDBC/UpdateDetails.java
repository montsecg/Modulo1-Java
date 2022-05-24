package com.welcome;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class UpdateDetails
 */
public class UpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        try {
            Class.forName(DBUtil.CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DBUtil.URL, DBUtil.USUARIO, DBUtil.CLAVE);
            System.out.println("connection successful");
            PreparedStatement st = conn
                    .prepareStatement("update usuarios set name=?, email=?, phnum=? where stuid=?");
  
            st.setString(1, request.getParameter("name"));
            st.setString(2, request.getParameter("email"));
            st.setString(3, request.getParameter("phnum"));
            st.setInt(4, Integer.valueOf(request.getParameter("id")));
  
            st.executeUpdate();
  
            st.close();
            conn.close();
  
            response.sendRedirect("Success.jsp?msg=Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	

}
