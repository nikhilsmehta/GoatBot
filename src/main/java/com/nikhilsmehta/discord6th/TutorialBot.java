package com.nikhilsmehta.discord6th;

import com.nikhilsmehta.discord6th.events.memes.*;
import com.nikhilsmehta.discord6th.events.moderation.*;
import com.nikhilsmehta.discord6th.events.utilities.*;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;

import java.awt.*;

import javax.security.auth.login.LoginException;

/**
 * @status In progress
 * @author Nikhil
 * class is always being updated when new commands are made
 *
 * */


public class TutorialBot {

    public static JDA jda;
    public static String prefix = "?";
    public static final Color embedColor = new Color(114, 229, 14);
    String loggingChannelId = System.getenv("log");
    TextChannel logging = jda.getTextChannelById(loggingChannelId);

    public static void main(String[] args) throws LoginException {

        String token = System.getenv("token");

        jda = new JDABuilder(AccountType.BOT).setToken(token).build();
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.playing("?help"));
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
        jda.addEventListener(new Muted());
        jda.addEventListener(new unmute());
        jda.addEventListener(new Sus());
        jda.addEventListener(new UserJoin());
        jda.addEventListener(new RandomMemesAPI());
        jda.addEventListener(new Newsspi());
        jda.addEventListener(new Ban());
        jda.addEventListener(new Boi());
        jda.addEventListener(new Kick());
        jda.addEventListener(new SendInvite());
        jda.addEventListener(new Lowry());
        jda.addEventListener(new Weather());
        jda.addEventListener(new Aiden());
        jda.addEventListener(new star());
        jda.addEventListener(new undeafan());
        jda.addEventListener(new Yea());
        jda.addEventListener(new Thirst());
        jda.addEventListener(new Ping());
        jda.addEventListener(new Suggestion());
        jda.addEventListener(new RequestResponse());
        jda.addEventListener(new Simp());
        jda.addEventListener(new Fax());
        jda.addEventListener(new yessir());
        jda.addEventListener(new Bop());
        jda.addEventListener(new Sike());
        jda.addEventListener(new Fire());
        jda.addEventListener(new Milkdud());
        jda.addEventListener(new Monk());
    }

    public static void logger(String msgContent, String jumpURL, String server, String user){
        TutorialBot bot = new TutorialBot();
        MessageBuilder logger = new MessageBuilder();
        logger.setContent("("+server+") "+"From: "+user+" Content: "+msgContent+", "+jumpURL);
        bot.logging.sendMessage(logger.build()).queue();
    }

}
