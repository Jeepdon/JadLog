package com.jadonvb;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

@org.apache.maven.plugins.annotations.Mojo(name = "logger")
public class Logger extends AbstractMojo {

    private String name;

    public Logger(String name) {
        this.name = name;
    }

    public void log(String message) {
        System.out.println(
                ConsoleColors.PURPLE + "[" + name + "]" +
                ConsoleColors.RESET + ": " + message);
    }

    public void error(String message) {
        System.out.println(
                ConsoleColors.PURPLE + "[" + name + "]" +
                ConsoleColors.RED + message);
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {}
}
