# Combination

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *25 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<Integer> f(int d, int k, List<Integer> integerList) `


Method must return a list which contains a combination of two subset of the `integerList` list:
* the first subset of the `integerList` list is all elements greater than value `d`
* the second subset of the `integerList` list is elements with ordinal number `k` and greater.

Elements of list must be sorted in descending order.

Parameters:
* `d` is an integer number;
* `k` is a positive integer number;
* `integerList` is a list of integer numbers.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
d = 3
k = 4
integerList = [-10, 3, -3, 4, 55, 6]
```

Output:

```
[55, 6, 4]
```
