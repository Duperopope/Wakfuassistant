/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fKG
 */
public class fkg_1
extends fkv_2 {
    private static final Logger uHm = Logger.getLogger(fkg_1.class);
    private flf_1 uHn;
    public static final int uHo = -1156593849;

    public void setModulationColor(axb_2 axb_22) {
        this.uHn.setModulationColor(axb_22);
    }

    public axb_2 getModulationColor() {
        return this.uHn.getModulationColor();
    }

    @Override
    public void setScaled(boolean bl) {
        super.setScaled(bl);
        this.uHn.setScaled(bl);
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110, awg_1 awg_111, awg_1 awg_112, awg_1 awg_113, awg_1 awg_114, awg_1 awg_115, awg_1 awg_116, awg_1 awg_117, awg_1 awg_118) {
        this.uHn.setPixmaps(awg_12, awg_13, awg_14, awg_15, awg_16, awg_17, awg_18, awg_19, awg_110, awg_111, awg_112, awg_113, awg_114, awg_115, awg_116, awg_117, awg_118);
        if (awg_12 == null || awg_13 == null || awg_14 == null || awg_15 == null || awg_16 == null || awg_17 == null || awg_18 == null || awg_19 == null || awg_110 == null || awg_111 == null || awg_112 == null || awg_113 == null || awg_114 == null || awg_115 == null || awg_116 == null || awg_117 == null || awg_118 == null) {
            uHm.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        if (awg_1Array.length == 17) {
            this.uHn.setPixmaps(awg_1Array);
        } else {
            uHm.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        if (awg_1Array[0] == null || awg_1Array[1] == null || awg_1Array[2] == null || awg_1Array[3] == null || awg_1Array[4] == null || awg_1Array[5] == null || awg_1Array[6] == null || awg_1Array[7] == null || awg_1Array[8] == null) {
            uHm.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(awg_1 awg_12) {
        this.uHn.setPixmaps(awg_12);
        if (awg_12 == null) {
            uHm.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    @Override
    public flf_1 getMesh() {
        return this.uHn;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkd_1 fkd_12 = (fkd_1)fhi_22;
        fkd_12.setScaled(this.isScaled());
        fkd_12.setModulationColor(this.getModulationColor());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHn = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHn = new flf_1();
        this.uHn.aVI();
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

