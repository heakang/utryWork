package com.utry;

import java.util.HashMap;
import java.util.Map;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-20-13:14
 */
public class PromotionStrategy {

    private static final String GROUP_BOOKING = "group_booking";

    private static final String SECOND_KILL = "second_kill";

    private static final String NORMAL = "normal";

    private static Map<String,IPromotion> IOC = new HashMap<String, IPromotion>();

    static {
        IOC.put(GROUP_BOOKING, new GroupBookingPromotion());
        IOC.put(SECOND_KILL, new SecondKillPromotion());
        IOC.put(NORMAL, new NonPromotion());
    }


    public  IPromotion getPromotionInstance(String name){
        if(!IOC.containsKey(name)){
            return IOC.get(NORMAL);
        }

        return IOC.get(name);
    }



}
