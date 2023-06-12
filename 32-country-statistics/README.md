# Countries' statistics

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *45 min*.

### Description

Please, proceed to `Task` class and implement its method  

`public static List<CountryStat> f(List<Goods> goodsList, List<StorePrice> storePriceList)`

Method must return a list of `CountryStat` objects by the following rules:
* each `CountryStat` object contains an information about the number of stores offering goods manufactured in thå country, as well as the 
minimum price for goods from this country for all stores;
* if no product is found for a certain country that is presented in any store, then put the number of stores and the minimum price to **0**;
* the list must be sorted by country of origin.

Parameters:
* `goodsList` is a list of `Goods` objects;
* `storePriceList` is a list of `StorePrice` objects.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

Proceed to `Goods` class and implement its content, it contains the following fields:
* `<product_SKU>`, `<product_name>`, `<country_of_origin>`.

Proceed to `StorePrice` class and implement its content, it contains the following fields:
* `<product_SKU>`, `<store_Title>`, `<price>` (this field must be declared as BigDecimal).

Proceed to `CountryStat` class and implement its content, it contains the following fields:
* `<number>`, `<countryOfOrigin>`, `<price>` (this field must be declared as BigDecimal)

> Follow Java naming convention when you name fields.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
goodsList = [
Goods(1, "milk", "Poland"),
Goods(2, "milk", "Portugal") 
]
storePriceList = [
StorePrice(1, "BigShop", BigDecimal("12.50")),
StorePrice(1, "SushiBar", BigDecimal("10.50")),
StorePrice(2, "BigShop", BigDecimal("12.50"))
]
```

Output:
```
[
CountryStat("Poland", 2, BigDecimal("10.50)),
CountryStat("Portugal", 1, BigDecimal("12.50")) 
]
```

