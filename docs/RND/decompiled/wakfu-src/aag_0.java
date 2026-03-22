/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

/*
 * Renamed from aag
 */
public class aag_0
extends agf {
    private int bXN;
    private int bXO;
    private aah bXP = aah.bXS;

    public aag_0(aaj_0 aaj_02) {
        super(aaj_02);
    }

    public final int bqE() {
        return this.bXN;
    }

    public final int bqF() {
        return this.bXO;
    }

    public void bL(boolean bl) {
        this.bXP = bl ? aah.bXQ : aah.bXS;
    }

    public boolean bfb() {
        return this.bXP == aah.bXR;
    }

    public final void ba(int n, int n2) {
        if (this.bXP == aah.bXR) {
            return;
        }
        this.bXN = n;
        this.bXO = n2;
        if (this.bXP == aah.bXQ) {
            this.bXP = aah.bXR;
        }
    }

    @Override
    public final float[] a(agV agV2) {
        return aaE.brU().b(agV2);
    }

    @Override
    public final int bqG() {
        afW afW2 = this.byR();
        if (afW2 instanceof agV) {
            agV agV2 = (agV)((Object)afW2);
            return agV2.bqh();
        }
        return this.bqE();
    }

    public static DisplayedScreenElement a(aaa_0 aaa_02, int n, int n2, int n3) {
        return aaa_02.h(n, n2, n3, abd.ccZ);
    }

    public final void bqH() {
        this.ba(0, 0);
    }
}

