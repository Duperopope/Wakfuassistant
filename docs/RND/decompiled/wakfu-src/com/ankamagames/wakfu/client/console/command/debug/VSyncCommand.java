/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class VSyncCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        axm_1 axm_12;
        axm_12.dt(!(axm_12 = aie_0.cfn().bmE()).bRe());
        if (!axm_12.bRe()) {
            aqh_0.cBI().jG("vsync: on");
        } else {
            aqh_0.cBI().jG("vsync: off");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

