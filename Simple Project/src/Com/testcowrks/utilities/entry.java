package Com.testcowrks.utilities;


 class entry {

	public static void main(String[] args) {
		son s=new son();
		s.smoke();
		s.color();
		s.running();

	}

}

class father{
	 void smoke() {
		 
		 System.out.println("father smoking daily");
		 System.out.println("don't pay money");
	 }
	 void color() {
		 System.out.println("black color");
		 System.out.println("dar hair");
	 }
}

class son extends father{
	
	void smoke() {
		System.out.println("son smoking hourly");
	}
	void running() {
		System.out.println("running daily");
	}
}


