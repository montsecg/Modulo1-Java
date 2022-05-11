package com.welcome;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
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
			Alumnos alumno = new Alumnos(nombre, apellido, promedio);
			// OUT O RESPUESTA QUE VAMOS A VER...
			
			//EN EL OBJETO REQUEST GUARDAMOS EL OBJETO ALUMNO.
			// UTILIZAMOS EL ATRIBUTO LLAMADO "ATRIBUTOALUMNO"
			// PARA GUARDARLO
			request.setAttribute("datosAlmacenados", alumno);
			
			// CON ESTA INSTRUCCIÓN SE HACE UN REENVIO (FORWARD) DE LOS OBJETOS REQUEST Y RESPONSE
			// AL JSP MUESTRADATOS. 
			request.getRequestDispatcher("/muestraDatos.jsp").forward(request, response);
			
		} finally {
		out.close();
		}}
	
    public MyServlet() {
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
