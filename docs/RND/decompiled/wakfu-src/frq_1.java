/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from fRQ
 */
public class frq_1
extends frs_1 {
    public static final String TAG = "tl";
    private int vbj;
    private int vbk;
    private faa_2 tCX;
    private boolean vbl = true;
    private fes_2[][] vbm;
    private int[] vbn;
    private int[] vbo;
    private boolean[] vbp;
    private boolean[] vbq;
    private int vbr = 0;
    private int vbs = 0;
    private int brs = 0;
    private int brt = 0;
    public static final int vbt = 3506649;
    public static final int vbu = 949721053;
    public static final int vbv = 92903173;

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n;
        this.eZ(faw_22);
        for (n = 0; n < this.vbk; ++n) {
            for (int i = 0; i < this.vbj; ++i) {
                fes_2 fes_22 = this.vbm[n][i];
                if (fes_22 == null || !fes_22.isVisibleForLayout()) continue;
                fsm_1 fsm_12 = fes_22.getPrefSize();
                this.vbn[n] = Math.max(this.vbn[n], fsm_12.width);
                this.vbo[i] = Math.max(this.vbo[i], fsm_12.height);
                if (!fes_22.isExpandable()) continue;
                if (!this.vbp[n]) {
                    ++this.vbr;
                }
                if (!this.vbq[i]) {
                    ++this.vbs;
                }
                this.vbp[n] = true;
                this.vbq[i] = true;
            }
        }
        this.brs = 0;
        this.brt = 0;
        for (n = 0; n < this.vbk; ++n) {
            this.brs += this.vbn[n];
        }
        for (n = 0; n < this.vbj; ++n) {
            this.brt += this.vbo[n];
        }
        return new fsm_1(this.brs, this.brt);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        Object object;
        int n;
        int n2;
        if (this.vbn == null || this.vbo == null) {
            return;
        }
        frr_2[] frr_2Array = new frr_2[this.vbk * this.vbj];
        for (n2 = 0; n2 < this.vbk; ++n2) {
            for (n = 0; n < this.vbj; ++n) {
                object = this.vbm[n2][n];
                if (object == null || !((fes_2)object).isVisibleForLayout()) continue;
                frr_2Array[n2 * this.vbj + n] = new frr_2((frs_2)((fes_2)object).getLayoutData(), ((fes_2)object).getPrefSize());
            }
        }
        this.a(faw_22, frr_2Array);
        this.b(faw_22, frr_2Array);
        for (n2 = 0; n2 < this.vbk; ++n2) {
            for (n = 0; n < this.vbj; ++n) {
                object = frr_2Array[n2 * this.vbj + n];
                if (object == null) continue;
                fes_2 fes_22 = this.vbm[n2][n];
                fes_22.setPosition(((frr_2)object).bap, ((frr_2)object).baq);
                fes_22.setSize(((frr_2)object).brs, ((frr_2)object).brt);
            }
        }
    }

    private void a(faw_2 faw_22, frr_2[] frr_2Array) {
        int n = faw_22.getAppearance().getContentWidth();
        int n2 = n - this.brs;
        int n3 = n2 / GC.a(this.vbr, 1, new int[0]);
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < this.vbk; ++i) {
            int n6 = this.vbn[i];
            if (this.vbp[i]) {
                if (++n4 == this.vbr) {
                    n6 += n2;
                    n2 = 0;
                } else {
                    n6 += n3;
                    n2 -= n3;
                }
            }
            for (int j = 0; j < this.vbj; ++j) {
                frr_2 frr_22 = frr_2Array[i * this.vbj + j];
                if (frr_22 == null) continue;
                faa_2 faa_22 = frr_22.vbw.getHorizontalAlign();
                if (faa_22 != null) {
                    fsm_1 fsm_12 = frr_22.vbx;
                    frr_22.bap = n5 + faa_22.cf(fsm_12.width, n6);
                    frr_22.brs = fsm_12.width;
                    continue;
                }
                frr_22.bap = n5;
                frr_22.brs = n6;
            }
            n5 += n6;
        }
    }

    private void b(faw_2 faw_22, frr_2[] frr_2Array) {
        int n = faw_22.getAppearance().getContentHeight();
        int n2 = n - this.brt;
        int n3 = n2 / GC.a(this.vbs, 1, new int[0]);
        int n4 = 0;
        int n5 = n;
        for (int i = 0; i < this.vbj; ++i) {
            int n6 = this.vbo[i];
            if (this.vbq[i]) {
                if (++n4 == this.vbs) {
                    n6 += n2;
                    n2 = 0;
                } else {
                    n6 += n3;
                    n2 -= n3;
                }
            }
            n5 -= n6;
            for (int j = 0; j < this.vbk; ++j) {
                frr_2 frr_22 = frr_2Array[j * this.vbj + i];
                if (frr_22 == null) continue;
                faa_2 faa_22 = frr_22.vbw.getVerticalAlign();
                if (faa_22 != null) {
                    fsm_1 fsm_12 = frr_22.vbx;
                    frr_22.baq = n5 + faa_22.cg(fsm_12.height, n6);
                    frr_22.brt = fsm_12.height;
                    continue;
                }
                frr_22.baq = n5;
                frr_22.brt = n6;
            }
        }
    }

    private void eZ(faw_2 faw_22) {
        if (this.vbl) {
            this.vbm = new fes_2[this.vbk][];
            for (int i = 0; i < this.vbk; ++i) {
                this.vbm[i] = new fes_2[this.vbj];
            }
            this.vbn = new int[this.vbk];
            this.vbo = new int[this.vbj];
            this.vbp = new boolean[this.vbk];
            this.vbq = new boolean[this.vbj];
            this.vbl = false;
        }
        this.gEU();
        this.ehP();
        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            frs_2 frs_22;
            fes_2 fes_22 = arrayList.get(i);
            if (!(fes_22.getLayoutData() instanceof frs_2) || (frs_22 = (frs_2)fes_22.getLayoutData()).getRow() >= this.vbj || frs_22.getColumn() >= this.vbk) continue;
            this.vbm[frs_22.getColumn()][frs_22.getRow()] = fes_22;
        }
    }

    private void gEU() {
        if (this.vbm == null) {
            return;
        }
        for (int i = 0; i < this.vbk; ++i) {
            for (int j = 0; j < this.vbj; ++j) {
                this.vbm[i][j] = null;
            }
        }
    }

    private void ehP() {
        if (this.vbn != null) {
            Arrays.fill(this.vbn, 0);
        }
        if (this.vbo != null) {
            Arrays.fill(this.vbo, 0);
        }
        if (this.vbp != null) {
            Arrays.fill(this.vbp, false);
        }
        if (this.vbq != null) {
            Arrays.fill(this.vbq, false);
        }
        this.vbr = 0;
        this.vbs = 0;
    }

    public int getRows() {
        return this.vbj;
    }

    public void setRows(int n) {
        this.vbj = n;
        this.vbl = true;
    }

    public int getColumns() {
        return this.vbk;
    }

    public void setColumns(int n) {
        this.vbk = n;
        this.vbl = true;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        frq_1 frq_12 = (frq_1)fhi_22;
        frq_12.setAlign(this.tCX);
        frq_12.setRows(this.vbj);
        frq_12.setColumns(this.vbk);
    }

    public frq_1 gEV() {
        frq_1 frq_12 = new frq_1();
        frq_12.aVI();
        this.a((fhi_2)frq_12);
        return frq_12;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.vbl = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vbm = null;
        this.vbn = null;
        this.vbo = null;
        this.vbp = null;
        this.vbq = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3506649: {
                this.setRows(Bw.m(string));
                return true;
            }
            case 949721053: {
                this.setColumns(Bw.m(string));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.tI(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3506649: {
                this.setRows(Bw.m(object));
                return true;
            }
            case 949721053: {
                this.setColumns(Bw.m(object));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.aU(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEV();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEV();
    }
}

