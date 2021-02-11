package com.tms.clonning;

import java.io.*;

public class CatSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cat vaska = new Cat("Vaska", "Gray", 4);
		
		FileOutputStream baos = new FileOutputStream(new File("catser.dat"));
		ObjectOutputStream ous = new ObjectOutputStream(baos);
		ous.writeObject(vaska);
		ous.close();

		FileInputStream bais = new FileInputStream(new File("catser.dat"));
		ObjectInputStream ois = new ObjectInputStream(bais);

		Cat cloneVaska = (Cat) ois.readObject();
		System.out.println(vaska);
		System.out.println(cloneVaska);
		
		
		System.out.println("*********************************************");
		cloneVaska.setColor("White");
		cloneVaska.setName("ExperimentalVaska");
		
		
		System.out.println(vaska);
		System.out.println(cloneVaska);

	}
}
