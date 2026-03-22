/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fdx
 */
public class fdx_0
extends fdz_0 {
    public static final short rWp = 3;
    public static final short rWq = 2;
    public static final short rWr = 1;
    private final long rWs;
    private final int rWt;
    private final int rWu;
    private final int rWv;
    private final boolean rWw;
    private final int rWx;
    private final boolean rWy;
    private final long rWz;
    private final ang_2 rWA;

    public fdx_0(int n, int n2, long l, int n3, int n4, int n5, boolean bl, int n6, boolean bl2, long l2, ang_2 ang_22, eIx eIx2, int n7) {
        super(n, n2, eIx2, n7);
        this.rWs = l;
        this.rWt = n3;
        this.rWu = n4;
        this.rWv = n5;
        this.rWw = bl;
        this.rWx = n6;
        this.rWy = bl2;
        this.rWz = l2;
        this.rWA = ang_22;
    }

    public ang_2 bdo() {
        return this.rWA;
    }

    public long bVj() {
        return this.rWs;
    }

    public int cqq() {
        return this.rWt;
    }

    public int cqr() {
        return this.rWu;
    }

    public int cqs() {
        return this.rWv;
    }

    public boolean cmN() {
        return this.rWw;
    }

    public boolean fTC() {
        return this.cqr() > 0;
    }

    public int cqt() {
        return this.rWx;
    }

    public boolean cqu() {
        return this.rWy;
    }

    public long fTD() {
        return this.rWz;
    }

    public String toString() {
        return "IELootChestParameter{m_coolDown=" + this.rWs + ", m_cost=" + this.rWt + ", m_itemIdCost=" + this.rWu + ", m_itemQuantityCost=" + this.rWv + ", m_consumeItem=" + this.rWw + ", m_nbActivation=" + this.rWx + ", m_distributionDuration=" + this.rWz + ", m_criterion=" + String.valueOf(this.rWA) + "}";
    }
}

