# Task: Dynamic Document Generation

Your system needs to generate documents for a business app.
Sometimes the document content comes from different sources (like **database**, **file**, or **API**).
And the final output can be exported in different formats: **Text**, **HTML**, or **PDF**.

---

## Requirements

**The system should:**
- Work with multiple **input sources**.
- Support multiple **output formats**.
- Allow **switching between them at runtime**.
- Stay **open for new formats and sources** without editing existing code.

---

## Keep in Mind

- Some parts of the process should be **stable**.
- Other parts should be **easy to swap out**.
- Think about what **varies**.
- Make sure the **high-level class** doesn’t depend on concrete implementations.
- You should be able to **add a new output type** without changing the main logic.

---

## Expected Output Example
```text
[Text Export] Generated from Database Source
[HTML Export] Generated from API Source
[PDF Export] Generated from File Source
```

---

## Optional Twist (for more challenge)

Add an extra variation:
- Sometimes documents must be **compressed**, other times **encrypted** before export.
- Make that **extendable too**, without touching existing exporters.
