# Symmetrical difference

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *25 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<Integer> f(int k, List<Integer> integerList)`

Method must return a list which contains a symmetrical difference between two subsets of integer values:
* the first subset is all even `integerList` values;
* the second subset is the `integerList` values excluding the first `k` elements.

List must be sorted in descending order.

Parameters:
* `k` is a positive integer number;
* `integerList` is a list of positive integer numbers.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
k = 5
integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

Output:

```
[9, 7, 4, 2]
```
