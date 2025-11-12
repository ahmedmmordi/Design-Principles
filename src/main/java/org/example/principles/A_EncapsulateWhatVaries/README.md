# Task: Notification System

Build a small system that sends notifications to users. There are different notification methods — e.g. **Email**, **SMS**, **Push Notification** — and more might be added later.

Your goal is to **encapsulate the part that varies** (the notification sending logic) and make the system **easy to extend without modifying existing code**.

---

## Requirements

### Define the Core Abstraction
- Establish a single interface responsible for representing the notification behavior.
- This interface should declare one operation that enables sending a message.

---

### Create Multiple Concrete Variants
- Implement three distinct types of notification services, each representing a different communication channel:
    - Email
    - SMS
    - Push Notification
- Each implementation should produce an output that clearly indicates the channel through which the message is being sent.

---

### Introduce the Sender Component
- Design a class responsible for coordinating message delivery.
- It should depend only on the abstract notification type, not on any concrete implementation.
- Use **constructor-based dependency injection** to provide the notification mechanism at creation time.
- Include a public method that delegates the sending operation through the injected service.

---

### Verification and Execution
- Prepare a simple test class to demonstrate the behavior.
- Use it to send a sample message through each notification channel, verifying that each produces its corresponding output.

---

### Outcome
- The system should flexibly support multiple notification mechanisms.
- Adding a new one should require no modifications to the existing sender or interface.

---

## Bonus (Optional)

If you finish the above easily:
- Consider extending the system to support an additional type of notification.
- Think about how this new type could be integrated **without modifying the existing sender component**.

That proves your design follows the **Encapsulate What Varies** principle.

---

## Expected Output Example
```text
Sending EMAIL: Your order has been shipped
Sending SMS: Your order has been shipped
Sending PUSH: Your order has been shipped
Sending SLACK: Your order has been shipped
```
