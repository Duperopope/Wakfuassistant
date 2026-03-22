/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBY
 */
public class cby_0
extends cbw_0 {
    public static final byte myW = 2;
    private float aQI;
    private float aQJ;

    public float aSJ() {
        return this.aQI;
    }

    public void aR(float f2) {
        this.aQI = f2;
    }

    public float aSK() {
        return this.aQJ;
    }

    public void aS(float f2) {
        this.aQJ = f2;
    }

    @Override
    public boolean eIS() {
        float f2 = cbr_0.eIZ().eJa();
        return this.aQI <= f2 && this.aQJ > f2;
    }

    @Override
    public byte eIT() {
        return 2;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.aQI = apl_12.aIB();
        this.aQJ = apl_12.aIB();
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.b(this.aQI);
        fs_02.b(this.aQJ);
    }

    @Override
    public String eIU() {
        return "Moment de la journ\u00e9e - D\u00e9but : " + (int)(this.aQI * 100.0f) + " - Fin : " + (int)(this.aQJ * 100.0f);
    }

    @Override
    public cbp_0 eIV() {
        cby_0 cby_02 = new cby_0();
        cby_02.aR(this.aQI);
        cby_02.aS(this.aQJ);
        cby_02.jH(this.bDL());
        return cby_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

