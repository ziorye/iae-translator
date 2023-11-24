package com.ziorye.iaetranslator.service.impl;

import com.ziorye.iaetranslator.service.TextTranslatorService;
import org.springframework.stereotype.Service;

@Service
public class EchoTextTranslatorServiceImpl implements TextTranslatorService {
    @Override
    public String translateText(String text, String sourceLanguageCode, String targetLanguageCode) {
        return text;
    }
}
