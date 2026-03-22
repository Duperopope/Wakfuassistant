/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cTv
 */
class ctv_2
implements bot_0 {
    final /* synthetic */ TIntObjectHashMap nJl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ctv_2(ctu_2 ctu_22, TIntObjectHashMap tIntObjectHashMap) {
        this.nJl = tIntObjectHashMap;
    }

    @Override
    public void c(long l, @Unmodifiable List<bpt_1<?, ?>> list) {
        for (bpt_1<?, ?> bpt_12 : list) {
            bpk_2 bpk_22;
            int n;
            int n2;
            ArrayList<bpk_2> arrayList = bpt_12.eik();
            if (arrayList.size() != 1 || (n2 = blr_0.iuw.DF(n = (bpk_22 = (bpk_2)arrayList.get(0)).eiL())) == 0) continue;
            blp_0 blp_02 = (blp_0)this.nJl.get(n2);
            if (blp_02 == null) {
                ctu_2.nJe.error((Object)("Le compagnon de breed " + n2 + " n'existe pas !"));
                continue;
            }
            blp_02.b(bpt_12);
        }
    }

    @Override
    public void cXM() {
        ctu_2.nJe.warn((Object)"Error has occured during listing of companion articles. (More detail in previous logs)");
    }
}

