package snackelection;

import java.util.Scanner;

public class Snackelection {

	public static void main(String[] args) {
		int t,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++){
			
			String db;
			db=sc.nextLine();
			String []bol=db.split("");
			int countm=0,counts=0;
			for(int j=0;j<bol.length;j++){
				if(bol[j].equals("m")){
					countm++;
					if(bol[j-1].equals("s")){
						counts--;
					}else if(bol[j+1].equals("s")){
						counts--;
					}else{
						
					}
				
			}else{
				counts++;
				
			}
				
			}	
			
			if(countm>counts){
				System.out.println("mongooses");
			}else if(countm<counts){
				System.out.println("snakes");
			}else{
				System.out.println("tie");
			}	
		}
		

	}

}