package org.jsapar.testsuite;

/**
 * The JSaPar TestSuite console tool.
 * <p>
 * This TestSuite tool generates dataset(s) based on a questionnaire, a ruleset, datasource schemas (as used by the
 * JSaPar library) and a source dataset for generating the testdata. The generated dataset(s) can be used for testing
 * the JSaPar library and/or similar libraries. The TestSuite tool can generate valid and invalid (= corrupt) dataset(s)
 * for testing purposes.
 */
public class App {
    /**
     * The entry point of the JSaPar TestSuite tool.
     *
     * @param args the command line arguments given at the command line to initiate the tool.
     */
    public static void main(String[] args) {
        System.out.println("The JSaPar TestSuite console tool, version 0.1. (C) 2018 JSaPar Team. All rights reserved.\n\n");
    }
}
