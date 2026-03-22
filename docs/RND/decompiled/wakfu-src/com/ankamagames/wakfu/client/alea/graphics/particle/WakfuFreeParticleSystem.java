/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.alea.graphics.particle;

import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class WakfuFreeParticleSystem
extends FreeParticleSystem {
    public WakfuFreeParticleSystem(boolean bl) {
        super(bl);
    }

    @Override
    public boolean isVisible() {
        bsj_0 bsj_02;
        try {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 == null) {
                return true;
            }
            bsj_02 = bgt_02.dmV();
        }
        catch (Exception exception) {
            return super.isVisible();
        }
        int n = this.bha();
        if (bsj_02 != null && bsj_02.d() != n && bsj_02.bag().T(this.bcC(), this.bcD())) {
            return false;
        }
        if (n != -1) {
            afW afW2 = this.btr();
            bgy bgy2 = null;
            if (afW2 instanceof bgy) {
                bgy2 = (bgy)((Object)afW2);
            } else if (afW2 instanceof bdj_2) {
                bgy2 = ((bdj_2)afW2).dcP();
            }
            if (bgy2 != null) {
                boolean bl = bgy2.baM();
                if (bl) {
                    return false;
                }
                if (bgy2.a(exe_1.rDg)) {
                    return false;
                }
            }
            return aJP.cig().yN(n);
        }
        return super.isVisible();
    }
}

