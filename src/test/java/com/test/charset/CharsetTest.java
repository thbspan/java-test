package com.test.charset;

import java.nio.charset.Charset;

import org.junit.Test;

public class CharsetTest {

    @Test
    public void test() {
        System.out.println(Charset.defaultCharset());
        System.out.println(Charset.availableCharsets());
    }
}
