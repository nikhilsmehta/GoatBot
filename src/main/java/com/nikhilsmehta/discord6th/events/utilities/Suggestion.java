package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Suggestion extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "suggestion")) {
            EmbedBuilder e =new EmbedBuilder();
            String raw = event.getMessage().getContentDisplay();
            String yeet = raw.replace("?suggestion", "");
            e.setTitle("New Suggestion");
            e.appendDescription("From: "+event.getAuthor().getAsTag());
            e.appendDescription(" Command: "+yeet);
            if(!event.getMessage().getAttachments().isEmpty()){
                e.setImage(event.getMessage().getAttachments().get(0).getUrl());
            }
            MessageEmbed ok = e.build();
            User nikhil = event.getJDA().getUserById("745127340581060619");
            nikhil.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage(ok))
                    .queue();

            User maker = event.getMember().getUser();
            String userString = event.getMember().getUser().getId();
            maker.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage("Thank you for your command submission. It will be reviewed by our developers shortly."))
                    .queue();

        }



    }


}
