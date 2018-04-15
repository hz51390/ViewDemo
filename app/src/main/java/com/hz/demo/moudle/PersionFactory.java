package com.hz.demo.moudle;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/4/6 0006.
 */

public class PersionFactory {

    Persion persion;

    @Inject
    public PersionFactory(Persion p) {
        this.persion = p;
    }

}
