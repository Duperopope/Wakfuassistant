/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bAt
 */
public final class bat_0
extends bco_0 {
    static final Logger jEX = Logger.getLogger(bat_0.class);
    private fdh_0 jEY;
    long aDL;
    private final fi_1 jEZ = new bau_0(this);

    @Override
    protected fi_1 bey() {
        return this.jEZ;
    }

    @Override
    public void dNq() {
        if (this.jFc == fre_0.sZd) {
            this.jEY = new fdh_0(0, 957, eIx.qwB, 0);
            this.jEY.Um(cps_1.njv.avZ());
        }
    }

    @Override
    public cpm_1[] dNh() {
        TIntArrayList tIntArrayList = this.jEY.eDY();
        cpm_1[] cpm_1Array = new cpm_1[tIntArrayList.size()];
        int n = tIntArrayList.size();
        for (int i = 0; i < n; ++i) {
            int n2 = tIntArrayList.get(i);
            cps_1 cps_12 = cps_1.Mi(n2);
            if (cps_12 != null) {
                cpm_1Array[i] = cps_12.eLI();
                continue;
            }
            jEX.error((Object)("Action d'id inconnu " + n2));
        }
        return cpm_1Array;
    }

    static /* synthetic */ void a(bat_0 bat_02, ayv_2 ayv_22) {
        bat_02.a(ayv_22);
    }
}

