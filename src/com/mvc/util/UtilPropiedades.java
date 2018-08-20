package com.mvc.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilPropiedades {
	  public static Properties propiedades(){
	    	Properties prop = new Properties();
	    	InputStream input = null;
	    	try {
	    		input = UtilPropiedades.class.getClassLoader().getResourceAsStream("config.properties");
	    		if(input==null){
    	            System.out.println("Error al cargar el archivo de propiedades");
	    		    return null;
	    		}
	    		prop.load(input);
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
	        } finally{
	        	if(input!=null){
	        		try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	}
	        }
			return prop;
	    }

}