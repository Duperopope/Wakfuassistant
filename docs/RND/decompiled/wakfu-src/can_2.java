/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cAn
 */
public class can_2
implements aef_2 {
    public static final String mnB = "title";
    public static final String mnC = "description";
    public static final String mnD = "descNormal";
    public static final String mnE = "descRepro";
    public static final String mnF = "types";
    public static final String mnG = "selectedType";
    private String mnH;
    private String jbB;
    private String mnI;
    private String mnJ;
    private String mnK;
    private ahm cxY;
    private long aDh;
    private int mnL;
    private int mnM;
    private String aFD;
    private String mnN;
    private long aDg;
    private String mnO;
    private String mnP;
    private String aCR = "Graphisme";
    private String mnQ;
    public static final String[] mnR = new String[]{"title", "description", "descNormal", "descRepro", "types", "selectedType"};

    public void oE(String string) {
        this.mnH = string;
    }

    public void oA(String string) {
        this.jbB = string;
    }

    public void oF(String string) {
        this.mnI = string;
    }

    public void oG(String string) {
        this.mnJ = string;
    }

    public void oH(String string) {
        this.mnK = string;
    }

    public void e(ahm ahm2) {
        this.cxY = ahm2;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void Lw(int n) {
        this.mnL = n;
    }

    public void Lx(int n) {
        this.mnM = n;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public void ks(String string) {
        this.mnN = string;
    }

    public void nL(long l) {
        this.aDg = l;
    }

    public void oI(String string) {
        this.mnO = string;
    }

    public void oJ(String string) {
        this.mnP = string;
    }

    public void jY(String string) {
        this.aCR = string;
    }

    public void oK(String string) {
        this.mnQ = string;
    }

    public String eGl() {
        return this.mnH;
    }

    public String eGm() {
        return this.jbB;
    }

    public String eGn() {
        return this.mnI;
    }

    public String eGo() {
        return this.mnJ;
    }

    public String eGp() {
        return this.mnK;
    }

    public ahm bAI() {
        return this.cxY;
    }

    public long KU() {
        return this.aDh;
    }

    public int eGq() {
        return this.mnL;
    }

    public int eGr() {
        return this.mnM;
    }

    public String xO() {
        return this.aFD;
    }

    public String cVp() {
        return this.mnN;
    }

    public long xl() {
        return this.aDg;
    }

    public String eGs() {
        return this.mnO;
    }

    public String eGt() {
        return this.mnP;
    }

    public String aLZ() {
        return this.aCR;
    }

    public String eGu() {
        return this.mnQ;
    }

    @Override
    public String[] bxk() {
        return mnR;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(mnB)) {
            return this.eGl();
        }
        if (string.equals(mnC)) {
            return this.eGm();
        }
        if (string.equals(mnD)) {
            return this.eGn();
        }
        if (string.equals(mnE)) {
            return this.eGo();
        }
        if (string.equals(mnF)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Graphisme");
            arrayList.add("Son");
            arrayList.add("Cin\u00e9matique");
            arrayList.add("Crash / Freeze");
            arrayList.add("Interface");
            arrayList.add("Animation");
            arrayList.add("Collision");
            arrayList.add("Logique");
            return arrayList.toArray();
        }
        if (string.equals(mnG)) {
            return this.aLZ();
        }
        return null;
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(mnB)) {
            this.oE(object.toString());
        } else if (string.equals(mnC)) {
            this.oA(object.toString());
        } else if (string.equals(mnD)) {
            this.oF(object.toString());
        } else if (string.equals(mnE)) {
            this.oG(object.toString());
        } else if (string.equals(mnG)) {
            this.jY(object.toString());
        }
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public boolean hP(String string) {
        if (string.equals(mnB)) {
            return true;
        }
        if (string.equals(mnC)) {
            return true;
        }
        if (string.equals(mnD)) {
            return true;
        }
        if (string.equals(mnE)) {
            return true;
        }
        if (string.equals(mnF)) {
            return true;
        }
        return string.equals(mnG);
    }
}

