/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZM
 */
public class czm_1
implements aaq_2 {
    public boolean a(aam_2 aam_22) {
        if (!aue_0.cVJ().cVK().dpO()) {
            return false;
        }
        String string = bvk.dJZ().drl().getName();
        fik_2 fik_22 = new fik_2().l("guild.disband.validate", string).pe(true).abQ(3).a(fil_2.gCp().c(string2 -> {
            if (string.equalsIgnoreCase(string2)) {
                bvk.dJZ().dKr();
                aue_0.cVJ().b(cvg_2.eTB());
            }
        })).a(fil_2.gCq());
        fiq_2.gCw().d(fik_22);
        return false;
    }

    @Override
    public int bkq() {
        return 19815;
    }
}

