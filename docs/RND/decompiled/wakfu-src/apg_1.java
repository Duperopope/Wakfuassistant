/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashSet;
import java.util.Vector;
import org.apache.log4j.Logger;

/*
 * Renamed from apG
 */
public class apg_1 {
    private static final Logger cOs = Logger.getLogger(apg_1.class);
    private Vector<ape_2> cOt = new Vector();
    private int cOu = 0;
    private HashSet<String> cOv = new HashSet();

    public apg_1() {
        this.fz("br");
        this.fz("BR");
        this.fz("hr");
        this.fz("HR");
    }

    public void fz(String string) {
        this.cOv.add(string);
    }

    public boolean bFD() {
        return this.cOt.isEmpty();
    }

    public void a(ape_2 ape_22) {
        apl_2 apl_22;
        aph_1 aph_12 = ape_22.bFC();
        if (aph_12 instanceof apl_2 && this.cOv.contains((apl_22 = (apl_2)aph_12).bEX())) {
            return;
        }
        this.cOt.add(ape_22);
    }

    public ape_2 bFE() {
        ape_2 ape_22 = this.cOt.lastElement();
        this.cOt.removeElementAt(this.cOt.size() - 1);
        return ape_22;
    }

    public ape_2 bFF() {
        if (this.cOt.size() > 0) {
            return this.cOt.get(this.cOt.size() - 1);
        }
        return null;
    }

    public ape_2 b(ape_2 ape_22) {
        apl_2 apl_22 = (apl_2)ape_22.bFC();
        ape_2 ape_23 = null;
        int n = 0;
        ape_2 ape_24 = null;
        int n2 = 0;
        while ((ape_24 = this.tu(n++)) != null) {
            if (ape_24.bFC() instanceof apl_2) {
                apl_2 apl_23 = (apl_2)ape_24.bFC();
                if (apl_23.bEX().equalsIgnoreCase(apl_22.bEX())) {
                    for (int i = 0; i <= n2; ++i) {
                        ape_23 = this.bFE();
                    }
                    break;
                }
                ++n2;
                continue;
            }
            cOs.error((Object)("Invalid TAG.." + String.valueOf(ape_24.bFC())));
        }
        return ape_23;
    }

    public ape_2 tu(int n) {
        int n2 = this.cOt.size() - 1 - n;
        if (n2 < 0) {
            return null;
        }
        return this.cOt.get(n2);
    }
}

