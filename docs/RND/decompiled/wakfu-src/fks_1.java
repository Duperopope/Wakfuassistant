/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fKS
 */
public class fks_1
extends fkv_2
implements fzd {
    private static final Logger uHG = Logger.getLogger(fks_1.class);
    public static final String TAG = "TiledPixmapBackground";
    private flo_1 uHH = new flo_1();
    private boolean kuf = true;
    private boolean tMi = true;
    private static final ObjectPool uHI = new ayv_2(new fkt_1());
    public static final int uHJ = -1156593849;
    public static final int uHK = -1984141450;
    public static final int uHL = 1387629604;

    public static fks_1 checkOut() {
        fks_1 fks_12;
        try {
            fks_12 = (fks_1)uHI.borrowObject();
            fks_12.uth = uHI;
        }
        catch (Exception exception) {
            uHG.error((Object)"Probl\u00e8me au borrowObject.");
            fks_12 = new fks_1();
            fks_12.aVI();
        }
        return fks_12;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public void gvr() {
        super.gvr();
        if (this.uki == null) {
            uHG.warn((Object)"Appearance null !?");
            return;
        }
        fes_2 fes_22 = this.uki.getWidget();
        if (fes_22 == null) {
            uHG.warn((Object)"Widget null !?");
            return;
        }
        faw_2 faw_22 = fes_22.getContainer();
        if (faw_22 != null) {
            faw_22.setNeedsScissor(true);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.uHH.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHH.getModulationColor();
    }

    @Override
    public void setPixmap(fze fze2) {
        this.uHH.setPixmap(fze2.getPixmap());
    }

    @Override
    public flo_1 getMesh() {
        return this.uHH;
    }

    @Override
    public Entity getEntity() {
        return this.uHH.getEntity();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHH.aVH();
        this.uHH = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHH = new flo_1();
        this.uHH.aVI();
        fhv_1 fhv_12 = this.getParent();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fks_1 fks_12 = (fks_1)fhi_22;
        fks_12.setScaled(this.isScaled());
        fks_12.setModulationColor(this.getModulationColor());
        fks_12.setHorizontal(this.tMi);
        fks_12.setVertical(this.kuf);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == -1984141450) {
            this.setVertical(Bw.aK(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1156593849) {
            return super.setPropertyAttribute(n, object);
        }
        this.setModulationColor((axb_2)object);
        return true;
    }

    public void setVertical(boolean bl) {
        if (this.uHH != null) {
            this.uHH.setVertical(bl);
        }
        this.kuf = bl;
    }

    public void setHorizontal(boolean bl) {
        if (this.uHH != null) {
            this.uHH.setHorizontal(bl);
        }
        this.tMi = bl;
    }
}

