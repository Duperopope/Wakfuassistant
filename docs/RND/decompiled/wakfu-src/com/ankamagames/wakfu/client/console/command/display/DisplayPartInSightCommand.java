/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class DisplayPartInSightCommand
implements aQm {
    private static final Logger gwY = Logger.getLogger(DisplayPartInSightCommand.class);
    private static final String gwZ = "DEBUG_FRONT_LAYER";
    private static final String gxa = "DEBUG_BACK_LAYER";
    private static final String gxb = "DEBUG_SIDE_LAYER";
    private static final float[] gxc = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    private static final float[] gxd = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    private static final float[] gxe = new float[]{0.0f, 0.0f, 1.0f, 0.5f};

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        sp_0 sp_02 = bgt_02.baD();
        sp_0 sp_03 = sp_02 != null ? sp_02 : new sp_0();
        sp_03.a(bgt_02.bcC(), bgt_02.bcD(), bgt_02.bcE(), bgt_02.bcB());
        this.f(gwZ, gxc);
        this.f(gxa, gxd);
        this.f(gxb, gxe);
        int n = bgt_02.bcC();
        int n2 = bgt_02.bcD();
        for (int i = -15; i < 15; ++i) {
            block6: for (int j = -15; j < 15; ++j) {
                so_0 so_02 = sp_03.o(n + i, n2 + j, bgt_02.bcE());
                long l = agx_0.E(n + i, n2 + j, bgt_02.bcE());
                switch (so_02) {
                    case bpI: {
                        agx_0.bze().a(l, gwZ);
                        continue block6;
                    }
                    case bpF: {
                        agx_0.bze().a(l, gxa);
                        continue block6;
                    }
                    case bpH: 
                    case bpG: {
                        agx_0.bze().a(l, gxb);
                    }
                }
            }
        }
    }

    private void f(String string, float[] fArray) {
        agu_0 agu_02 = agx_0.bze().eH(string);
        if (agu_02 == null) {
            try {
                agu_02 = agx_0.bze().eF(string);
                agu_02.q(fArray);
            }
            catch (Exception exception) {
                gwY.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        agx_0.bze().eI(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

