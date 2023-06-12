# Extracting characters

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *25 min*.

### Description

Please, proceed to `Task` class and implement its method

`public static List<Character> f(List<String> stringList)`

Method must return a list which contains characters by the following rules:
* select the last character from each element of `stringList`, convert it to uppercase;
* sort characters in descending order by *initial string* length. 

Parameter:
* `stringList` is a list of non-empty strings of Latin alphabet characters.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
stringList = ["asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"]
```

Output:
```
['U', 'D', 'B', 'B', 'F', 'P', 'S', 'A']
```
