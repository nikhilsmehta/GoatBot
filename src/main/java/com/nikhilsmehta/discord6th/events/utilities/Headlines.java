package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/*
 * @status still in progress
 *
 * */

public class Headlines extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "nflhead")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("NFL HEADLINES");
            info.setDescription("https://www.espn.com/nfl/");
            info.setColor(TutorialBot.embedColor);
            info.setFooter("Fetched using espn", TutorialBot.jda.getSelfUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "nbahead")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("NBA HEADLINES");
            info.setDescription("https://www.espn.com/nba/");
            info.setColor(TutorialBot.embedColor);
            info.setFooter("Fetched using espn", TutorialBot.jda.getSelfUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }



}
