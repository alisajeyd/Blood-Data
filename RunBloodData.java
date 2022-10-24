package hehe;
import java.util.Scanner;
public class RunBloodData {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 BloodData bd = new BloodData();
	        
	        System.out.print("Enter blood type of patient:");
	        String input1 = sc.nextLine();
	        System.out.print("Enter the Rhesus factor (+ or -):");
	        String input2 = sc.nextLine();
	        String data = input1 + input2;
	        
	        if(data.isEmpty()){
	            bd.display();
	        }
	        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||
	        		data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){
	            bd.setBloodType(input1);
	            bd.setRhFactor(input2);
	            bd.display();
	        }
	        else{
	            System.out.println("Invalid input!");
	        }
	        sc.close();
	    }
	}



