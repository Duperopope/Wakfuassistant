/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fKA
 */
public class fka_1
extends fko_1
implements fzc {
    public static final String TAG = "Particle";
    private int bap;
    private int baq;
    private faa_2 tMA;
    @Nullable
    private Point uGA;
    private boolean uGB = false;
    private XulorParticleSystem uGC;
    private EntityGroup bVe;
    private fmx_1 uGD;
    private final acr_1 uGE = new acr_1(0.0f, 0.0f, 0.0f);
    private boolean uGF = false;
    private float aPW = 200.0f;
    private int uGG;
    private boolean uGH = true;
    private acr_1 uGI;
    private String aCH;
    private int eoY;
    private float aXn;
    private axb_2 ncL;
    private boolean uGJ;
    private int uGK;
    private int uGL;
    private boolean uGM = false;
    @Nullable
    private fkc_1 uGN;
    public static final int uGO = 1767875043;
    public static final int uGP = 3143036;
    public static final int uGQ = 944051414;
    public static final int uGR = 102865796;
    public static final int uGS = 636283137;
    public static final int uGT = 109641799;
    public static final int uGU = 816164660;
    public static final int uGV = 1355892107;
    public static final int uGW = 120;
    public static final int uGX = 121;
    public static final int uGY = 3744723;
    public static final int uGZ = -41994714;
    public static final int uHa = -1981236101;

    @Override
    public final fkx_2 getMesh() {
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public final Entity getEntity() {
        return null;
    }

    public final void setFile(String string) {
        this.aCH = string;
        this.setNeedsToPreProcess();
    }

    public final void setLevel(int n) {
        this.eoY = n;
        if (this.aCH != null) {
            this.setNeedsToPreProcess();
        }
    }

    private void gDf() {
        if (this.uGC != null) {
            if (this.ncL != null) {
                this.uGC.q(this.ncL.aIU() * this.ncL.aIX(), this.ncL.aIV() * this.ncL.aIX(), this.ncL.aIW() * this.ncL.aIX(), this.ncL.aIX());
            } else {
                this.uGC.q(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.ncL = axb_22;
        this.gDf();
    }

    @Override
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public final void setX(int n) {
        this.bap = n;
        this.uGE.dk(this.bap);
    }

    public final void setY(int n) {
        this.baq = n;
        this.uGE.dl(this.baq);
    }

    public final void setAlignment(faa_2 faa_22) {
        this.tMA = faa_22;
    }

    public void setFixedPosition(@Nullable Point point) {
        this.uGA = point;
    }

    public final void setUseParentScissor(boolean bl) {
        this.uGB = bl;
        this.uGD.pj(this.uGB);
    }

    public void setFollowBorders(boolean bl) {
        this.uGF = bl;
    }

    public float getZoom() {
        return this.aXn;
    }

    public void setZoom(float f2) {
        this.aXn = f2;
        awp_1 awp_12 = (awp_1)this.bVe.bIS().uW(0);
        awp_12.B(this.aXn, this.aXn, this.aXn);
        this.bVe.bIS().bPv();
    }

    public void setSpeed(float f2) {
        this.aPW = f2;
    }

    public void setMoveClockWise(boolean bl) {
        this.uGH = bl;
    }

    public void setTimeToLive(int n) {
        if (this.uGG == n) {
            return;
        }
        this.uGG = n;
        if (this.uGC != null) {
            this.uGC.setDuration(n);
        }
    }

    public void setParticleSystem(XulorParticleSystem xulorParticleSystem) {
        if (this.uGC != null) {
            this.uGC.bsI();
        }
        this.uGC = xulorParticleSystem;
        if (this.uGC != null) {
            this.uGC.bGY();
            if (this.uGG > 0) {
                this.uGC.setDuration(this.uGG);
            }
            this.uGC.setApply3DTo2DProjection(this.uGM);
        }
        this.gDf();
    }

    public void setApply3DTo2DProjection(boolean bl) {
        this.uGM = bl;
        if (this.uGC != null) {
            this.uGC.setApply3DTo2DProjection(this.uGM);
        }
    }

    public void bLH() {
        this.uGC.bLH();
    }

    @Override
    public final boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.uGC != null) {
            if (this.uGC.bnq()) {
                this.uGC.bLH();
            }
            this.uGC.bsI();
            this.uGC = null;
            this.bVe.bJk();
        }
        this.gDg();
        this.gDf();
        return bl;
    }

    @Override
    public final boolean LY(int n) {
        EntityGroup entityGroup;
        super.LY(n);
        this.bVe.bJk();
        this.abV(n);
        if (this.uGC != null && this.uGC.bSW() < 0) {
            this.gAD();
            return false;
        }
        if (this.uGC != null) {
            this.uGC.b(this.bVe);
        }
        if (this.bVe.bIR() == null && (entityGroup = this.getParentEntity()) != null) {
            entityGroup.h(this.bVe);
            entityGroup.g(this.bVe);
        }
        if (this.uGC != null && this.uGC.bSW() < 0) {
            this.gAD();
            return false;
        }
        return true;
    }

    @Override
    public final void b(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fka_1 fka_12 = (fka_1)fhi_22;
        fka_12.setFile(this.aCH);
        fka_12.setAlignment(this.tMA);
        fka_12.setFixedPosition(this.uGA);
        fka_12.setFollowBorders(this.uGF);
        fka_12.setLevel(this.eoY);
        fka_12.setMoveClockWise(this.uGH);
        fka_12.setSpeed(this.aPW);
        fka_12.setTimeToLive(this.uGG);
        fka_12.setUseParentScissor(this.uGB);
        fka_12.setX(this.bap);
        fka_12.setY(this.baq);
        fka_12.setParticleSystem(this.uGC);
        fka_12.setTurnNumber(this.uGK);
        fka_12.setZoom(this.aXn);
        fka_12.setApply3DTo2DProjection(this.uGM);
    }

    @Override
    public void aVI() {
        assert (this.bVe == null);
        super.aVI();
        this.uGK = -1;
        this.uGL = 0;
        this.uGJ = false;
        this.uGG = -1;
        this.eoY = 1;
        this.setNeedsToPostProcess();
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.uGD = new fmx_1();
        this.bVe.a(this.uGD);
        this.bVe.a(this.uGD);
        this.bVe.bIS().a(new awp_1());
        this.uGD.pj(this.uGB);
        this.uGI = this.uGH ? new acr_1(1.0f, 0.0f, 0.0f) : new acr_1(-1.0f, 0.0f, 0.0f);
        this.aXn = 1.0f;
        this.uGM = false;
    }

    @Override
    public void aVH() {
        EntityGroup entityGroup;
        super.aVH();
        this.aCH = null;
        if (this.uGC != null && this.uGC.bnq()) {
            this.uGC.bLH();
            this.uGC.bsI();
            this.uGC = null;
        }
        if ((entityGroup = this.getParentEntity()) != null) {
            entityGroup.h(this.bVe);
        }
        if (this.bVe != null) {
            this.bVe.bJk();
            this.bVe.bsI();
        }
        this.bVe = null;
        this.uGN = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1767875043) {
            this.setAlignment(faa_2.tI(string));
        } else if (n == 3143036) {
            this.setFile(fic_12.a(string, this.nQt));
        } else if (n == 944051414) {
            this.setFollowBorders(Bw.aK(string));
        } else if (n == 102865796) {
            this.setLevel(Bw.m(string));
        } else if (n == 636283137) {
            this.setMoveClockWise(Bw.aK(string));
        } else if (n == 109641799) {
            this.setSpeed(Bw.o(string));
        } else if (n == 816164660) {
            this.setTimeToLive(Bw.m(string));
        } else if (n == 1355892107) {
            this.setUseParentScissor(Bw.aK(string));
        } else if (n == 120) {
            this.setX(Bw.m(string));
        } else if (n == 121) {
            this.setY(Bw.m(string));
        } else if (n == 3744723) {
            this.setZoom(Bw.o(string));
        } else if (n == -41994714) {
            this.setTurnNumber(Bw.m(string));
        } else if (n == -1981236101) {
            this.setApply3DTo2DProjection(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1767875043) {
            this.setAlignment((faa_2)((Object)object));
        } else if (n == 3143036) {
            this.setFile((String)object);
        } else if (n == 944051414) {
            this.setFollowBorders(Bw.l(object));
        } else if (n == 102865796) {
            this.setLevel(Bw.m(object));
        } else if (n == 636283137) {
            this.setMoveClockWise(Bw.l(object));
        } else if (n == 109641799) {
            this.setSpeed(Bw.o(object));
        } else if (n == 816164660) {
            this.setTimeToLive(Bw.m(object));
        } else if (n == 1355892107) {
            this.setUseParentScissor(Bw.l(object));
        } else if (n == 120) {
            this.setX(Bw.m(object));
        } else if (n == 121) {
            this.setY(Bw.m(object));
        } else if (n == 3744723) {
            this.setZoom(Bw.o(object));
        } else if (n == -41994714) {
            this.setTurnNumber(Bw.m(object));
        } else if (n == -1981236101) {
            this.setApply3DTo2DProjection(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    private void gDg() {
        assert (this.uGC == null) : "Particle system is already initialized";
        if (this.aCH == null) {
            return;
        }
        String string = fyw_0.gqw().tCu + this.aCH;
        this.uGC = fmv_1.gEH().C(string, this.eoY);
        if (this.uGC != null) {
            if (this.uGG > 0) {
                this.uGC.setDuration(this.uGG);
            }
            this.uGC.setApply3DTo2DProjection(this.uGM);
            fmw_1.uJG.a(this.uGC);
        }
    }

    private void abV(int n) {
        fes_2 fes_22 = this.getParentOfType(fes_2.class);
        if (fes_22 == null) {
            return;
        }
        fsm_1 fsm_12 = fes_22.getSize();
        Optional<acb_1> optional = this.getPositionFromSupplier();
        if (optional.isPresent()) {
            this.uGE.m(optional.get().aPY, optional.get().aPZ, 0.0f);
        } else if (this.uGF) {
            if (!this.uGJ) {
                this.uGE.m((float)(this.bap + this.tMA.uS(fsm_12.width)) / this.aXn, (float)(this.baq + this.tMA.uT(fsm_12.height)) / this.aXn, 0.0f);
                this.uGJ = true;
            }
            this.aw(n, fsm_12.width, fsm_12.height);
        } else if (this.tMA != null) {
            this.uGE.m((float)(this.bap + this.tMA.uS(fsm_12.width)) / this.aXn, (float)(this.baq + this.tMA.uT(fsm_12.height)) / this.aXn, 0.0f);
        } else if (this.uGA != null) {
            this.uGE.m(this.uGA.x, this.uGA.y, 0.0f);
        }
        if (this.uGC != null) {
            this.uGC.aw(this.uGE.bVA(), this.uGE.bVB());
        }
    }

    private Optional<acb_1> getPositionFromSupplier() {
        if (this.uGN == null) {
            return Optional.empty();
        }
        return this.uGN.gwp();
    }

    private void aw(int n, int n2, int n3) {
        this.uGE.a(this.aPW * (float)n / 1000.0f, this.uGI);
        if (this.uGE.bVA() > (float)n2) {
            this.uGE.dk(n2);
            if (this.uGE.bVB() == 0.0f) {
                this.uGI.m(0.0f, 1.0f, 0.0f);
                this.a(faa_2.tLS, false);
            } else {
                this.uGI.m(0.0f, -1.0f, 0.0f);
                this.a(faa_2.tLM, true);
            }
        } else if (this.uGE.bVA() < 0.0f) {
            this.uGE.dk(0.0f);
            if (this.uGE.bVB() == 0.0f) {
                this.uGI.m(0.0f, 1.0f, 0.0f);
                this.a(faa_2.tLQ, true);
            } else {
                this.uGI.m(0.0f, -1.0f, 0.0f);
                this.a(faa_2.tLK, false);
            }
        }
        if (this.uGE.bVB() > (float)n3) {
            this.uGE.dl(n3);
            if (this.uGE.bVA() == 0.0f) {
                this.uGI.m(1.0f, 0.0f, 0.0f);
                this.a(faa_2.tLK, true);
            } else {
                this.uGI.m(-1.0f, 0.0f, 0.0f);
                this.a(faa_2.tLM, false);
            }
        } else if (this.uGE.bVB() < 0.0f) {
            this.uGE.dl(0.0f);
            if (this.uGE.bVA() == 0.0f) {
                this.uGI.m(1.0f, 0.0f, 0.0f);
                this.a(faa_2.tLQ, false);
            } else {
                this.uGI.m(-1.0f, 0.0f, 0.0f);
                this.a(faa_2.tLS, true);
            }
        }
    }

    private void a(faa_2 faa_22, boolean bl) {
        if (this.uGK < 0) {
            return;
        }
        if (bl != this.uGH) {
            return;
        }
        if (faa_22 != this.tMA) {
            return;
        }
        ++this.uGL;
        if (this.uGL >= this.uGK) {
            this.uGC.bLH();
        }
    }

    public acr_1 getPosition() {
        return this.uGE;
    }

    private EntityGroup getParentEntity() {
        fes_2 fes_22 = this.getParentOfType(fes_2.class);
        return fes_22 == null ? null : fes_22.getEntity();
    }

    public void setTurnNumber(int n) {
        this.uGK = n;
    }

    public void setPositionSupplier(@Nullable fkc_1 fkc_12) {
        this.uGN = fkc_12;
    }
}

