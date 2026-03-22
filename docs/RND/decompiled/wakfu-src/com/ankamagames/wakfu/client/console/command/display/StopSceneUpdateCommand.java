/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class StopSceneUpdateCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        axm_1 axm_12;
        axm_12.ds(!(axm_12 = aie_0.cfn().bmE()).bRd());
        aqh_0.cBI().jG("Scene update is now : " + (axm_12.bRd() ? "stopped" : "running"));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

