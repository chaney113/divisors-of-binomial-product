package divisorsOfBinomialProduct;

import java.util.ArrayList;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class DivisorsOfBinomialProduct {
	public void helloWorld() {
		System.out.println("Hello World from the DivisorsOfBinomialProductclass");
	}
    
    public void findFactors(ArrayList<Long> factors, Long num) {
        // Skip two if the number is odd
        int incrementer = num % 2 == 0 ? 1 : 2;

        for (Long i = 1L; i <= Math.sqrt(num); i += incrementer) {
            if (num % i == 0) { // We found a factor (one of the factors ie 7 of 7*3 = 21)
                factors.add(i);

                // Skip duplicates
                if (i != num / i) { // Now find the other number ie: 3 of 7 * 3 = 21
                    factors.add(num / i);
                }
            }
        }
    }
    
    public Long productOfBinomialCoffs(int n) {
    	Long product = 1L;
    	for(int k = n; k >= 0; k--) {
    		product *= CombinatoricsUtils.binomialCoefficient(n,k);
    	}
    	return product;
    }
}
