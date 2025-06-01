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


    String bakeCake(){
        return "Baking cake with " + frosting.getFrosting() + " and " + syrup.getSyrup();
    }

}
