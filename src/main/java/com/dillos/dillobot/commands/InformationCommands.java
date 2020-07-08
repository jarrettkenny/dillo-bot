package com.dillos.dillobot.commands;

import com.dillos.dillobot.annotations.Arg;
import com.dillos.dillobot.annotations.Channel;
import com.dillos.dillobot.annotations.Command;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;

@Component
public class InformationCommands {

    @Value("${discord.bot.redirect_uri}")
    String redirectUri;
 
    @Command("/help")
    public void help(
        @Channel MessageChannel channel,
        @Arg String command
    ) {
        EmbedBuilder message = new EmbedBuilder()
            .setTitle("DilloBot", redirectUri)
            .setDescription("by Discord server Dillos the Third. Available commands:")
            .addField("Informational", "`/help`", false)
            .addField("GitHub", "`/request`, `/issues`, `/repository`", false);

        channel.sendMessage(message.build()).queue();
    }
}