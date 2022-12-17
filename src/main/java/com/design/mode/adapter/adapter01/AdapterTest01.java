package com.design.mode.adapter.adapter01;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/13 10:40
 * @Description:
 */
public class AdapterTest01 {

    public static void main(String[] args) {
        ChineseSocket socket = new ChineseSocket();
        ChargerAdapter adapter = new ChargerAdapter(socket);
        adapter.charge();
    }

}
