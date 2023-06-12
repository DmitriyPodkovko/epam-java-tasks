# Schools' statistics for specific years

The purpose of this exercise is to train you to work with the Java 8 streams API.  
The estimated workload is *35 min*.

### Description

Please, proceed to `Task` class and implement its methods

`public static List<YearSchoolStat> f(List<Entrant> nameList, List<Integer> yearsList)`

Method must return a list of `YearSchoolStat` objects by the following rules:
* each `YearSchoolStat` object contains an information about the number of different schools that applicants graduated from, for each year from the `yearList`;
* if there is no applicant for specific year put zero into the `<number_of_schools>` field;
* the list must be sorted in ascending order by the number of schools and for equaled numbers in ascending order by the year.

Parameters:
* `nameList` is a list of `Entrant` objects;
* `yearList` is a list of years (integers).

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
(11, 2003, "Ivanov"),
(11, 2001, "Petrov"),
(11, 2001, "Pupkin"),
(10, 1999, "Zobkin"),
(10, 1999, "Zabkin"),
(10, 1999, "Ivanov"),
(10, 2000, "Petrov"),
(14, 2001, "Pupkin"),
(15, 2000, "Zobkin"),
(10, 2000, "Ivanov"),
(12, 2003, "Petrov"),
(11, 2003, "Pupkin"),
(10, 2003, "Zobkin")
]
yearList = [2001, 1999, 2000, 2002, 2003]
```

Output:
```
[
(2002, 0),
(1999, 1),
(2000, 2),
(2001, 2),
(2003, 3)
]
```
