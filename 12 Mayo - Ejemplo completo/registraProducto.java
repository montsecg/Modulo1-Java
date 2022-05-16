package com.welcome;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class registraProducto
 */
@WebServlet(name = "registraProducto", urlPatterns = {"/registraProducto"})

public class registraProducto extends HttpServlet {
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		// COMO RESPUESTA A LA PETICIÓN, UTILIZAREMOS TEXTO/HTML
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// OBTENCIÓN DE LOS PARÁMETROS DE LA PETICIÓN
	
		try {
			int clave = Integer.parseInt(request.getParameter("clave"));
			String nombre = request.getParameter("nombre");
			Double precio = Double.parseDouble(request.getParameter("precio"));
			int cantidad = Integer.parseInt(request.getParameter("cant"));
			
			Producto producto = new Producto(clave, nombre, precio, cantidad);
			
			//Sintaxis para crear el productos.txt
			ServletContext sc = this.getServletContext();
			String path = sc.getRealPath("/WEB-INF/Productos.txt");
			System.out.println(path);
			path = path.replace('\\','/');
			System.out.println(path);
			
			
			//Guardar en un archivo
			guardarProducto.add(producto, path);
			
			// sintaxis para pasar los datos del objeto a otro JSP. 
			request.setAttribute("atributoProducto", producto);
			request.getRequestDispatcher("/muestraRegistro.jsp").forward(request,response);
			
		} finally {
		out.close();
		}}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registraProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
