package com.JobApp;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "printCompany", description = "Prints the company name")
public class PrintSaaSquatch implements Runnable {

    @Override
    public void run() {
        // Hardcoded company name
        String companyName = "Impact SaaSquatch";
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new PrintSaaSquatch()).execute(args);
        System.exit(exitCode);
    }
}