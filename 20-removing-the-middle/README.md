# Removing the middle

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *15 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<String> f(List<String> stringList)`

Method must return a list of strings, each string consists of the first and the last characters of the corresponding string from the input non-empty `stringList` list.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
stringList = ["asd", "a", "basdw"]
```

Output:

```
["ad", "aa", "bw"]
```

