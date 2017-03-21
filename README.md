# HangmanApp
ALE Mini-project

Scenario:
The game is designed around a sprite (character) being slowly lowered into a tub of acid after every wrong guess.

Requirements:<br/>
1 - Maximum of 9 guesses to get the word. <br/>
2 - At each failed attempt a sound is produced to alert the user they guessed wrong and the sprite is moved nearer the acid.<br/>
3 - At the beginning of each round the system will randomly select a word, all words must be saved on a MySQL database. <br/>
4 - When a word is selected, the correct amount of underscores must be presented. e.g. if the system selects "Truth" the lines should be "_ _ _ _ _". <br/>
5 - At a correct guess, a success sound must be produced. <br/>
6 - If a player fails to guess all the characters, then a sound will play and the sprite is moved "into" the acid. <br/>
7 - If the player guesses all the characters correctly then a triumphant sound is played and the sprite is raised through the top of the screen to signify him being safe. <br/>
8 - The game must show failed guessed characters. <br/>
9 - There must be a separate section which allows the addition of new words to the database. <br/>
10 - The correct guessed characters must be filled in, even if they are repeating characters. <br/>

Additional Requirements: <br/>
1 - The game will allow keyboard inputs as well as inputs from the on-screen buttons.<br/>
2 - The game will have an on-screen timer to record how long it takes the user to successfully guess the word. </br>
3 - All times will be stored in database and ordered with quickest time first. </br>
4 - System will be extended so that the user can view the "leaderboard". <br/>

Any technical problems should be researched prior to asking those around you. <br/>
If you are still unsure about things, then ask Dave but you may be redirected to Kiki if Dave can't help.
