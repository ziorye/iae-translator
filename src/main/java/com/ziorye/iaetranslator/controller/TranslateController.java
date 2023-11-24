package com.ziorye.iaetranslator.controller;

import com.ziorye.iaetranslator.service.impl.AliTextTranslatorServiceImpl;
import com.ziorye.iaetranslator.service.impl.EchoTextTranslatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {
    @Autowired
    EchoTextTranslatorServiceImpl echoTextTranslatorService;

    @Autowired
    AliTextTranslatorServiceImpl aliTextTranslatorService;

    @GetMapping("/translate/echo/{sourceText}")
    String echoTranslate(
            @PathVariable String sourceText,
            @RequestParam(value = "sourceLanguage", defaultValue = "zh") String sourceLanguage,
            @RequestParam(value = "targetLanguage", defaultValue = "en") String targetLanguage
    ) {
        return echoTextTranslatorService.translateText(sourceText);
    }

    @GetMapping("/translate/ali/{sourceText}")
    String aliTranslate(
            @PathVariable String sourceText,
            @RequestParam(value = "sourceLanguage", defaultValue = "zh") String sourceLanguage,
            @RequestParam(value = "targetLanguage", defaultValue = "en") String targetLanguage
    ) {
        return aliTextTranslatorService.translateText(sourceText);
    }
}
