class Main{
	public static void main(String[] args){
		Samochod car1 = new Samochod("Marka1","Model1", 2000);
		Samochod car2 = new Samochod("Marka2", "Model2", 2010);

		car1.wyswietlInfo();
		car2.wyswietlInfo();
	}
}
