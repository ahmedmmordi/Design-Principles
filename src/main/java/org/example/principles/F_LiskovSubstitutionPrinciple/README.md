# Task: Vehicle Rental System

You are designing a system for a vehicle rental company. The system should handle different types of vehicles and calculate rental prices.

---

## Requirements

### Vehicle Types
- Car
- Bike
- Truck
- ElectricScooter

---

### Rental Behavior
- All vehicles can be rented for a number of hours.
- Some vehicles, like ElectricScooter, may have additional constraints (e.g., cannot be rented for more than 8 hours at a time).
- Trucks may require special licenses; Bikes and Cars do not.

---

### Pricing
Pricing is calculated differently for each vehicle type:

- **Car**: $10 per hour
- **Bike**: $5 per hour
- **Truck**: $20 per hour + insurance
- **ElectricScooter**: $3 per hour, max 8 hours per rental

---

### Liskov Substitution Principle (LSP) Rules
- Any subclass should be substitutable wherever a Vehicle is expected.
- Avoid throwing exceptions in overridden methods.
- Ensure that rental logic works uniformly without client code needing special checks for types.

---

### Extra Constraints
- Allow the system to easily add new vehicles in the future without modifying existing code.
- Include a mechanism to calculate total rental cost for a list of rented vehicles.
- Include a method to print rental summary for any vehicle.

---

## Goal
- Design the class hierarchy, interfaces, and methods in a way that respects LSP.
- Think carefully about which behaviors go in a parent class or interface, and which should be in specialized subclasses.
- Your solution should allow clients to call `rent()` or `calculatePrice()` on any Vehicle without knowing the specific type.
