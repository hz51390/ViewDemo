package com.hz.demo.moudle;

import dagger.Component;

/**
 * Created by Administrator on 2018/4/6 0006.
 */

@Component
public interface FactoryActivityCompent {
    void inject(PersionFactory factory);
}
