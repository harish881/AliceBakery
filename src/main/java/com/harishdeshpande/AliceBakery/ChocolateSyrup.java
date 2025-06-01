package com.harishdeshpande.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
