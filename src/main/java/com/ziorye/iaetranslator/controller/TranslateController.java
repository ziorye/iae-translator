package com.ziorye.iaetranslator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {
    @GetMapping("/translate/{sourceText}")
    String translate(
            @PathVariable String sourceText,
            @RequestParam(value = "sourceLanguage", defaultValue = "zh") String sourceLanguage,
            @RequestParam(value = "targetLanguage", defaultValue = "en") String targetLanguage
    ) {
        return "translatedText:" + sourceText;
    }
}
