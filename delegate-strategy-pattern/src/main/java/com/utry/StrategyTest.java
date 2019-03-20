package com.utry;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-20-13:27
 */
public class StrategyTest {
    public static void main(String[] args) {

        PromotionStrategy promotionStrategy = new PromotionStrategy();
        promotionStrategy.getPromotionInstance("111").buy();

        promotionStrategy.getPromotionInstance("group_booking").buy();
    }
}
