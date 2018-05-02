package com.netis;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class WordCounterTest {

    @Test
    public void test() throws IOException {
        final Map<String, Integer> wordDict;
        try (final InputStream input =
                     WordCounterTest.class.getClassLoader().getResourceAsStream("test.dat")) {
            final WordCounter counter = new WordCounter(4);
            wordDict = counter.wordCount(input);
        }
        Assert.assertNotNull(wordDict);

        Assert.assertEquals(505, wordDict.size());

        Assert.assertEquals(218, (int) wordDict.get("a"));
        Assert.assertEquals(380, (int) wordDict.get("the"));
        Assert.assertEquals(28, (int) wordDict.get("The"));
        Assert.assertEquals(0, (int) wordDict.get(""));
    }
}