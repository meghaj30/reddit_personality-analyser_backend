package com.example.redditpersonalityanalyser.service;

import com.example.redditpersonalityanalyser.model.PersonalityResult;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonalityService {

    // Dummy logic: Replace with NLP/ML-based analysis for production
    public PersonalityResult analyzeText(String text) {
        Map<String, Double> traits = new HashMap<>();
        // Example: Keyword-based scoring
        traits.put("Openness", text.contains("imagine") ? 0.9 : 0.2);
        traits.put("Conscientiousness", text.contains("plan") ? 0.8 : 0.3);
        traits.put("Extraversion", text.contains("party") ? 0.7 : 0.4);
        traits.put("Agreeableness", text.contains("help") ? 0.85 : 0.5);
        traits.put("Neuroticism", text.contains("worried") ? 0.8 : 0.2);
        return new PersonalityResult(traits);
    }
}