# Length aggregation

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *25 min*.

### Description

Please, proceed to `Task` class and implement its method

`public static List<String> f(List<String> stringList)`

Method must return a list which contains strings by the following rules:
* for all strings starting with the same character, determine their total length and obtain a string of the form **S-C**, where **S** is the total length of all strings from `stringList` that begin with the character **C**.
* elements must be sorted in descending order by the numerical values **S**; if numerical values are the same use ascending order by **C**.

Parameter:
* `stringList` is a list of non-empty strings containing only uppercase characters of the Latin alphabet.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
stringList = ["ABC", "A", "BCD", "D"]
```

Output:

```
["4-A", "3-B", "1-D"]
```
