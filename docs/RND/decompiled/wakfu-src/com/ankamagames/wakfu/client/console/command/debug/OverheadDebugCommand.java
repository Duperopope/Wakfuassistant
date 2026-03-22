/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class OverheadDebugCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        boolean bl = ZC.bVx = !ZC.bVx;
        if (ZC.bVx) {
            aqh_0.cBI().jG("Overhead debug : on");
        } else {
            aqh_0.cBI().jG("Overhead debug : off");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

