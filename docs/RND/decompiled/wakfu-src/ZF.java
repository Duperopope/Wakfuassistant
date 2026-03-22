/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;

class ZF
extends ard_2 {
    final /* synthetic */ Runnable bWh;
    final /* synthetic */ ZC bWi;

    ZF(ZC zC, Anm anm, Runnable runnable) {
        this.bWi = zC;
        this.bWh = runnable;
        super(anm);
    }

    @Override
    public void run() {
        this.bWi.bWc.remove(this);
        this.bWh.run();
    }
}

