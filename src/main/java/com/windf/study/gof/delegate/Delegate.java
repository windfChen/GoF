package com.windf.study.gof.delegate;

public class Delegate implements Business {
    @Override
    public void doSomeThing(String arg1, int arg2) {
        Business business = null;

        /*
         * 判断条件最好写在配置文件，或者根据规律写
         */
        if ("A".equals(arg1)) {
            business = new BusinessA();
        } else if ("B".equals(arg1) && arg2 == 1) {
            business = new BusinessB1();
        } else if ("B".equals(arg1) && arg2 == 2) {
            business  = new BusinessB2();
        }

        if (business != null) {
            business.doSomeThing(arg1, arg2);
        } else {
            System.out.println("参数不匹配");
        }
    }
}
