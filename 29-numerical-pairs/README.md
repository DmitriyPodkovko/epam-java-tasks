# Numberical pairs

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *35 min*.

### Description

Please, proceed to `Task` class and implement its method

`public static List<NumberPair> f(List<Integer> integerList1, List<Integer> integerList2)`

Method must return a list of `NumberPair` objects by the following rules:
* the first element of the pair belongs to `integerList1`;
* the second element of the pair belongs to `integerList2`;
* both elements end with the same digit.

Parameter:
* `integerList1` is a list of positive integers; 
* `integerList2` is a list of positive integers.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

Proceed to `NumberPair` class and implement its content, it contains the following fields:
* `<value_1>`, `<value_2>`.

> Follow Java naming convention when you name fields.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
integerList1 = [1, 2, 33, 44]
integerList2 = [11, 22, 13]
```

Output:
```
[
NumberPair(1, 11),
NumberPair(2, 22),
NumberPair(33, 13)
]
```
