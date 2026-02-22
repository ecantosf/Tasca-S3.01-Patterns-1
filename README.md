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
Implementation of an Undo class that simulates the basic functionality of a command history system, 
using the Singleton design pattern to ensure a single shared instance across the entire application.

- Features
1. Store commands in a history list
2. Add new commands to the history
3. Undo the last command (LIFO behavior)
4. Display all stored commands (similar to Linux `history` command)

- Technical Implementation
1. Singleton Pattern: Private constructor, static `getInstance()` method
2. Data Structure: `List<String>` for command storage (modern approach)
3. Methods:
	a. `addCommand(String command)`: Adds a command to history
	b. `undoCommand()`: Removes and returns the last command
	c. `showHistory()`: Displays all commands with numbered indexing
 
## Level 2

### Exercise 1 - Abstract Factory:

- Overview
Implementation of a contact management system that automatically formats addresses and phone numbers 
according to the country of origin, using the Abstract Factory design pattern to create families of 
related contact objects without specifying their concrete classes.

- Features
1. Create properly formatted addresses based on country-specific conventions
2. Generate phone numbers with correct international prefixes and local formats
3. Support for multiple countries (Spain and USA initially)
4. Easily extensible to add new countries without modifying existing code

- Technical Implementation

1. Abstract Factory Pattern:
	a. ContactFactory (abstract factory) defines the interface for creating address and phone objects
	b. SpainContactFactory and USAContactFactory (concrete factories) implement country-specific creations
2. Abstract Products:
	a. Address interface with getFormattedAddress() method
	b. Phone interface with getFormattedPhone() method
3. Concrete Products:
	a. SpainAddress, SpainPhone with Spanish formatting rules
	b. USAAddress, USAPhone with US formatting rules
4. Client: Contact class uses factories without knowing concrete implementations
5. Testing: JUnit 5 tests verify correct formatting for both countries

## Level 3

### Exercise 1 - Command:

Design a parking lot for 4 vehicles: a car, a bicycle, a plane and a ship.
Show how the Command pattern works by implementing the start, accelerate and brake methods for each type 
of vehicle.

## Technologies Used
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


### Setup

1. Clone the repository: https://github.com/ecantosf/Tasca-S3.01-Patterns-1.git
2. Open the project with IntelliJ IDEA.
3. Run the class `LevelXExercise1.Main.java` from each exercise folder.
