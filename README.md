# Understaning-Classes — Java Classes Assignment

## Overview
This was a Java assignment from AP Computer Science A focused on **object-oriented programming and class design**. The program simulates an Amazon-style package ordering system using two custom classes: `Destination` and `Package`. A `Main` driver class handles user interaction via the console.

## Concepts Covered
- Designing and implementing multiple classes in Java
- Instance variables, constructors, and methods
- Encapsulation with getters and setters
- Static variables and methods
- Object comparison with custom `equals()` methods
- Copy constructors / defensive copying

## How It Works
The program walks the user through:
1. Creating a `Destination` object using the default constructor
2. Choosing an item name and price to build a `Package` object (6% tax applied automatically)
3. Creating a second `Package` with a random price and comparing the two
4. Updating the first package's item name and re-checking equality
5. Displaying the total number of `Package` objects created via a static counter

## Files
| File | Description |
|------|-------------|
| `Main.java` | Driver class — handles all user input and program flow |
| `Package.java` | Class B — represents a shippable item with a name, price, destination, and sale status |
| `Destination.java` | Class A — represents a shipping address with city, state, and zipcode |

## How to Run
Make sure you have Java installed, then in your terminal:
```bash
javac Main.java Package.java Destination.java
java Main
```

## Sample Interaction
```
What is your name? Hanna
Hello Hanna. Welcome to the tester class.

Choose item: 1) Sweatpants 2) Microwave 3) TV
> 1
Choose price: 1) $85 2) $15 3) $500
> 2

Package 1: Item: Sweatpants | Price: $15.90 | Dest: Annandale, Virginia, 22003
Package 2: Item: Sweatpants | Price: $7.21  | Dest: Annandale, Virginia, 22003
Equal? true

Total packages created: 2
```

## Notes
- Equality between two `Package` objects is based on **item name and destination only** — price is intentionally excluded
- The `Package` constructor stores a **defensive copy** of the `Destination` object to preserve encapsulation
- Tax (6%) is applied once at construction time
