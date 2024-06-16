package registeryProject;
import java.util.*;
public class VehicalRegistry {
	
	Scanner s=new Scanner(System.in);	
	private String name;
	private long addhar;
	private String licence;
	public String brand;
	public String moddel;
	public String chessyno;
	public long price;
	
	public void newReg(){
		System.out.println("Enter your name: ");
		this.name=s.nextLine();
		System.out.println("Enter your addhar card number(last 4 digit): ");
		this.addhar=s.nextLong();
		System.out.println("Enter your licence no issued by RTO: ");
		this.licence=s.nextLine();
		System.out.println("Enter the brand of vehical: ");
		this.brand=s.nextLine();
		System.out.println("Enter the model of vehicle: ");
		this.moddel=s.nextLine();
		System.out.println("Enter the Chesis no of the Vehicle: ");
		this.chessyno=s.nextLine();
		System.out.println("Enter the price of vehicle: ");
		this.price=s.nextLong();	
	}
	
	
	
	public void updInfo() {
		System.out.println("Note:- Things you can update are name,addhar no,licence no and price only.");
		
		System.out.println("To choose what to update select: \nFor Name= 1.\nFor Addhar no= 2.\nFor Licence= 3\nFor Price= 4.");
		
		int a=s.nextInt();
		switch(a) {
		case 1:
			System.out.println("Enter new owner name: ");
			String newonr=s.nextLine();
			this.name=newonr;
			break;
		case 2:
			System.out.println("Enter new owner addhar no: ");
			long newaddno=s.nextLong();
			this.addhar=newaddno;
			break;
		case 3:
			System.out.println("Enter new owners Licence no issued by RTO: ");
			String newlicence=s.nextLine();
			this.licence=newlicence;
			break;
		case 4:
			System.out.println("Enter new price: ");
			long newprice=s.nextLong();
			this.price=newprice;
			break;
		default:
			System.out.println("Wrong selection.");
		}			               
	}
	
	
	
	public void viewInfo() {
		System.out.println("Owner of the vehicle is :"+name);
		System.out.println("Owners licence no is: "+licence);
		System.out.println("Brand and Model of the vehicle is: \nBrand: "+brand+"\nModel: "+moddel);
		System.out.println("Chessy no of the vehicle is: "+chessyno);
		System.out.println("The price of the vehicle is: "+price);
		
	}
	
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			VehicalRegistry vr=new VehicalRegistry();
			
			int numReg=1000;
			for(int j=1; j<=numReg;j++) {
			System.out.println("To register new vehicle please choose 1: ");
			System.out.println("To update existing registered records please choose 2: ");
			System.out.println("To view registered details please choose 3: ");
			
			int i =sc.nextInt();
			switch(i) {
			case 1:
				vr.newReg();
				break;
			case 2:
				vr.updInfo();
				break;
				
			case 3:
				vr.viewInfo();
				break;
			
			}
		
				

}
		}

}
}
