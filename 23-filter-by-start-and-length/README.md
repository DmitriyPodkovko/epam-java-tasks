# Filter by start and length

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *25 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<String> f(List<Integer> integerList, List<String> stringList)`

Method must return a list of strings according to the following rules:
* for each value `n` from `integerList` select a string from `stringList` that starts with a digit and has length `n`;
* if there are several required strings in the `stringList`, select the first one;
* if there are no required string, place *Not found* as an appropriate element.

Parameters:
* `integerList` is a list of positive integer numbers.
* `stringList` is a list of strings.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
integerList = [1, 3, 4]
stringList = ["1aa", "aaa", "1", "a"]
```

Output:

```
["1", "1aa", "Not Found"]
```
