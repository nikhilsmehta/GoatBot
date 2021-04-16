package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @status Completed
 *
 * */

public class Maker extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "maker")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Bot Maker!");
            info.setDescription(":computer: Nikhil Mehta made this bot. For more info on the bot and it's code, follow this link to take you to my github repository: https://github.com/nikhilsmehta/GoatBot");
            info.setColor(TutorialBot.embedColor);
            info.setFooter("Created by nikhil", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
            TutorialBot.logger(event.getMessage().getContentDisplay(), event.getMessage().getJumpUrl(), event.getGuild().getName());
        }
    }
}
