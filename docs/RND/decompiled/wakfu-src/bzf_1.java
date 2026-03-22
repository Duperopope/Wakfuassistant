/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZf
 */
public class bzf_1
extends bzn_1 {
    private static final Long[] lBN = new Long[]{70300052L, 70500006L, 70300053L, 70300051L};
    private static final Long[] lBO = new Long[]{70420001L, 70420002L, 70420003L, 70420004L};
    public static final awx_2 lBP = new awx_2(0.6f, 0.6f, 0.6f, 0.4f);
    private final awx_2 lBQ = new awx_2(lBP);
    private boolean lBR;
    private int lBS;
    private int lBT;
    private int lBU;
    private long lBV;
    private int lBW;

    @Override
    public void setColor(axb_2 axb_22) {
        this.lBQ.c(axb_22);
    }

    @Override
    public void clear() {
    }

    @Override
    public void reset() {
        super.reset();
        this.lBR = false;
        this.lBT = 0;
        this.lBW = -1;
        this.lBU = 0;
        this.lBV = 0L;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        if (this.lBT > 30000) {
            return;
        }
        this.lBT += n;
        this.lBU += n;
        if (this.lBW <= 0 && this.lBT <= 11500) {
            this.lBW = GC.q(2000, 5000);
        }
        if (this.lBU > this.lBW && this.lBT <= 11500) {
            long l;
            while ((l = lBN[GC.q(0, lBN.length - 1)].longValue()) == this.lBV) {
            }
            if (aiv_2.bBr().bpD()) {
                aiv_2.bBr().a(l, 0.4f, 1, -1L, -1L, -1);
            }
            this.lBW = -1;
            this.lBU = 0;
            this.lBV = l;
        }
        if (this.lBT > 11500 && !this.lBR) {
            if (aiv_2.bBr().bpD()) {
                aiv_2.bBr().a(70300050L, 0.45f, 1, -1L, -1L, -1);
            }
            this.lBR = true;
        }
        switch (this.lBS) {
            case 0: {
                if (this.lBT < 5000) {
                    return;
                }
                bzq_1.a(this.bUu, this.lBQ, 200, 400, -0.5f, -0.6f);
                this.epN();
                ++this.lBS;
                break;
            }
            case 1: {
                if (this.lBT < 10000) {
                    return;
                }
                bzq_1.a(this.bUu, this.lBQ, 300, 500, -1.0f, -1.5f);
                this.epN();
                ++this.lBS;
                break;
            }
            case 2: {
                if (this.lBT < 15000) {
                    return;
                }
                bzq_1.a(this.bUu, this.lBQ, 800, 1000, -2.5f, -2.0f);
                this.epN();
                ++this.lBS;
                break;
            }
            case 3: {
                if (this.lBT < 20000) {
                    return;
                }
                bzq_1.a(this.bUu, this.lBQ, 300, 500, -1.0f, -1.5f);
                this.epN();
                ++this.lBS;
                break;
            }
            case 4: {
                if (this.lBT < 25000) {
                    return;
                }
                bzq_1.a(this.bUu, this.lBQ, 200, 400, -0.5f, -0.6f);
                this.epN();
                ++this.lBS;
                break;
            }
            default: {
                ast_1.bJG().b(this);
                return;
            }
        }
    }

    private void epN() {
        if (aiv_2.bBr().bpD()) {
            aiv_2.bBr().a(lBO[GC.q(0, lBO.length - 1)], 0.5f, 1, -1L, -1L, -1);
        }
    }

    @Override
    public void b(art_1 art_12) {
    }

    @Override
    public axb_2 epO() {
        return this.lBQ;
    }
}

