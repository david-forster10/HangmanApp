# HangmanApp
ALE Mini-project

Scenario:
The game is designed around a sprite (character) being slowly lowered into a tub of acid after every wrong guess.

Requirements:
1 - Maximum of 9 guesses to get the word. 
2 - At each failed attempt a sound is produced to alert the user they guessed wrong and the sprite is moved nearer the acid.
3 - At the beginning of each round the system will randomly select a word, all words must be saved on a MySQL database. 
4 - When a word is selected, the correct amount of underscores must be presented. e.g. if the system selects "Truth" the lines should be "_ _ _ _ _".
5 - At a correct guess, a success sound must be produced. 
6 - If a player fails to guess all the characters, then a sound will play and the sprite is moved "into" the acid.
7 - If the player guesses all the characters correctly then a triumphant sound is played and the sprite is raised through the top of the screen to signify him being safe.    
8 - The game must show failed guessed characters. 
9 - There must be a separate section which allows the addition of new words to the database. 
10 - The correct guessed characters must be filled in, even if they are repeating characters.

Additional Requirements:
1 - The game will allow keyboard inputs as well as inputs from the on-screen buttons.
2 - The game will have an on-screen timer to record how long it takes the user to successfully guess the word.
3 - All times will be stored in database and ordered with quickest time first.
4 - System will be extended so that the user can view the "leaderboard".

Any technical problems should be researched prior to asking those around you.
If you are still unsure about things, then ask Dave but you may be redirected to Kiki if Dave can't help.
