/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fRu
 */
public class fru_1
extends frr_1
implements ayz_2 {
    private static final Logger uZF = Logger.getLogger(fru_1.class);
    public static final String TAG = "borderLayoutData";
    public static final String uZG = "bld";
    private fzt_0 uZH = null;
    private static final ObjectPool uZI = new ayv_2(new frv_2());
    public static final int uZJ = 3076010;

    public static fru_1 checkOut() {
        fru_1 fru_12;
        try {
            fru_12 = (fru_1)uZI.borrowObject();
            fru_12.uth = uZI;
        }
        catch (Exception exception) {
            uZF.error((Object)"Probl\u00e8me au borrowObject.");
            fru_12 = new fru_1();
            fru_12.aVI();
        }
        return fru_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fzt_0 getData() {
        return this.uZH;
    }

    public void setData(fzt_0 fzt_02) {
        this.uZH = fzt_02;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fru_1 fru_12 = (fru_1)fhi_22;
        super.a(fru_12);
        fru_12.uZH = this.uZH;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uZH = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 3076010) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setData(fzt_0.tB(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

