package com.welcome;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class muestraProductos
 */
@WebServlet(name = "muestraProductos", urlPatterns= {"/muestraProductos"})
public class muestraProductos extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		// COMO RESPUESTA A LA PETICIÓN, UTILIZAREMOS TEXTO/HTML
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		try {
			ArrayList <Producto> productos = new ArrayList<Producto>();
			int cont = 0;
			String contador;
			Producto producto;
			ServletContext sc = this.getServletContext();
			String path = sc.getRealPath("/WEB-INF/Productos.txt");
			path = path.replace('\\', '/');
			LeeProductos.clearCont();
			contador = String.valueOf(cont);
			
			request.setAttribute("Productos", productos);
			request.setAttribute("contador", contador);
			request.getRequestDispatcher("/despliegaProductos.jsp")
			.forward(request, response);
			
		} finally {
		out.close();
		}}

   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public muestraProductos() {
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
		processRequest(request, response);
	}

}
