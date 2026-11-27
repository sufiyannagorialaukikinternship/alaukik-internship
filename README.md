# Java Internship Practice - Day 1 to Day 26

Ye README mere Java practice ka summary hai. Har day ke liye likha hai:
kya padha, kya banaya, kaun si file kahan hai, aur us program ko kaise chalate hain.

Dates file ki last-modified date se andaaze se likhi hain.

---

## Folder structure

| Days | Folder |
|------|--------|
| Day 1 to 5 | `day-1/` to `day-5/` |
| Day 6 to 10 | `phase-2/` |
| Day 11 to 15 | `phase-3/` |
| Day 16 to 20 | `phase-4/` |
| Day 21 to 25 | `phase-5/` |
| Day 26 | Is din ka code zip mein nahi hai |

---

## Day 1 - Java ka introduction

**Date:** approx. 26 Oct

**Kya padha:** Java kya hai, JDK / JRE / JVM ka farq, bytecode, `javac` aur `java` ka farq.

**Kya banaya:** `day-1/hellojava.java` - ek simple program jo "hello java" print karta hai.

**Kaise chalaye:**
```
javac hellojava.java
java hellojava
```

---

## Day 2 - Variables, data types aur operators

**Date:** approx. 26 Oct

**Kya padha:** Variables, primitive aur reference types, type casting, operators.

**Kya banaya:** `day-2/StudentMarksCalculator.java` - 4 subjects ke marks lete hai, total, percentage aur grade nikalta hai.

**Kaise chalaye:**
```
javac StudentMarksCalculator.java
java StudentMarksCalculator
```

---

## Day 3 - Conditions (if, else, switch)

**Date:** approx. 27 Oct

**Kya padha:** `if`, `if-else`, `else-if`, nested conditions.

**Kya banaya:** `day-3/StudentGradeManagementSystem.java` - 5 subjects ke marks, total (500 mein se), percentage, grade, aur Pass/Fail.

**Dhyan dein:** File ka naam `StudentGradeManagementSystem.java` hai, lekin andar class ka naam `StudentMarksCalculator` hai.

---

## Day 4 - Loops aur patterns

**Date:** approx. 28 Oct

**Kya padha:** `for`, `while`, `do-while`, nested loops, `break`, `continue`.

**Kya banaya:**
- `FabonacciSeries.java` - ek number tak Fibonacci series print karta hai.
- `Factorial.java` - factorial nikalta hai.
- `PrimeNumberChecker.java` - check karta hai number prime hai ya nahi.
- `Palindrome.java` - string palindrome hai ya nahi.
- `ReverseNumber.java` aur `ReverseNumber2.java` - number ko ulta karna (2 tarike se; `ReverseNumber2` seedha aur aasan hai).
- `patternprograms.java` - star (`*`) ka pattern.

**Dhyan dein:** Assignment mein Armstrong number aur number patterns bhi the, lekin unki files zip mein nahi hain.

---

## Day 5 - Methods aur arrays

**Date:** approx. 29 Oct

**Kya padha:** Methods, parameters, return values, overloading, 1D aur 2D arrays.

**Kya banaya:**
- `Average.java` - array ka average.
- `MaximumNumber.java` aur `MinimumNumber.java` - sabse bada aur sabse chhota number.
- `Searching.java` - array mein number dhundhna.
- `Sorting.java` - array ko sort karna (bubble sort jaisa tarika).
- `StudentResultManagementSystem.java` - students add, update, remove, show, aur roll number se result dekhna. Isme `ArrayList` aur `HashMap` use hue hain.

**Dhyan dein:** `Student.java` file zip mein nahi hai, sirf `Student.class` hai. Isliye `StudentResultManagementSystem` ko chalane ke liye `Student` class chahiye.

---

## Day 6 - Classes aur objects

**Date:** approx. 29 Oct - 3 Nov

**Kya padha:** Class, object, fields, methods, constructors, `this`, instance aur static members.

**Kya banaya:** `phase-2/day-6/Employee.java` - Employee ki id, name, salary, department. Constructor, getters/setters, aur `displayDetails()` method.

---

## Day 7 - Encapsulation

**Date:** approx. 30 Oct

**Kya padha:** Access modifiers (`private`, `public`, `protected`), getters/setters, data hiding.

**Kya banaya:** `phase-2/day-7/BankAccount.java` - bank ke accounts ka system. Account banana, edit karna, delete karna, deposit, withdraw, balance dekhna. Data `HashMap` aur `LinkedList` mein rakha hai.

