/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcj
 */
public final class bcj_1
implements PQ {
    private final int hDM;
    private final bbu_2 hDN;
    private final String hDO;
    private final String hDP;
    private final bcm_2[] hDQ;
    private final boolean hDR;
    private ang_2 hDS = amz_2.cIw;
    private boolean hCe;
    private final akr_0[] hDT;
    private ang_2 hDU;

    bcj_1(int n, bbu_2 bbu_22, bcm_2[] bcm_2Array, String string, String string2, boolean bl, akr_0[] akr_0Array) {
        this.hDM = n;
        this.hDN = bbu_22;
        this.hDT = akr_0Array;
        this.hDO = string != null ? string.intern() : null;
        this.hDP = string2 != null ? string2.intern() : null;
        this.hDQ = bcm_2Array;
        this.hDR = bl;
    }

    bcj_1(bcj_1 bcj_12, bbu_2 bbu_22, bcm_2[] bcm_2Array) {
        this.hDM = bcj_12.hDM;
        this.hDN = bbu_22;
        this.hDO = bcj_12.hDO;
        this.hDP = bcj_12.hDP;
        this.hDR = bcj_12.hDR;
        this.hDT = bcj_12.hDT;
        this.hDQ = bcm_2Array;
    }

    @Override
    public PJ aYA() {
        return bcb_1.hDb.AL(this.hDN.d());
    }

    public boolean daJ() {
        return this.hCe;
    }

    void fk(boolean bl) {
        this.hCe = bl;
    }

    public int d() {
        return this.hDM;
    }

    public bbu_2 daS() {
        return this.hDN;
    }

    public String daT() {
        return this.hDO;
    }

    public String daU() {
        return this.hDP;
    }

    public bcm_2[] daV() {
        return this.hDQ;
    }

    public boolean cjw() {
        return this.hDR;
    }

    public void reset() {
        this.hCe = false;
    }

    public boolean daW() {
        return this.hDT.length > 0;
    }

    public boolean jf(long l) {
        for (akr_0 akr_02 : this.hDT) {
            if (akr_02.cjE() != l) continue;
            return true;
        }
        return false;
    }

    public akr_0 jg(long l) {
        for (akr_0 akr_02 : this.hDT) {
            if (akr_02.cjE() != l) continue;
            return akr_02;
        }
        return null;
    }

    public ang_2 daX() {
        return this.hDS;
    }

    public ang_2 daY() {
        return this.hDU;
    }

    public void a(ang_2 ang_22) {
        this.hDS = ang_22;
    }

    public void b(ang_2 ang_22) {
        this.hDU = ang_22;
    }
}

