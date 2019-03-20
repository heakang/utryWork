package com.utry;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-20-09:35
 */
public class BuyProxTest {
    public static void main(String[] args) {
        IBuy buyClient = (IBuy)new BuyProxy().getInstance(new IBuyImpl());
        buyClient.buy();
    }
}
