/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBT
 */
public class cbt_0
extends cbw_0 {
    public static final byte myO = 7;
    private int myP;
    private int myQ;

    public int eJf() {
        return this.myP;
    }

    public void LM(int n) {
        this.myP = n;
    }

    public int eJg() {
        return this.myQ;
    }

    public void LN(int n) {
        this.myQ = n;
    }

    @Override
    public boolean eIS() {
        int n = cbr_0.eIZ().eJd();
        return this.myP <= n && this.myQ >= n;
    }

    @Override
    public byte eIT() {
        return 7;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.myP = apl_12.aIA();
        this.myQ = apl_12.aIA();
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.mz(this.myP);
        fs_02.mz(this.myQ);
    }

    @Override
    public String eIU() {
        return "Nombre de joueurs alentours - [" + this.myP + " - " + this.myQ + "]";
    }

    @Override
    public cbp_0 eIV() {
        cbt_0 cbt_02 = new cbt_0();
        cbt_02.LM(this.myP);
        cbt_02.LN(this.myQ);
        cbt_02.jH(this.bDL());
        return cbt_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

