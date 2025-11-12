# Task: The Payroll Processor

You have been handed a single Java class called **PayrollProcessor**.
It currently:
- Calculates employees’ monthly salaries (including bonuses and taxes).
- Reads and writes employee data from a JSON file.
- Prints payslips to the console.
- Sends salary payment confirmation emails to employees.

Your job is to restructure the design so that it fully follows the **Single Responsibility Principle (SRP)**.

---

## Your Objectives

**Identify the different responsibilities inside PayrollProcessor.**
- Analyze which parts of the code handle salary calculations, data access, reporting, and communication.

**Decide what logical parts (classes, interfaces, etc.) should exist in your refactored design.**
- Determine separate classes or interfaces for each responsibility.

**Sketch or describe how these parts will interact together without breaking SRP.**
- Ensure each class has one and only one reason to change.

---

## Important Points to Keep in Mind
- Think about different reasons this class might need to change in the future.
- Ask yourself: **"If the email system changes, which class should I touch?"**
- Try to make each class have one clear purpose, summarized in a single sentence.
