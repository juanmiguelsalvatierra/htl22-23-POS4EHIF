package com.company;

import java.util.TimerTask;

public class Haus extends TimerTask {

    private ITemp[] interessenten = new ITemp[20];
    private int iCounter = 0;

    public void addListener(ITemp interessent){
        interessenten[iCounter] = interessent;
        iCounter++;
    }


    @Override
    public void run() {
        float tmp = getTemp();
        for(int i = 0; i < iCounter; i++){
            interessenten[i].temp(tmp);
        }
    }

    private float getTemp(){
        return 21.5f;
    }
}
