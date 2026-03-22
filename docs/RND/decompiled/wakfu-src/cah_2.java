/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from caH
 */
class cah_2
implements cae_2 {
    private final int lHh;
    private final int lHi;
    int lHb = 0;

    cah_2(int n, int n2) {
        this.lHh = n;
        this.lHi = n2;
    }

    @Override
    public void e(ScreenElement screenElement) {
        if (screenElement.bsF() > this.lHb) {
            this.lHb = screenElement.bsF();
        }
        screenElement.ro(screenElement.bsF() + this.lHh);
        if (screenElement.vD() != 0) {
            screenElement.rp(this.lHi);
        }
        screenElement.rq(0);
    }
}