**Dhyan dein:** `Customer.java` file zip mein nahi hai, sirf `Customer.class` hai.

---

## Day 8 - Inheritance

**Date:** approx. 30 Oct - 2 Nov

**Kya padha:** `extends`, method overriding, `super`, constructor chaining.

**Kya banaya:**
- `phase-2/day-8/Employee/` - `Employee` (parent), `Developer` aur `SeniorDeveloper` (child). `Main.java` dono ka sample data print karta hai.
- `phase-2/day-8/VehicleMS/` - `Vehicle` (parent), aur `Car`, `Bike`, `Truck` (child). `Main.java` teeno ka data print karta hai.

**Dhyan dein:** `Main.java` mein sample personal ID numbers (Aadhar, PAN) likhe hain. GitHub par public karne se pehle inhe hata dein.

---

## Day 9 - Polymorphism

**Date:** approx. 3 Nov

**Kya padha:** Method overriding, upcasting, dynamic method dispatch.

**Kya banaya:** `phase-2/day-9/PayementProcessingSystem.java` - `Payement` parent class. `CardPayement`, `UpiPayement`, `CashPayement` usme se override karte hain. Ek hi reference se alag-alag payment chalta hai.

---

## Day 10 - Abstraction aur interfaces

**Date:** approx. 3 - 4 Nov

**Kya padha:** Interface, abstract class, default aur static methods, enum.

**Kya banaya:**
- `phase-2/day-10/PaymentSystem/` - `PaymentService` interface. `UpiPayment`, `CardPayment`, `NetBankingPayment` use implement karte hain. `Main.java` mein menu hai: payment karo ya payment history dekho.
- `phase-2/day-10/NotificationSystem/` - SMS, WhatsApp aur Email bhejne ka system. `NOTIFICATIONTYPE` enum hai, `NotificationSender` mein sending ka code hai, `Main.java` mein menu hai.

---

## Day 11 - Strings

**Date:** approx. 4 Nov

**Kya padha:** `String`, immutability, `StringBuilder`, string methods.

**Kya banaya:**
- `phase-3/day-11/Reverse.java` - string ko ulta karna.
- `phase-3/day-11/TextProcessingUtility.java` - ek menu jisme: reverse, characters count, words count, palindrome, aur duplicate characters hatana.

**Dhyan dein:** `CountCharacter.java` khaali hai (sirf comment hai).

---

## Day 12 - Exception handling

**Date:** approx. 5 Nov

**Kya padha:** `try`, `catch`, `finally`, `throw`, `throws`, checked aur unchecked exceptions, custom exceptions.

**Kya banaya:** `phase-3/day-12/BankAccount.java` - bank system jisme galat kaam par exception throw hota hai. Custom exceptions hain: `InsufficientBalanceException`, `InvalidAmountException`, `AccountNotFoundException`.

**Dhyan dein:** Custom exception ki `.java` files zip mein nahi hain, sirf `.class` files hain.

---

## Day 13 - Packages

**Date:** approx. 5 - 6 Nov

**Kya padha:** Packages, imports, project ka folder structure (`com.company.employee`).

**Kya banaya:** `phase-3/day-13 & 14/src/com/company/employee/` mein ek proper package structure:
- `Main.java` - menu.
- `model/EmployeeModel.java` - employee ka data.
- `service/EmployeeService.java` - business logic aur checks.
- `util/Converter.java` - string ko date mein badalna (`dd/MM/yyyy`).

**Kaise chalaye:**
```
cd "phase-3/day-13 & 14/src"
javac -d out com/company/employee/Main.java com/company/employee/model/*.java com/company/employee/service/*.java com/company/employee/util/*.java
java -cp out com.company.employee.Main
```

---

## Day 14 - Collections Framework I

**Date:** approx. 5 - 6 Nov

**Kya padha:** `List`, `ArrayList`, `LinkedList`, `Iterator`.

**Kya banaya:** Day 13 wala hi Employee Management System. Isme add, update, delete, search aur display ka kaam hai. `LinkedList` aur `LinkedHashMap` use hue hain.

---

## Day 15 - Collections Framework II (Set aur Map)

**Date:** approx. 16 Nov

**Kya padha:** `Set`, `HashSet`, `TreeSet`, `Map`, `HashMap`, `LinkedHashMap`, `TreeMap`.

