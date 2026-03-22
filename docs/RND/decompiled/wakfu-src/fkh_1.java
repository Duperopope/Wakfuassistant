/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fKH
 */
public class fkh_1
extends fkz_2
implements fzd {
    private static final Logger uHp = Logger.getLogger(fkh_1.class);
    public static final String TAG = "PixmapBorder";
    private flj_1 uHq;
    public static final int uHr = -1156593849;

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
    public void setPixmap(fze fze2) {
        fys_0 fys_02;
        switch (fze2.getPosition()) {
            case tKY: {
                this.uHq.i(fze2.getPixmap());
                break;
            }
            case tLa: {
                this.uHq.g(fze2.getPixmap());
                break;
            }
            case tLc: {
                this.uHq.h(fze2.getPixmap());
                break;
            }
            case tLf: {
                this.uHq.m(fze2.getPixmap());
                break;
            }
            case tLh: {
                this.uHq.f(fze2.getPixmap());
                break;
            }
            case tLk: {
                this.uHq.l(fze2.getPixmap());
                break;
            }
            case tLm: {
                this.uHq.j(fze2.getPixmap());
                break;
            }
            case tLo: {
                this.uHq.k(fze2.getPixmap());
            }
        }
        if (this.uHq.gwN() && (fys_02 = this.getParentOfType(fys_0.class)) != null) {
            this.uHq.a(this.cxn);
            fys_02.setBorder(this.cxn);
        }
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19) {
        this.uHq.setPixmaps(awg_12, awg_13, awg_14, awg_15, awg_16, awg_17, awg_18, awg_19);
        if (this.uHq.gwN()) {
            this.uHq.a(this.cxn);
            fys_0 fys_02 = this.getParentOfType(fys_0.class);
            fys_02.setBorder(this.cxn);
        }
    }

    @Override
    public flj_1 getMesh() {
        return this.uHq;
    }

    @Override
    public Entity getEntity() {
        return this.uHq.getEntity();
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.uHq.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHq.getModulationColor();
    }

    @Override
    public boolean isValidAdd(fhi_2 fhi_22) {
        if (fhi_22 instanceof fze && ((fze)fhi_22).getPosition() == null) {
            uHp.error((Object)"Tentative d'ajout d'une Pixmap sans position");
            return false;
        }
        return super.isValidAdd(fhi_22);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkh_1 fkh_12 = (fkh_1)fhi_22;
        fkh_12.setModulationColor(this.getModulationColor());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHq.aVH();
        this.uHq = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHq = new flj_1();
        this.uHq.aVI();
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

