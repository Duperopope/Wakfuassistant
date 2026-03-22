/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBX
 */
public class cbx_0
extends cbw_0 {
    public static final byte myV = 1;
    private int dfd;
    private int dfe;

    public int bWb() {
        return this.dfd;
    }

    public void ou(int n) {
        this.dfd = n;
    }

    public int bWc() {
        return this.dfe;
    }

    public void ot(int n) {
        this.dfe = n;
    }

    public void eu(int n, int n2) {
        this.dfd = n;
        this.dfe = n2;
    }

    @Override
    public boolean eIS() {
        float f2 = cbr_0.eIZ().blu();
        return (float)this.dfd <= f2 && f2 <= (float)this.dfe;
    }

    @Override
    public byte eIT() {
        return 1;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.dfd = apl_12.aIA();
        this.dfe = apl_12.aIA();
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.mz(this.dfd);
        fs_02.mz(this.dfe);
    }

    @Override
    public String eIU() {
        return "Temp\u00e9rature (Min : " + this.dfd + ", Max : " + this.dfe + ")";
    }

    @Override
    public cbp_0 eIV() {
        cbx_0 cbx_02 = new cbx_0();
        cbx_02.ou(this.dfd);
        cbx_02.ot(this.dfe);
        cbx_02.jH(this.bDL());
        return cbx_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

