Traffic Invader
Authors: Karan Dalal, Eric Decasper, Vikram Penumarti
Revision: 5/25/2021


Introduction: 


What does your program do?


Our program is an endless game where the player is a car dodging through traffic while the screen scrolls down. The program moves the screen down while the player navigates through traffic that increases in speed and quantity as time passes. It also keeps score as a function of time.


What Problem Does it Solve? Why did you Write it?


We wrote our program to provide a fun, catchy game to play while bored. Our game was formed through the idea of a game where a player can play for as long as they want, but also be challenged with constant obstacles and increasing difficulty.


What is the story?


It’s every child’s, and maybe even some adult’s, dream to go fast. To achieve the adrenaline that comes with high thrill speeds. However, in our current world, this is simply impossible – in fact, extremely dangerous to attempt on normal interstates and highways. We created this game to allow people to achieve the thrill of swerving in and out of traffic at high speeds, just as they see on their favorite racing channels, such as F1. 


What are the rules? What is the goal?


In short, you are a car that has to navigate the busy interstate – swearing and weaving your way through traffic. If you make contact with another object / vehicle, you lose a life, if all your lives are exhausted the game is ended. Your goal is to “live as long as you can” and achieve the highest score possible. 


Who would want to use your program?


Our program is rated “E for everyone” meaning that anyone can use our game. Many people may want to use our program – from adults who are frustrated with their commute to children who want the thrill of the ride, Traffic Invader is made for all.






Instructions:


Which keyboard keys will do what? 


The left, right, up, and down arrow keys will be used to navigate the car left, right, up, and down in order to swerve through traffic. If you press e, you can also move the car with your mouse.


Where will you need to click? 


In order to start the game, you must click the start button. Once the game is over, you have the option to return to the main menu and play again. You can also change the background, car, and look at instructions in the main menu.


Will you have menus that need to be navigated? What will they look like? 


The main menu will be the first screen to navigate to. It has a start button, it displays the overall high score, it also has menus where you can navigate to change the background, player color/car, and look at the instructions. While in the game you can click the pause button, and return to the main menu, or choose to continue.


Do actions need to be taken in a certain order?


Our user interface will be very simple and easy to navigate. In order to start the game, a user would launch the program and click the start button.


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):


Must-have Features:
* High Score: This must-have feature displays a scoreboard with the highest score in the current program session. This means that the high score is reset every time the program is run.
* Main Game Screen: This is the main game screen where users (players) navigate through traffic. This feature encompasses the display element of the game.
* Pause/Restart: This must have feature allows users to pause in the middle of their game and even restart without having to return to the main menu.
* Infinite Obstacle Generation: We would like the game to continue on forever. This feature will implement infinite obstacle generation so that the user never reaches a certain “end” to the game. Instead, their goal is to get the highest score.
* Initial Menu: We would like to implement a separate, modern initial menu to display game options to customize and run the game.
* Life System: In order to add a little flair into our game, we would like to implement a life system based on how many collisions you can take and an invulnerability period after a certain collision.


Want-to-have Features:
* Music: This stretch feature would involve the addition of music, with multiple channels,80 into our game.
* Animations: In order to make the game more entertaining the addition of collision and spin of animations would do a lot to make the game look more fluid.
* The ability to use your mouse. The ability to use your mouse to control the car as a different means of movement.
* Different “skins” for the car that you are driving. Not just solid colors but patterns and different images.
* Different types of cars with different traits. For example you may be able to select a sports car or a semi truck that have different speeds and health.


Stretch Features:
* Online high score list: Our game is competitive by nature, and in order to increase our competitiveness, we wanted to create an online high score list that can be viewed by any player from anywhere. This online high score list will store the top 10 scores ever achieved in our game, and encourage users to beat them.
* Different POV: A different birds eye view that is 3D where you can see more specifics of the oncoming cars perhaps the people driving it even.
* 2 players: A way to compete with other plays online with the same obstacles with the person who last the longest being the winner.


Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]


Game.java: Extends PApplet. Runs the main game loop. 
Runner.java: Runs the program


GameOver.java: Displays the game over screen
MainGame.java: Is the main screen of the game
MainMenu: Displays the main screen when the user launches the game
Screen: Superclass for GameOver, MainGame, and MainMenu
BackgroundSelect.java: This screen displays the background selection.
Instructions.java: This screen displays the instructions.
PlayerSelect.java: This screen displays the player selection screen.


Car.java: Represents the incoming obstacle grey car.
Player.java: Represents the player – a.k.a a car.
Entity.java: The superclass of Car and Player.
RedCar.java: Represents the incoming obstacle red car.
SemiTruck.java: Represents the incoming obstacle semi truck.


BackGroundManager.java: Manages variety of backgrounds. Picks and displays them.
BackGround.java: Superclass of all backgrounds
NormalRoad.java: Default background of program
DoubleRoad.java: Same as NormalRoad.java except with extra lanes and different color
CountryRoad.java: Same as NormalRoad.java except with solid lane divider and different color


Music.java : Handles music and sound elements


Credits:


Eric Decasper: 
Game.java: Did all the collisions and movement of the player through WASD and mouse.
Entity.java
Car.java
Player.java
RedCar.java:
SemiTruck.java:
Isolated all PNGs in photoshop for the cars. 


Karan Dalal: 
Game.java: Programmed the setup method and currentScreen method. As Well as mouse pressed
GameOver.java
MainMenu.java
BackgroundSelect.java:
Instructions.java:
MainGame.java:
PlayerSelect.java:
Screen.java:
Runner.java:




Vikram:
Music.java: 
BackGroundManager.java: 
BackGround.java: 
NormalRoad.java: 
DoubleRoad.java:
CountryRoad.java: 




External Credits:
Dan Decasper: Eric’s dad helped me with a couple syntax errors and debugging.
Sam Leistiko: Friend outside of class helped with our project structure, collisions, and some player movement.