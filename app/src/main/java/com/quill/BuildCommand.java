package com.quill;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import java.util.concurrent.Callable;

@Command(name = "build", description = "Build the static site from content/")
public class BuildCommand implements Callable<Integer> {

    @Option(names = {"-c", "--content"}, defaultValue = "content", description = "Content directory")
    private String contentDir;

    @Option(names = {"-o", "--output"}, defaultValue = "_site", description = "Output directory")
    private String outputDir;

    @Override
    public Integer call() throws Exception {
        System.out.println("Building site from: " + contentDir);
        System.out.println("Output to: " + outputDir);
        // TODO: implement SiteBuilder
        return 0;
    }
}
