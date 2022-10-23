package com.se.jpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "chuyenbay")
@Entity
public class ChuyenBay {
	@Id
	@Column(name = "MaCB")
	private String maCB;
	@Column(name = "GaDi")
	private String gaDi;
	@Column(name = "GaDen")
	private String gaDen;
	@Column(name = "DoDai")
	private int doDai;
	@Column(name = "GioDi")
	private Date gioDi;
	@Column(name = "GioDen")
	private Date gioDen;
	@Column(name = "ChiPhi")
	private int chiPhi;
	public String getMaCB() {
		return maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public Date getGioDi() {
		return gioDi;
	}
	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}
	public Date getGioDen() {
		return gioDen;
	}
	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}
	public int getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}
	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	
	
}
