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
 * Renamed from fKD
 */
public class fkd_1
extends fkv_2
implements fzd {
    private static final Logger uHg = Logger.getLogger(fkd_1.class);
    public static final String TAG = "PixmapBackground";
    private flg_1 uHh = new flg_1();
    private static final ObjectPool uHi = new ayv_2(new fke_1());
    public static final int uHj = -1156593849;
    public static final int uHk = -436781190;

    public static fkd_1 checkOut() {
        fkd_1 fkd_12;
        try {
            fkd_12 = (fkd_1)uHi.borrowObject();
            fkd_12.uth = uHi;
        }
        catch (Exception exception) {
            uHg.error((Object)"Probl\u00e8me au borrowObject.");
            fkd_12 = new fkd_1();
            fkd_12.aVI();
        }
        return fkd_12;
    }

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
        this.uHh.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHh.getModulationColor();
    }

    public boolean isRepeated() {
        return this.uHh.isRepeated();
    }

    public void setRepeated(boolean bl) {
        this.uHh.setRepeated(bl);
    }

    @Override
    public void setPixmap(fze fze2) {
        switch (fze2.getPosition()) {
            case tKY: {
                this.uHh.i(fze2.getPixmap());
                break;
            }
            case tLa: {
                this.uHh.g(fze2.getPixmap());
                break;
            }
            case tLc: {
                this.uHh.h(fze2.getPixmap());
                break;
            }
            case tLf: {
                this.uHh.m(fze2.getPixmap());
                break;
            }
            case tLg: {
                this.uHh.n(fze2.getPixmap());
                break;
            }
            case tLh: {
                this.uHh.f(fze2.getPixmap());
                break;
            }
            case tLk: {
                this.uHh.l(fze2.getPixmap());
                break;
            }
            case tLm: {
                this.uHh.j(fze2.getPixmap());
                break;
            }
            case tLo: {
                this.uHh.k(fze2.getPixmap());
            }
        }
    }

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110) {
        this.uHh.setPixmaps(awg_12, awg_13, awg_14, awg_15, awg_16, awg_17, awg_18, awg_19, awg_110);
        if (awg_12 == null || awg_13 == null || awg_14 == null || awg_15 == null || awg_16 == null || awg_17 == null || awg_18 == null || awg_19 == null || awg_110 == null) {
            uHg.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(awg_1[] awg_1Array) {
        if (awg_1Array.length == 9) {
            this.uHh.setPixmaps(awg_1Array);
        } else {
            uHg.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        if (awg_1Array[0] == null || awg_1Array[1] == null || awg_1Array[2] == null || awg_1Array[3] == null || awg_1Array[4] == null || awg_1Array[5] == null || awg_1Array[6] == null || awg_1Array[7] == null || awg_1Array[8] == null) {
            uHg.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(awg_1 awg_12) {
        this.uHh.setPixmaps(awg_12);
        if (awg_12 == null) {
            uHg.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    @Override
    public flg_1 getMesh() {
        return this.uHh;
    }

    @Override
    public Entity getEntity() {
        return this.uHh.getEntity();
    }

    @Override
    public void setScaled(boolean bl) {
        super.setScaled(bl);
        this.uHh.setScaled(bl);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHh.aVH();
        this.uHh = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHh = new flg_1();
        this.uHh.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkd_1 fkd_12 = (fkd_1)fhi_22;
        fkd_12.setScaled(this.isScaled());
        fkd_12.setModulationColor(this.getModulationColor());
        fkd_12.setRepeated(this.isRepeated());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == -436781190) {
            this.setRepeated(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == -436781190) {
            this.setRepeated(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

