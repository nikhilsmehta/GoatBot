package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class help extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "help")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle(":newspaper: Commands").setThumbnail("https://i.pinimg.com/originals/7b/3e/ee/7b3eeeafffcbc7669f9dd76404285117.jpg");

            info.addField("?help to get to this page", " ", false);
            info.addField("?helpmemes to view meme commands", " ", false);
            info.addField("?helpsports to view sports", " ", false);
            info.addField("?helputil to view utility commands", " ", false);

            info.setColor(TutorialBot.embedColor);
            info.setFooter("Created by nikhil");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

        //memes section

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "helpmemes")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle(":rofl: Meme Commands");

            info.addField("?meme is a randomly generated meme", " ", false);
            info.addField("?love to see arnav and nikhil loving each other", " ", false);
            info.addField("?osas to view osas", "", false);
            info.addField("?cap to view cappers", "", false);
            info.addField("?supahot to see the legend supahot", "", false);
            info.addField("?bully to see akhil getting banned", "", false);
            info.addField("?nah to see oh hell nah", "", false);
            info.addField("?chewy to see chewy", "", false);
            info.addField("?kwaza to see kwaza", "", false);
            info.addField("?wtf to see ayo wtf", "", false);
            info.addField("?osas to view osas", "", false);
            info.addField("?pain to see stephen a smith", "", false);
            info.addField("?coding to see akhil coding", "", false);
            info.addField("?bruh to see bruh", " ", false);
            info.addField("?sus to see sus", " ", false);
            info.addField("?howie to see howie", " ", false);



            info.setColor(TutorialBot.embedColor);
            info.setFooter("Created by nikhil");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "helpsports")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle(":medal: Sports Commands");

            info.addField("?nflhead to view nfl headlines :football:", " ", false);
            info.addField("?nbahead to view nba headlines :basketball:", "", false);

            info.setColor(TutorialBot.embedColor);
            info.setFooter("Created by nikhil");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "helputil")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Utility Commands");

            info.addField("?maker to view the maker of this awesome bot", " ", false);
            info.addField("?user to view user info about yourself", "", false);
            info.addField("?sourcecode to view the sourcecode for this bot", " ", false);
            info.addField("?mute to mute people. this is a moderator only command!", "", false);
            info.addField("?unmute to unmute people. this is a moderator only command!", "", false);
            info.addField("?sportnews to catch up on the most recent sport's news", " ", false);
            info.addField("?usnews to catch up on the most recent US news", " ", false);

            info.setColor(TutorialBot.embedColor);
            info.setFooter("Created by nikhil");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

    }
}