**Kya banaya:** `phase-3/day-15/` mein Contact Management System:
- `Contact.java` - contact ka data. Same number wale contact ko same maana hai (`equals` aur `hashCode`).
- `ContactManagementSystem.java` - contacts ko save, edit, remove, search karna. Number 10 digit ka hona chahiye aur duplicate number allowed nahi hai.
- `Main.java` - menu.

---

## Day 16 - Generics

**Date:** approx. 17 Nov

**Kya padha:** Generic classes, generic methods, `<T>`, type safety.

**Kya banaya:** `phase-4/day-16/`:
- `Repository.java` - ek generic class `Repository<T>` jisme add, update, getAll hain.
- `Student.java` aur `Teacher.java` - alag-alag data classes.
- `Main.java` - dono ke liye Repository use karke data add aur print karta hai.

**Dhyan dein:** `Repository.delete()` method abhi khaali hai.

---

## Day 17 - Functional programming (Lambda aur functional interfaces)

**Date:** approx. 18 Nov

**Kya padha:** Lambda expressions, `Consumer`, `Function`, `Supplier`, `Predicate`.

**Kya banaya:** `phase-4/day-17/`:
- `ConsumerExample.java` - Consumer se data print karna, `andThen` ka use.
- `FunctionExample.java` - Function se string ki length nikalna.
- `SupplierExample.java` - Supplier se random OTP banana.
- `functionInterfaceExample.java` - custom functional interface, anonymous class vs lambda, aur `Predicate` (even/odd check).
- `Assignment/Employee.java` - employee list par lambda se kaam.

---

## Day 18 - Stream API

**Date:** approx. 17 - 19 Nov

**Kya padha:** `stream()`, `filter`, `map`, `sorted`, `distinct`, `collect`, `reduce`.

**Kya banaya:**
- `StreamExample.java` - ek product list par step by step operations (distinct, filter, map, sorted) dikhata hai, har step ke pehle aur baad ka output ke saath.
- `EmployeeAnalyticsSystem/` - employees ki salary aur department par analysis: sabse zyada salary, average salary, department ke hisaab se.
- `StreamPractice/Stream.java` - aur practice.

**Dhyan dein:** `EmployeeAnalyticsSystem` ke sample data mein Aadhar numbers likhe hain. Public karne se pehle hata dein.

---

## Day 19 - Optional aur Date/Time API

**Date:** approx. 19 - 20 Nov

**Kya padha:** `LocalDate`, `LocalTime`, `LocalDateTime`, date formatting, time zones.

**Kya banaya:**
- `LocalDateExample.java`, `LocalTimeExample.java`, `LocalDateTimeExample.java` - in classes ke basic use.
- `DateFormattingExample.java` - date ko apne format mein print aur parse karna.
- `JavaTimeApi.java` - India aur New York ka time, age nikalna, aur shift ke minutes.
- `Assignment/` - employee attendance system: check-in, check-out, aur working hours.

**Dhyan dein:** `OptionalExample.java` khaali hai.

---

## Day 20 - Multithreading

**Date:** approx. 24 - 25 Nov

**Kya padha:** Thread, Runnable, thread lifecycle, synchronization, race condition, ExecutorService.

**Kya banaya:** `phase-4/day-20/`:
- `FileProcessor.java` - `input/` folder ki sari files ko alag-alag threads mein padhta hai aur lines, words, characters count karta hai.
- `Synchronization.java` - do threads ek hi counter ko 1000-1000 baar badhate hain. `synchronized` ki wajah se result 2000 aata hai.
- `ThreadLifeCycle.java` - thread ki states dikhata hai (NEW, RUNNABLE, TERMINATED).
- `RunnableThread.java`, `creatingThread.java`, `SingleProcessExample.java` - thread banane ke alag tarike.

**Kaise chalaye `FileProcessor`:** Us folder mein `input/` naam ka folder ho jisme text files hon. Phir:
```
javac FileProcessor.java
java FileProcessor
```

---

## Day 21 - SQL Fundamentals

**Date:** approx. 25 Nov

**Kya padha:** Database, DBMS, RDBMS, primary key, foreign key, constraints, normalization.

**Kya banaya:** MySQL install aur `employee_db` database banaya. Usme teen tables hain: `employees`, `departments`, `roles`. `employees` table ko foreign keys se baaki dono se jodha hai.

