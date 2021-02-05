
public class harmonic {

	public static void main(String[] args) {
		double i,n;
		d ouble sum =0;
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter any no");
		
		n =sc.nextDouble();
		
		for (i=1;i<=n; i++) 
		{	
			
		sum =sum+(1/i);
		System.out.println(sum);
		}
			System.out.print("sum of harmonic series is"+sum);
			
		}
		
			
		}
		

	}

}
