package com.epam.rd.qa.topic10.task14;

import java.util.List;

public class Task {

	public static List<DiscountOwner> f(List<Supplier> supplierList,
				List<SupplierDiscount> supplierDiscountList) {
		return null;
	}

	public static void main(String[] args) {
		List<Supplier> supplierList = null;
		List<SupplierDiscount> supplierDiscountList = null;

		supplierList.forEach(System.out::println);
		System.out.println("~~~");

		supplierDiscountList.forEach(System.out::println);
		System.out.println("~~~");

		f(supplierList, supplierDiscountList).forEach(System.out::println);
	}

}
