package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Virgin extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "virgin")) {
            MessageBuilder e =new MessageBuilder();
            e.setContent("https://cdn.discordapp.com/attachments/779048271653109801/832634470598705212/unknown.png");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(e.build()).queue();
            e.clear();
            TutorialBot.logger(event.getMessage().getContentDisplay(), event.getMessage().getJumpUrl(), event.getGuild().getName(), event.getAuthor().getAsMention());

        }
    }

}
