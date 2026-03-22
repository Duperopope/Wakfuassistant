/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fEm
 */
public class fem_1
extends feq_1
implements WT,
ady_0<ads_0> {
    private static final Logger ujx = Logger.getLogger(fem_1.class);
    public static final String TAG = "wakfuBubble";
    private static final int ujy = 5;
    private static final int ujz = 60;
    public static final String ujA = "text";
    public static final String ujB = "container";
    public static final String ujC = "coloredContainer";
    public static final String ujD = "image";
    public static int lHp = Integer.MIN_VALUE;
    private fdz_1 ujE;
    private boolean ucd;
    private boolean ujF = true;
    private boolean ujG = false;
    private boolean ujH = true;
    private boolean ujI = false;
    private boolean ujJ = false;
    private fei_1 ujK;
    private ads_0 ujL;
    private fep_1 ujM;
    private float azQ = 1.0f;
    private boolean ujN;
    private axb_2 chO;

    public void aPg() {
        this.A(true, true);
    }

    public void A(boolean bl, boolean bl2) {
        this.a(true, bl, bl2, false);
    }

    public void f(boolean bl, boolean bl2, boolean bl3) {
        this.a(true, bl, bl2, bl3);
    }

    public void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.ujE = (fdz_1)this.getElementMap().uH(ujA);
        if (!this.ujG || this.ujH != bl) {
            this.ujH = bl;
            this.gtc();
        }
        this.ucd = bl2;
        this.ujN = bl3;
        this.ujJ = bl4;
    }

    protected void gtc() {
        if (this.ujK != null && this.ujK.gvt() != null) {
            this.ujK.gvt().c(this);
        }
        this.setAlign(this.ujH ? faa_2.tLK : faa_2.tLM);
        if (this.ujX != null) {
            this.a(this.ujX, this.ujX.getScreenX(), this.ujX.getScreenY(), 0);
        }
        this.bFM();
        this.ujG = true;
    }

    protected void gtd() {
        this.ujK.gvt().b(this);
    }

    public String setText(String string) {
        return this.setText(string, 1.0f);
    }

    public String setText(String string, float f2) {
        assert (this.ujE != null);
        azx_1<fei_1, String> azx_12 = fei_1.tS(string);
        if (azx_12.getFirst() != this.ujK) {
            this.ujK = azx_12.getFirst();
            this.gtd();
            this.gtc();
        }
        string = azx_12.aHI().trim();
        this.ujE.setText(string);
        this.setDuration((int)((float)Xh.dK(string) * f2));
        if (this.ujJ) {
            this.jL(true);
        }
        this.bqn();
        this.gvm();
        return string;
    }

    public void setTarget(ZG zG) {
        this.setTarget((ZC)zG);
        if (zG != null) {
            this.r(zG.bcB());
        }
    }

    public void setTarget(ZC zC) {
        if (zC == this.ujX) {
            return;
        }
        if (this.ujX != null && this.ujX instanceof ZC) {
            ((ZC)this.ujX).b(this);
        }
        super.setTarget(zC);
        if (zC != null) {
            zC.a(this);
            this.setTargetIsVisible(zC.isVisible());
        }
    }

    public void setBubbleObserver(ads_0 ads_02) {
        this.ujL = ads_02;
        this.ujL.a(this);
    }

    private void r(abi_1 abi_12) {
        boolean bl = fem_1.isRightDirection(abi_12);
        if (bl != this.ujH) {
            this.ujH = bl;
            this.gtc();
        }
    }

    @Override
    public void gss() {
        if (this.ujJ) {
            this.jL(false);
        } else {
            this.bmX();
        }
    }

    public void bmX() {
        this.ujI = false;
        this.ujM = null;
        if (this.ucd) {
            this.guv();
        } else {
            this.setBubbleIsVisible(false);
        }
        if (this.ujL != null) {
            this.ujL.c(this);
        }
    }

    public void setBubbleIsVisible(boolean bl) {
        if (this.ujF == bl) {
            return;
        }
        this.ujF = bl;
        this.bqn();
    }

    @Override
    protected void bqn() {
        boolean bl;
        boolean bl2 = bl = this.ujY && this.ujF;
        if (this.bmg == bl) {
            return;
        }
        this.setVisible(bl);
        if (bl) {
            this.gvm();
        }
    }

    private void gvm() {
        fbw_1 fbw_12 = this.getParentOfType(fbw_1.class);
        if (fbw_12 == null) {
            return;
        }
        fbw_12.o(this);
    }

    @Override
    public final void bFM() {
        super.bFM();
    }

    @Override
    public acc_1 getComputedPosition(int n, int n2, int n3) {
        acc_1 acc_12 = super.getPositionWithOutOfScreen(n, n2, n3);
        int n4 = acc_12.bWx();
        int n5 = acc_12.bWy();
        int n6 = this.uka.getDuration();
        if (this.ujI && (n6 == -1 || this.uka.bnA() < n6 / 2) || this.ujK == fei_1.uns && this.uka.bnA() < 500) {
            n4 += GC.q(-3, 3);
            n5 += GC.q(-3, 3);
        }
        acc_12.cG(n4, n5);
        return acc_12;
    }

    @Override
    public void a(WQ wQ, int n, int n2, int n3) {
        this.bqn();
        this.c(this.ujL);
        super.a(wQ, n, n2, 0);
    }

    public void setShakingBubble(boolean bl) {
        this.ujI = bl;
    }

    public void setDuration(int n) {
        this.uka.setDuration(n);
    }

    public void bnz() {
        this.uka.aaK(0);
        this.bqn();
    }

    public int getAdviserId() {
        return this.uka.d();
    }

    public boolean isToRight() {
        return this.ujH;
    }

    public axb_2 getColor() {
        return this.chO;
    }

    public void setColor(axb_2 axb_22) {
        this.chO = axb_22;
        this.gro();
    }

    public void gro() {
        faw_2 faw_22 = (faw_2)this.getElementMap().uH(ujC);
        faw_22.setVisible(this.chO != null);
        faw_22.getAppearance().setModulationColor(this.chO);
    }

    public void guv() {
        if (this.getElementMap() != null) {
            fyw_0.gqw().tl(this.getElementMap().getId());
        }
    }

    @Override
    public void b(boolean bl, WU wU) {
        this.setTargetIsVisible(bl);
    }

    public static boolean isRightDirection(abi_1 abi_12) {
        switch (abi_12) {
            case dzp: 
            case dzq: 
            case dzj: 
            case dzk: 
            case dzl: {
                return false;
            }
            case dzn: 
            case dzo: 
            case dzm: {
                return true;
            }
        }
        return false;
    }

    @Override
    public float getWorldX() {
        if (this.ujX != null) {
            return this.ujX.getWorldX();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.ujX != null) {
            return this.ujX.getWorldY();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.ujX != null) {
            return this.ujX.getAltitude();
        }
        return 0.0f;
    }

    public int getDuration() {
        return this.uka.getDuration();
    }

    @Override
    public void gsh() {
        super.gsh();
        if (this.ujX != null && this.ujX instanceof ZC) {
            ((ZC)this.ujX).b(this);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ujG = false;
    }

    private void jL(boolean bl) {
        fhs_2 fhs_22 = this.getElementMap();
        ArrayList<fzc> arrayList = new ArrayList<fzc>();
        if (fhs_22 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH(ujD);
        if (fes_22 != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH(ujB)) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if ((fes_22 = (fes_2)fhs_22.uH(ujA)) != null) {
            arrayList.add(fes_22.getAppearance());
        }
        if (fes_22 != null) {
            awx_2 awx_22 = new awx_2(bl ? awx_2.dnC.aTn() : awx_2.dnF.aTn());
            awx_2 awx_23 = new awx_2(bl ? awx_2.dnF.aTn() : awx_2.dnC.aTn());
            fsz_2 fsz_22 = new fsz_2(awx_22, awx_23, arrayList, 0, 500, 1, abn.cdr);
            if (!bl) {
                fsz_22.a(new fen_1(this, fsz_22));
            }
            fes_22.a(fsz_22);
        }
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        this.c(ads_02);
    }

    private void c(ads_0 ads_02) {
        if (ads_02 == null || this.ujK == null || this.ujX == null) {
            return;
        }
        int n = ads_02.bqg().P(this.ujX.bcC(), this.ujX.bcD(), this.ujX.bcE());
        fep_1 fep_12 = n > this.ujK.gvu() ? fep_1.ujT : fep_1.ujU;
        if (fep_12 != this.ujM) {
            if (this.ujN || this.ujK == fei_1.unt) {
                this.a(fep_12);
            }
            this.ujM = fep_12;
        }
    }

    private void a(fep_1 fep_12) {
        fdz_1 fdz_12 = (fdz_1)this.getElementMap().uH(ujA);
        if (this.ujM != null) {
            fdz_12.setZoomTween(fep_12.getZoomScale(), 500);
        } else {
            fdz_12.setZoom(fep_12.getZoomScale());
        }
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

