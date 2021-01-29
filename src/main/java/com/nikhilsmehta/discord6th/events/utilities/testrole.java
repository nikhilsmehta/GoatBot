package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

import static com.nikhilsmehta.discord6th.TutorialBot.jda;

/**
 * @status Class For Testing stuff
 *
 * */

public class testrole extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");



        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "test")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("this is a test");

            if (event.getMember().hasPermission(Permission.ADMINISTRATOR)){
                info.setDescription ("yeet");
            }

            else {
                info.setDescription("you are no admin");
            }




            info.setColor(0xf45642);
            info.setFooter("Generated by GoatBot using the Discord API", jda.getSelfUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }

}
