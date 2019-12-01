package com.gst.calculate;

import java.io.IOException;
import java.util.Scanner;
public class CalculateGST {

	public static void main(String args[]) throws IOException
	{
		Scanner  sc = new Scanner(System.in);
		int units = sc.nextInt();
		ReadPropertyFile readPropertyFile = new ReadPropertyFile();
		int slab = Integer.parseInt(readPropertyFile.getProperty(sc.next()));
		Commodities com = new Commodities(slab,sc.nextInt(),units);
		double gstValue = com.calculateGST();
		
		System.out.println("GSTValue"+" "+gstValue+" "+"FinalPrice"+" "+(gstValue + (com.getUnitPrice()*com.getUnits())));
	}
}



