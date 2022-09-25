package Functions;
public class FarToCel {
	public static void printFahrenheitTable(int start, int end, int step) {
			 double celcius=0.0;
	        int print=0;
	        for(int i=start;i<=end;i+=step)
	        {
	            celcius =((5*(i-32))/9);
	            print=(int)celcius;
	            System.out.println(i+" "+print);
	        }
			
		}
	}

