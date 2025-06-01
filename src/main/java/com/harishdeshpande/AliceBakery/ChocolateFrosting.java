package com.harishdeshpande.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrosting() {
        return "Chocolate Frosting";
    }
}
