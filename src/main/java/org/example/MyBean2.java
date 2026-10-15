package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {
    private final MyBean myBean;
//Mana sh joiyda  ///CI Constructor Injection ishlatilgan joyi

    public MyBean2(MyBean myBean){
        this.myBean=myBean;
        System.out.println("MyBean2 ...dependecny injection....            ");
    }

    public MyBean getMyBean(){
        return myBean;
    }
}
