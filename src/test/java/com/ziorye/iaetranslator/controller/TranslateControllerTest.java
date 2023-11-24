package com.ziorye.iaetranslator.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class TranslateControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    void echoTranslate() throws Exception {
        String sourceText = "原文";
        mvc.perform(MockMvcRequestBuilders.get("/translate/echo/" + sourceText))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.is(sourceText)))
        ;
    }

    @Test
    void aliTranslate() throws Exception {
        String sourceText = "中文";
        String expectedTranslatedText = "Chinese";
        mvc.perform(MockMvcRequestBuilders.get("/translate/ali/" + sourceText))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.is(expectedTranslatedText)))
        ;
    }
}