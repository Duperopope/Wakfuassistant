/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fAK
 */
public class fak_2<Content extends fbb_1>
extends fay_1<Content>
implements fiz_1,
fyi_0,
fyo_0,
fyv_0 {
    public static final String tPu = "selection";
    public static final String TAG = "calendar";
    private static final int tPv = 7;
    private static final int tPw = 31;
    private ArrayList<fbb_1> tPx;
    ArrayList<fap_2> bjS = new ArrayList();
    private fjf_1 tMx = new fjf_1();
    Calendar jeX = new GregorianCalendar();
    int tPy = 0;
    int tPz = 0;
    int tPA;
    int tPB;
    fsm_1 tMc;
    private String tMB = null;
    private fhs_2 tMC = null;
    private boolean tPC;
    private boolean tPD;
    int tPE = -1;
    int tPF = -1;
    private Insets tPG = null;
    private faa_2 tPH = faa_2.tLS;
    private awx_1 tPI = null;
    private axb_2 tPJ = null;
    private fle_1 tPK;
    public static final int tPL = -917611389;
    public static final int tPM = 3200366;
    public static final int tPN = 3617440;
    public static final int tPO = 342714108;
    public static final int tPP = "calendar".hashCode();

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
        if (this.tPK != null && this.tPF != -1) {
            this.bVe.g(this.tPK.gDq());
        }
    }

    @Override
    public fzq getAppearance() {
        return (fzq)this.uki;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public Calendar getCalendar() {
        return this.jeX;
    }

    public void setCalendar(Calendar calendar) {
        this.jeX = calendar;
        this.tPC = true;
        this.setNeedsToPreProcess();
    }

    public void setCellSize(fsm_1 fsm_12) {
        this.tMc = fsm_12;
        this.tPC = true;
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
        this.tPC = true;
        this.setNeedsToPreProcess();
    }

    public int getHgap() {
        return this.tPz;
    }

    public void setHgap(int n) {
        this.tPz = n;
        this.tPC = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    @Override
    public void setContent(@NotNull Iterable<Content> iterable, boolean bl) {
        this.tPx = new ArrayList();
        for (fbb_1 fbb_12 : iterable) {
            this.tPx.add(fbb_12);
        }
        this.tPD = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public Iterable<Content> getUnfilteredContent() {
        return this.tPx;
    }

    @Override
    public void setFont(awx_1 awx_12) {
        if (awx_12 == this.tPI) {
            return;
        }
        this.tPI = awx_12;
        int n = this.bjS.size();
        for (int i = 0; i < n; ++i) {
            this.bjS.get(i).gsA().setFont(awx_12);
        }
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equals("text")) {
            if (axb_22 == this.tPJ) {
                return;
            }
            this.tPJ = axb_22;
            int n = this.bjS.size();
            for (int i = 0; i < n; ++i) {
                this.bjS.get(i).gsA().setColor(axb_22, "text");
            }
        } else if (string.equals(tPu)) {
            if (axb_22 != null) {
                if (this.tPK == null) {
                    this.tPK = new fle_1();
                    this.tPK.aVI();
                    this.setNeedsToResetMeshes();
                }
                this.tPK.setColor(axb_22);
            } else {
                if (this.tPK != null) {
                    this.tPK.aVH();
                }
                this.tPK = null;
                this.setNeedsToResetMeshes();
            }
        }
    }

    @Override
    public void setAlign(faa_2 faa_22) {
        if (this.tPH == faa_22) {
            return;
        }
        this.tPH = faa_22;
        int n = this.bjS.size();
        for (int i = 0; i < n; ++i) {
            this.bjS.get(i).gsA().setAlign(faa_22);
        }
    }

    public Insets getDateMargin() {
        return this.tPG;
    }

    public void setDateMargin(Insets insets) {
        this.tPG = insets;
    }

    public int getYearOver() {
        return this.jeX.get(1);
    }

    public int getMonthOver() {
        return this.jeX.get(2) + 1;
    }

    public int getDayOver() {
        if (this.tPF != -1) {
            return this.tPF + 1;
        }
        return -1;
    }

    void setSelectedDate(int n) {
        this.tPF = n - 1;
        this.jeX.set(5, n);
        if (this.tPK != null) {
            faw_2 faw_22 = this.bjS.get(this.tPF).getContainer();
            this.tPK.a(faw_22.getPosition(), faw_22.getSize(), this.getAppearance().getTotalInsets());
            this.setNeedsToResetMeshes();
        }
    }

    private void gsy() {
        int n;
        int n2 = this.jeX.getActualMaximum(5);
        if (n2 > (n = this.bjS.size())) {
            for (int i = n; i < n2; ++i) {
                fap_2 fap_22 = new fap_2();
                fcv_1 fcv_12 = new fcv_1();
                fcv_12.aVI();
                fcv_12.setNonBlocking(this.ukD);
                fcv_12.setRendererManager(this.tMx);
                faw_2 faw_22 = faw_2.checkOut();
                fro_1 fro_12 = new fro_1();
                fro_12.aVI();
                faw_22.a(fro_12);
                faw_22.a(fzq_0.tJQ, new fal_1(this, fap_22), false);
                faw_22.a(fzq_0.tJR, new fam_1(this), false);
                faw_22.a(fzq_0.tJU, new fan_2(this, fap_22), false);
                frp_1 frp_12 = new frp_1();
                frp_12.aVI();
                frp_12.setSize(new fsm_1(100.0f, 100.0f));
                fcv_12.d(frp_12);
                fbv_2 fbv_22 = new fbv_2();
                fbv_22.aVI();
                fbv_22.setNonBlocking(true);
                fbv_22.setFont(this.tPI);
                fbv_22.setColor(this.tPJ, "text");
                fbv_22.setAlign(this.tPH);
                fbv_22.setText(String.valueOf(i + 1));
                frp_12 = new frp_1();
                frp_12.aVI();
                frp_12.setSize(new fsm_1(100.0f, 100.0f));
                fbv_22.d(frp_12);
                if (this.tPG != null) {
                    fzq fzq2 = fbv_22.getAppearance();
                    fzv fzv2 = fzv.checkOut();
                    fzv2.setInsets(this.tPG);
                    ((fys_0)fzq2).d(fzv2);
                }
                faw_22.d(fcv_12);
                faw_22.d(fbv_22);
                fap_22.b(fcv_12);
                fap_22.eT(faw_22);
                fap_22.ad(fbv_22);
                this.bjS.add(fap_22);
                this.d(faw_22);
            }
        } else if (n2 < n) {
            for (int i = n2; i < n; ++i) {
                fap_2 fap_23 = this.bjS.remove(this.bjS.size() - 1);
                fap_23.getContainer().gAD();
            }
            if (this.tPE >= this.bjS.size()) {
                this.tPE = -1;
            }
        }
        this.setSelectedDate(this.jeX.get(5));
    }

    public void ebw() {
        Object object;
        int n;
        int n2;
        int[] nArray = new int[this.tPx.size()];
        int n3 = this.tPx.size();
        for (n2 = 0; n2 < n3; ++n2) {
            fbb_1 fbb_12 = this.tPx.get(n2);
            nArray[n2] = fbb_12.dEZ();
            n = fbb_12.dEZ() - 1;
            fcv_1 fcv_12 = this.bjS.get(n).getRenderable();
            object = fbb_12.dFa();
            fcv_12.setContentProperty(this.tMB + "#" + n, this.tMC);
            fcv_12.setContent(object);
        }
        n2 = 0;
        n3 = this.bjS.size();
        int n4 = 0;
        int n5 = this.tPx.size();
        for (n = 0; n < n5; ++n) {
            n4 = this.tPx.get(n).dEZ() - 1;
            while (n2 < n4 && n2 < n3) {
                object = this.bjS.get(n2).getRenderable();
                ((fcv_1)object).setContentProperty(this.tMB + "#" + n2, this.tMC);
                ((fcv_1)object).setContent(null);
                ++n2;
            }
            n2 = n4 + 1;
        }
        n = this.tPx.size() == 0 ? 0 : 1;
        int n6 = this.bjS.size();
        for (n5 = n4 + n; n5 < n6; ++n5) {
            fcv_1 fcv_13 = this.bjS.get(n5).getRenderable();
            fcv_13.setContentProperty(this.tMB + "#" + n5, this.tMC);
            fcv_13.setContent(null);
        }
    }

    private void gsz() {
        this.tPA = 7;
        int n = 4;
        int n2 = 3;
        if (n2 > 1) {
            n2 = 2;
        }
        this.tPB = 4 + n2;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        boolean bl2 = false;
        if (this.tPC) {
            this.gsy();
        }
        if (this.tPD) {
            this.ebw();
        }
        if (this.tPC) {
            this.gsm();
        }
        this.tPC = false;
        this.tPD = false;
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fak_2 fak_22 = (fak_2)fhi_22;
        super.a(fak_22);
        fak_22.setAlign(this.tPH);
        fak_22.setCellSize((fsm_1)this.tMc.clone());
        fak_22.setCalendar(this.jeX);
        fak_22.setHgap(this.tPz);
        fak_22.setVgap(this.tPy);
        fak_22.setDateMargin(this.tPG);
        for (int i = fak_22.tRe.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = (fes_2)fak_22.tRe.get(i);
            fes_22.gAD();
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        fao_1 fao_12 = new fao_1(this);
        fao_12.aVI();
        this.a(fao_12);
        fzq fzq2 = new fzq();
        fzq2.aVI();
        this.d(fzq2);
        this.jeX.setTime(new Date());
        this.jeX.set(5, 1);
        this.gsz();
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.tPx != null) {
            this.tPx.clear();
            this.tPx = null;
        }
        this.bjS.clear();
        this.bjS = null;
        this.tMc = null;
        this.tMx = null;
        this.tPJ = null;
        this.tPH = null;
        this.tPI = null;
        this.tPG = null;
        if (this.tPK != null) {
            this.tPK.aVH();
            this.tPK = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -917611389) {
            this.setCellSize(fic_12.vn(string));
        } else if (n == 3200366) {
            this.setHgap(Bw.m(string));
        } else if (n == 3617440) {
            this.setVgap(Bw.m(string));
        } else if (n == 342714108) {
            this.setDateMargin(fic_12.vo(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != tPP) {
            return super.setPropertyAttribute(n, object);
        }
        this.setCalendar((Calendar)object);
        return true;
    }
}

