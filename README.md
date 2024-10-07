# Java Chat Application
This project simulates a simple chat application where users can create accounts, manage their settings, and participate in individual or group chats.

## Features:

- User account creation and login
- Managing user settings (change password, update phone number, etc.)
- Sending and receiving messages in individual and group chats
- Blocking and unblocking users
- Searching messages within chats
- Chat history management for both individual and group conversations
  
## Main Classes
### 1. User
   - This class represents a user in the system. It includes attributes like username, password, and status (e.g., available, offline, busy).
   - Key methods: `createAccount()`, `login()`, `blockUser()`, `addChat()`, `createGroupChat()`, `searchMessages()`, `logout()`.
### 2.Settings
   - This class allows users to manage their account settings such as notifications, password changes, and status updates.
   - Key methods: `setNotifications()`, `changePassword()`, `updateStatus()`, `help()`.
### 3.Chat_Individuel
   - Represents an individual chat between two users.
   - Methods allow for receiving and handling messages between users.
### 4.Groupe_Chat
   - Represents group chats that can involve multiple users.
   - Users can be added or removed from the group, and the group chat can be deleted or left by members.
   - Key methods: `addMembers()`, `removeFriend()`, `sentERequest()`, `sentMRequest()`.
### 5.Message
   - Handles messages exchanged in chats. Messages can be of different types (text, image, file, etc.).
   - Key methods: `Display()`, `setMessage_type()`.
### 6.Chat_Histoire
   - Manages the chat history for both individual and group chats. Users can retrieve and add messages to the history.
   - Key methods: `getMessageList()`, `addMessage()`.
### 7.Status
   - Enum class that defines the possible statuses a user can have: Available, Busy, Offline, or Away.

## Running the Program
- Compile and run the `Main` class.
- The program simulates user interactions like logging in, sending messages, and managing settings.
- User actions are triggered through the `main()` method for demonstration purposes.