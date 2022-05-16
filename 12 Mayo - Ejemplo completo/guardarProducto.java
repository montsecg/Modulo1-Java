package com.welcome;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class guardarProducto {

	public static void add(Producto p, String path) throws IOException{
		File archivo;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			
			archivo = new File(path);
			fw = new FileWriter(archivo, true);
			pw = new PrintWriter(fw);
			pw.println(p.getClave() + "," + p.getNombre() + "," + p.getPrecio() + "," 
					+ p.getCantidad());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( pw != null) pw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
	}}

