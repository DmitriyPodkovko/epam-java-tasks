# Fixed length

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *15 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<String> f(int k, List<String> stringList)`

Method must return a list of strings sorted in ascending order, each string has length equaled to `k` and ends in a digit.

Parameters:
* `k` is a positive integer;
* `stringList` is a list of non-empty strings, each string contains only numbers and uppercase characters of the Latin alphabet.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
k = 2
stringList = ["8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"]
```

Output:

```
["A1", "S3"]
```

