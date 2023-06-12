package com.epam.rd.qa.topic10.task15;

import java.util.List;

public class Task {
	
	public static List<CountryStat> f(List<Goods> goodsList, List<StorePrice> storePriceList) {
		return null;
	}

	public static void main(String[] args) {
		List<Goods> goodsList = null;
		List<StorePrice> storePriceList = null;

		goodsList.forEach(System.out::println);

		System.out.println("~~~");
		storePriceList.forEach(System.out::println);

		System.out.println("~~~");
		f(goodsList, storePriceList).forEach(System.out::println);
	}

}
