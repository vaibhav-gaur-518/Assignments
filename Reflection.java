package com.monocept.test;
import java.lang.reflect.*;

public class Reflection {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang." + args[0]);
			Method methlist[] = c.getDeclaredMethods();
			for (int i = 0; i < methlist.length; i++) {
				Method m = methlist[i];
				System.out.println("name  = " + m.getName());
				
				Class pvec[] = m.getParameterTypes();
				for (int j = 0; j < pvec.length; j++) {
					System.out.println("param #" + j + " " + pvec[j]);
					System.out.println("return type = " + m.getReturnType());
				}
				
				Field[] fields = c.getDeclaredFields();
				for(int j=0;i<fields.length;i++) 
					System.out.println("Fields: "+ fields[i].getType().getName()+" "+fields[i].getName());
				System.out.println("");
			}
			System.out.println("-----------------------------------");

			Class c1 = Class.forName("java.lang." + args[1]);
			Method methlist2[] = c1.getDeclaredMethods();
			for (int i = 0; i < methlist2.length; i++) {
				Method m = methlist2[i];
				System.out.println("name  = " + m.getName());
				
				Class pvec2[] = m.getParameterTypes();
				for (int j = 0; j < pvec2.length; j++) {
					System.out.println("param #" + j + " " + pvec2[j]);
					System.out.println("return type = " + m.getReturnType());
				}
				
				Field[] fields = c1.getDeclaredFields();
				for(int j=0;i<fields.length;i++) 
					System.out.println("Fields: "+fields[i].getName());
				System.out.println("");
				
				System.out.println("");
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
