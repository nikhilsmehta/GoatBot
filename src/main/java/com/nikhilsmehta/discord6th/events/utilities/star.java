package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class star extends ListenerAdapter {

    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {

        if (event.getReaction().getReactionEmote().getName().equals("⭐")) {
            event.getReaction().getChannel().retrieveMessageById(event.getMessageId()).queue(message -> {
                String msg = message.getContentDisplay();
                String writer = message.getAuthor().getAsMention();
                String channel = message.getChannel().getName();
                MessageBuilder m = new MessageBuilder();

                m.setContent("Writer: " +writer+"\n"+"Channel: "+channel+"\n"+"Message: "+msg);
                event.getGuild().getTextChannelById("811657756268036136").sendTyping().queue();
                event.getGuild().getTextChannelById("811657756268036136").sendMessage(m.build()).queue();
                m.clear();
            });

        }
    }

}
