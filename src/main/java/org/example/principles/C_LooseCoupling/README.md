# Task: Report Delivery System

Your company generates business reports (like **Sales**, **Inventory**, **Performance**, etc.). These reports can be delivered via **Email**, **Slack**, or **Push notifications**.

---

## Your Goal

Build a small system that delivers a report message.

**Design Guidelines:**
- Use **interfaces** and **constructor injection** (composition) to decouple components.
- Allow switching **delivery types dynamically** at runtime.
- Ensure the system is **open for new delivery methods** without modifying existing code.

---

## Optional Add-Ons (for challenge)

- Consider adding a **mock delivery class** to simulate testing scenarios.
- Introduce a **message formatter** (e.g., `ReportFormatter`) that can change the style of messages, injected separately.
- These extensions help illustrate multiple compositions and demonstrate flexible, maintainable design.

---

## Expected Console Output (example)
```text
Email delivery: Monthly Sales Report sent
Push delivery: Monthly Sales Report sent
```

---

## Focus Points

- Maintain a **clear structure**: interfaces, implementations, and main/test class.
- Ensure **dependency direction** is correct — avoid instantiating concrete delivery types inside the core business logic.
