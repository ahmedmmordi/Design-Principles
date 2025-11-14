# Task: Music Player System

You are tasked with designing a music player application. It should handle multiple types of **audio sources**, **playlists**, **logging**, and **audio adjustments** (like equalizer settings). Users should be able to switch sources and playlists at runtime, and the system should operate **without relying on real audio playback**.

---

## Requirements

**The Music Player should be able to:**
- Play a song from any source (e.g., local file, online stream, or generated audio).
- Stop or pause playback.

**The Music Player should log events such as:**
- Song "X" Started
- Song "Z" Paused
- Song "Y" Stopped

**Design constraints:**
- High-level modules (Music Player) must **not depend on concrete implementations** of audio sources or loggers.
- High-level modules should depend on **abstractions (interfaces)**.
- Concrete implementations of audio sources or loggers should **implement these abstractions**.
- You should be able to **add new audio sources or loggers** without modifying the Music Player class.

---

## Goals

- Demonstrate correct application of the **Dependency Inversion Principle**.
- Show how the system allows **adding new sources or loggers** without changing high-level logic.
- Apply **Dependency Inversion Principle** across all parts of the system.
- Avoid **tight coupling** between the player and any specific implementation.
- Emphasize **extensibility**, **testability**, and **runtime flexibility** in the design.
