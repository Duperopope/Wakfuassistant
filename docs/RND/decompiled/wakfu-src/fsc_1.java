/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fSc
 */
public class fsc_1 {
    private static Logger oO = Logger.getLogger(fsc_1.class);
    private Object aGT;
    private fsf_1 vcL;

    private fsc_1(Object object) {
        this.aGT = object;
    }

    public static fsc_1 a(Object object, String string, fhs_2 fhs_22, fcv_1 fcv_12) {
        if (object instanceof aef_2) {
            fsf_1 fsf_12 = null;
            if (fhs_22 == null) {
                fsf_12 = fse_1.gFu().getProperty(string);
            }
            if (fsf_12 == null) {
                fsf_12 = new fsf_1(string, fhs_22, true);
                fse_1.gFu().b(fsf_12);
            }
            fsf_12.a(object, false);
            fsc_1 fsc_12 = new fsc_1(object);
            fsc_12.d(fsf_12);
            fsf_12.c(fsc_12);
            return fsc_12;
        }
        return new fsc_1(object);
    }

    public static void b(fsc_1 fsc_12) {
        if (fsc_12 == null || fsc_12.gFt() == null) {
            return;
        }
        fsc_12.gFt().d(fsc_12);
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void d(fsf_1 fsf_12) {
        this.vcL = fsf_12;
    }

    public fsf_1 gFt() {
        return this.vcL;
    }

    public Object eu(String string) {
        if (this.aGT != null && this.aGT instanceof aef_2 && string != null) {
            return fsf_1.a(this.aGT, string);
        }
        return null;
    }
}

