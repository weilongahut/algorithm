package com.wilson.study.designPattern;

/**
 * <p>
 *     double check实现的单例
 * </p>
 * Created by wilson on 17/09/2017.
 */
public class SingletonDCK {

    private static volatile SingletonDCK INSTANCE;

    private SingletonDCK() {

    }

    public SingletonDCK getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDCK.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDCK();
                }
            }
        }
        return INSTANCE;
    }
}
