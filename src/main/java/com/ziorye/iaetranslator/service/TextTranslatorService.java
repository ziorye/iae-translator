package com.ziorye.iaetranslator.service;

public interface TextTranslatorService {
    default String translateText(String text) {
        return translateText(text, "zh", "en");
    }

    String translateText(String text, String sourceLanguageCode, String targetLanguageCode);
}
