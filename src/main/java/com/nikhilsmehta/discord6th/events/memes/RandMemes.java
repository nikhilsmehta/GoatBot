package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/*
* @status not in use!
*
* */

import java.util.Arrays;
import java.util.Random;

/**
 * @status NOT IN USE
 *
 * */

/*
public class RandMemes extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String memes[] = new String[15];
        memes[0] = ("https://cdn.memes.com/up/33436521601415506/i/1611581237822.jpg");
        memes[1] = ("https://cdn.memes.com/up/33436521601415506/i/1611582108368.jpg");
        memes[2] = ("https://cdn.memes.com/up/33436521601415506/i/1611582036318.jpg");
        memes[3] = ("https://cdn.memes.com/up/19322851596239870/i/1611623976052.jpg");
        memes[4] = ("https://cdn.memes.com/up/33436521601415506/i/1611581216207.jpg");
        memes[5] = ("https://cdn.memes.com/up/91110881607552253/i/1611598006557.jpg");
        memes[6] = ("https://cdn.memes.com/up/33436521601415506/i/1611581981370.jpg");
        memes[7] = ("https://cdn.memes.com/up/33436521601415506/i/1611581884820.jpg");
        memes[8] = ("https://cdn.memes.com/up/71558571535638926/i/1611624496027.jpg");
        memes[9] = ("https://cdn.memes.com/up/33436521601415506/i/1611581168058.jpg");
        memes[10] = ("https://cdn.memes.com/up/58569071607645506/i/1611580436305.jpg");
        memes[11] = ("https://cdn.memes.com/up/33436521601415506/i/1611581721343.jpg");
        memes[12] = ("https://cdn.memes.com/up/33436521601415506/i/1611581184122.jpg");
        memes[13] = ("https://cdn.memes.com/up/33436521601415506/i/1611581197849.jpg");
        memes[14] = ("https://cdn.memes.com/up/33436521601415506/i/1611581863111.jpg");

        Random rand = new Random();

        int randMeme = rand.nextInt(14);



        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "thisisold")) {
            MessageBuilder e =new MessageBuilder();
            e.setContent(memes[randMeme]);

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(e.build()).queue();
            e.clear();


        }


    }

}
*/
