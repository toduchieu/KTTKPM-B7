package com.se.jpa.entity;

public class MayBay {
	private String MaMB;
	private String Loai;
	private int TamBay;
	public String getMaMB() {
		return MaMB;
	}
	public void setMaMB(String maMB) {
		MaMB = maMB;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public int getTamBay() {
		return TamBay;
	}
	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}
	public MayBay() {
		super();
	}
	public MayBay(String maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}
	
	
}
