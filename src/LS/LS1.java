package LS;



class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		
		
		
		System.out.println("from samsung printer");
		System.out.println(doc);
		
	}
	
}


class LPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		
		System.out.println("from LG printer");
		System.out.println(doc);

	}
	
}



class LS1{
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
    //SPrinterDriver 와 LPrinterDriver를 만드시오
    
    
    /*
출력: 
From Samsung printer
This is a report about ...
From LG printer
This is a report about ...
     */
	
}


interface Printable { // MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

