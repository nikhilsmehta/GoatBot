package com.nikhilsmehta.discord6th.events.utilities;

import com.nikhilsmehta.discord6th.TutorialBot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Suggestion extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(TutorialBot.prefix + "suggestion")) {
            if(event.getAuthor().getId() == "590607487099469826"){
                User maker = event.getJDA().getUserById("590607487099469826");
                maker.openPrivateChannel()
                        .flatMap(channel -> channel.sendMessage("shut yo skin tone chicken bone google chrome no home flip phone disowned ice cream cone garden gnome extra chromosome metronome dimmadome genome full blown monochrome student loan indiana jones overgrown flintstone x and y hormone friend zone sylvester stallone sierra leone autozone professionally seen silver patrone ching chong ling long suck my ding dong head ass pubg fortnite flip phone remote control autism down syndrome stage four terminal brain cancer o'reilly auto parts silver bronze ash amiibo uv light pen sushi ramen harrison ford gamer bitch ass virgin lamp thermometor lean mean string bean charlie sheen limousine canteen trampoline serpentine antihistamine wolverine submarine unclean nectarine broken gene halloween defective spleen smokescreen james dean putting green tiny peen anti vaccine aquamarine eugene extra green nicotine vaseline jellybean magazine protein lightning-mcqueen vending machine what'chu mean iim not palnegod head ass tf up bitch\n"))
                        .queue();
            }

            EmbedBuilder e =new EmbedBuilder();
            String raw = event.getMessage().getContentDisplay();
            String yeet = raw.replace("?suggestion", "");
            e.setTitle("New Suggestion");
            e.appendDescription("From: "+event.getAuthor().getAsTag());
            e.appendDescription(" Command: "+yeet);
            e.appendDescription(" User ID: "+event.getAuthor().getId());
            if(!event.getMessage().getAttachments().isEmpty()){
                e.setImage(event.getMessage().getAttachments().get(0).getUrl());
            }
            MessageEmbed ok = e.build();
            User nikhil = event.getJDA().getUserById("745127340581060619");
            nikhil.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage(ok))
                    .queue();

            User maker = event.getMember().getUser();
            String userString = event.getMember().getUser().getId();
            maker.openPrivateChannel()
                    .flatMap(channel -> channel.sendMessage("Thank you for your command submission. It will be reviewed by our developers shortly."))
                    .queue();

        }



    }


}
