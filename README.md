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

### Exercise 1 - Abstract Factory: Contact Formatter

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

### Exercise 1 - Strategy Pattern: Report Generation System:

- Overview
Implementation of a flexible report generation system that can produce documents in multiple 
formats (CSV, JSON, HTML, XML, PDF, Excel, Word) using the Strategy design pattern. The system 
demonstrates how to encapsulate different algorithms (report formats) behind a common interface, 
allowing them to be interchangeable at runtime.

- Features
1. Generate reports in 7 different formats: CSV, JSON, HTML, XML, PDF, Excel, Word
2. Easily switch between formats without modifying existing code
3. Add new report formats without changing the core service
4. Demonstrate low coupling between the report service and specific implementations
5. Show runtime strategy switching capability

- Technical Implementation
1. Strategy Pattern Components:
a. Strategy Interface: ReportStrategy defines the contract with generate(String data, String outputPath) method
b. Concrete Strategies: Seven implementations, one for each format:
- CsvReportStrategy - Generates comma-separated value files
- JsonReportStrategy - Creates JSON formatted documents
- HtmlReportStrategy - Produces HTML web pages
- XmlReportStrategy - Generates XML structured data
- PdfReportStrategy - Creates PDF documents (simulated)
- ExcelReportStrategy - Produces spreadsheet files (simulated)
- WordReportStrategy - Creates word processing documents (simulated)
c. Context Class: ReportService accepts any strategy and delegates report generation

- Package Structure:
1. interfaces/ - Contains the ReportStrategy interface
2. impl/ - Houses all concrete strategy implementations
3. service/ - Contains ReportService (context class)

- Testing:
1. Unit Tests: Each strategy has its own test verifying file creation and content format
2. Service Tests: Demonstrate the service working with any strategy implementation
3. Runtime Switching: Tests show changing strategies dynamically
4. Extensibility Demo: Test showing new strategies can be added without modifying existing code

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
