/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/*
 * Renamed from fBN
 */
public class fbn_2
extends faw_2
implements awh_1,
fzd {
    public static final String TAG = "multipleImage";
    public static final String tVT = "internalPopup";
    public static final String tVU = "internalPopupTextView";
    protected ffu_1 tVV;
    boolean tVW = false;
    Point tVX = null;
    protected boolean tVY = false;
    protected boolean tQh = true;
    protected boolean tVZ = false;
    private boolean tWa = false;
    private boolean tWb = false;
    protected int dhZ;
    protected int dia;
    int tWc;
    int tWd;
    protected int tWe = 0;
    protected int tWf = 0;
    int tWg = 0;
    int tWh = 0;
    boolean tWi = false;
    boolean tWj = false;
    private final ArrayList<fsv_1> tWk = new ArrayList();
    final ArrayList<fth_1> tWl = new ArrayList();
    private awg_1 tEC = null;
    fth_1 tWm = null;
    private fis_1 tND;
    private fis_1 mTP;
    private fis_1 tNF;
    private fis_1 tNH;
    fes_2 tWn;
    fdy_1 tWo;
    fbu_1 tWp;
    private String tCu;
    private fbv_1 tWq;
    public static final int tWr = "modulationColor".hashCode();
    public static final int tWs = "imagePath".hashCode();
    public static final int tWt = -1450345951;
    public static final int tWu = 370229451;
    public static final int tWv = 1415534255;
    public static final int tWw = 498894174;
    public static final int tWx = -1161348842;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        } else if (fhv_12 instanceof fes_2 && fhv_12.getId().equals(tVT)) {
            this.tWn = (fes_2)fhv_12;
            this.tWn.setVisible(false);
        }
        super.d(fhv_12);
    }

    @Override
    protected void eKZ() {
        if (this.bVe != null && this.tVV.gxg() != null) {
            this.bVe.g(this.tVV.gxg());
        }
        super.eKZ();
    }

    public void setImageListener(fbv_1 fbv_12) {
        this.tWq = fbv_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tVV != null) {
            this.tVV.B(axb_22);
        }
        int n = this.tWl.size();
        for (int i = 0; i < n; ++i) {
            XulorParticleSystem xulorParticleSystem = this.tWl.get(i).gGD();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.q(axb_22.aIU() * axb_22.aIX(), axb_22.aIV() * axb_22.aIX(), axb_22.aIW() * axb_22.aIX(), axb_22.aIX());
        }
    }

    public boolean getManualInnerMove() {
        return this.tWi;
    }

    public void setManualInnerMove(boolean bl) {
        this.tWi = bl;
        this.gtA();
    }

    private void gtA() {
        fzo_0 fzo_02 = fzo_0.tHq;
        if (this.tWi) {
            fzo_02 = this.tWa && !this.tWb ? fzo_0.tHV : (this.tWb && !this.tWa ? fzo_0.tHW : fzo_0.tHO);
        }
        this.setCurrentCursorType(fzo_02);
    }

    public void setUseInnerMoveTween(boolean bl) {
        this.gtB();
        if (bl) {
            this.b(0.0f, 1.0f, 0.0f, 1.0f, 5000);
        }
    }

    public boolean getShrinkToImageWidth() {
        return this.tWb;
    }

    public void setShrinkToImageWidth(boolean bl) {
        this.tWb = bl;
        this.gtA();
    }

    public boolean getShrinkToImageHeight() {
        return this.tWa;
    }

    public void setShrinkToImageHeight(boolean bl) {
        this.tWa = bl;
        this.gtA();
    }

    public boolean getToggleInnerMoveOnClick() {
        return this.tWj;
    }

    public void setToggleInnerMoveOnClick(boolean bl) {
        this.tWj = bl;
    }

    @Override
    public void setPixmap(fze fze2) {
        this.tWk.clear();
        if (this.tVV != null) {
            this.tVV.clear();
        }
        this.tEC = fze2.getPixmap();
        this.tEC.a(this);
        fsv_1 fsv_12 = new fsv_1(this.tEC, 0, 0);
        this.tWk.add(fsv_12);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.tVV != null ? this.tVV.gxd() : null;
    }

    public int getDeltaX() {
        return this.dhZ;
    }

    public void setDeltaX(int n) {
        int n2 = -(this.tWg - this.uki.getContentWidth());
        boolean bl = false;
        int n3 = GC.a(n, n2, 0);
        if (n3 != this.dhZ) {
            this.dhZ = n3;
            this.tQh = true;
            this.setNeedsToPreProcess();
            if (this.tWq != null) {
                if (this.dhZ == n2) {
                    this.tWq.eg((byte)2);
                } else if (this.dhZ == 0) {
                    this.tWq.eg((byte)0);
                } else {
                    this.tWq.eg((byte)1);
                }
            }
        }
    }

    public int getDeltaY() {
        return this.dia;
    }

    public void setDeltaY(int n) {
        boolean bl = false;
        int n2 = this.tWh - this.uki.getContentHeight();
        int n3 = GC.a(n, 0, n2);
        if (n3 != this.dia) {
            this.dia = n3;
            this.tQh = true;
            this.setNeedsToPreProcess();
            if (this.tWq != null) {
                if (this.dia == 0) {
                    this.tWq.eh((byte)2);
                } else if (this.dia == n2) {
                    this.tWq.eh((byte)0);
                } else {
                    this.tWq.eh((byte)1);
                }
            }
        }
    }

    public String getParticlePath() {
        return this.tCu;
    }

    public void setParticlePath(String string) {
        this.tCu = string;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    public void setImagePath(String string) {
        aqs_2 aqs_22;
        URL uRL;
        if (string == null) {
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
        this.tWk.clear();
        if (this.tVV != null) {
            this.tVV.clear();
        }
        this.dhZ = 0;
        this.dia = 0;
        this.tWe = 0;
        this.tWf = 0;
        ArrayList<? extends apd_1> arrayList = aqs_22.bGT().getChildren();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            int n2;
            apd_1 apd_12 = arrayList.get(i);
            if (apd_12.getName().equals("#text") || apd_12.getName().equals("#comment")) continue;
            if (apd_12.getName().equalsIgnoreCase("parameters")) {
                apd_1 apd_13 = apd_12.fq("maxWidth");
                if (apd_13 != null) {
                    this.tWe = apd_13.bCo();
                }
                if ((apd_13 = apd_12.fq("maxHeight")) != null) {
                    this.tWf = apd_13.bCo();
                }
                if ((apd_13 = apd_12.fq("totalWidth")) != null) {
                    this.tWg = apd_13.bCo();
                }
                if ((apd_13 = apd_12.fq("totalHeight")) == null) continue;
                this.tWh = apd_13.bCo();
                continue;
            }
            if (apd_12.getName().equalsIgnoreCase("image")) {
                int n3 = 0;
                n2 = 0;
                awk_1 awk_12 = null;
                apd_1 apd_14 = apd_12.fq("x");
                if (apd_14 != null) {
                    n3 = apd_14.bCo();
                }
                if ((apd_14 = apd_12.fq("y")) != null) {
                    n2 = apd_14.bCo();
                }
                if ((apd_14 = apd_12.fq("texture")) != null) {
                    object4 = apd_14.bCt();
                    try {
                        object3 = bl_0.a(uRL, (String)object4);
                        object2 = ((URL)object3).toString();
                        awk_12 = this.tM((String)object2);
                    }
                    catch (Exception exception) {
                        uxJ.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
                    }
                }
                object4 = new fsv_1(new awg_1(awk_12), n3, n2);
                this.tWk.add((fsv_1)object4);
                continue;
            }
            if (!apd_12.getName().equalsIgnoreCase("text")) continue;
            int n4 = 0;
            n2 = 0;
            int n5 = 40;
            int n6 = 40;
            object4 = null;
            object3 = apd_12.fq("x");
            if (object3 != null) {
                n4 = object3.bCo();
            }
            if ((object3 = apd_12.fq("y")) != null) {
                n2 = object3.bCo();
            }
            if ((object3 = apd_12.fq("width")) != null) {
                n5 = object3.bCo();
            }
            if ((object3 = apd_12.fq("height")) != null) {
                n6 = object3.bCo();
            }
            if ((object3 = apd_12.fq("key")) != null) {
                object4 = object3.bCt();
            }
            object2 = null;
            if (this.tCu != null && (object2 = fmv_1.gEH().vW(this.tCu)) != null) {
                fmw_1.uJG.a((ParticleSystem)object2);
                ((ayy_2)object2).bGY();
                ((ParticleSystem)object2).aw(n4 + n5 / 2, n2 + n6 / 2);
                ((XulorParticleSystem)object2).b(this.tVV.gxh());
                object = this.tVV.gxd();
                if (object != null) {
                    ((ParticleSystem)object2).q(object.aIU() * object.aIX(), object.aIV() * object.aIX(), object.aIW() * object.aIX(), object.aIX());
                }
            }
            object = new fth_1((String)object4, n4, n2, n5, n6, (XulorParticleSystem)object2);
            this.tWl.add((fth_1)object);
        }
        this.tVZ = true;
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    private boolean gsR() {
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        if (this.tWa) {
            n2 = this.tWh;
        }
        if (this.tWb) {
            n = this.tWg;
        }
        if (this.uku == null || n != this.uku.width || n2 != this.uku.height) {
            this.setMinSize(new fsm_1(n, n2));
            bl = true;
        }
        return bl;
    }

    public void b(float f2, float f3, float f4, float f5, int n) {
        this.x(fbu_1.class);
        this.tWp = new fbu_1(this, f2, f3, f4, f5, this, 0, n, abn.cdr);
        this.tWp.acd(-1);
        this.a(this.tWp);
    }

    public void gtB() {
        this.x(fbu_1.class);
    }

    public void setTweenPaused(boolean bl) {
        if (this.tWp != null) {
            this.tWp.setPaused(bl);
        }
    }

    public boolean gtC() {
        return this.tWp != null;
    }

    private awk_1 tM(String string) {
        return awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false);
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.tWo = (fdy_1)this.getElementMap().uH(tVU);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tWp = null;
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.tNF = null;
        this.tNH = null;
        this.mTP = null;
        this.tND = null;
        this.tWq = null;
        if (this.tVV != null) {
            this.tVV.gxe();
            this.tVV = null;
        }
        if (this.tEC != null) {
            this.tEC.b(this);
            this.tEC = null;
        }
        this.tWk.clear();
        this.tCu = null;
        for (int i = this.tWl.size() - 1; i >= 0; --i) {
            XulorParticleSystem xulorParticleSystem = this.tWl.get(i).gGD();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.bsI();
        }
        this.tWl.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.setNonBlocking(false);
        this.setLayoutManager(null);
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        this.setNeedsToPreProcess();
        this.tVV = new ffu_1();
        this.tVV.gxf();
        this.gtD();
    }

    @Override
    public void eKI() {
        super.eKI();
        this.uko.setNeedsScissor(true);
    }

    @Override
    public void grg() {
        if (this.tVV != null) {
            this.tVV.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
        }
        if (this.tWn != null) {
            if (this.tWm != null) {
                this.tWn.setVisible(true);
                this.tWn.setSizeToPrefSize();
                int n = -faa_2.tLO.cf(this.tWm.getWidth(), this.tWn.getWidth()) + this.tWm.getX() + this.dhZ;
                int n2 = this.tWm.getY() + this.dia + this.tWm.getHeight();
                this.tWn.setPosition(n, n2);
            } else {
                this.tWn.setVisible(false);
            }
        }
        super.grg();
    }

    private void gtD() {
        this.tND = new fbo_1(this);
        this.a(fzq_0.tJS, this.tND, false);
        this.mTP = new fbp_1(this);
        fbj_1.getInstance().a(fzq_0.tJP, this.mTP, false);
        this.tNF = new fbq_2(this);
        this.a(fzq_0.tJO, this.tNF, false);
        this.tNH = new fbr_2(this);
        this.a(fzq_0.tJM, this.tNH, false);
        this.a(fzq_0.tJU, new fbs_2(this), false);
    }

    boolean isInside(fth_1 fth_12, int n, int n2) {
        return fth_12.getX() <= n && fth_12.getX() + fth_12.getWidth() >= n && fth_12.getY() <= n2 && fth_12.getY() + fth_12.getHeight() >= n2;
    }

    @Override
    public boolean LZ(int n) {
        int n2;
        int n3;
        boolean bl = super.LZ(n);
        boolean bl2 = false;
        boolean bl3 = this.gsR();
        if (this.tVY) {
            this.tWh = this.tWf = this.tEC.getHeight();
            this.tWg = this.tWe = this.tEC.getWidth();
            this.setDeltaX(this.dhZ);
            this.setDeltaY(this.dia);
            this.tVY = false;
            this.tQh = true;
            this.tVZ = true;
        }
        if (this.tVV != null && this.tQh) {
            this.tVV.abc(this.dhZ);
            this.tVV.abd(this.dia);
            this.tVV.abe(this.tWf);
            this.tVV.abf(this.tWe);
            this.tQh = false;
            bl2 = true;
        }
        if (this.tVV != null && this.tVZ) {
            this.tVV.clear();
            n3 = this.tWk.size();
            for (n2 = 0; n2 < n3; ++n2) {
                this.tVV.a(this.tWk.get(n2));
            }
            this.tVZ = false;
            bl2 = true;
        }
        n3 = this.tWl.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.tWl.get(n2).hj(this.dhZ, this.dia);
        }
        if (bl2) {
            try {
                if (this.uki != null) {
                    this.tVV.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("imageMesh = " + String.valueOf(this.tVV) + ", appearance = " + String.valueOf(this.uki)), (Throwable)nullPointerException);
            }
        }
        if (bl3) {
            this.gsm();
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        super.LY(n);
        this.tVV.gxh().bJk();
        int n2 = this.tWl.size();
        for (int i = 0; i < n2; ++i) {
            XulorParticleSystem xulorParticleSystem = this.tWl.get(i).gGD();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.b(this.tVV.gxh());
        }
        return true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fbn_2 fbn_22 = (fbn_2)fhi_22;
        super.a(fhi_22);
        fbn_22.b(fzq_0.tJP, this.mTP, false);
        fbn_22.b(fzq_0.tJO, this.tNF, false);
        fbn_22.b(fzq_0.tJM, this.tNH, false);
        fbn_22.b(fzq_0.tJS, this.tND, false);
        fbn_22.setModulationColor(fbn_22.getModulationColor());
        fbn_22.setManualInnerMove(this.tWi);
        fbn_22.setShrinkToImageWidth(this.tWb);
        fbn_22.setShrinkToImageHeight(this.tWa);
        fbn_22.setToggleInnerMoveOnClick(this.tWj);
    }

    @Override
    public void a(awg_1 awg_12) {
        this.tVY = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1415534255) {
            this.setShrinkToImageWidth(Bw.aK(string));
        } else if (n == 498894174) {
            this.setShrinkToImageHeight(Bw.aK(string));
        } else if (n == -1161348842) {
            this.setToggleInnerMoveOnClick(Bw.aK(string));
        } else if (n == 370229451) {
            this.setUseInnerMoveTween(Bw.aK(string));
        } else if (n == -1450345951) {
            this.setManualInnerMove(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1415534255) {
            this.setShrinkToImageWidth(Bw.l(object));
        } else if (n == 498894174) {
            this.setShrinkToImageHeight(Bw.l(object));
        } else if (n == tWr) {
            this.setModulationColor((axb_2)object);
        } else if (n == tWs) {
            this.setImagePath((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

