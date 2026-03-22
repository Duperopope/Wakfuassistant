/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmv
 */
public class bmv_2
extends eKO {
    private final int iBC;
    private final int iBD;
    private final boolean iBE;
    private final byte iBF;
    private final boolean iBG;
    private final int[] iBH;

    public bmv_2(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ang_2 ang_22, boolean bl, int n9, byte by, eKP eKP2, boolean bl2, int[] nArray, float f2) {
        super(n, n3, n4, n5, n6, n8, ang_22, n9, eKP2, f2);
        this.iBC = n2;
        this.iBD = n7;
        this.iBE = bl;
        this.iBF = by;
        this.iBG = bl2;
        this.iBH = nArray;
    }

    public int dwt() {
        return this.iBC;
    }

    public byte aGu() {
        return this.iBF;
    }

    public int csA() {
        return this.iBD;
    }

    public boolean csC() {
        return this.iBG;
    }

    public int[] dwu() {
        return this.iBH;
    }

    public boolean cuR() {
        return this.iBE;
    }

    @Override
    public String toString() {
        return "CollectAction{" + super.toString() + "m_resourceStep=" + this.iBC + ", m_collectItemId=" + this.iBD + "}";
    }
}

