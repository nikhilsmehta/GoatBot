package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Howie extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "howie")) {
            MessageBuilder e =new MessageBuilder();
            e.setContent("https://media.discordapp.net/attachments/779048271653109801/804192332899024956/unknown.png");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(e.build()).queue();
            e.clear();


        }
    }

}
