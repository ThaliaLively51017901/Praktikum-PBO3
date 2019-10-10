class acaratv {
	public String Stasiuntv;
	public String Acara;
	
	public String getStasiuntv() {
		return Stasiuntv;
	}
	public void setStasiuntv(String Stasiuntv) {
		this.Stasiuntv = Stasiuntv;
	}
	public String getAcara() {
		return Acara;
	}
	public void setAcara(String Acara) {
		this.Acara = Acara;
	}
	public void cetak() {
		System.out.println("Acara "+Acara+"Stasiun TV "+Stasiuntv);
	}
}