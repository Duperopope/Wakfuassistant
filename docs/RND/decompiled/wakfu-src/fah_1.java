/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAh
 */
public class fah_1
extends frs_1
implements fai_1 {
    final /* synthetic */ fab_1 tNA;

    public fah_1(fab_1 fab_12) {
        this.tNA = fab_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = (int)Math.ceil((float)this.tNA.jLZ.size() / (float)this.tNA.tMs);
        int n2 = (int)Math.ceil(this.tNA.tMc.getWidth() / 2.0 * (double)(n + this.tNA.tMs));
        int n3 = (int)Math.ceil(this.tNA.tMc.getHeight() / 2.0 * (double)(n + this.tNA.tMs));
        return new fsm_1(n2, n3);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = (int)Math.ceil((float)this.tNA.jLZ.size() / (float)this.tNA.tMs);
        int n2 = (int)Math.ceil(this.tNA.tMc.getWidth() / 2.0 * (double)(n + this.tNA.tMs));
        int n3 = (int)Math.ceil(this.tNA.tMc.getHeight() / 2.0 * (double)(n + this.tNA.tMs));
        return new fsm_1(n2, n3);
    }

    @Override
    public void ox(boolean bl) {
        fcv_1 fcv_12;
        int n;
        if (this.tNA.tMx == null) {
            return;
        }
        this.tNA.tMh = true;
        int n2 = this.tNA.uki.getContentWidth();
        int n3 = this.tNA.uki.getContentHeight();
        int n4 = this.tNA.tMc.width;
        int n5 = this.tNA.tMc.height;
        this.tNA.tLZ.setVisible(false);
        int n6 = (int)Math.min(Math.floor((float)(n2 / n4) * 2.0f), Math.floor((float)(n3 / n5) * 2.0f)) - this.tNA.tMs + 1;
        int n7 = n6 * this.tNA.tMs;
        if (n7 > this.tNA.ncz.size()) {
            this.tNA.ncz.ensureCapacity(n7);
            this.tNA.tMv.ensureCapacity(n7);
            for (n = this.tNA.ncz.size(); n < n7; ++n) {
                fcv_12 = this.tNA.gsk();
                this.tNA.k(fcv_12);
            }
        }
        for (n = this.tNA.ncz.size() - 1; n >= 0 && n >= n7; --n) {
            fcv_12 = this.tNA.ncz.remove(n);
            if (fcv_12 == this.tNA.tMw) {
                this.tNA.tMw = null;
            }
            this.tNA.m((fhv_1)fcv_12);
        }
        for (n = 0; n < this.tNA.tMs; ++n) {
            int n8;
            int n9;
            if (n < this.tNA.tMs / 2) {
                n9 = 0;
                n8 = this.tNA.tMt ? -n5 * (2 * n - this.tNA.tMs + 1) : n5 * (2 * n - this.tNA.tMs) + n3;
            } else {
                n8 = 0;
                n9 = this.tNA.tMt ? (int)((float)n5 / 2.0f * (float)(2 * n - this.tNA.tMs + 1)) : (int)((float)n5 / 2.0f * (float)(2 * n - this.tNA.tMs - 1)) + n3;
            }
            for (int i = 0; i < n6; ++i) {
                int n10 = (this.tNA.tMs - n - 1) * n6 + i;
                fcv_1 fcv_13 = this.tNA.ncz.get(n10);
                fcv_13.setPosition(n8, n9);
                fcv_13.setSize(n4, n5);
                n8 += n4 / 2;
                n9 += this.tNA.tMt ? n5 / 2 : -n5 / 2;
            }
        }
        this.tNA.tMh = false;
        float f2 = this.tNA.tMf;
        this.tNA.gsl();
        if ((double)Math.abs(f2 - this.tNA.tMf) > 1.0E-4) {
            this.tNA.setOffset(this.tNA.tMf);
        }
        this.tNA.tME |= bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(faw_2 faw_22) {
        this.ox(true);
    }

    @Override
    public fzz_0 gso() {
        return fzz_0.tGo;
    }
}

