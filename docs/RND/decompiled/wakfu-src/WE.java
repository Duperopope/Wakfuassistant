/*
 * Decompiled with CFR 0.152.
 */
public class WE
extends ww_0 {
    private byte bNP;
    private byte bOM;
    private short bON;

    @Override
    public final boolean aJ(int n, int n2) {
        return this.bNP == -1;
    }

    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        wt_0 wt_02 = wt_0Array[n3];
        wt_02.bap = n;
        wt_02.baq = n2;
        wt_02.ban = this.ban;
        wt_02.bNP = this.bNP;
        wt_02.bNr = false;
        wt_02.aXR = 0;
        wt_02.bNQ = this.bOM;
        wt_02.bNR = this.bON;
        return 1;
    }

    @Override
    public short aL(int n, int n2) {
        return this.bON;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        wu_0 wu_02 = wu_0Array[n3];
        wu_02.bap = n;
        wu_02.baq = n2;
        wu_02.ban = this.ban;
        wu_02.bNr = false;
        wu_02.aXR = 0;
        return 1;
    }

    @Override
    public void a(apl_1 apl_12) {
        super.a(apl_12);
        this.bNP = apl_12.aIy();
        this.bOM = apl_12.aIy();
        this.bON = apl_12.aIz();
    }
}

