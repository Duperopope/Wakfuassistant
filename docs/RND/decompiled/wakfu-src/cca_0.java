/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCa
 */
public class cca_0
extends cbw_0 {
    public static final byte myX = 4;
    private float dtq;
    private float dtr;

    public float eJh() {
        return this.dtq;
    }

    public void eX(float f2) {
        this.dtq = f2;
    }

    public float eJi() {
        return this.dtr;
    }

    public void eY(float f2) {
        this.dtr = f2;
    }

    public void bA(float f2, float f3) {
        this.dtq = f2;
        this.dtr = f3;
    }

    @Override
    public boolean eIS() {
        float f2 = cbr_0.eIZ().eJc();
        return this.dtq <= f2 && f2 <= this.dtr;
    }

    @Override
    public byte eIT() {
        return 4;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.dtq = apl_12.aIB();
        this.dtr = apl_12.aIB();
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.b(this.dtq);
        fs_02.b(this.dtr);
    }

    @Override
    public String eIU() {
        return "Wakfu (Min : " + this.dtq + ", Max : " + this.dtr + ")";
    }

    @Override
    public cbp_0 eIV() {
        cca_0 cca_02 = new cca_0();
        cca_02.eX(this.dtq);
        cca_02.eY(this.dtr);
        cca_02.jH(this.bDL());
        return cca_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

