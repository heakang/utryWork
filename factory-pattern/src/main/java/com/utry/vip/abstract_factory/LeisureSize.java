package com.utry.vip.abstract_factory;

/**
 * **************************************************************
 * <p>
 * 公司名称    :杭州初健网络科技有限公司
 * <p>
 * 系统名称    :初健电商平台-Mybatis+mysql 最新架构版 v7.20
 * <p>
 * 类 名 称    :
 * <p>
 * 功能描述    :
 * <p>
 * 业务描述    :
 * <p>
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-12-23:20
 * <p>
 * Created     :IntelliJ IDEA
 * <p>
 * **************************************************************
 * <p>
 * 修改日期    :
 * <p>
 * 修 改 者    :
 * <p>
 * 修改内容    :
 * <p>
 * **************************************************************
 */
public class LeisureSize implements ISize{

    @Override
    public void sayMySize() {
        System.out.println("休闲尺寸");
    }
}
