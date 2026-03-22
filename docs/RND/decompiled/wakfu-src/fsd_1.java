/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fSd
 */
public class fsd_1
extends fha_2 {
    private static Logger oO = Logger.getLogger(fsd_1.class);
    public static final String TAG = "Item";
    private String dFo = null;
    private String vcM = null;
    private int vcN = 0;
    private fjj_2 vcO = null;
    public static final int vcP = 13085340;
    public static final int vcQ = 97427706;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fjj_2) {
            this.vcO = (fjj_2)((Object)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getField() {
        return this.dFo;
    }

    public void setField(String string) {
        this.dFo = string;
    }

    public int getAttributeHash() {
        return this.vcN;
    }

    public String getAttribute() {
        return this.vcM;
    }

    public void setAttribute(String string) {
        this.vcM = string;
        this.vcN = this.vcM != null ? this.vcM.hashCode() : 0;
    }

    public fjj_2 getResultProvider() {
        return this.vcO;
    }

    public void setCondition(fjj_2 fjj_22) {
        this.vcO = fjj_22;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.dFo = null;
        this.vcM = null;
        this.vcO = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.vcN = 0;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fsd_1 fsd_12 = (fsd_1)fhi_22;
        super.a(fsd_12);
        fsd_12.vcM = this.vcM;
        fsd_12.vcN = this.vcN;
        fsd_12.dFo = this.dFo;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 13085340) {
            this.setAttribute(fic_12.a(string, this.nQt));
        } else if (n == 97427706) {
            this.setField(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 13085340) {
            this.setAttribute(String.valueOf(object));
        } else if (n == 97427706) {
            this.setField(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

