package nl.utwente.di;

public class Quoter {

	public double getBookPrice(String ISBN) {
		double price = 0;
		if (ISBN.equals("1")){
			price = 10.0;
		}
		else if (ISBN.equals("2")){
			price = 45.0;
		}
		else if (ISBN.equals("3")){
			price = 20.0;
		}
		else if (ISBN.equals("4")){
			price = 35.0;
		}
		else if (ISBN.equals("5")){
			price = 50.0;
		}
		return price;
	}
}
