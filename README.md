S3.01 - Patterns 1
  
# 🎯 Objectives

In this practice we will learn to identify and build programs using design patterns. The use of patterns 
is fundamental in building extensible and reusable software. The Java language, as well as all software 
frameworks, are built according to the most important software patterns.

#Exercises to Perform

## Level 1

In all exercises, create a project with a Main class that demonstrates the use of the pattern (with the 
necessary invocations).

###Exercise 1 - Singleton Pattern: Undo Command 

- Overview
Implementation of an **Undo** class that simulates the basic functionality of a command history system, 
using the **Singleton design pattern** to ensure a single shared instance across the entire application.

- Features
1. Store commands in a history list
2. Add new commands to the history
3. Undo the last command (LIFO behavior)
4. Display all stored commands (similar to Linux `history` command)

- Technical Implementation
1. **Singleton Pattern**: Private constructor, static `getInstance()` method
2. **Data Structure**: `List<String>` for command storage (modern approach)
3. **Methods**:
  a. `addCommand(String command)`: Adds a command to history
  b. `undoCommand()`: Removes and returns the last command
  c. `showHistory()`: Displays all commands with numbered indexing
 
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


# Technologies Used  

## Technologies
- Language: Java
- IDE: IntelliJ IDEA Community Edition
- Version Control: Git

## Development Notes
- Configured **IntelliJ Live Template** (custom "Patterns" group) for automatic Singleton code generation
- Built with **Maven** for dependency management
- Unit tests implemented with **JUnit 5** to verify:
  - Singleton behavior (single instance)
  - Command addition and removal
  - Exception handling (empty history)
  - History display functionality


---

### Setup

1. Clone the repository: https://github.com/ecantosf/Tasca-S3.01-Patterns-1.git
2. Open the project with IntelliJ IDEA.
3. Run the class `LevelXExercise1.Main.java` from each exercise folder.

---

