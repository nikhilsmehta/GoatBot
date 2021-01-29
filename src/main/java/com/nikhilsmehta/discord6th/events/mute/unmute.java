package com.nikhilsmehta.discord6th.events.mute;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @status Completed
 *
 * */

public class unmute extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) throws IndexOutOfBoundsException{
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "unmute")) {
            if (event.getMember().hasPermission(Permission.ADMINISTRATOR)) {
                if (args.length <= 1) {
                    senErrorMessage(event.getChannel(), event.getMember());
                } else {
                    Member target = event.getMessage().getMentionedMembers().get(0);
                    Role muted = event.getGuild().getRolesByName("Muted", true).get(0);
                    event.getGuild().removeRoleFromMember(target, muted).queue();

                    if (args.length >= 3) {
                        String reason = "";
                        for (int i = 2; i < args.length; i++) {
                            reason += args[i] + " ";
                        }

                        log(target, event.getMember(), reason, event.getChannel());
                    } else {
                        log(target, event.getMember(), "", event.getChannel());
                    }
                }

            }
            else {
                MessageBuilder m = new MessageBuilder();
                m.setContent("You don't have perms for that!");
            }
        }
    }

    public void senErrorMessage(TextChannel channel, Member member){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Invalid Usage!");
        builder.setAuthor(member.getUser().getName(), member.getUser().getAvatarUrl(), member.getUser().getAvatarUrl());
        builder.setColor(TutorialBot.embedColor);
        builder.setDescription("Proper usage: ?mute {@user} [reason]");
        channel.sendMessage(builder.build()).queue();
    }

    public void log(Member muted, Member muter, String reason, TextChannel channel){
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Mute Report :microphone2:");
        builder.setColor(TutorialBot.embedColor);
        builder.addField("Unmuted User", muted.getAsMention(), false);
        builder.addField("Unmuter", muter.getAsMention(), false);
        builder.addField("Date", sdf.format(date), false);
        builder.addField("Time", stf.format(date), false);
        channel.sendMessage(builder.build()).queue();

    }
}
