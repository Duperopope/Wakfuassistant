/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class RunPlayListDataCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        short s = Bw.r(arrayList.get(2));
        cAY.eHc().cH(s);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

