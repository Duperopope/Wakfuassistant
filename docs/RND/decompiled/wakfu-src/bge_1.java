/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGe
 */
public class bge_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUx = Logger.getLogger(bge_1.class);
    private final Map<Integer, Long> jUy = new HashMap<Integer, Long>();

    public bge_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        anm_2 anm_22 = new anm_2();
        for (String string : stringArray) {
            amd_2 amd_22 = anm_22.fm(string);
            TLongLongHashMap tLongLongHashMap = amd_22.g(null, null, null, null);
            tLongLongHashMap.forEachEntry((l, l2) -> {
                this.jUy.put((int)l, l2);
                return true;
            });
        }
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        return fhc_02 != null && bDq.Gj(fhc_02.d());
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUx.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer n : this.jUy.keySet()) {
            if (!bDq.Gj(n)) continue;
            arrayList.add(n);
        }
        if (arrayList.size() == this.jUy.size()) {
            aPd.e("error.furniture.alreadyKnown", new Object[0]);
            return false;
        }
        if (arrayList.isEmpty()) {
            this.jU(ffV2.LV());
        } else {
            this.a(ffV2, arrayList);
        }
        return true;
    }

    private void a(ffV ffV2, List<Integer> list) {
        String string2 = bDq.x(list);
        fiq_2.gCw().d(fik_2.a(string -> this.jU(ffV2.LV())).l("error.furniture.partially.known", string2).abQ(1).vG(ccp_2.mRE.byf()));
    }

    @Override
    public void clear() {
    }

    public Map<Integer, Long> dTz() {
        return this.jUy;
    }

    @Override
    public fgM dTl() {
        return fgM.sla;
    }
}

