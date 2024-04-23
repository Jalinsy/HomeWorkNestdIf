import java.util.Scanner;

public class HomeWorkNestdIf {
    public static void main(String[] args) {
    	
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请输入年龄:");
    	int age = myScanner.nextInt();
    	System.out.println("请输入月份:");
    	byte month = myScanner.nextByte();
    	int fare = 60;
    	if(age >= 18 && age <= 60 && (month >= 4 && month <= 10)) {
    		System.out.println("成人票:" + fare);
    	} else if (age < 18 && (month >= 4 && month <= 10)) {
    		System.out.println("儿童票:" + fare / 2);
    	} else if (age > 60 && (month >= 4 && month <= 10)) {
    		System.out.println("老年票:" + fare / 3);
    	}
    	
    	if(age >= 18 && age <= 60) {
    		if(month < 4 || month > 10) {
    			System.out.println("成人票:40");
    		}
    	} else {
    		System.out.println("其他票:20");
    	}
    }
}
