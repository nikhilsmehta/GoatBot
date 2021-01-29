package com.nikhilsmehta.discord6th;

import com.nikhilsmehta.discord6th.events.memes.*;
import com.nikhilsmehta.discord6th.events.mute.Muted;
import com.nikhilsmehta.discord6th.events.mute.unmute;
import com.nikhilsmehta.discord6th.events.utilities.*;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import java.awt.*;

import javax.security.auth.login.LoginException;

/**
 * @status In progress
 * @author Nikhil
 * class is always being updated when new commands are made
 *
 * */


public class TutorialBot {
    public static JDABuilder builder;

    public static JDA jda;
    public static String prefix = "?";
    public static final Color embedColor = new Color(114, 229, 14);

    public static void main(String[] args) throws LoginException {
// test
        String token = System.getenv("token");

        jda = new JDABuilder(AccountType.BOT).setToken(token).build();

        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("I am not a Robot!"));
        jda.addEventListener(new Maker());
        jda.addEventListener(new love());
        jda.addEventListener(new osas());
        jda.addEventListener(new StopTheCap());
        jda.addEventListener(new SupaHotFire());
        jda.addEventListener(new Bully());
        jda.addEventListener(new OhHellNah());
        jda.addEventListener(new UserInfo());
        jda.addEventListener(new chewy());
        jda.addEventListener(new help());
        jda.addEventListener(new Kwaza());
        jda.addEventListener(new WTF());
        jda.addEventListener(new Pain());
        jda.addEventListener(new Coding());
        jda.addEventListener(new Bruh());
        jda.addEventListener(new SourceCode());
        jda.addEventListener(new Headlines());
        jda.addEventListener(new Muted());
        jda.addEventListener(new unmute());
        jda.addEventListener(new Sus());
        jda.addEventListener(new UserJoin());
        jda.addEventListener(new RandomMemesAPI());
        jda.addEventListener(new Newsspi());
        jda.addEventListener(new Howie());

        /*Below are still in progress*/
        //        jda.addEventListener(new Ban());
        //        jda.addEventListener(new testrole());

    }

}
