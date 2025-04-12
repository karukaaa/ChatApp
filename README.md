This is the **Chat Application**.
The main project uses the Chat Library (https://github.com/karukaaa/ChatLibrary) with the packet chat-library (https://github.com/karukaaa/ChatLibrary/packages/2470237) to send, receive, display messages via Web socket and Recycler view. 
The **Chat Library** is designed to encapsulate a full chat experience with a single public method: ChatLibrary.start(context)


When invoked, it launches an Activity containing:

A chat built using RecyclerView for displaying messages.

A message input field and a send button.

WebSocket connection to wss://echo.websocket.org, which:

Sends messages typed by the user.

Displays echoed responses from the server.




Replaces special response 203 = 0xcb with a predefined message: "Received special code!"

All WebSocket connection logic is encapsulated within the library.

Connection is closed when the activity is destroyed.


![image](https://github.com/user-attachments/assets/91330688-0238-469a-8577-483feccb5e25)
![image](https://github.com/user-attachments/assets/19cac54e-3228-4549-b2de-6ba229c00409)
![image](https://github.com/user-attachments/assets/0ccf6e0c-93d6-4119-96e0-f9f973475ae9)


https://github.com/user-attachments/assets/0fdeb61f-103a-48fb-8281-5e26bd72bde2


To use the library:
Add dependency: implementation("com.github:chat-library:X.X.X")
Invoke start method: ChatLibrary.start(this)

