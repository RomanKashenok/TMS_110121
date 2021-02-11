package com.tms.interf;

import com.tms.interf.impl.FireplaceRemote;
import com.tms.interf.impl.LgTvRemote;
import com.tms.interf.impl.SamsungTvRemote;
import com.tms.interf.impl.WareHouseRemote;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Remote[] remotes = new Remote[4];

        Remote warehouseRemote = new WareHouseRemote();
        Remote fireplaceRemote = new FireplaceRemote();
        Remote lgTvRemote = new LgTvRemote();
        Remote samsungTvRemote = new SamsungTvRemote();

        remotes[0] = warehouseRemote;
        remotes[1] = fireplaceRemote;
        remotes[2] = lgTvRemote;
        remotes[3] = samsungTvRemote;

        for (int i = 0; i < remotes.length; i++) {
            if (remotes[i] != null) {
                remotes[i].turnOn();
                remotes[i].turnOff();
                remotes[i].specialFunction();
            }
        }
    }
}
