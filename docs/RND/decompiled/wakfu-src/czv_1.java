/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZV
 */
public class czv_1
implements aaq_2 {
    public boolean a(aam_2 aam_22) {
        dae_0 dae_02 = (dae_0)aam_22;
        ezz_1 ezz_12 = bvk.dJZ().jP(dae_02.bCp());
        if (ezz_12 == null) {
            return false;
        }
        fik_2 fik_22 = fik_2.b(string -> bvk.dJZ().kL(ezz_12.Sn())).l("guild.excludeMember.validate", ezz_12.getName()).abQ(3);
        fiq_2.gCw().d(fik_22);
        return false;
    }

    @Override
    public int bkq() {
        return 19382;
    }
}

