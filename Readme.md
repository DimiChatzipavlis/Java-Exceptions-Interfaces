# 📘 README

## Overview
This repository contains a collection of **simple and educational Java examples** demonstrating three core language concepts:

---

## 1. Exceptions & Specified Exceptions (`try-catch` & `throws` / `throw`)
These examples illustrate:

- How to define and use **custom exceptions**
- How methods declare possible failures using **`throws`**
- How to actively trigger an exception using **`throw`**
- How to wrap original exceptions through **exception chaining**
- How `try`/`catch` blocks handle abnormal execution paths

The exception examples use basic input validation to make the control flow easy to understand.

---

## 2. Assertions, Preconditions & Postconditions
These examples demonstrate:

- **Preconditions:** requirements that must hold before a method runs  
- **Postconditions:** conditions that must hold after the method completes  
- **Assertions:** development-time checks for programmer assumptions  
- How a failing assertion triggers an **`AssertionError`**
- How to enable assertions using the `-ea` JVM flag

Assertions help catch internal logic errors early in development.

---

## 3. Interfaces
These examples show:

- How to declare **interfaces**
- How classes implement interfaces using **`implements`**
- How interfaces inherit from other interfaces using **`extends`**
- How Java supports **multiple inheritance of type** through interfaces
- How interfaces define roles and behavioral contracts

The interface examples keep behavior simple so the structural concepts are clear.

---

# ▶ How to Compile and Run the Programs

### 0. Go to the appropriate directory (via cd command)

### 1. Compile all `.java` files & run the file you like
From the selected directory, run:

```bash
javac *.java
java FileName