**Dhyan dein:** `phase-5/day-21/MySql` ek text report hai, SQL code ki file nahi.

---

## Day 22 - SQL CRUD aur queries

**Date:** approx. 25 Nov

**Kya padha:** `CREATE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE`, `WHERE`, `ORDER BY`, `GROUP BY`, `HAVING`.

**Kya banaya:** `phase-5/day-22/MySql` mein har command ka example aur uska matlab likha hai.

---

## Day 23 - Advanced SQL

**Date:** approx. 25 Nov

**Kya padha:** Joins (INNER, LEFT, RIGHT), subqueries, aggregate functions (`COUNT`, `SUM`, `AVG`, `MAX`, `MIN`), indexes.

**Kya banaya:** `phase-5/day-23/MySql` mein reporting queries:
- Employee ke saath department ka naam.
- Employee ke saath salary.
- Department-wise total salary.
- Sabse zyada salary wala employee.

---

## Day 24 - JDBC (Java ko MySQL se jodna)

**Date:** approx. 26 Nov

**Kya padha:** JDBC architecture, Driver, Connection, Statement, `PreparedStatement`, `ResultSet`.

**Kya banaya:** `phase-5/day-24/`:
- `MyConnection.java` - MySQL se connection banata hai.
- `MyDAO.java` - `employees` table ka saara data padh kar print karta hai.

**Zaroori:** Chalane ke liye MySQL Connector/J jar file classpath mein honi chahiye.

---

## Day 25 - JDBC CRUD project (Employee Management System)

**Date:** approx. 26 Nov

**Kya padha:** Poore CRUD ko JDBC se banana: add, update, remove, show all, search.

**Kya banaya:** `phase-5/day-25/`. Layers aise hain:

| Layer | File | Kaam |
|-------|------|------|
| UI (menu) | `Operator.java` | User se input leta hai aur menu dikhata hai |
| Model | `Employee.java` | Employee ka data |
| DAO | `EmployeeDAO.java` | Database ke saath saare kaam |
| Connection | `DAOConnection.java` | MySQL se connection |

**Dhyan dein:** `Operator.java` ke andar class ka naam `Main` hai.

---

## Day 26 - HTTP aur web basics

**Topic:** Client-server, HTTP aur HTTPS, request aur response, HTTP methods (GET, POST, PUT, PATCH, DELETE), status codes, headers, JSON.

**Practice:** Postman se APIs ko test karna.

**Zip mein code:** Is din ka koi folder ya code zip mein nahi hai.

---

## Dhyan dene wali baatein (known issues)

Ye cheezein code mein galat ya adhoori hain. Inhe baad mein theek kar sakte hain:

1. **Day 10:** `NetBankingPayment` ke `makePayment` mein message "Card payment" likha hai. Ye copy-paste ki galti hai.
2. **Day 13 aur 14:** `Scanner` (`sc.nextInt()`) aur `BufferedReader` dono `System.in` se padhte hain. Isse kabhi-kabhi input skip ho sakta hai. Ek hi reader use karna better hai.
3. **Day 20:** `FileProcessor` mein `words=arr.length;` loop ke andar hai, isliye words count sirf last line ka aata hai. Sahi karne ke liye `words += ...` use karein.
4. **Day 24 aur 25:** Database ka password (`123`) code mein likha hai. Ise config file ya environment variable mein rakhna better hai.
5. **Day 16:** `Repository.delete()` abhi khaali hai.
6. **Day 11 aur 19:** `CountCharacter.java` aur `OptionalExample.java` khaali hain.
7. **Day 12:** Custom exception ki `.java` files missing hain. Sirf `.class` hain.
8. **Day 8, 17, 18:** Sample data mein Aadhar aur PAN jaise personal numbers hain. GitHub par public karne se pehle inhe hata dein.
9. **File aur class ka naam alag hai:** Day 3 (`StudentGradeManagementSystem.java`) aur Day 25 (`Operator.java`).

---

## Main points (ek nazar mein)

- **Day 1 - 5:** Java basics, if-else, loops, methods, arrays.
- **Day 6 - 10:** OOP - class, encapsulation, inheritance, polymorphism, interface.
- **Day 11 - 15:** Strings, exceptions, packages, collections.
- **Day 16 - 20:** Generics, lambda, streams, date/time, multithreading.
- **Day 21 - 25:** MySQL, SQL queries, JDBC, aur ek CRUD project.
- **Day 26:** HTTP aur Postman (code nahi).