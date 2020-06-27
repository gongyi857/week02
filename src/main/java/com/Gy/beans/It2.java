package com.Gy.beans;

public class It2 {
		private Integer tid;
		private String bq;
		public Integer getTid() {
			return tid;
		}
		public void setTid(Integer tid) {
			this.tid = tid;
		}
		public String getBq() {
			return bq;
		}
		public void setBq(String bq) {
			this.bq = bq;
		}
		public It2(Integer tid, String bq) {
			super();
			this.tid = tid;
			this.bq = bq;
		}
		public It2() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "It2 [tid=" + tid + ", bq=" + bq + "]";
		}
		
}
