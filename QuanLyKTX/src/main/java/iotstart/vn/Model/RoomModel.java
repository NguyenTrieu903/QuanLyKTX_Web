package iotstart.vn.Model;

public class RoomModel {
	private String maphong;
	private int giaphong;
	private int sosinhvienhientai;
	private int sosinhvientoida;
	private int tinhtrang;
	public RoomModel(String maphong, int giaphong, int sosinhvienhientai, int sosinhvientoida, int tinhtrang) {
		super();
		this.maphong = maphong;
		this.giaphong = giaphong;
		this.sosinhvienhientai = sosinhvienhientai;
		this.sosinhvientoida = sosinhvientoida;
		this.tinhtrang = tinhtrang;
	}
	public RoomModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public int getGiaphong() {
		return giaphong;
	}
	public void setGiaphong(int giaphong) {
		this.giaphong = giaphong;
	}
	public int getSosinhvienhientai() {
		return sosinhvienhientai;
	}
	public void setSosinhvienhientai(int sosinhvienhientai) {
		this.sosinhvienhientai = sosinhvienhientai;
	}
	public int getSosinhvientoida() {
		return sosinhvientoida;
	}
	public void setSosinhvientoida(int sosinhvientoida) {
		this.sosinhvientoida = sosinhvientoida;
	}
	public int getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(int tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
}
