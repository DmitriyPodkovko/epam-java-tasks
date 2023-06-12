# Length of strings

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *15 min*.

### Description

Please, proceed to `Task` class and implement its method:

`public static List<Integer> f(List<String> stringList)`

Method must return a list of ascending sorted integer values that are equaled to length of strings from the input non-empty `stringList` list.


> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
stringList = ["Hello", "world", "!", "Good", "morning", "!"]
```

Output:

```
[1, 1, 4, 5, 5, 7]
```

