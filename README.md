# Java Chat & Messaging Architecture Simulator

[![Java](https://img.shields.io/badge/Java-JDK%208+-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Architecture](https://img.shields.io/badge/Pattern-OOP%20%2F%20Polymorphism-blue.svg)]()
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

An object-oriented messaging platform simulator in Java designed to model the architecture of modern communication networks. It implements core messaging patterns including 1-on-1 private channels, group conversations, multimodal message types, user identity state machines, privacy controls (blocking/unblocking), and full conversation history indexation.

---

## Key Features

- **Identity & Account Management**:
  - Registration, credential verification, profile updating, and stateful session control (`login`/`logout`).
  - Real-time user status states: `AVAILABLE`, `BUSY`, `AWAY`, `OFFLINE`.
- **Privacy & User Control**:
  - Block/unblock functionality to restrict unwanted communication.
  - User settings module for notifications, password updates, and profile privacy.
- **Multimodal Messaging**:
  - Support for multiple content types via `MessageType`: **Text** (`TEXTE`), **Image** (`IMAGE`), **Location** (`LOCATION`), and **File** (`FICHIER`).
- **Channel Topologies**:
  - **1-on-1 Private Chats** (`Chat_Individuel`): Direct peer-to-peer message exchange.
  - **Group Chats** (`Groupe_Chat`): Multi-participant channels with dynamic member onboarding, removal, and email/SMS invite requests.
- **Conversation History & Search Indexing**:
  - Stateful chat history stores per conversation (`Chat_Histoire`).
  - Full-text keyword search across messages.

---

## Domain Architecture

```text
┌──────────────────────────────────────────────────────────────────────────┐
│                               User Engine                                │
│  • Account & Session: createAccount(), login(), logout()                 │
│  • Privacy Controls:  blockUser(), updateStatus()                        │
│  • Channels & Search: addChat(), createGroupChat(), searchMessages()     │
└──────────────────┬────────────────────────────────────┬──────────────────┘
                   │ owns                               │ participates in
                   ▼                                    ▼
┌──────────────────────────────────────┐   ┌───────────────────────────────┐
│           Settings Module            │   │          Chat Channels        │
│  • Notifications & Privacy           │   │  ┌─────────────────────────┐  │
│  • Password & Contact Updates        │   │  │ Direct (Chat_Individuel)│  │
└──────────────────────────────────────┘   │  ├─────────────────────────┤  │
                                           │  │ Group (Groupe_Chat)     │  │
                                           │  └─────────────────────────┘  │
                                           └──────────────┬────────────────┘
                                                          │ contains
                                                          ▼
                                           ┌───────────────────────────────┐
                                           │   Messages & History Store    │
                                           │  • TEXTE / IMAGE / LOCATION   │
                                           │  • Chat_Histoire persistence  │
                                           └───────────────────────────────┘
```

---

## Project Structure

```text
ex 1/
└── src/
    ├── Chat.java              # Abstract base class for chat channels
    ├── ChatType.java          # Enum defining channel types (INDIVIDUEL, GROUP)
    ├── Chat_Individuel.java   # 1-to-1 direct messaging channel implementation
    ├── Groupe_Chat.java       # Multi-user group chat implementation
    ├── Message.java           # Message payload encapsulation
    ├── MessageType.java       # Enum for content types (TEXTE, IMAGE, LOCATION, FICHIER)
    ├── Chat_Histoire.java     # Conversation history & log persistence
    ├── Status.java            # Enum representing user availability status
    ├── Settings.java          # User configuration & profile preferences
    ├── User.java              # User identity, security, and action orchestrator
    └── Main.java              # Comprehensive simulation runner & CLI interaction
```

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### Compilation & Running

1. **Clone the repository**:
   ```bash
   git clone https://github.com/GalanRaduM24/ChatSystemSimulator.git
   cd ChatSystemSimulator
   ```

2. **Compile the source files**:
   ```bash
   javac -d out "ex 1/src"/*.java
   ```

3. **Run the simulation**:
   ```bash
   java -cp out Main
   ```

4. **Simulation Execution**: The application executes an end-to-end simulation covering user account creation, settings updates, peer blocking, group chat lifecycle, and message exchange workflows.