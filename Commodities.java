package com.gst.calculate;

public class Commodities {
	private int gst;
	private int unitPrice;
	private int units;

	public Commodities(int gst, int unitPrice, int units) {

		this.gst = gst;
		this.unitPrice = unitPrice;
		this.units = units;
	}

	public int getGst() {
		return gst;
	}


	public void setGst(int gst) {
		this.gst = gst;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getUnits() {
		return units;
	}




	public void setUnits(int units) {
		this.units = units;
	}


	public double calculateGST()
	{
		return (gst*unitPrice*units)/100;

	}
}


