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
            String name = args[1];
            String discriminator = args[2];
            String msg = event.getMessage().getContentDisplay();
            StringBuilder message= new StringBuilder(msg);
            message.delete(0, 2);
            User u = event.getJDA().getUserByTag(name, discriminator);
            String sending = event.getMessage().getContentDisplay();
            String updated1 = sending.replace(args[0], "");
            String updated2 = updated1.replace(args[1], "");
            String updated3 = updated2.replace(args[2], "");


            u.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage(updated3))
                    .queue();

        }
    }

}
