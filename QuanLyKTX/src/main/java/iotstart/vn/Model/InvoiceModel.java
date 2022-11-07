package iotstart.vn.Model;

import java.sql.Date;

public class InvoiceModel {
	private String mahd;
	private int tiendien;
	private int tiennuoc;
	private String maphong;
	private Date ngaytao;
	private int trangthai;

	public InvoiceModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceModel(String mahd, int tiendien, int tiennuoc, String maphong, Date ngaytao, int trangthai) {
		super();
		this.mahd = mahd;
		this.tiendien = tiendien;
		this.tiennuoc = tiennuoc;
		this.maphong = maphong;
		this.ngaytao = ngaytao;
		this.trangthai = trangthai;
	}

	public String getMahd() {
		return mahd;
	}

	public void setMahd(String mahd) {
		this.mahd = mahd;
	}

	public int getTiendien() {
		return tiendien;
	}

	public void setTiendien(int tiendien) {
		this.tiendien = tiendien;
	}

	public int getTiennuoc() {
		return tiennuoc;
	}

	public void setTiennuoc(int tiennuoc) {
		this.tiennuoc = tiennuoc;
	}

	public String getMaphong() {
		return maphong;
	}

	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
}
