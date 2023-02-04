# DVD_Logo_Engine
Recreating the recognisable DVD logo bouncing on screen in JAVA 

The project represent the well know DVD logo bouncing on the TV monitor when the DVD was not in use (when it was sleeping). I wanted to recreate this nostalgic invention using the JAVA ( version 11) language. I made it using the SOLID principals, as best as I can implement them, also I used dependency injection making the project loosely coupled. In addition to that the program can adapt to any size of monitor. If the user want to change the size of the DVD logo box or the movement speed, this could be adjusted in the MAIN file (where the code is ran).

There are six JAVA files and all of them do different fuctions:

1. JPanelBackground changes the color of the panel which is inside the box that represents the DVD logo. 
2. JWindowStructure represent the DVD logo, however for simplisity I use a box. There are few methoeds which are override to do new specific job.
3. Main DVD is logically the main method where the program is running and all components are initialized.
4. Movement is at the file where all the movement and characteristics of the project is made.
5. MovementApps is a functional interface, which I used in other projects.
6. Position is a file with getters and setters which pinpoint the exact position of the DVD box.
