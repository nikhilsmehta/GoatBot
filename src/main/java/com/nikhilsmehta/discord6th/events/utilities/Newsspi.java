package com.nikhilsmehta.discord6th.events.utilities;

import com.google.gson.JsonObject;
import com.nikhilsmehta.discord6th.TutorialBot;
import io.github.ccincharge.newsapi.NewsApi;
import io.github.ccincharge.newsapi.datamodels.Article;
import io.github.ccincharge.newsapi.endpoints.ArticlesEndpoint;
import io.github.ccincharge.newsapi.requests.RequestBuilder;
import io.github.ccincharge.newsapi.responses.ApiArticlesResponse;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Newsspi extends ListenerAdapter {


    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "sportnews")) {

        NewsApi newsApi = new NewsApi("57c30eb43aba4db6910910ecb8875f64");
        RequestBuilder usNewsRequest = new RequestBuilder()
                .setCategory("sport")
                .setLanguage("en");

        ApiArticlesResponse apiArticlesResponse = newsApi.sendTopRequest(usNewsRequest);
        String responseStatus = apiArticlesResponse.status();
        ArrayList<Article> newsArticles = apiArticlesResponse.articles();
        Article firstArticle = newsArticles.get(0);
        String firstArticleTitle = firstArticle.title();
        String firstArticleDescription = firstArticle.description();

        Article secondArticle = newsArticles.get(2);
        String secondArticleTitle = firstArticle.title();
        String secondArticleDescription = firstArticle.description();




            EmbedBuilder m = new EmbedBuilder();
            m.setColor(TutorialBot.embedColor);
            m.setTitle(firstArticleTitle);
            m.setDescription(firstArticleDescription);
            m.setFooter("Data fetched by newsapi.org. GoatBot is created by Nikhil Mehta");
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(m.build()).queue();
            m.clear();


        }



        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "usnews")) {

            NewsApi newsApi = new NewsApi("57c30eb43aba4db6910910ecb8875f64");
            RequestBuilder usNewsRequest = new RequestBuilder()
                    .setCategory("general")
                    .setCountry("us")
                    .setLanguage("en");


            ApiArticlesResponse apiArticlesResponse = newsApi.sendTopRequest(usNewsRequest);
            String responseStatus = apiArticlesResponse.status();
            ArrayList<Article> newsArticles = apiArticlesResponse.articles();
            Article firstArticle = newsArticles.get(0);
            String firstArticleTitle = firstArticle.title();
            String firstArticleDescription = firstArticle.description();

            Article secondArticle = newsArticles.get(2);
            String secondArticleTitle = firstArticle.title();
            String secondArticleDescription = firstArticle.description();




            EmbedBuilder m = new EmbedBuilder();
            m.setColor(TutorialBot.embedColor);
            m.setTitle(firstArticleTitle);
            m.setDescription(firstArticleDescription);
            m.setFooter("Data fetched by newsapi.org. GoatBot is created by Nikhil Mehta");
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(m.build()).queue();
            m.clear();


        }
    }



}
