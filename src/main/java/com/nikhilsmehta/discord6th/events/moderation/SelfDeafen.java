package com.nikhilsmehta.discord6th.events.moderation;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.concurrent.Task;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class SelfDeafen extends ListenerAdapter {

    /*public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "selfdeafen")) {

            String target = event.getAuthor().getId();
            Role role = event.getGuild().getRoleById("811751764856537098"); //811751764856537098
            List<Role> roles = event.getMember().getRoles();
            event.getGuild().removeRoleFromMember(target, roles.get(0)).queue();
            event.getGuild().addRoleToMember(target, role).queue();
            String mins = args[1];
            long minsLong = Long.parseLong(mins)*60000;
            long startTime = System.currentTimeMillis();
            TimerTask task = new TimerTask() {
                public void run() {
                    event.getGuild().removeRoleFromMember(target, role).queue();
                    event.getGuild().addRoleToMember(target, roles.get(0)).queue();
                }
            };
            Timer timer = new Timer("Timer");

            long delay = 1000L;
            timer.schedule(task, minsLong);

        }

    }*/

}
