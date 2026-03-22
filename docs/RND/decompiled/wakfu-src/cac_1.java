/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from caC
 */
class cac_1
implements cae_2 {
    final /* synthetic */ cab_1 lGW;

    cac_1(cab_1 cab_12) {
        this.lGW = cab_12;
    }

    @Override
    public void e(ScreenElement screenElement) {
        if (screenElement.bsF() > this.lGW.lGS) {
            this.lGW.lGS = screenElement.bsF();
        }
        if (screenElement.bsB() > this.lGW.lGT) {
            this.lGW.lGT = Math.abs(screenElement.bsB());
        }
        screenElement.rp(0);
        screenElement.rq(0);
    }
}

