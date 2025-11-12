# Task: Smart Home Device Management System

You are asked to design a system that manages smart home devices (lights, thermostats, security cameras, smart locks, sprinklers, etc.).

---

## Requirements & Constraints

### 1. Device Capabilities
Devices have different sets of features. Examples include:

- **Lights**: can be turned on/off, dimmed, or change color.
- **Thermostats**: can set temperature and schedule.
- **Security Cameras**: can record video and detect motion.
- **Smart Locks**: can lock/unlock.
- **Sprinklers**: can start/stop watering and set duration.

---

### 2. Operations by Clients
- Clients (apps, web dashboards, or automation routines) should be able to invoke operations **only relevant to the device type**.
- No client should ever be forced to know about or call methods it cannot use.

---

### 3. Extensibility
- New device types may be added in the future (e.g., smart blinds, coffee machines) **without modifying existing devices or clients**.
- The system must remain **open for extension but closed for modification** (OCP applies as a bonus).

---

### 4. Automation & Grouping
- Clients should be able to perform actions on **groups of devices** (e.g., turn all lights off, start all sprinklers).
- Each action should respect the capabilities of each device.
    - Example: The system should **not attempt to dim a thermostat**.

---

### 5. Optional Features
- Devices may have optional features (like motion-sensing cameras).
- Clients that depend on these features should **only require interfaces relevant to that feature**.

---

## Goal
- Design the device interfaces so that:
    - Each interface is **focused and minimal**, covering only one set of related capabilities.
    - No device is forced to implement methods it does not support.
    - Clients can safely interact with any device through the interfaces they actually need.

- Consider:
    - How many interfaces you need.
    - How devices implement **multiple interfaces** if they support multiple capabilities.
    - How this design would make **adding new devices easy**.
