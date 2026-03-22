/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class aYf
implements aqg_1<all_0> {
    aYf(aye_0 aye_02) {
    }

    public void a(all_0 all_02) {
        ArrayList<beY> arrayList = new ArrayList<beY>();
        for (alm_0 alm_02 : all_02.clc()) {
            arrayList.add(new beY(alm_02.d(), alm_02.aHb(), alm_02.cld(), alm_02.cle()));
        }
        beV beV2 = beV.bm(all_02.clb());
        if (beV2.dfh() && all_02.clc().length % 2 != 0) {
            arrayList.add(new beY(-1, (short)arrayList.size(), 0, -1));
        }
        beT beT2 = new beT(beV2, all_02.d(), arrayList);
        beU.hOR.a(beT2);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((all_0)aqz_22);
    }
}

