package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Fax extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "fax")) {
            MessageBuilder e =new MessageBuilder();
            e.setContent("https://tenor.com/view/tom-and-jerry-what-insomnia-no-sleep-gif-13337078");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(e.build()).queue();
            e.clear();


        }
    }

}
