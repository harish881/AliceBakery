package com.harishdeshpande.AliceBakery;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private Syrup syrup;
    private Frosting frosting;

    public CakeBaker(Syrup syrup, Frosting frosting){
        this.frosting = frosting;
        this.syrup = syrup;
    }


    String getSyrup(){
        return syrup.getSyrup();
    }

    String getFrosting(){
        return frosting.getFrosting();
    }

}
