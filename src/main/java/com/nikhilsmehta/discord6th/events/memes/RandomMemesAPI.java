package com.nikhilsmehta.discord6th.events.memes;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @status Completed
 *
 * */


public class RandomMemesAPI extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
//test
        JSONParser parser = new JSONParser();
        String url = "";

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "meme")) {

            try {
                URL memeURL = new URL("https://meme-api.herokuapp.com/gimme");
                BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(memeURL.openConnection().getInputStream()));

                String lines;
                while ((lines = bufferedReader.readLine()) != null){
                    JSONArray array = new JSONArray();
                    array.add(parser.parse(lines));

                    for (Object o : array){
                        JSONObject jsonObject = (JSONObject) o;

                        url = (String) jsonObject.get("url");
                    }
                }

                bufferedReader.close();

                MessageBuilder m = new MessageBuilder();
                m.setContent(url);
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage(m.build()).queue();
                m.clear();
            } catch (Exception e) {
                event.getChannel().sendMessage("this caught a parse exception").queue();
                e.printStackTrace();
            }


        }
    }


}
