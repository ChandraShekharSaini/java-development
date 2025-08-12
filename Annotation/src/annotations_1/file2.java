package annotations_1;

import java.util.ArrayList;

//Deprecated//Deprecated//Deprecated//Deprecated
//Deprecated//Deprecated//Deprecated//Deprecated


class TimeZoze{
	
	@Deprecated
	public void showDataAndTime() {
		
		System.out.println("7:30PM");
	}
	
	
    public void showTime() {
		
		System.out.println("7:30PM");
	}

    public void showDate() {
	
	System.out.println("2025-07-10");
     }

}

public class file2 extends TimeZoze{
	
	@Deprecated
	@Override
     public void showDataAndTime() {
		
		System.out.println("8:00PM");
	}

	
	public static void main(String[] args) {
		
		file2  f1 = new file2();
		f1.showDataAndTime();
		
	
	}
}
