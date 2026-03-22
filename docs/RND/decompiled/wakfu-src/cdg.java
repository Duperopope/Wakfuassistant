/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

class cdg
implements aaq_2<csb> {
    cdg() {
    }

    @Override
    public boolean a(csb csb2) {
        Optional optional = bbs_2.a(eva_1.owu);
        if (optional.isEmpty()) {
            return false;
        }
        feb_0 feb_02 = (feb_0)optional.get();
        Map<Integer, Integer> map = feb_02.fUd();
        map.merge(csb2.avr(), csb2.oP(), Integer::sum);
        if (map.getOrDefault(csb2.avr(), 0) <= 0) {
            map.remove(csb2.avr());
        }
        ffV ffV2 = fgD.fXh().Ve(csb2.avr());
        if (csb2.oP() > 0) {
            bgz_2.a(ffV2, csb2.oP(), null);
        } else {
            bgz_2.e(ffV2, -csb2.oP());
        }
        fcI.a(bbs_2.xl(), exP2 -> ((bdl_0)exP2.dod()).dRt());
        return false;
    }

    @Override
    public int bkq() {
        return 12755;
    }
}

