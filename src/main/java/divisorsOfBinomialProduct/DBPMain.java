package divisorsOfBinomialProduct;

import java.util.ArrayList;

public class DBPMain {
	public static void main(String[] args) {
		DivisorsOfBinomialProduct dbp = new DivisorsOfBinomialProduct();
		dbp.helloWorld();

		int n = 5;
        ArrayList<Long> factors = new ArrayList<Long>();
		for(int i=1; i<=n; i++) {
			Long productOfBinomialCoffs = dbp.productOfBinomialCoffs(i);
			dbp.findFactors(factors, productOfBinomialCoffs);
		}
		System.out.println("accumulated factors: " + factors);
		
		Long sum = 0L;
		for(int i=0; i<factors.size(); i++) {
			sum += factors.get(i);
		}
		System.out.println("sum: " + sum);
	}
}
