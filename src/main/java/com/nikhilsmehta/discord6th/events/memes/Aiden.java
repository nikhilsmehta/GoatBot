package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Aiden extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "aiden")) {
            MessageBuilder e =new MessageBuilder();
            e.setContent("https://cdn.discordapp.com/emojis/797172070914981928.png?v=1");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(e.build()).queue();
            e.clear();


        }
    }

}
