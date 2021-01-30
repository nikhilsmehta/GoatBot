# GoatBot :goat:

GoatBot is a discord bot which offers a combination of memes as well as moderation commands. Some features are:
* Banning and Muting Commands
* Numerous memes
* A command that uses an [API](https://meme-api.herokuapp.com/gimme) to get random memes from [r/memes](https://www.reddit.com/r/memes/)
* A news command to get the most up-to-date news from [NewsAPI](https://newsapi.org/)
* A modular code design allowing for environmental variables


## Installation and Setup

To use Goatbot follow the below steps:
1. Clone this repository
2. If you want to host it on a sevrer, adjust the Maven dependencies in the pom.xml file and also adjust Procfile as needed
3. I have it set up so that it uses environmental variables for the bot token and some other images, so i suggest you comment those commands out or add environmental variables of your own. Keep in mind that you will need the bot token in order for this to run. 
4. This bot uses Java 8, however you can change that to suit your needs in the [pom.xml](https://github.com/nikhilsmehta/GoatBot/blob/main/pom.xml) file at lines 12 and 13


## Usage

1. To run this bot, open [TutorialBot.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/TutorialBot.java). Keep in mind that for the token, it uses environmental variables.
2. Visit the [help.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/events/utilities/help.java) file for help on all of the commands or scroll down to see the directory of commands. 
3. Besides the token, it also uses Environmental Variables in [Howie.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/events/memes/Howie.java), [love.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/events/memes/love.java), and for the NewsAPI key in [Newsspi.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/events/utilities/Newsspi.java)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
* [MIT](https://choosealicense.com/licenses/mit/)
* See more about the license in the [License.txt](https://github.com/nikhilsmehta/GoatBot/blob/main/LICENSE.txt) file

## Content Directory
```
GoatBot/
├─ Memes/
│   ├─ ?meme
│   ├─ ?love
│   ├─ ?osas
│   ├─ ?cap
│   ├─ ?supahot
│   ├─ ?bully
│   ├─ ?nah
│   ├─ ?chewy
│   ├─ ?kwaza
│   ├─ ?wtf
│   ├─ ?osas
│   ├─ ?pain
│   ├─ ?code
│   ├─ ?bruh
│   ├─ ?sus
│   ├─ ?howie
│   ├─ ?boi
├─ Utilities/
│   ├─ ?maker
│   ├─ ?user
│   ├─ ?sourcecode
│   ├─ ?sportnews
│   ├─ ?usnews
│   ├─ ?help
│   ├─ ?helpmemes
│   ├─ ?helputil
├─ Moderation
│   ├─ ?mute
│   ├─ ?unmute
│   ├─ ?ban
│   ├─ ?unban
```
