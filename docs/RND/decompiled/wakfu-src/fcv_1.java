/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fCv
 */
public class fcv_1
extends faw_2
implements fiz_1 {
    public static final String TAG = "renderableContainer";
    private fhv_1[] tYM;
    private ArrayList<fsd_1> tYN;
    private final ArrayList<fhv_1> tYO = new ArrayList();
    private fsc_1 tYP = null;
    private fje_2 tYQ = null;
    private fjf_1 tMx = new fjf_1();
    private fja_2 tYR = null;
    private fhs_2 tYS = null;
    private fbd_1 tYT;
    private boolean tMe = true;
    private boolean tYU = false;
    private fim_1 tYV = null;
    private fis_1 tYW = null;
    private String tMB = null;
    private fhs_2 tMC = null;
    private boolean tYX = false;
    public static final int tYY = "content".hashCode();
    public static final int tYZ = -631680873;

    public fcv_1() {
        this(null);
    }

    public fcv_1(fja_2 fja_22) {
        this.tYR = fja_22;
        this.setNonBlocking(false);
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fje_2) {
            this.tMx.aB((fje_2)fhv_12);
        }
    }

    private void gtO() {
        if (this.tYV != null) {
            fil_1.gBx().a(this.tYV, true);
        }
        this.tYV = new fim_1(this);
        fil_1.gBx().a(this.tYV);
    }

    public void k(fhv_1 fhv_12) {
        this.tYO.add(fhv_12);
        this.d(fhv_12);
    }

    @Override
    public void a(fzq_0 fzq_02, fis_1 fis_12, boolean bl) {
        super.a(fzq_02, fis_12, bl);
        if (fzq_02 == fzq_0.tJC && this.tYW == null) {
            this.tYW = new fcw_1(this);
            super.a(fzq_0.tJV, this.tYW, false);
        }
    }

    @Override
    public void b(fzq_0 fzq_02, fis_1 fis_12, boolean bl) {
        super.b(fzq_02, fis_12, bl);
        if (fzq_02 == fzq_0.tJC && this.a(fzq_02)) {
            this.b(fzq_0.tJV, this.tYW, false);
            this.tYW = null;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setRenderableChildren(fhv_1[] fhv_1Array) {
        this.tYM = fhv_1Array;
    }

    public void setItemElements(ArrayList<fsd_1> arrayList) {
        this.tYN = arrayList;
    }

    public void setRenderer(fje_2 fje_22) {
        if (fje_22 != this.tYQ) {
            if (this.tYQ != null) {
                this.tYQ.y(this);
            }
            this.tYQ = fje_22;
            for (int i = this.tYO.size() - 1; i >= 0; --i) {
                this.m(this.tYO.get(i));
            }
            this.tYO.clear();
        }
    }

    public boolean getEnableDND() {
        return this.tMe;
    }

    public void setEnableDND(boolean bl) {
        this.tMe = bl;
    }

    public boolean gtP() {
        return this.tMe && this.tYT.isEnabledFull();
    }

    public fjf_1 getRendererManager() {
        return this.tMx;
    }

    public void setRendererManager(fjf_1 fjf_12) {
        if (fjf_12 != null && this.tMx != fjf_12) {
            if (this.tMx != null) {
                this.tMx.A(this);
            }
            this.tMx = fjf_12;
            this.tMx.z(this);
        }
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    public String getContentProperty() {
        return this.tMB;
    }

    public void k(flp_2 flp_22) {
        Object object = this.tYP == null ? null : this.tYP.getValue();
        flg_2 flg_22 = flg_2.a(flp_22, this, fzq_0.tJE, object);
        this.h(flg_22);
        flp_22.oZ(flg_22.gBF());
    }

    public void l(flp_2 flp_22) {
        Object object = this.tYP == null ? null : this.tYP.getValue();
        flg_2 flg_22 = flg_2.a(flp_22, this, fzq_0.tJD, object);
        this.h(flg_22);
        flp_22.oZ(flg_22.gBF());
    }

    public void m(flp_2 flp_22) {
        Object object = this.tYP == null ? null : this.tYP.getValue();
        flg_2 flg_22 = flg_2.a(flp_22, this, fzq_0.tJB, object);
        this.h(flg_22);
        flp_22.oZ(flg_22.gBF());
    }

    public void n(flp_2 flp_22) {
        Object object = this.tYP == null ? null : this.tYP.getValue();
        flg_2 flg_22 = flg_2.a(flp_22, this, fzq_0.tJC, object);
        this.h(flg_22);
        flp_22.oZ(flg_22.gBF());
    }

    public void gtQ() {
        if (this.tYQ != null && this.tYM != null && this.tYM.length != 0) {
            this.tYQ.a(this.tYM, this.tYP);
        }
        this.tYU = false;
    }

    public fja_2 getCollection() {
        return this.tYR;
    }

    public void setCollection(fja_2 fja_22) {
        this.tYR = fja_22;
    }

    public void setInnerElementMap(fhs_2 fhs_22) {
        this.tYS = fhs_22;
    }

    public fhs_2 getInnerElementMap() {
        return this.tYS;
    }

    public void setContent(Object object) {
        if (this.uwm) {
            return;
        }
        if (this.tYP == null || this.tYP.getValue() != object) {
            this.setItemValue(object);
        }
        this.tYU = true;
    }

    public void setItem(fsc_1 fsc_12) {
        this.setItem(fsc_12, false);
    }

    public void setItem(fsc_1 fsc_12, boolean bl) {
        if (this.tYP != fsc_12) {
            this.a(this.tYP);
            fsc_1.b(this.tYP);
            this.tYP = fsc_12;
            this.gtX();
            this.oz(true);
        }
    }

    public void gtR() {
        this.oz(true);
    }

    public void oz(boolean bl) {
        fsf_1 fsf_12;
        if (this.tMx == null) {
            return;
        }
        if (this.tMx.B(this)) {
            this.gtS();
            bl = true;
        }
        this.gtX();
        if (this.tYN != null && this.tYP != null && this.tYP.gFt() != null && (fsf_12 = this.tYP.gFt()).getValue() instanceof aef_2) {
            int n = this.tYN.size();
            for (int i = 0; i < n; ++i) {
                fsd_1 fsd_12 = this.tYN.get(i);
                fhv_1 fhv_12 = fsd_12.getParent() != null ? fsd_12.getParent() : fsd_12;
                if (fsd_12.getField() != null && fsd_12.getField().contains("/")) {
                    azx_1<Object, String> azx_12 = fsf_1.b(fsf_12.getValue(), fsd_12.getField());
                    String string = azx_12.aHI() == null ? fsd_12.getField() : fsd_12.getField().substring(0, fsd_12.getField().length() - azx_12.aHI().length() - 1);
                    String string2 = fsf_12.getName() + "/" + string;
                    fsf_1 fsf_13 = fse_1.gFu().j(string2, this.tMC);
                    if (fsf_13 == null) {
                        fsf_13 = new fsf_1(string2, fsf_12, string, this.tMC);
                        fsf_13.a(azx_12.getFirst(), false);
                        fse_1.gFu().b(fsf_13);
                    }
                    fsf_13.a(new fsi_1<fhi_2>(fhv_12, fkc_2.gCQ().vR(fhv_12.getTag()), fsd_12.getAttribute(), azx_12.aHI(), fsd_12.getResultProvider()));
                    continue;
                }
                fsf_12.a(new fsi_1<fhi_2>(fhv_12, fkc_2.gCQ().vR(fhv_12.getTag()), fsd_12.getAttribute(), fsd_12.getField(), fsd_12.getResultProvider()));
            }
        }
        if (bl) {
            this.tYU = true;
        }
    }

    public fja_2 getRenderableCollection() {
        return this.tYR;
    }

    public void setItemValue(Object object) {
        fsc_1 fsc_12 = fsc_1.a(object, this.tMB, this.tMC, this);
        this.setItem(fsc_12);
    }

    public Object getItemValue() {
        if (this.tYP != null) {
            return this.tYP.getValue();
        }
        return null;
    }

    public int getItemValueIndex() {
        if (this.uxL instanceof fab_1) {
            return ((fab_1)this.uxL).j(this);
        }
        if (this.uxL instanceof fdf_1) {
            return ((fdf_1)this.uxL).getTableIndex(this);
        }
        return -1;
    }

    public fsc_1 getItem() {
        return this.tYP;
    }

    public fje_2 getRenderer() {
        return this.tYQ;
    }

    public void gtS() {
        if (this.tRe != null && this.tRe.size() == 0 && this.tYQ != null) {
            this.tYQ.w(this);
            fhj_2.gBa().gBd();
        }
    }

    public fbd_1 getDragNDropable() {
        return this.tYT;
    }

    public void setDragNDropable(fbd_1 fbd_12) {
        if (this.tYT == null) {
            this.gtO();
        }
        this.tYT = fbd_12;
    }

    public void gtT() {
        this.a(fzq_0.tJQ, new fcx_2(this), false);
        this.a(fzq_0.tJR, new fcy_1(this), false);
        this.a(fzq_0.tJU, new fcz_1(this), false);
    }

    public void gtU() {
        this.a(this.tYP);
    }

    private void a(fsc_1 fsc_12) {
        fsf_1 fsf_12;
        if (fsc_12 != null && fsc_12.gFt() != null && this.tYN != null && (fsf_12 = fsc_12.gFt()).getValue() instanceof aef_2) {
            for (fsd_1 fsd_12 : this.tYN) {
                fhv_1 fhv_12 = fsd_12.getParent() != null ? fsd_12.getParent() : fsd_12;
                if (fsd_12.getField() != null && fsd_12.getField().contains("/")) {
                    azx_1<Object, String> azx_12 = fsf_1.b(fsf_12.getValue(), fsd_12.getField());
                    String string = azx_12.aHI();
                    int n = string != null ? string.length() : 0;
                    String string2 = fsd_12.getField().substring(0, fsd_12.getField().length() - n - 1);
                    String string3 = fsf_12.getName() + "/" + string2;
                    fsf_1 fsf_13 = fse_1.gFu().j(string3, this.tMC);
                    if (fsf_13 == null) continue;
                    fsf_13.an(fhv_12);
                    continue;
                }
                fsf_12.an(fhv_12);
            }
        }
    }

    public void gtV() {
        this.tYU = true;
    }

    public boolean gtW() {
        boolean bl = false;
        if (this.tYQ == null) {
            this.oz(true);
            bl = true;
        }
        if (this.tYU) {
            this.gtQ();
            bl = true;
        }
        return bl;
    }

    public void setHideWithoutItem(boolean bl) {
        this.tYX = bl;
        this.gtX();
    }

    public boolean isHideWithoutItem() {
        return this.tYX;
    }

    private void gtX() {
        if (this.tYX) {
            super.setVisible(this.tYP != null && this.tYP.gFt() != null);
        }
    }

    @Override
    public void setVisible(boolean bl) {
        if (this.tYX) {
            return;
        }
        super.setVisible(bl);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcv_1 fcv_12 = (fcv_1)fhi_22;
        super.a(fhi_22);
        fcv_12.tMe = this.tMe;
        for (int i = fcv_12.tRe.size() - 1; i >= 0; --i) {
            ((fes_2)fcv_12.tRe.get(i)).gAD();
        }
        if (this.tYW != null) {
            fcv_12.tYW = new fca_1(this, fcv_12);
        }
        fcv_12.tYX = this.tYX;
        fcv_12.gtX();
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.tYV != null) {
            try {
                fil_1.gBx().a(this.tYV, true);
            }
            catch (Exception exception) {
                uxJ.error((Object)"", (Throwable)exception);
            }
        }
        this.tYV = null;
        fhc_2.gAV().v(this);
        this.tYO.clear();
        this.tYR = null;
        this.tYT = null;
        this.tYM = null;
        if (this.tYP != null) {
            this.a(this.tYP);
            fsc_1.b(this.tYP);
            this.tYP = null;
        }
        if (this.tYN != null) {
            this.tYN.clear();
            this.tYN = null;
        }
        this.tMB = null;
        this.tMC = null;
        this.tYS = null;
        this.tYQ = null;
        if (this.tMx != null) {
            this.tMx.A(this);
            this.tMx = null;
        }
    }

    @Override
    public void aVI() {
        fhc_2.gAV().u(this);
        super.aVI();
        this.gtT();
        this.tMe = true;
        this.ukD = false;
        this.tYX = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -631680873) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setEnableDND(Bw.aK(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tYY) {
            this.setContent(object);
        } else if (n == -631680873) {
            this.setEnableDND(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

