package aula18.exemplo3.predicate.util;

import java.util.function.Predicate;

import aula18.exemplo3.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
