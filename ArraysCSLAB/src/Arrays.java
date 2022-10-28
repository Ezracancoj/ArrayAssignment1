import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(25.3);
		numbers.add(100.0);
		numbers.add(-10.0);
		numbers.add(-1.5);
		numbers.add(13.0);
		numbers.add(98.6);
		numbers.add(17.0);
		numbers.add(123.145);
		numbers.add(125.6);
		numbers.add(123.146);
		 Double max=0.0;
		final int size = 9;
		
		//{ 125.6, 123.146}
		for (Double number: numbers) {
		      System.out.printf(number+" ");
		     
		    }
		System.out.println();
	   
		for (int i = 1; i < size; i++) {
			if (numbers.get(i) > max);
			max = numbers.get(i);
		}
                
         
        System.out.println("The largest element in the array is "+max);
    

	}

}
