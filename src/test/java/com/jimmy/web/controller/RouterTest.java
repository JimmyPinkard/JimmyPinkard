package com.jimmy.web.controller;

import org.junit.jupiter.api.Test;

import static com.jimmy.web.TestUtils.readFile;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RouterTest extends ControllerTestTemplate {
    @Test
    void testIndex() {
        String index = getPageRequest("/", String.class);
        String indexContents = readFile("/templates/index.html");
        assertEquals(indexContents, index);
    }
}
