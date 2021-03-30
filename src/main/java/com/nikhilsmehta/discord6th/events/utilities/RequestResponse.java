package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RequestResponse extends ListenerAdapter {

    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "respond")) {
            String userID = args[1];
            User u = event.getJDA().getUserById(userID);
            String sending = event.getMessage().getContentDisplay();
            String updated1 = sending.replace(args[0], "");
            String updated2 = updated1.replace(args[1], "");

            u.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage(updated2))
                    .queue();

            User nikhil = event.getJDA().getUserById("745127340581060619");
            nikhil.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage("Message sent!"))
                    .queue();
        }
    }

}
