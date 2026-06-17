package com.quill;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "quill",
    description = "Quill - Minimal static site generator",
    mixinStandardHelpOptions = true,
    subcommands = {BuildCommand.class}
)
public class Quill implements Runnable {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Quill()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("Use 'quill build' to generate the site");
    }
}
