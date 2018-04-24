package com.hungpham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhanVien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNhanVien;
	
	private String tenNhanVien;
	
	private int tuoi;
	
	public NhanVien() {
	}

	public int getIdNhanVien() {return idNhanVien;}
	public void setIdNhanVien(int idNhanVien) {this.idNhanVien = idNhanVien;}

	public String getTenNhanVien() {return tenNhanVien;}
	public void setTenNhanVien(String tenNhanVien) {this.tenNhanVien = tenNhanVien;}

	public int getTuoi() {return tuoi;}
	public void setTuoi(int tuoi) {this.tuoi = tuoi;}

	@Override
	public String toString() {
		return "NhanVien [idNhanVien=" + idNhanVien + ", tenNhanVien=" + tenNhanVien + ", tuoi=" + tuoi + "]";
	}
	
}
