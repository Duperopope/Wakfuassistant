/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.io.IOException;

/*
 * Renamed from fAx
 */
public class fax_1
extends fes_2
implements fzc {
    public static final String TAG = "AnimatedElementViewer";
    private static final avc_2 tOs = new fay_2();
    private static final avc_2 tOt = new faz_1();
    protected ZG tOu;
    private String tDk;
    private String bdC;
    protected float aAx;
    protected float aAy;
    protected float azQ;
    private boolean bUQ;
    private int eqA;
    private Material bVn;
    private boolean tOv = true;
    private arf_2 cSx = arf_2.cUO;
    private arf_2 cSy = null;
    private ara_1 cSz = ara_1.cUz;
    private auw_2 tOw = auw_2.dfI;
    private auw_2 tOx = auw_2.dfM;
    private boolean cXf = false;
    protected boolean tOy;
    private boolean bWk;
    private boolean bVi = false;
    private boolean tOz;
    private boolean tOA = false;
    private boolean tCY = false;
    private boolean tCZ = false;
    private boolean bVZ;
    private boolean bUU = true;
    public static final int tOB = "animatedElement".hashCode();
    public static final int tOC = -962590849;
    public static final int tOD = -735662143;
    public static final int tOE = "equipment".hashCode();
    public static final int tOF = -795787204;
    public static final int tOG = -1548407259;
    public static final int tOH = -1548407258;
    public static final int tOI = 109250890;
    public static final int tOJ = 1594237441;
    public static final int tOK = -1122949950;
    public static final int tOL = -158227633;
    public static final int tOM = -1290304399;
    public static final int tON = 2129268483;
    public static final int tOO = -1884319283;
    public static final int tOP = 1657247819;

    @Override
    public fyk_0 getAppearance() {
        return (fyk_0)this.uki;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public final String getFilePath() {
        return this.tDk;
    }

    public final void setFilePath(String string) {
        if (string == null) {
            return;
        }
        this.tDk = string;
        String string2 = fyw_0.gqw().tCt;
        if (string2 == null) {
            return;
        }
        this.tOu.dP(fq_0.bJ(string));
        Object object = string.startsWith("jar:") || string.startsWith("file:") ? string : string2 + string;
        this.tJ((String)object);
    }

    private void tJ(String string) {
        try {
            this.tOu.k(string, false);
        }
        catch (IOException iOException) {
            uxJ.error((Object)"Unable to load anm file", (Throwable)iOException);
        }
        this.tOu.a(this.tOw, this.tOx);
    }

    public final String getAnimName() {
        return this.bdC;
    }

    public final void setAnimName(String string) {
        if (string != null) {
            this.bdC = string;
            this.bUQ = true;
        }
    }

    public ZC getAnimatedElement() {
        return this.tOu;
    }

    public void setAnimatedElement(ZC zC) {
        if (this.tOu == null) {
            return;
        }
        this.tOu.a(zC);
        if (this.tOv) {
            this.tOu.bpx();
        }
        this.tOy = true;
        this.cXf = true;
        this.bWk = true;
    }

    public boolean isForceReloadOnAnimNameChange() {
        return this.tOA;
    }

    public void setForceReloadOnAnimNameChange(boolean bl) {
        this.tOA = bl;
    }

    public void setFlipVertical(boolean bl) {
        this.tCZ = bl;
    }

    public void setFlipHorizontal(boolean bl) {
        this.tCY = bl;
    }

    public float getOffsetX() {
        return this.aAx;
    }

    public final void setOffsetX(float f2) {
        this.aAx = f2;
        this.tOy = true;
    }

    public final float getOffsetY() {
        return this.aAy;
    }

    public final void setOffsetY(float f2) {
        this.aAy = f2;
        this.tOy = true;
    }

    public float getScale() {
        return this.azQ;
    }

    public void setScale(float f2) {
        this.azQ = f2;
        this.tOy = true;
    }

    public int getDirection() {
        return this.eqA;
    }

    public void setDirection(int n) {
        this.eqA = n;
        this.bWk = true;
    }

    public final void setMaterial(Material material) {
        if (material == null) {
            return;
        }
        this.bVn.f(material);
        this.cXf = true;
    }

    public void setEquipment(aro_1 aro_12) {
        if (aro_12 == null) {
            return;
        }
        this.cSx = aro_12.bHy();
        this.cSy = aro_12.bHz();
        this.cSz = aro_12.bHA();
        this.bVi = true;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    public boolean isUseDefaultMaterial() {
        return this.tOv;
    }

    public void setUseDefaultMaterial(boolean bl) {
        this.tOv = bl;
    }

    public void setUseBlendPremult(boolean bl) {
        this.tOw = bl ? auw_2.dfI : auw_2.dfL;
        this.tOz = true;
    }

    private void setStopped(boolean bl) {
        this.bVZ = bl;
        this.setNeedsToPostProcess();
    }

    public void setCanPlaySound(boolean bl) {
        this.bUU = bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public final void aVH() {
        super.aVH();
        if (this.tOu != null) {
            this.tOu.bpI();
            this.tOu = null;
        }
        this.cSx = arf_2.cUO;
        this.cSz = ara_1.cUz;
        if (this.bVn != null) {
            this.bVn.bsI();
            this.bVn = null;
        }
    }

    @Override
    public final void aVI() {
        super.aVI();
        assert (this.tOu == null);
        this.tOu = new ZG(0L);
        this.tOu.by(false);
        this.tOy = true;
        fyk_0 fyk_02 = new fyk_0();
        fyk_02.aVI();
        fyk_02.setWidget(this);
        this.d(fyk_02);
        this.setNeedsToPostProcess();
        this.tOw = auw_2.dfI;
        this.tOx = auw_2.dfM;
        this.bVn = (Material)Material.daL.bSK();
        this.bVn.f(Material.daH);
        this.cXf = true;
        this.tOv = true;
        this.tOA = false;
        this.tCY = false;
        this.tCZ = false;
        this.bVZ = false;
        this.bUU = true;
    }

    @Override
    public boolean LY(int n) {
        super.LY(n);
        if (!this.bmg) {
            return true;
        }
        this.gst();
        if (this.bUQ) {
            this.tOu.dT(this.bdC);
            if (this.tOA) {
                this.tOu.bpC();
            }
            this.bUQ = false;
        }
        if (this.bWk) {
            this.tOu.a(abi_1.wG(this.eqA));
            this.bWk = false;
        }
        if (this.bVi) {
            aro_1 aro_12 = this.tOu.bqd();
            aro_12.a(this.cSx, this.cSy);
            aro_12.a(this.cSz);
            this.tOu.bpy();
            this.bVi = false;
        }
        if (this.cXf) {
            this.tOu.a(this.bVn);
            this.cXf = false;
        }
        if (this.tOz) {
            this.tOu.a(this.tOw, this.tOx);
            this.tOz = false;
        }
        if (this.tOu.bpO() != this.bVZ) {
            this.tOu.setStopped(this.bVZ);
        }
        if (this.tOu.bpD() != this.bUU) {
            this.tOu.setCanPlaySound(this.bUU);
        }
        this.tOu.b((afV)null, n);
        return true;
    }

    @Override
    public final void a(fhi_2 fhi_22) {
        fax_1 fax_12 = (fax_1)fhi_22;
        super.a(fax_12);
        fax_12.setFilePath(this.tDk);
        fax_12.setOffsetX(this.aAx);
        fax_12.setOffsetY(this.aAy);
        fax_12.setScale(this.azQ);
        fax_12.setDirection(this.eqA);
        fax_12.setMaterial(this.bVn);
        fax_12.setAnimName(this.bdC);
        fax_12.setAnimatedElement(this.tOu);
        fax_12.setForceReloadOnAnimNameChange(this.tOA);
        fax_12.setFlipHorizontal(this.tCY);
        fax_12.setFlipVertical(this.tCZ);
        fax_12.setStopped(this.bVZ);
        fax_12.setCanPlaySound(this.bUU);
        fax_12.tOv = this.tOv;
        fax_12.setNeedsToPostProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -735662143) {
            this.setFilePath(string);
        } else if (n == -795787204) {
            this.setAnimName(string);
        } else if (n == -962590849) {
            this.setDirection(Bw.m(string));
        } else if (n == -1548407259) {
            this.setOffsetX(Bw.o(string));
        } else if (n == -1548407258) {
            this.setOffsetY(Bw.o(string));
        } else if (n == 109250890) {
            this.setScale(Bw.o(string));
        } else if (n == 1594237441) {
            this.setUseDefaultMaterial(Bw.aK(string));
        } else if (n == -1122949950) {
            this.setUseDefaultMaterial(Bw.aK(string));
        } else if (n == -158227633) {
            this.setForceReloadOnAnimNameChange(Bw.aK(string));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Bw.aK(string));
        } else if (n == 2129268483) {
            this.setFlipVertical(Bw.aK(string));
        } else if (n == -1884319283) {
            this.setStopped(Bw.aK(string));
        } else if (n == 1657247819) {
            this.setCanPlaySound(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tOB) {
            this.setAnimatedElement((ZC)object);
        } else if (n == -735662143) {
            this.setFilePath((String)object);
        } else if (n == -795787204) {
            this.setAnimName((String)object);
        } else if (n == -962590849) {
            this.setDirection(Bw.m(object));
        } else if (n == -1548407259) {
            this.setOffsetX(Bw.o(object));
        } else if (n == -1548407258) {
            this.setOffsetY(Bw.o(object));
        } else if (n == 109250890) {
            this.setScale(Bw.o(object));
        } else if (n == tOE) {
            this.setEquipment((aro_1)object);
        } else if (n == 1594237441) {
            this.setUseDefaultMaterial(Bw.l(object));
        } else if (n == -158227633) {
            this.setForceReloadOnAnimNameChange(Bw.l(object));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Bw.l(object));
        } else if (n == 2129268483) {
            this.setFlipVertical(Bw.l(object));
        } else if (n == -1884319283) {
            this.setStopped(Bw.l(object));
        } else if (n == 1657247819) {
            this.setCanPlaySound(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        Entity entity = this.tOu.bpq();
        this.bVe.g(entity);
        entity.a(tOs);
        entity.b(tOt);
    }

    protected void gst() {
        Entity entity = this.tOu.bpq();
        awp_1 awp_12 = (awp_1)entity.bIS().uW(0);
        awp_12.A((float)this.ukt.getWidth() / 2.0f + this.aAx, (float)this.ukt.getHeight() / 2.0f + this.aAy, 0.0f);
        float f2 = 1.0f;
        if (this.tOu.bqd() != null) {
            f2 = this.tOu.bqd().getScale();
        }
        awp_12.B(this.azQ / f2 * (this.tCY ? -1.0f : 1.0f), this.azQ / f2 * (this.tCZ ? -1.0f : 1.0f), 0.0f);
        entity.bIS().bPv();
        this.tOy = false;
        if (this.bVn != null && this.cXf) {
            this.tOu.a(this.bVn);
            this.tOu.bpr().c(this.tOu.bpt());
            this.cXf = false;
        }
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tOu == null || axb_22 == null) {
            return;
        }
        Entity3D entity3D = this.tOu.bpr();
        if (entity3D == null) {
            return;
        }
        float[] fArray = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArray2 = new float[]{axb_22.aIU() * axb_22.aIX(), axb_22.aIV() * axb_22.aIX(), axb_22.aIW() * axb_22.aIX(), axb_22.aIX()};
        this.bVn.N(fArray2);
        this.bVn.S(fArray);
        this.tOu.a(this.bVn);
        entity3D.c(this.tOu.bpt());
    }

    @Override
    public axb_2 getModulationColor() {
        float[] fArray = this.tOu.bpt().bKT();
        return new awx_2(fArray[0], fArray[1], fArray[2], fArray[3]);
    }
}

