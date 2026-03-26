class Main{
	public static void main(String[] args){
		Pracownik p1 = new Pracownik("Imie", 2100);
		Programista p2 = new Programista("ImieProg", 4000, "Java");
		System.out.println("Imie: " + p1.imie + " Pensja: " + p1.pensja);
		System.out.println("Imie: " + p2.imie + " Pensja: " + p1.pensja + " Jezyk Programowania: " + p2.jezykProgramowania);
	}
} 
