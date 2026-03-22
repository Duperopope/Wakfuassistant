/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from fBB
 */
public abstract class fbb_2<T extends fft_1>
extends fbd_1
implements fzd {
    private static final int tTJ = 200;
    public static final String tTK = "poissonDisk";
    private static final asl_1 tTL = new asl_1(new ase_1[0]);
    protected EntityGroup tTM;
    private ahc tTN = ahc.cvB;
    private fsb_1 tTO;
    protected boolean tTP = true;
    final ffs_2 tTQ = new ffs_2();
    private boolean tTR;
    protected float aXn = 1.0f;
    protected float col = 1.0f;
    protected float cok = 1.0f;
    protected float cbl = 1.0f;
    private boolean tTS;
    protected boolean tTT;
    protected ffv_2 tTU;
    final ffw_2 tTV = new ffw_2();
    final ffw_2 tTW = new ffw_2();
    final ffw_2 tTX = new ffw_2();
    private final HashMap<String, awk_1> tTY = new HashMap();
    private final ffu_2 tTZ = new ffu_2();
    boolean tUa;
    protected afV crl;
    protected boolean tUb;
    protected boolean tUc;
    private float tUd;
    private boolean tUe;
    protected float tUf;
    protected float tUg;
    protected float tUh;
    protected float tUi;
    protected awg_1 tEC;
    protected T tUj;
    protected ffj_2<T> tUk;
    protected awg_1 tUl;
    protected int tUm;
    protected int tUn;
    protected int tUo;
    protected int tUp;
    protected awk_1 tUq;
    protected boolean tUr;
    protected boolean tUs;
    protected boolean tUt;
    protected boolean tSd;
    protected String tUu;
    protected final ArrayList<fbf_1> tUv = new ArrayList();
    private long tUw;
    public static final int tUx;
    public static final int tUy;
    public static final int tUz;
    public static final int tUA = 1650396766;
    public static final int tUB = 1650396767;
    public static final int tUC = 1650396768;
    public static final int tUD = -1179317609;
    public static final int tUE = 844294999;
    public static final int tUF = 1064092997;
    public static final int tUG = -910230938;
    public static final int tUH = 1641242935;
    public static final int tUI = -1372042101;
    public static final int tUJ = 420023546;
    public static final int tUK = -2122168210;
    public static final int tUL = -20604672;
    public static final int tUM = -1636742325;
    public static final int tUN = 836595617;
    public static final int tUO;

    public String getMapAnmPath() {
        return this.tUu;
    }

    public void setMapAnmPath(String string) {
        this.tUu = string;
    }

    public void a(ffp_2 ffp_22) {
        ffo_2 ffo_22 = ffx_2.a(ffp_22, this.aXn, this.tUf, this.tUg, this.tUu);
        this.tUk.a(ffp_22.Sn(), ffo_22);
        ((fft_1)this.tUj).b(ffp_22.Sn(), ffo_22);
        this.tUr = true;
        this.setNeedsToPostProcess();
    }

    public void aaD(int n) {
        this.tUk.aaD(n);
        this.tUt = true;
        this.setNeedsToPostProcess();
    }

    public void gtl() {
        this.tUk.gtl();
        this.tUt = true;
        this.setNeedsToPostProcess();
    }

    protected void gtm() {
        this.tUk.gtm();
        this.tUt = false;
        this.tUr = true;
    }

    protected void gtj() {
        this.tUk.L(this.aXn, this.tUf, this.tUg);
        this.tUr = true;
        this.tUs = false;
    }

    public void setMapBackgroundPixmap(awg_1 awg_12) {
        this.tUl = awg_12;
        this.tSd = true;
        this.setNeedsToPreProcess();
    }

    public awg_1 getMapBackgroundPixmap() {
        return this.tUl;
    }

    public int getMapBackgroundStartX() {
        return this.tUm;
    }

    public int getMapBackgroundStartY() {
        return this.tUn;
    }

    public int getMapBackgroundEndX() {
        return this.tUo;
    }

    public int getMapBackgroundEndY() {
        return this.tUp;
    }

    public void setMapBackgroundStartX(int n) {
        this.tUm = n;
    }

    public void setMapBackgroundStartY(int n) {
        this.tUn = n;
    }

    public void setMapBackgroundEndX(int n) {
        this.tUo = n;
    }

    public void setMapBackgroundEndY(int n) {
        this.tUp = n;
    }

    @Override
    public void setPixmap(fze fze2) {
        if (fze2 == null) {
            return;
        }
        String string = fze2.getName();
        if (string == null || !string.equals(tTK)) {
            return;
        }
        awg_1 awg_12 = fze2.getPixmap();
        if (awg_12 != null && awg_12.bOX()) {
            awg_12.bOY();
        }
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
    }

    @Override
    public axb_2 getModulationColor() {
        return null;
    }

    protected void gtn() {
        if (this.tUl != null) {
            float f2 = (float)(this.tUo - this.tUm) / (float)this.tUl.getWidth();
            float f3 = (float)(this.tUp - this.tUn) / (float)this.tUl.getHeight();
            float f4 = this.tUh / f2;
            float f5 = this.tUi / f3;
            float f6 = -f4 * (float)this.tUm / (float)this.tUl.getWidth();
            float f7 = -f5 * (float)this.tUn / (float)this.tUl.getHeight();
            ((fft_1)this.tUj).M((int)f6, (int)f7, (int)f4, (int)f5);
        }
    }

    public void a(fbf_1 fbf_12) {
        this.tUv.add(fbf_12);
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tSd) {
            boolean bl2;
            boolean bl3 = this.tUl != null && this.tUl.bHg().bPe();
            boolean bl4 = this.tEC != null && this.tEC.bHg().bPe() || this.tTT;
            boolean bl5 = bl2 = this.tUq == null || this.tUq.bPe();
            if (!(bl3 && bl4 && bl2)) {
                return true;
            }
            if (this.tEC != null) {
                ((fft_1)this.tUj).setPixmap(this.tEC);
            }
            ((fft_1)this.tUj).j(this.tUq);
            if (this.tUl != null) {
                ((fft_1)this.tUj).p(this.tUl);
            }
            for (int i = this.tUv.size() - 1; i >= 0; --i) {
                this.tUv.get(i).eRo();
            }
            this.tSd = false;
            this.tUr = true;
            this.setNeedsToPreProcess();
            this.setNeedsToPostProcess();
        }
        return bl;
    }

    @Override
    public fzb getAppearance() {
        return (fzb)this.uki;
    }

    private boolean a(EntitySprite entitySprite, fso_1 fso_12) {
        awk_1 awk_12 = this.getMeshTexture(fso_12.bGW());
        if (awk_12 != null) {
            if (awk_12.bQp()) {
                return false;
            }
            axj_2 axj_22 = awk_12.ve(0);
            acc_1 acc_12 = awk_12.bQs();
            int n = acc_12.bWx();
            int n2 = acc_12.bWy();
            entitySprite.setTexture(awk_12);
            entitySprite.n(0.0f, 0.0f, (float)n2 / (float)axj_22.getHeight(), (float)n / (float)axj_22.getWidth());
        }
        return true;
    }

    void a(afV afV2, fsn_1 fsn_12, EntitySprite entitySprite, EntitySprite entitySprite2, float f2, float f3, acb_1 acb_12, boolean bl, boolean bl2) {
        XulorParticleSystem xulorParticleSystem;
        int n;
        int n2;
        int n3;
        int n4;
        fso_1 fso_12;
        if (!fsn_12.isVisible()) {
            return;
        }
        if (this.tUw == -1L || fsn_12.aqZ() != this.tUw) {
            return;
        }
        if (fsn_12.gg(0.05f)) {
            fsn_12.ga(this.getIsoValue(fsn_12.gEb(), fsn_12.gGm(), bl2));
            fsn_12.gb(this.getIsoValue(fsn_12.gEc(), fsn_12.gGl(), bl2));
            fsn_12.gf(this.getIsoValue(fsn_12.gGh(), fsn_12.gGn(), bl2));
        }
        boolean bl3 = this.tTU != null && this.tTU.upT == entitySprite;
        int n5 = 3;
        int n6 = 3;
        int n7 = 3;
        boolean bl4 = this.tUe && fsn_12.gGj() != null;
        fso_1 fso_13 = fso_12 = bl4 ? fsn_12.gGj() : fsn_12.gGi();
        if (fso_12 == null || !this.a(entitySprite, fso_12)) {
            return;
        }
        acc_1 acc_12 = entitySprite.bHg().bQs();
        n5 = acc_12.bWx();
        n6 = n7 = acc_12.bWy();
        int n8 = 3;
        int n9 = 3;
        int n10 = 3;
        fso_1 fso_14 = fsn_12.gGk();
        if (fso_14 != null && this.a(entitySprite2, fso_14)) {
            entitySprite2.setVisible(true);
            acc_1 acc_13 = entitySprite2.bHg().bQs();
            n8 = acc_13.bWx();
            n9 = n10 = acc_13.bWy();
        } else {
            entitySprite2.setVisible(false);
        }
        float f4 = afV2.aM(fsn_12.gEb(), fsn_12.gEc()) - acb_12.bWv();
        float f5 = afV2.j(fsn_12.gEb(), fsn_12.gEc(), fsn_12.gGh()) - acb_12.bWw();
        int n11 = (int)(f4 + (float)this.getAppearance().getContentWidth() / 2.0f);
        int n12 = (int)(f5 + (float)this.getAppearance().getContentHeight() / 2.0f);
        int n13 = (int)(f4 * 1.05f + (float)this.getAppearance().getContentWidth() / 2.0f);
        int n14 = (int)(f5 * 1.05f + (float)this.getAppearance().getContentHeight() / 2.0f);
        boolean bl5 = this.getAppearance().getShape().I(n13, n14, this.getWidth(), this.getHeight());
        if (!bl5 && bl) {
            n3 = n4 = this.getAppearance().getOnScreenX(n11, n12) - (int)((float)this.getAppearance().getContentWidth() / 2.0f);
            n = n2 = this.getAppearance().getOnScreenY(n11, n12) - (int)((float)this.getAppearance().getContentHeight() / 2.0f);
        } else {
            n3 = n4 = (int)f4;
            n = n2 = (int)f5;
        }
        if (bl3 && fsn_12.gGq()) {
            n5 = (int)((double)n5 * 1.2);
            n6 = (int)((double)n6 * 1.2);
            n8 = (int)((double)n8 * 1.2);
            n9 = (int)((double)n9 * 1.2);
        }
        if (!bl4) {
            n5 = (int)((float)n5 * this.tUd);
            n6 = (int)((float)n6 * this.tUd);
            n8 = (int)((float)n8 * this.tUd);
            n9 = (int)((float)n9 * this.tUd);
        }
        n3 -= (int)((float)n5 * fso_12.gGs());
        n += (int)((float)n6 * fso_12.gGt());
        if (fso_14 != null) {
            n4 -= (int)((float)n8 * fso_14.gGs());
            n2 = n - 1;
        }
        entitySprite.e((int)(f3 + (float)n), (int)(f2 + (float)n3), n5, n6);
        entitySprite2.e((int)(f3 + (float)n2), (int)(f2 + (float)n4), n8, n9);
        float[] fArray = fsn_12.aXT();
        float f6 = 1.0f;
        if (fArray != null && fArray.length == 4) {
            f6 = fArray[3] * (bl && !bl5 ? 0.5f : 1.0f);
        }
        if ((xulorParticleSystem = this.tTZ.h(fsn_12)) != null) {
            int n15 = n6 - n7;
            xulorParticleSystem.aw(f2 + f4, f3 + f5 + (float)n15);
        }
        if (bl || bl5) {
            asr_1 asr_12 = ast_1.bJG().bJH();
            if (asr_12.un(asa_1.cYN)) {
                if (fsn_12.gGr()) {
                    entitySprite.a(asr_12, asa_1.cYN, tTL);
                    entitySprite2.a(asr_12, asa_1.cYN, tTL);
                } else {
                    entitySprite.a(asr_12, asa_1.cYC, tTL);
                    entitySprite2.a(asr_12, asa_1.cYC, tTL);
                }
            } else if (fsn_12.gGr()) {
                f6 *= 0.5f;
            }
            entitySprite.c(fArray[0], fArray[1], fArray[2], f6);
            entitySprite2.c(fArray[0], fArray[1], fArray[2], f6);
            this.tTM.g(entitySprite);
            this.tTM.g(entitySprite2);
            if (xulorParticleSystem != null) {
                xulorParticleSystem.b(this.tTM);
            }
        }
    }

    private float getIsoValue(float f2, float f3, boolean bl) {
        return this.tTQ.getIsoValue(f2, f3, bl);
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
    }

    @Override
    protected void eKZ() {
        this.bVe.g(((fft_1)this.tUj).gwU());
        this.bVe.g(this.tTM);
        super.eKZ();
    }

    public boolean isDisplayPoints() {
        return this.tUb;
    }

    public void setDisplayPoints(boolean bl) {
        this.tUb = bl;
    }

    public boolean isDisplayCompass() {
        return this.tUc;
    }

    public void setDisplayCompass(boolean bl) {
        this.tUc = bl;
    }

    public float getIsoCenterX() {
        return this.tTQ.getIsoCenterX();
    }

    public void setIsoCenterX(float f2) {
        this.tTQ.setIsoCenterX(f2);
    }

    public float getIsoCenterY() {
        return this.tTQ.getIsoCenterY();
    }

    public void setIsoCenterY(float f2) {
        this.tTQ.setIsoCenterY(f2);
    }

    public float getIsoCenterZ() {
        return this.tTQ.getIsoCenterZ();
    }

    public void setIsoCenterZ(float f2) {
        this.tTQ.setIsoCenterZ(f2);
    }

    public boolean getEnableTooltip() {
        return this.tTP;
    }

    public void setEnableTooltip(boolean bl) {
        this.tTP = bl;
    }

    public float getZoom() {
        return this.aXn;
    }

    public float getMinZoom() {
        return this.cok;
    }

    public void setMinZoom(float f2) {
        if (f2 > 0.0f && f2 <= 1.0f) {
            this.cok = f2;
            this.setZoom();
        }
    }

    public float getMaxZoom() {
        return this.col;
    }

    public void setMaxZoom(float f2) {
        if (f2 > 0.0f && f2 <= 1.0f) {
            this.col = f2;
            this.setZoom();
        }
    }

    public float getZoomScale() {
        return this.cbl;
    }

    public void setZoomScale(float f2) {
        if (f2 >= 0.0f && f2 <= 1.0f) {
            this.cbl = f2;
            this.setZoom();
        }
    }

    public void setMapId(long l) {
        this.tUw = l;
    }

    public ahc getTooltipHotPoint() {
        return this.tTN;
    }

    public void setTooltipHotPoint(ahc ahc2) {
        this.tTN = ahc2;
    }

    protected void setZoom() {
        this.aXn = this.cok + (this.col - this.cok) * this.cbl;
        assert (this.aXn > 0.0f && this.aXn <= 1.0f);
        this.tTQ.setZoom(this.aXn);
        this.crl.cv(86.0f * this.aXn);
        this.crl.cw(43.0f * this.aXn * (float)(this.tTR ? 1 : 2));
        this.crl.cx(10.0f * this.aXn);
        ((fft_1)this.tUj).fR(this.aXn);
        this.tUr = true;
        this.setNeedsToPostProcess();
    }

    public boolean isIsoMap() {
        return this.tTR;
    }

    public void setIsoMap(boolean bl) {
        this.tTR = bl;
        this.setZoom();
    }

    private void setList(ffw_2 ffw_22, ArrayList<fsn_1> arrayList) {
        this.tTZ.a(ffw_22);
        ffw_22.ad(arrayList);
    }

    public void e(fsn_1 fsn_12) {
        this.tTX.i(fsn_12);
    }

    public void d(fsn_1 fsn_12) {
        this.tTX.j(fsn_12);
        if (this.getOverItem() == fsn_12) {
            this.setOverItem(null);
        }
    }

    public void gto() {
        this.tTX.clear();
        this.setOverItem(null);
    }

    private awk_1 getMeshTexture(String string) {
        awk_1 awk_12 = this.tTY.get(string);
        if (awk_12 != null) {
            return awk_12;
        }
        awk_12 = ffy_2.tM(string);
        this.tTY.put(string, awk_12);
        return awk_12;
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || fbj_1.getInstance().isMovePointMode()) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fzb;
    }

    public void setOnMapClick(fmw_2 fmw_22) {
        this.a(fzq_0.tJJ, fmw_22, true);
    }

    public void setOnMapDoubleClick(fmx_2 fmx_22) {
        this.a(fzq_0.tJK, fmx_22, true);
    }

    public void setOnMapMove(fmy_1 fmy_12) {
        this.tTS = true;
        this.a(fzq_0.tJL, fmy_12, true);
    }

    public fsn_1 getOverItem() {
        return this.tTU == null ? null : this.tTU.upS;
    }

    public EntitySprite getOverMesh() {
        return this.tTU == null ? null : this.tTU.upT;
    }

    public float getLandMarkZoom() {
        return this.tUd;
    }

    public void setLandMarkZoom(float f2) {
        this.tUd = f2;
    }

    public boolean isUseAlternateTexture() {
        return this.tUe;
    }

    public void setUseAlternateTexture(boolean bl) {
        this.tUe = bl;
    }

    protected void gtp() {
        this.tUa = true;
    }

    private boolean a(EntitySprite entitySprite, int n, int n2) {
        if (entitySprite == null) {
            return false;
        }
        int n3 = n - this.uki.getLeftInset();
        int n4 = n2 - this.uki.getBottomInset();
        return this.getAppearance().gE(n3, n4) && fft_2.b(entitySprite, n, n2);
    }

    public fsn_1 getItemUnderMouse(ffw_2 ffw_22, ArrayList<fsn_1> arrayList, int n, int n2) {
        int n3 = this.a(ffw_22, n, n2);
        if (n3 < 0 || n3 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(n3);
    }

    private ffv_2 getMapOverlayPointUnderMouse(int n, int n2) {
        ffv_2 ffv_22;
        ffv_2 ffv_23 = ffv_22 = this.tUc ? this.getMapOverlayPointUnderMouse(this.tTW, n, n2) : null;
        if (ffv_22 != null) {
            return ffv_22;
        }
        ffv_2 ffv_24 = ffv_22 = this.tUb ? this.getMapOverlayPointUnderMouse(this.tTV, n, n2) : null;
        if (ffv_22 != null) {
            return ffv_22;
        }
        return this.getMapOverlayPointUnderMouse(this.tTX, n, n2);
    }

    private ffv_2 getMapOverlayPointUnderMouse(ffw_2 ffw_22, int n, int n2) {
        int n3 = this.a(ffw_22, n, n2);
        return ffw_22.aaW(n3);
    }

    private int a(ffw_2 ffw_22, int n, int n2) {
        for (int i = ffw_22.aVo() - 1; i >= 0; --i) {
            EntitySprite entitySprite = ffw_22.aaU(i);
            if (!this.a(entitySprite, n, n2) || this.tUw == -1L || ffw_22.aaT(i).aqZ() != this.tUw) continue;
            return i;
        }
        return -1;
    }

    protected void a(ffv_2 ffv_22) {
    }

    protected void b(ffv_2 ffv_22) {
    }

    protected void a(int n, ffv_2 ffv_22) {
    }

    protected void gK(int n, int n2) {
    }

    public acc_1 getIsoMousePosition() {
        int n = fhz_2.gAS().getX() - this.getScreenX();
        int n2 = fhz_2.gAS().getY() - this.getScreenY();
        acb_1 acb_12 = this.getMouseToIso(n, n2);
        return new acc_1((int)acb_12.bWv(), (int)acb_12.bWw());
    }

    private void setOverItem(ffv_2 ffv_22) {
        if (this.tTU != null) {
            this.tTU.bsI();
        }
        this.tTU = ffv_22;
        if (this.tTU != null) {
            this.tTU.bGY();
        }
    }

    public void gtq() {
        int n = fhz_2.gAS().getX() - this.getScreenX();
        int n2 = fhz_2.gAS().getY() - this.getScreenY();
        this.setOverItem(this.getMapOverlayPointUnderMouse(n, n2));
    }

    void i(flp_2 flp_22) {
        int n;
        int n2 = flp_22.x(this);
        ffv_2 ffv_22 = this.getMapOverlayPointUnderMouse(n2, n = flp_22.y(this));
        if (this.tTU != ffv_22) {
            if (this.tTU != null) {
                this.b(this.tTU);
                this.h(fln_2.a(flp_22, this, fzq_0.tJD, this.tTU.upS, this.tTU.upT));
                this.setOverItem(null);
            }
            if (ffv_22 != null) {
                this.a(ffv_22);
                this.h(fln_2.a(flp_22, this, fzq_0.tJE, ffv_22.upS, ffv_22.upT));
                this.setOverItem(ffv_22);
            }
        }
        acb_1 acb_12 = this.getMouseToIso(n2, n);
        this.gK((int)acb_12.bWv(), (int)acb_12.bWw());
        if (this.tTS) {
            fll_2 fll_22 = fll_2.a(flp_22, acb_12.bWv(), acb_12.bWw(), this.tTU != null ? this.tTU.getValue() : null);
            fll_22.b(fzq_0.tJL);
            this.h(fll_22);
        }
    }

    private acb_1 getMouseToIso(int n, int n2) {
        int n3 = -this.uki.getLeftInset() - this.uki.getContentWidth() / 2;
        int n4 = -this.uki.getBottomInset() - this.uki.getContentHeight() / 2;
        return this.tTQ.b(this.crl, n + n3, n2 + n4);
    }

    boolean j(flp_2 flp_22) {
        Object object;
        fzq_0 fzq_02;
        fzq_0 fzq_03;
        if (flp_22.gBy() != fzq_0.tJU && flp_22.gBy() != fzq_0.tJV) {
            return false;
        }
        int n = flp_22.x(this);
        int n2 = flp_22.y(this);
        if (flp_22.gBy() == fzq_0.tJU) {
            fzq_03 = fzq_0.tJB;
            fzq_02 = fzq_0.tJJ;
        } else {
            fzq_03 = fzq_0.tJC;
            fzq_02 = fzq_0.tJK;
        }
        if (this.tTU != null) {
            object = fln_2.a(flp_22, this, fzq_03, this.tTU.upS, this.tTU.upT);
            this.h((fiq_1)object);
            this.a(flp_22.fca(), this.tTU);
        }
        object = this.getMouseToIso(n, n2);
        this.gK((int)((acb_1)object).bWv(), (int)((acb_1)object).bWw());
        fll_2 fll_22 = fll_2.a(flp_22, ((acb_1)object).bWv(), ((acb_1)object).bWw(), this.tTU != null ? this.tTU.getValue() : null);
        fll_22.b(fzq_02);
        this.h(fll_22);
        return false;
    }

    private void dKc() {
        fbc_2 fbc_22 = new fbc_2(this);
        this.a(fzq_0.tJM, fbc_22, false);
        fbd_2 fbd_22 = new fbd_2(this);
        this.a(fzq_0.tJU, fbd_22, false);
        this.a(fzq_0.tJV, fbd_22, false);
    }

    public acc_1 isoToScreen(int n, int n2, boolean bl) {
        acb_1 acb_12 = this.tTQ.a(this.crl, n, n2, bl);
        return new acc_1((int)acb_12.bWv(), (int)acb_12.bWw());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tTM.bsI();
        this.tTM = null;
        this.tTV.clear();
        this.tTX.clear();
        this.tTW.clear();
        this.tTO.aVH();
        this.tTO = null;
        this.setOverItem(null);
        this.tTZ.clear();
        this.crl.bqO();
        this.crl = null;
        this.gts();
        if (this.tUj != null) {
            ((fft_1)this.tUj).aVH();
            this.tUj = null;
        }
    }

    protected final void gtr() {
        if (!this.tUr) {
            return;
        }
        if (this.uki == null || this.uki.getContentWidth() == 0 || this.uki.getContentHeight() == 0) {
            return;
        }
        this.gtk();
        this.gtp();
        this.tUr = false;
    }

    protected void gtk() {
        ((fft_1)this.tUj).a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
    }

    protected final void gts() {
        if (this.tEC != null && this.tEC.bHg() != null) {
            this.tEC.bHg().bsI();
        }
        this.tEC = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        frz_2 frz_22 = frz_2.checkOut();
        this.a(frz_22);
        assert (this.tTM == null);
        this.tTM = (EntityGroup)EntityGroup.cXh.bSK();
        this.tTM.cWR = this;
        this.tTM.bIS().a(new awp_1());
        this.tTO = new fsb_1();
        this.tTO.aVI();
        this.tTQ.reset();
        this.tTP = true;
        this.tUa = false;
        this.tUd = 1.0f;
        this.tUe = false;
        this.dKc();
        this.gtt();
        this.setNonBlocking(false);
    }

    @Override
    public void bFM() {
        super.bFM();
    }

    @Override
    public void grg() {
        super.grg();
        this.tTQ.aaS((int)((float)this.uki.getContentWidth() / this.crl.byr()));
        this.tUr = true;
        int n = this.tUv.size();
        for (int i = 0; i < n; ++i) {
            this.tUv.get(i).eRp();
        }
    }

    @Override
    public boolean LY(int n) {
        super.LY(n);
        this.crl.setVisible(false);
        this.crl.bb(this.uki.getContentWidth(), this.uki.getContentHeight());
        this.crl.bRp().vm(this.getDisplayX() + this.uki.getLeftInset());
        this.crl.bRp().vn(this.getDisplayY() + this.uki.getBottomInset());
        this.crl.qy(n);
        return true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fbb_2 fbb_22 = (fbb_2)fhi_22;
        fbb_22.setIsoCenterX(this.getIsoCenterX());
        fbb_22.setIsoCenterY(this.getIsoCenterY());
        fbb_22.setIsoCenterZ(this.getIsoCenterZ());
        fbb_22.setIsoMap(this.tTR);
        fbb_22.setMaxZoom(this.getMaxZoom());
        fbb_22.setMinSize(this.getMinSize());
        fbb_22.setTooltipHotPoint(this.getTooltipHotPoint());
        fbb_22.setZoomScale(this.getZoomScale());
        fbb_22.setEnableTooltip(this.getEnableTooltip());
        fbb_22.setMapId(this.tUw);
    }

    private void gtt() {
        assert (this.crl == null);
        this.tUb = true;
        this.tUc = true;
        this.crl = new fbe_2(this);
        this.crl.cv(86.0f * this.aXn);
        this.crl.cw(43.0f * this.aXn);
        this.crl.setVisible(false);
    }

    public void setMapPath(String string) {
        aqs_2 aqs_22;
        URL uRL;
        if (this.tTT) {
            return;
        }
        if (BH.aU(string)) {
            return;
        }
        try {
            uRL = fo_0.bA(string);
        }
        catch (MalformedURLException malformedURLException) {
            uxJ.error((Object)("URL invalide : " + string));
            return;
        }
        try {
            aqs_22 = fyw_0.j(uRL);
        }
        catch (Exception exception) {
            uxJ.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + String.valueOf(uRL)));
            return;
        }
        this.gts();
        this.tUf = 0.0f;
        this.tUg = 0.0f;
        this.tUh = 0.0f;
        this.tUi = 0.0f;
        this.setBaseMapDisplayer();
        ArrayList<? extends apd_1> arrayList = aqs_22.bGT().getChildren();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_12 = arrayList.get(i);
            ffy_2 ffy_22 = ffy_2.o(apd_12);
            if (ffy_22 == null) continue;
            this.tUh = (float)ffy_22.uqh;
            this.tUi = (float)ffy_22.uqi;
            this.tUf = (float)ffy_22.uqf;
            this.tUg = (float)ffy_22.uqg;
            awk_1 awk_12 = ffy_2.a(arrayList.get(i), uRL);
            this.a(string, uRL, apd_12);
            if (awk_12 != null) {
                this.a(ffy_22, awk_12);
            }
            ((fft_1)this.tUj).gS((int)this.tUh, (int)this.tUi);
            this.setMeshCenter();
        }
        this.gti();
    }

    protected void gti() {
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
        this.tUs = true;
    }

    protected void setMeshCenter() {
    }

    protected void a(ffy_2 ffy_22, awk_1 awk_12) {
        this.tEC = ffy_22.i(awk_12);
        this.gtn();
        this.tSd = true;
    }

    protected void a(String string, URL uRL, apd_1 apd_12) {
        this.tUq = ffy_2.a(apd_12, uRL, string);
    }

    protected void setBaseMapDisplayer() {
        ((fft_1)this.tUj).setMapDisplayer(new fgk_1());
    }

    public void setForceDisplayEntity(boolean bl) {
        this.tTT = bl;
    }

    public void setMapRect(int n, int n2, int n3, int n4) {
        assert (this.tTT);
        this.tUf = n;
        this.tUg = n2;
        this.tUh = n3;
        this.tUi = n4;
        ((fft_1)this.tUj).gS(n3, n4);
        this.gts();
        this.gtn();
    }

    public void setMapDisplayer(fgi_1 fgi_12) {
        this.setForceDisplayEntity(true);
        ((fft_1)this.tUj).setMapDisplayer(fgi_12);
        this.gti();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 836595617) {
            this.setMapPath(string);
        } else if (n == 1650396766) {
            this.setIsoCenterX(Bw.o(string));
        } else if (n == 1650396767) {
            this.setIsoCenterY(Bw.o(string));
        } else if (n == 1650396768) {
            this.setIsoCenterZ(Bw.o(string));
        } else if (n == -1179317609) {
            this.setIsoMap(Bw.aK(string));
        } else if (n == -1372042101) {
            this.setOnMapClick(fic_12.b(fmw_2.class, string));
        } else if (n == 420023546) {
            this.setOnMapDoubleClick(fic_12.b(fmx_2.class, string));
        } else if (n == -2122168210) {
            this.setOnMapMove(fic_12.b(fmy_1.class, string));
        } else if (n == 844294999) {
            this.setMaxZoom(Bw.o(string));
        } else if (n == 1064092997) {
            this.setMinZoom(Bw.o(string));
        } else if (n == -910230938) {
            this.setTooltipHotPoint(ahc.eL(string));
        } else if (n == -20604672) {
            this.setEnableTooltip(Bw.aK(string));
        } else if (n == -1636742325) {
            this.setLandMarkZoom(Bw.o(string));
        } else if (n == 1641242935) {
            this.setZoomScale(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 836595617) {
            this.setMapPath(Bw.k(object));
        } else if (n == tUO) {
            this.setMapId(Bw.p(object));
        } else if (n == tUx) {
            this.setList(this.tTV, (ArrayList)object);
        } else if (n == tUy) {
            this.setList(this.tTW, (ArrayList)object);
        } else if (n == tUz) {
            this.setList(this.tTX, (ArrayList)object);
        } else if (n == 1650396766) {
            this.setIsoCenterX(Bw.o(object));
        } else if (n == 1650396767) {
            this.setIsoCenterY(Bw.o(object));
        } else if (n == 1650396768) {
            this.setIsoCenterZ(Bw.o(object));
        } else if (n == -1179317609) {
            this.setIsoMap(Bw.l(object));
        } else if (n == 844294999) {
            this.setMaxZoom(Bw.o(object));
        } else if (n == 1064092997) {
            this.setMinZoom(Bw.o(object));
        } else if (n == -910230938) {
            this.setTooltipHotPoint((ahc)((Object)object));
        } else if (n == -20604672) {
            this.setEnableTooltip(Bw.l(object));
        } else if (n == 1641242935) {
            this.setZoomScale(Bw.o(object));
        } else if (n == -1636742325) {
            this.setLandMarkZoom(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    static {
        tTL.c("gColorScale", 1.0f);
        tUx = "content".hashCode();
        tUy = "compassContent".hashCode();
        tUz = "landMarkContent".hashCode();
        tUO = "mapId".hashCode();
    }
}

