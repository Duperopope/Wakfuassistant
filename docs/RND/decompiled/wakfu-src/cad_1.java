/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from caD
 */
class cad_1
implements cae_2 {
    private final int lGX;
    private final int lGY;
    private final int lGZ;
    private final int lHa;
    private int lHb;

    cad_1(int n, int n2, int n3, int n4) {
        this.lGX = n;
        this.lGY = n2;
        this.lGZ = n3;
        this.lHa = n4;
    }

    @Override
    public void e(ScreenElement screenElement) {
        if (screenElement.bsF() > this.lHb) {
            this.lHb = screenElement.bsF();
        }
        screenElement.ro(screenElement.bsF() + this.lGX);
        short s = screenElement.bsB();
        screenElement.at((short)(Math.abs(s) + this.lGY));
        if (screenElement.vD() != 0 && s != 0) {
            screenElement.rp(this.lHa);
            int n = s > 0 ? this.lGZ : -this.lGZ;
            screenElement.rq(s + n);
        } else {
            screenElement.rq(0);
        }
    }

    public int erz() {
        return this.lHb;
    }
}

