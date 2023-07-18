
class TV{
   private int a;
   public TV(int a) { this.a = a; }
   public int getSize() { return a; }
}

class ColorTV extends TV{
	
	
private int a;
private int b;


public ColorTV(int a, int b) {
		this.a=a;
		this.b=b;
	
	}


private void printProperty() {

		
	}
	
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		}

	
}