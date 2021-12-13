package bridgelabz.com;

public class Empwage {
	 public static void main(String args[]) {
		   int is_full_time  =  1;
		   double empCheck  =  Math.floor(Math.random()  *  10)  %2;
		   if (empCheck  ==  is_full_time)
			   System.out.println("employee is present");
		   else
			   System.out.println("employee is absent");
}
}
