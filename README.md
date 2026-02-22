S3.01 - Patterns 1

---
  
# 🎯 Objectives

In this practice we will learn to identify and build programs using design patterns. The use of patterns 
is fundamental in building extensible and reusable software. The Java language, as well as all software 
frameworks, are built according to the most important software patterns.

---
#Exercises to Perform

## Level 1

In all exercises, create a project with a Main class that demonstrates the use of the pattern (with the 
necessary invocations).

###Exercise 1 - Singleton: 

Create a class that replicates the functionality of the 'Undo' command. This class will be used by the 
Main class, which will allow introducing options via console.

The 'Undo' class must store the last commands entered. It must allow adding or removing commands, as well 
as listing the last commands entered (similar to the 'history' command in Linux).
The 'Undo' class must imperatively implement a Singleton pattern.
 
## Level 2

### Exercise 1 - Abstract Factory:

Create a small manager for international addresses and phone numbers.
The application must allow adding international addresses and phone numbers to the agenda. Taking into 
account the different formats of different countries, build the agenda, addresses and phones implementing 
an Abstract Factory pattern.

## Level 3

### Exercise 1 - Command:

Design a parking lot for 4 vehicles: a car, a bicycle, a plane and a ship.
Show how the Command pattern works by implementing the start, accelerate and brake methods for each type 
of vehicle.


---
# 💻 Technologies Used  

## Technologies
- Language: Java
- IDE: IntelliJ IDEA Community Edition
- Version Control: Git 

---

## 📋 Requirements  

- Java 21
- IntelliJ or another IDE 
- Git 2.51

---

### 🛠️ Setup

1. Clone the repository: https://github.com/ecantosf/Tasca-S3.01-Patterns-1.git
2. Open the project with IntelliJ IDEA.
3. Run the class `LevelXExercise1.Main.java` from each exercise folder.

---

## 🔗 Contributions

1. Fork the repository
2. Create a new branch: `git checkout -b feature/NewFeature`
3. Make your changes and commit them: `git commit -m 'Add New Feature'`
4. Push the changes to your branch: `git push origin feature/NewFeature`
5. Open a pull request