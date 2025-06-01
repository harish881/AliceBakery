package com.harishdeshpande.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{


    @Override
    public String getFrosting() {
        return "Strawberry Frosting";
    }
}
