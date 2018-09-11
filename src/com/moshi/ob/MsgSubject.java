package com.moshi.ob;

import net.sourceforge.plantuml.preproc.Sub;

/**
 * Created by 56498838@qq.com 张涛 on 2018/7/2.
 *
 * @version 2.0.0
 */
public class MsgSubject extends Subject {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObserver();
    }
}
