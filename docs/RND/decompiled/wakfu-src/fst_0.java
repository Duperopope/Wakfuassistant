/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fsT
 */
public class fst_0
extends fsQ<fsm_0> {
    private static final Logger teD = Logger.getLogger(fst_0.class);

    public fst_0(fsm_0 fsm_02) {
        super(fsm_02);
    }

    public boolean glA() {
        this.glz();
        ArrayList<fsX> arrayList = fst_0.b((fsm_0)this.teA);
        return arrayList.isEmpty();
    }

    public boolean glB() {
        ArrayList<fsX> arrayList;
        this.glz();
        fsm_0 fsm_02 = new fsm_0((fsm_0)this.teA);
        boolean bl = true;
        while (bl && !(arrayList = fst_0.b(fsm_02)).isEmpty()) {
            bl = this.a(fsm_02, arrayList);
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                this.a(arrayList.get(i));
            }
        }
        return !this.gly();
    }

    private static ArrayList<fsX> b(fsm_0 fsm_02) {
        ArrayList<fsX> arrayList = new ArrayList<fsX>();
        fsm_02.O(new fsu_0(fsm_02, arrayList));
        return arrayList;
    }

    private boolean a(fsm_0 fsm_02, ArrayList<fsX> arrayList) {
        boolean bl = false;
        for (fsX fsX2 : arrayList) {
            fsb_0 fsb_02 = (fsb_0)fsX2.eLi();
            bl |= fsm_02.r(fsb_02.glj());
        }
        return bl;
    }
}

