/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.Line2D;
import java.util.ArrayList;

/*
 * Renamed from fDG
 */
public class fdg_2
extends faw_2
implements fiz_1 {
    public static final String TAG = "tournament";
    ArrayList<fgo_1> tPx;
    private ArrayList<Line2D> dka = new ArrayList();
    ArrayList<fcv_1> ncz = new ArrayList();
    private fjf_1 tMx = new fjf_1();
    int tPE = -1;
    int tPy = 5;
    int tPz = 10;
    int tPB;
    int tPA;
    fsm_1 tMc;
    private String tMB = null;
    private fhs_2 tMC = null;
    private boolean uhv = true;
    public static final int uhw = -917611389;
    public static final int uhx = "content".hashCode();
    public static final int uhy = 3200366;
    public static final int uhz = 3617440;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fje_2) {
            this.tMx.aB((fje_2)fhv_12);
        }
    }

    @Override
    protected void eKZ() {
        super.eKZ();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setCellSize(fsm_1 fsm_12) {
        this.tMc = fsm_12;
        this.uhv = true;
        this.setNeedsToPreProcess();
    }

    public fsm_1 getCellSize() {
        return this.tMc;
    }

    public int getVgap() {
        return this.tPy;
    }

    public void setVgap(int n) {
        this.tPy = n;
        this.uhv = true;
        this.setNeedsToPreProcess();
    }

    public int getHgap() {
        return this.tPz;
    }

    public void setHgap(int n) {
        this.tPz = n;
        this.uhv = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    public void setContent(fgn_1 fgn_12) {
        int n = 0;
        this.tPx = (ArrayList)fgn_12.getItems().clone();
        this.tPB = fgn_12.getRowCount();
        this.tPA = fgn_12.getColumnCount();
        this.dka = fgn_12.gwM() != null ? (ArrayList)fgn_12.gwM().clone() : this.dka;
        n = this.tPx.size();
        int n2 = this.ncz.size();
        if (n2 < n) {
            for (int i = n2; i < n; ++i) {
                fcv_1 fcv_12 = new fcv_1();
                fcv_12.aVI();
                fcv_12.setNonBlocking(this.ukD);
                fcv_12.setRendererManager(this.tMx);
                fcv_12.a(fzq_0.tJQ, new fdh_2(this), false);
                fcv_12.a(fzq_0.tJR, new fdi_2(this), false);
                this.ncz.add(fcv_12);
                this.d(fcv_12);
            }
        } else if (n2 > n) {
            for (int i = n; i < n2; ++i) {
                fcv_1 fcv_13 = this.ncz.remove(this.ncz.size() - 1);
                fcv_13.gAD();
            }
            if (this.tPE >= this.ncz.size()) {
                this.tPE = -1;
            }
        }
        this.ebw();
    }

    public void ebw() {
        for (int i = 0; i < this.tPx.size(); ++i) {
            fcv_1 fcv_12 = this.ncz.get(i);
            fgo_1 fgo_12 = this.tPx.get(i);
            fcv_12.setContentProperty(this.tMB + "#" + i, this.tMC);
            fcv_12.setContent(fgo_12.getValue());
        }
    }

    @Override
    public void grg() {
        super.grg();
        this.guY();
    }

    private void guY() {
        ArrayList<Line2D.Float> arrayList = new ArrayList<Line2D.Float>();
        int n = this.tMc.width + this.tPz;
        int n2 = this.tMc.height + this.tPy;
        for (Line2D line2D : this.dka) {
            float f2 = (float)line2D.getX1();
            float f3 = (float)line2D.getY1();
            float f4 = (float)line2D.getX2();
            float f5 = (float)line2D.getY2();
            float f6 = (float)n * f2 + (float)this.tMc.width;
            float f7 = (float)n * (f2 + 1.0f) - (float)(this.tPz / 2);
            float f8 = (float)this.tPB - f3 - 1.0f;
            float f9 = (float)n2 * f8 + (float)(this.tMc.height / 2);
            f8 = (float)this.tPB - f5 - 1.0f;
            float f10 = (float)n2 * f8 + (float)(this.tMc.height / 2);
            float f11 = (float)n * f4;
            arrayList.add(new Line2D.Float(f6, f9, f7, f9));
            arrayList.add(new Line2D.Float(f7, f9, f7, f10));
            arrayList.add(new Line2D.Float(f7, f10, f11, f10));
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.uhv) {
            this.gsm();
        }
        this.uhv = false;
        return bl;
    }

    private void guZ() {
        ArrayList<fgo_1> arrayList = new ArrayList<fgo_1>();
        ArrayList<Line2D> arrayList2 = new ArrayList<Line2D>();
        fgo_1 fgo_12 = new fgo_1("Arone", 1.0f, 0.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("?", 1.0f, 7.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Khalim", 1.0f, 1.0f);
        arrayList.add(fgo_12);
        arrayList2.add(new Line2D.Float(1.0f, 0.0f, 2.0f, 0.5f));
        arrayList2.add(new Line2D.Float(1.0f, 1.0f, 2.0f, 0.5f));
        fgo_12 = new fgo_1("Tessaran", 1.0f, 2.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Noreen", 1.0f, 3.0f);
        arrayList.add(fgo_12);
        arrayList2.add(new Line2D.Float(1.0f, 2.0f, 2.0f, 2.5f));
        arrayList2.add(new Line2D.Float(1.0f, 3.0f, 2.0f, 2.5f));
        fgo_12 = new fgo_1("Arone", 2.0f, 0.5f);
        arrayList.add(fgo_12);
        arrayList2.add(new Line2D.Float(2.0f, 0.5f, 3.0f, 1.5f));
        fgo_12 = new fgo_1("Noreen", 2.0f, 2.5f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Khalim", 0.0f, 4.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Tessaran", 0.0f, 5.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Khalim", 2.0f, 4.5f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Noreen", 2.0f, 5.5f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Khalim", 3.0f, 5.0f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("Arone", 3.0f, 1.5f);
        arrayList.add(fgo_12);
        fgo_12 = new fgo_1("?", 4.0f, 3.25f);
        arrayList.add(fgo_12);
        fgn_1 fgn_12 = new fgn_1(arrayList, arrayList2, 8, 5);
        this.setContent(fgn_12);
    }

    @Override
    public void aVI() {
        super.aVI();
        fdj_1 fdj_12 = new fdj_1(this);
        fdj_12.aVI();
        this.a(fdj_12);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tPx.clear();
        this.tPx = null;
        this.ncz.clear();
        this.ncz = null;
        this.dka.clear();
        this.dka = null;
        this.tMc = null;
        this.tMx = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -917611389) {
            this.setCellSize(fic_12.vn(string));
        } else if (n == 3200366) {
            this.setHgap(Bw.m(string));
        } else if (n == 3617440) {
            this.setVgap(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != uhx) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fgn_1)object);
        return true;
    }
}

