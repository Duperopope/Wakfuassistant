/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from bOl
 */
public class bol_2 {
    public static void Iv(int n) {
        Optional optional = bbs_2.a(eva_1.owD);
        if (optional.isEmpty()) {
            return;
        }
        if (frr_0.a((frq_0)optional.get(), n)) {
            cjf_0 cjf_02 = new cjf_0();
            cjf_02.ji(true);
            cjf_02.KS(n);
            aue_0.cVJ().etu().d(cjf_02);
        }
    }

    public static void f(Set<Integer> set) {
        Optional optional = bbs_2.a(eva_1.owD);
        if (optional.isEmpty()) {
            return;
        }
        Set<Integer> set2 = frr_0.b((frq_0)optional.get(), set);
        cjf_0 cjf_02 = new cjf_0();
        cjf_02.ji(false);
        cjf_02.B(set2);
        aue_0.cVJ().etu().d(cjf_02);
    }

    public static boolean Iw(int n) {
        Optional<evv_2> optional = bbs_2.a(eva_1.owD);
        if (optional.isEmpty()) {
            return false;
        }
        frq_0 frq_02 = optional.map(evv_22 -> (frq_0)evv_22).get();
        return frq_02.gkw().contains(n);
    }
}

