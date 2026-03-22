/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fKJ
 */
public class fkj_1
extends fkz_2
implements fzd {
    private static final Logger uHt = Logger.getLogger(fkj_1.class);
    private flh_1 uHu;
    public static final String TAG = "pixmapBorder16";
    public static final int uHv = -1156593849;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.uHu.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHu != null ? this.uHu.getModulationColor() : null;
    }

    @Override
    public void setPixmap(fze fze2) {
        this.uHu.a(fze2.getPixmap(), fze2.getPosition());
        this.dGB = true;
        if (this.uHu.gDo()) {
            this.uHu.a(this.cxn);
            fys_0 fys_02 = this.getParentOfType(fys_0.class);
            if (fys_02 != null) {
                fys_02.setBorder(this.cxn);
            }
        }
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110, awg_1 awg_111, awg_1 awg_112, awg_1 awg_113, awg_1 awg_114, awg_1 awg_115, awg_1 awg_116, awg_1 awg_117) {
        this.uHu.setPixmaps(awg_12, awg_13, awg_14, awg_15, awg_16, awg_17, awg_18, awg_19, awg_110, awg_111, awg_112, awg_113, awg_114, awg_115, awg_116, awg_117);
        this.dGB = true;
        if (this.uHu.gDo()) {
            this.uHu.a(this.cxn);
            fys_0 fys_02 = this.getParentOfType(fys_0.class);
            fys_02.setBorder(this.cxn);
        }
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        if (awg_1Array.length == 16) {
            this.uHu.setPixmaps(awg_1Array);
        } else {
            uHt.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        this.dGB = true;
        if (this.uHu.gDo()) {
            this.uHu.a(this.cxn);
            fys_0 fys_02 = this.getParentOfType(fys_0.class);
            fys_02.setBorder(this.cxn);
        }
    }

    @Override
    public flh_1 getMesh() {
        return this.uHu;
    }

    @Override
    public Entity getEntity() {
        return this.uHu.getEntity();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHu = new flh_1();
        this.uHu.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHu.aVH();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -1156593849) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setModulationColor(fic_12.vm(string));
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
}

