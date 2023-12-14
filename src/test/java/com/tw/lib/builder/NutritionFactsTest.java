package com.tw.lib.builder;

import org.junit.jupiter.api.Test;

public class NutritionFactsTest {

    @Test
    public void testNutritionFactsBuilder() {
        final NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27)
                .build();
        System.out.println(nutritionFacts);
    }
}
