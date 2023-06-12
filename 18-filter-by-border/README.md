# Filter by border

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *15 min*.

### Description

Please, proceed to `Task` class and implement its method

`public static List<String> f(char c, List<String> stringList)`

Method must return a new list of strings with more than one character from the **stringList**, starting and ending with **c**. 

Parameters:
* `c` is an abitrary character
* `stringList` is a sequence of non-empty strings.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
c = 'a'
stringList = ["Hello", "qwerty", "asda", "asdfa", "as", "a"]
```

Output:

```
["asda", "asdfa"]
```
