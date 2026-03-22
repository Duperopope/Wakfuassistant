/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ZoomInCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aam_0 aam_02 = aie_0.cfn().bmC();
        aam_02.cy(aam_02.byw() + 0.1f);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

