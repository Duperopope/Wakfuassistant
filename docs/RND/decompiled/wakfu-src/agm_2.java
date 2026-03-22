/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aGm
 */
public class agm_2 {
    private static final Logger dKP = Logger.getLogger(agm_2.class);
    private static final boolean dKQ = true;
    private static final agm_2 dKR = new agm_2();
    private final HashMap<agj_2, agk_2> dKS = new HashMap();

    private agm_2() {
    }

    public static agm_2 cbu() {
        return dKR;
    }

    public final void a(agj_2 agj_22, afx_1 afx_12, String string, afq_2[] afq_2Array, boolean bl) {
        agk_2 agk_22 = this.dKS.get(agj_22);
        if (agk_22 == null) {
            agk_22 = new agk_2();
            this.dKS.put(agj_22, agk_22);
        }
        agk_22.a(afx_12, string, afq_2Array, bl);
    }

    public final agk_2 b(agj_2 agj_22) {
        return this.dKS.get(agj_22);
    }

    public final agk_2 c(agj_2 agj_22) {
        return this.dKS.remove(agj_22);
    }

    public void d(agj_2 agj_22) {
        agk_2 agk_22 = this.dKS.get(agj_22);
        if (agk_22 != null && agk_22.a(agj_22)) {
            this.dKS.remove(agj_22);
        }
    }

    public void a(agj_2 agj_22, afx_1 afx_12) {
        agk_2 agk_22 = this.dKS.get(agj_22);
        if (agk_22 != null && agk_22.e(afx_12)) {
            this.dKS.remove(agj_22);
        }
    }

    public void clean() {
        this.dKS.clear();
    }
}

