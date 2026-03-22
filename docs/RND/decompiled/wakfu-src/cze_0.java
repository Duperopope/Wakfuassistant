/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czE
 */
public class cze_0
implements aaq_2<cpg> {
    @Override
    public boolean a(cpg cpg2) {
        ffV ffV2;
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(cpg2.KU());
        if (bgt_02 == null) {
            return false;
        }
        boolean bl = cvu_2.a(cpg2.exc(), (bhJ)bgt_02);
        if (cpg2.dnO() != null) {
            fhp.sop.a(bgt_02.Xi(), bgt_02.Sn(), cpg2.dnO());
        }
        if (cvu_2.eQx()) {
            cvu_2.eTO().oy(bgt_02.Sn());
            cvu_2.eUf();
        }
        if (cui_1.eQx()) {
            cui_1.eRw().d(null);
        }
        if ((ffV2 = fcI.aj(bgt_02.aZj(), cpg2.exc())) != null) {
            ffV2.bYg();
            if (bl) {
                bgt_02.bX(ffV2);
            }
        }
        byi_1.c(byh_1.lAv, "build.remove.item.from.all.success", cpg2.exd());
        return false;
    }

    @Override
    public int bkq() {
        return 13839;
    }
}

