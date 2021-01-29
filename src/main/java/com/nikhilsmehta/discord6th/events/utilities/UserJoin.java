package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;

import java.awt.*;
import java.util.List;

public class UserJoin extends ListenerAdapter {

    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        final List<TextChannel> dontDoThis = event.getGuild().getTextChannelsByName("general", true);

        if (dontDoThis.isEmpty()) {
            return;
        }

        final TextChannel pleaseDontDoThisAtAll = dontDoThis.get(0);

        final String useGuildSpecificSettingsInstead = String.format("Welcome %s to %s",
                event.getMember().getUser().getAsMention(), event.getGuild().getName(), ":pushpin:");

        pleaseDontDoThisAtAll.sendMessage(useGuildSpecificSettingsInstead).queue();
    }
    }

