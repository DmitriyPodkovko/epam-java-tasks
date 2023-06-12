# School statistics

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *35 min*.

### Description

Please, proceed to `Task` class and implement its method

`public static List<YearSchoolStat> f(List<Entrant> nameList)`

Method must return a list of `YearSchoolStat` objects by the following rules:
* each `YearSchoolStat` object contains an information about the number of different schools that applicants graduated from for each year presented in the source data;
* The list must be sorted in ascending order by the number of schools and in ascending order by the year number if numbers are the same.

Parameter:
* `nameList` is a list of `Entrant` objects.

> Also, it is necessary to implement `Task.main` method to demonstrate all the functionality.

Proceed to `Entrant` class and implement its content, it contains the following fields:
* `<school_number>`, `<year_of_entering>`, `<last_name>`.

Proceed to `YearSchoolStat` class and implement its content, it contains the following fields:
 * `<year_of_entering>`, `<number_of_schools>`

> Follow Java naming convention when you name fields.

### Details

* Function to implement must contain just only one return statement.
* Use one or more  Java 8 stream pipelines to create return value.

### Example

Input:

```
nameList = [ 
(1, 1993, "Ivanov"),
(2, 1992, "Petrov"),
(3, 1993, "Pupkin"),
(3, 2000, "Zobkin"),
(3, 2000, "Zabkin")
]
```

Output:
```
[
YearSchoolStat{yearOfEntering=1992, numberOfSchools=1},
YearSchoolStat{yearOfEntering=2000, numberOfSchools=1},
YearSchoolStat{yearOfEntering=1993, numberOfSchools=2}
]
```
