/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fHu
 */
public class fhu_1 {
    private static Logger oO = Logger.getLogger(fhu_1.class);
    private final HashMap<String, fhs_2> uxF = new HashMap();
    private fhs_2 uxG = null;
    private HashMap<String, fix_2> uxH = null;
    private ArrayList<fix_2> uxI = null;

    @Deprecated
    public fse_1 gAx() {
        return fse_1.gFu();
    }

    public void b(fhs_2 fhs_22, String string) {
        this.uxF.put(string, fhs_22);
    }

    public fhs_2 uP(String string) {
        fhs_2 fhs_22 = new fhs_2(string, this);
        this.b(fhs_22, string);
        return fhs_22;
    }

    public void aO(String string, String string2) {
        if (string != null && string2 != null) {
            fhs_2 fhs_22 = this.uxF.remove(string);
            this.uxF.put(string2, fhs_22);
        }
    }

    public fhv_1 uH(String string) {
        if (string == null) {
            return null;
        }
        int n = string.indexOf(46);
        String string2 = n < 0 ? string : string.substring(0, n);
        fhs_2 fhs_22 = this.uxF.get(string2);
        if (fhs_22 != null) {
            return fhs_22.uH(string.substring(n + 1));
        }
        return null;
    }

    public void uQ(String string) {
        if (this.uxF != null) {
            fhs_2 fhs_22 = this.uxF.remove(string);
            if (fhs_22 == this.uxG) {
                this.uxG = null;
            }
            if (fhs_22 != null) {
                fhs_22.clear();
            }
        }
    }

    public fhs_2 uR(String string) {
        return this.uxF.get(string);
    }

    public fhs_2 gAy() {
        return this.uxG;
    }

    public void k(fhs_2 fhs_22) {
        this.uxG = fhs_22;
    }

    public fix_2[] gAz() {
        if (this.uxI == null) {
            return null;
        }
        fix_2[] fix_2Array = new fix_2[this.uxI.size()];
        return this.uxI.toArray(fix_2Array);
    }

    public fix_2 gAA() {
        if (this.uxI != null) {
            return this.uxI.get(this.uxI.size() - 1);
        }
        return null;
    }

    public fix_2 uS(String string) {
        if (this.uxH == null) {
            return null;
        }
        return this.uxH.get(string);
    }

    public Collection<fix_2> gAB() {
        if (this.uxH == null) {
            return null;
        }
        return this.uxH.values();
    }

    public void a(String string, fix_2 fix_22) {
        if (this.uxH == null) {
            this.uxH = new HashMap();
            this.uxI = new ArrayList();
        }
        this.uxH.put(string, fix_22);
        this.uxI.add(fix_22);
    }

    public void uT(String string) {
        if (this.uxH == null) {
            return;
        }
        fix_2 fix_22 = this.uxH.get(string);
        this.uxI.remove(fix_22);
    }

    public void uU(String string) {
        fix_2 fix_22 = this.uxH.remove(string);
        this.uxI.remove(fix_22);
    }

    public void f(fix_2 fix_22) {
        String string = null;
        for (Map.Entry<String, fix_2> entry : this.uxH.entrySet()) {
            if (entry.getValue() != fix_22) continue;
            string = entry.getKey();
            break;
        }
        this.uxH.remove(string);
        this.uxI.remove(fix_22);
    }
}

