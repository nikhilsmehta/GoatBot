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
4. This bot uses Java 8, however you can change that to suit your needs in the [pom.xml](https://github.com/nikhilsmehta/GoatBot/blob/main/pom.xml) file


## Usage

1. To run this bot, open [TutorialBot.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/TutorialBot.java). Keep in mind that for the token, it uses environmental variables.

Visit the [help.java](https://github.com/nikhilsmehta/GoatBot/blob/main/src/main/java/com/nikhilsmehta/discord6th/events/utilities/help.java) file for help on all of the commands.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
