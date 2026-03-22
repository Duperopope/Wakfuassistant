/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class DebugBarCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aie_0 aie_02;
        boolean bl = (aie_02 = aie_0.cfn()).bnc();
        aie_02.bw(!bl);
        if (bl == aie_02.bnc()) {
            if (bl) {
                aqh_0.cBI().jI("Unable to hide DebugBar");
            } else {
                aqh_0.cBI().jI("Unable to display DebugBar");
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

