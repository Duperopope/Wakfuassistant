/*
 * Decompiled with CFR 0.152.
 */
public class cBD
extends cbw_0 {
    public static final byte myv = 8;
    private int myw;
    private int myx;

    public int eIQ() {
        return this.myw;
    }

    public void LK(int n) {
        this.myw = n;
    }

    public int eIR() {
        return this.myx;
    }

    public void LL(int n) {
        this.myx = n;
    }

    @Override
    public boolean eIS() {
        int n = cbr_0.eIZ().eJe();
        return this.myw <= n && this.myx >= n;
    }

    @Override
    public byte eIT() {
        return 8;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.myw = apl_12.aIA();
        this.myx = apl_12.aIA();
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.mz(this.myw);
        fs_02.mz(this.myx);
    }

    @Override
    public String eIU() {
        return "Altitude - [" + this.myw + " - " + this.myx + "]";
    }

    @Override
    public cbp_0 eIV() {
        cBD cBD2 = new cBD();
        cBD2.LK(this.myw);
        cBD2.LL(this.myx);
        cBD2.jH(this.bDL());
        return cBD2;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

