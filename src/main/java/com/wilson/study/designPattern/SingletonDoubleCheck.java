package com.wilson.study.designPattern;

/**
 * <p>
 *     double check实现的单例
 * </p>
 * Created by wilson on 17/09/2017.
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck INSTANCE;

    private SingletonDoubleCheck() {

    }

    public SingletonDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
