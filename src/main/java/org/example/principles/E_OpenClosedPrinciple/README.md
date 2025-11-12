# Task: Shipping Cost Strategy System

You are designing a Shipping Cost Calculation System for an online marketplace.
Currently, the company ships using a few carriers, but more will be added soon.
Each carrier has its own cost calculation logic.

---

## Requirements
**The system must calculate the shipping cost for a given order based on:**
- Destination (e.g., Local, International)
- Weight (in kg)
- Carrier type (e.g., DHL, FedEx, Aramex, UPS)

**Each carrier has a different formula for cost:**
- **DHL**: base + weight * 1.5
- **FedEx**: base + weight * 1.3
- **Aramex**: base + weight * 1.2
- **UPS**: base + weight * 1.4

**The system should:**
- Take an order object containing destination, weight, and carrier.
- Calculate total shipping cost.
- Print a small summary.

**You must follow the Open/Closed Principle (OCP):**
- The design should allow adding new carriers in the future without modifying existing code.

**Optional Twist (Advanced):**
- Add a promotional discount system that applies a discount strategy (e.g., seasonal discount, loyalty discount).
- Ensure this is also OCP-compliant.

---

## Constraints
- Avoid all `if`, `switch`, or type-checking conditions for carrier logic.
- Keep each class having **one reason to change** (SRP-compatible).
- Design it so that a new shipping carrier can be added **just by creating a new class**, not by editing existing ones.

---

## Goal
- Demonstrate the **Open/Closed Principle** through abstraction and extension.
