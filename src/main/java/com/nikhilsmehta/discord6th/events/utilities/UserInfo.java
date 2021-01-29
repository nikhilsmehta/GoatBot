package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

import static com.nikhilsmehta.discord6th.TutorialBot.jda;

public class UserInfo extends ListenerAdapter {


    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");



        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "user")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle(event.getMessage().getAuthor().getName()+"'s Info! :man_bowing:");

            info.setDescription (event.getMember().getAsMention()+" has been a member of discord since "+event.getAuthor().getTimeCreated().getDayOfMonth()+" "+event.getAuthor().getTimeCreated().getMonth()+", "+event.getAuthor().getTimeCreated().getYear() +" and has been a member of this server since "+event.getMember().getTimeJoined().getDayOfMonth()+" "+event.getMember().getTimeJoined().getMonth() + ", "+event.getMember().getTimeJoined().getYear());
            info.setColor(TutorialBot.embedColor);
            info.setFooter("Generated by GoatBot using the Discord API", jda.getSelfUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}
