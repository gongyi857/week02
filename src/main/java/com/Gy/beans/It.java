package com.Gy.beans;

public class It {
	private Integer id;
	private String type;
	private String bt;
	private String tid;
	private String bq;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBt() {
		return bt;
	}
	public void setBt(String bt) {
		this.bt = bt;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public It(Integer id, String type, String bt, String tid, String bq) {
		super();
		this.id = id;
		this.type = type;
		this.bt = bt;
		this.tid = tid;
		this.bq = bq;
	}
	public It() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "It [id=" + id + ", type=" + type + ", bt=" + bt + ", tid=" + tid + ", bq=" + bq + "]";
	}
	
}
