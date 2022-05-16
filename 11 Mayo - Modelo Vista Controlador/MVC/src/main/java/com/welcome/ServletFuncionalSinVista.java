package com.welcome;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.welcome.Alumno;

/**
 * Servlet implementation class MyServletFuncional
 */
//AQUÍ PONEMOS COMO NOMBRE(ID) DEL SERVLET UN NAME Y UNA URL ESPECÍFICA
//@WebServlet( name = "muestraRegistro", urlPatterns = {"/muestraRegistro"})

public class ServletFuncionalSinVista extends HttpServlet {
	
	// CREACIÓN DE UN MÉTODO PARA PROCESAR INFORMACIÓN Y GESTIONAR EL MVC
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		// COMO RESPUESTA A LA PETICIÓN, UTILIZAREMOS TEXTO/HTML
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// OBTENCIÓN DE LOS PARÁMETROS DE LA PETICIÓN
	
		try {
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellidos");
			Double promedio = Double.parseDouble(request.getParameter("prom"));
		
			//CREO AHORA UN OBJETO ALUMNO Y AÑADO LOS DATOS RECOGIDOS. 
			Alumno alumno = new Alumno(nombre, apellido, promedio);
			
			// OUT O RESPUESTA QUE VAMOS A VER...
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet muestraRegistro</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet muestraRegistro en " + request.getContextPath() + "</h1>");
			out.println("<h2>Este es el Servlet muestraRegistro.java</h2>");
			out.println("<h3>A continuación se muestran los parámetros recibidos</h3>");
			
			out.println(alumno);
			out.println("</body>");
			out.println("</html>");
			
		} finally {
		out.close();
		}
	
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFuncionalSinVista() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
