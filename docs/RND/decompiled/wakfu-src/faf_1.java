/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAf
 */
public class faf_1
extends frs_1
implements fai_1 {
    private static final int tNw = 4;
    private static final int tNx = 7;
    final /* synthetic */ fab_1 tNy;

    public faf_1(fab_1 fab_12) {
        this.tNy = fab_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = (int)Math.ceil(this.tNy.tMc.getWidth() * 4.0);
        int n2 = (int)Math.ceil(this.tNy.tMc.getHeight() * 7.0);
        return new fsm_1(n, n2);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = (int)Math.ceil(this.tNy.tMc.getWidth() * 4.0);
        int n2 = (int)Math.ceil(this.tNy.tMc.getHeight() * 7.0);
        return new fsm_1(n, n2);
    }

    @Override
    public void ox(boolean bl) {
        fcv_1 fcv_12;
        int n;
        if (this.tNy.tMx == null) {
            return;
        }
        this.tNy.tMh = true;
        int n2 = this.tNy.uki.getContentWidth();
        int n3 = this.tNy.uki.getContentHeight();
        int n4 = this.tNy.tMc.width;
        int n5 = this.tNy.tMc.height;
        this.tNy.tLZ.setVisible(false);
        int n6 = this.tNy.jLZ.size();
        if (n6 > this.tNy.ncz.size()) {
            this.tNy.ncz.ensureCapacity(n6);
            this.tNy.tMv.ensureCapacity(n6);
            for (n = this.tNy.ncz.size(); n < n6; ++n) {
                fcv_12 = this.tNy.gsk();
                this.tNy.k(fcv_12);
            }
        }
        for (n = this.tNy.ncz.size() - 1; n >= 0 && n >= n6; --n) {
            fcv_12 = this.tNy.ncz.remove(n);
            if (fcv_12 == this.tNy.tMw) {
                this.tNy.tMw = null;
            }
            this.tNy.m((fhv_1)fcv_12);
        }
        n = 0;
        for (int i = 0; i < 4; ++i) {
            int n7;
            int n8;
            int n9 = i * n4;
            if (i == 0) {
                n8 = 4;
                n7 = n5 * 7 - n5;
            } else if (i == 3) {
                n8 = 4;
                n7 = n5 * 7 - n5 * 3;
            } else {
                n8 = 5;
                n7 = n5 * 7 - n5 * i;
            }
            for (int j = 0; j < n8; ++j) {
                if (this.tNy.ncz.size() <= n) continue;
                fcv_1 fcv_13 = this.tNy.ncz.get(n++);
                fcv_13.setPosition(n9, n7);
                fcv_13.setSize(n4, n5);
                n7 -= n5;
            }
        }
        this.tNy.tMh = false;
        float f2 = this.tNy.tMf;
        this.tNy.gsl();
        if ((double)Math.abs(f2 - this.tNy.tMf) > 1.0E-4) {
            this.tNy.setOffset(this.tNy.tMf);
        }
        this.tNy.tME |= bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(faw_2 faw_22) {
        this.ox(true);
    }
}

