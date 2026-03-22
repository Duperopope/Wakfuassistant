/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class ColorizePictoCommand
implements aQm {
    private static float gwX = 1.0f;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.bcC();
        long l2 = bgt_02.bcD();
        long l3 = bgt_02.bcE();
        long l4 = agx_0.E((int)l, (int)l2, (int)l3);
        gwX = gwX == 1.0f ? 0.2f : 1.0f;
        aah_0.brY().a(l4, 1.0f, 1.0f, 1.0f, gwX);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

