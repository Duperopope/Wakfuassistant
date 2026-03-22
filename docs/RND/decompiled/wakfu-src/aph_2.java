/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from apH
 */
public class aph_2 {
    private static final Logger cOw = Logger.getLogger(aph_2.class);
    private apn_2 cOx = null;
    private apf_1 cOy = null;

    public aph_2(apn_2 apn_22, apf_1 apf_12) {
        this.cOx = apn_22;
        this.cOy = apf_12;
    }

    public aph_2(apn_2 apn_22) {
        this.cOx = apn_22;
        this.cOy = new api_1(this);
    }

    public List<ape_2> bFG() {
        ArrayList<ape_2> arrayList = new ArrayList<ape_2>();
        try {
            apg_1 apg_12 = new apg_1();
            aps_2 aps_22 = new aps_2(this.cOx);
            aph_1 aph_12 = null;
            apj_1 apj_12 = null;
            while (aps_22.bFj() && (aph_12 = aps_22.bFi()) != null) {
                apj_12 = new apj_1(aph_12);
                if (aph_12 instanceof apl_2) {
                    if (this.cOy != null && !this.cOy.a(aph_12)) continue;
                    apl_2 apl_22 = (apl_2)aph_12;
                    if (apl_22.bEZ()) {
                        apg_12.b(apj_12);
                        continue;
                    }
                    if (apg_12.bFF() == null) {
                        arrayList.add(apj_12);
                    } else {
                        ape_2 ape_22 = apg_12.bFF();
                        apj_12.c(ape_22);
                    }
                    if (apl_22.bEZ()) continue;
                    if (this.cOy != null) {
                        if (!this.cOy.a(aph_12)) continue;
                        apg_12.a(apj_12);
                        continue;
                    }
                    apg_12.a(apj_12);
                    continue;
                }
                if (!(aph_12 instanceof apm_2)) continue;
                if (apg_12.bFF() == null) {
                    cOw.error((Object)"Invalid source ..");
                    continue;
                }
                apj_12.c(apg_12.bFF());
            }
        }
        catch (Exception exception) {
            throw new apf_2("Cannot build DOM tree, " + exception.getMessage());
        }
        return arrayList;
    }

    public static void t(List<ape_2> list) {
        if (list != null) {
            for (ape_2 ape_22 : list) {
                System.out.println("NODE >" + String.valueOf(ape_22.bFC()));
                aph_2.t(ape_22.bFA());
            }
        }
    }
}

