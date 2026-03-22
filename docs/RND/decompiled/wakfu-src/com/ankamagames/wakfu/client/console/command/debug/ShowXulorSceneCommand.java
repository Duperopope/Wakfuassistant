/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class ShowXulorSceneCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        fhv_2 fhv_22 = aie_0.cfn().cft();
        if (arrayList.size() == 3) {
            if (arrayList.get(2).equals("0")) {
                aie_0.cfn().bmE().a(fhv_22);
            } else {
                aie_0.cfn().bmE().a(fhv_22, true);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

