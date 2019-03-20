package com.utry;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-20-14:37
 */
public class TypeCAdapter implements ITypeC{

    private USB usb ;

    public TypeCAdapter(USB usb){
        this.usb=usb;
    }
    public void use() {
        usb.use();
        System.out.println("插入USB");
        System.out.println("对接typeC接口");
    }
}
