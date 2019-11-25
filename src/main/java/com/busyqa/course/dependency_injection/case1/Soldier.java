package com.busyqa.course.dependency_injection.case1;

public class Soldier {

    KoreaMission km = new KoreaMission();

    public void goToKoreaMision(){
        km.executeKoreaMision();
    }
    
    VietnamMission vm = new VietnamMission();
    
    public void goToVietnamMision(){
    	km.executeKoreaMision();
    }
    
}
