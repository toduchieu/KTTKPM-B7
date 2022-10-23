package com.se.jpa.entity;

public class ChungNhan {
	private MayBay MaMB;
	private NhanVien MaNV;
	public MayBay getMaMB() {
		return MaMB;
	}
	public void setMaMB(MayBay maMB) {
		MaMB = maMB;
	}
	public NhanVien getMaNV() {
		return MaNV;
	}
	public void setMaNV(NhanVien maNV) {
		MaNV = maNV;
	}
	public ChungNhan() {
		super();
	}
	public ChungNhan(MayBay maMB, NhanVien maNV) {
		super();
		MaMB = maMB;
		MaNV = maNV;
	}
	
	
	
}
