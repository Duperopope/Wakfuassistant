/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cdB
 */
class cdb_0
implements aaq_2<csS> {
    cdb_0() {
    }

    @Override
    public boolean a(csS csS2) {
        long l = aue_0.cVJ().cVO().xl();
        byte[] byArray = csS2.eBG();
        List<fhm> list = fhj.eO(byArray);
        for (fhm fhm2 : list) {
            long l2 = fhm2.KU();
            fhp.sop.a(l, l2, fhm2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13800;
    }
}

