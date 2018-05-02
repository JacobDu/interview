package com.netis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class WordCounter {

    private final int parallelism;

    public WordCounter(int parallelism) {
        this.parallelism = parallelism;
    }

    public Map<String, Integer> wordCount(InputStream input) throws IOException {
        /*
         * 请实现本方法，统计输入文本中每个单词的数量（大小写敏感）。
         * 请通过WordCounterTest进行验证。
         *
         *
         * 实现需要满足如下要求：
         *  - 统计过程需要支持并行计算
         *  - 请勿引入三方库
         *  - 请勿使用JDK8的Stream包
         *  - 请在30分钟内完成
         *  - 尽可能的优化性能
         *  - 尽可能的优化内存
         *  - 尽可能保持优雅的CodeStyle
         */
        return null;
    }
}
