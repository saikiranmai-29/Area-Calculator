# Area-Calculator
A Java program demonstrating inheritance and polymorphism through a shape area calculator — Circle and Rectangle classes override a common method to calculate their respective areas.
## Overview
This project models different shape types through a common parent class,
with each shape providing its own implementation of the area calculation.
It highlights how polymorphism allows the same method call to produce
different results depending on the actual object type at runtime.

## Features
- Base `Shape` class defining a common `calculateArea()` method
- `Circle` and `Rectangle` classes extending `Shape`, each overriding
  `calculateArea()` with shape-specific logic
- Demonstrates runtime polymorphism: a `Shape` reference calling
  `calculateArea()` executes the correct version based on the actual
  object (Circle or Rectangle)

## Tech Stack
- Java
- OOP concepts: Inheritance, Method Overriding, Polymorphism

## Project Structure
- `Shape.java` – Base class with a default `calculateArea()` method
- `Circle.java` – Extends Shape, overrides `calculateArea()` using radius
- `Rectangle.java` – Extends Shape, overrides `calculateA[ShapeCalculator.java](https://github.com/user-attachments/files/32434116/ShapeCalculator.java)

rea()` using
  length and width
- `ShapeCalculator.java` – Main class demonstrating the calculation for
  both shapes

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA (or any Java IDE)
3. Run `ShapeCalculator.java`

## Future Improvements
- Add more shapes (Triangle, Square)
- Add a `calculatePerimeter()` method for each shape
- Store shapes in an ArrayList and loop through them for a cleaner demo
- Take dimensions as user input via Scanner
