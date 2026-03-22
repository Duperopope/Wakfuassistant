/*
 * Decompiled with CFR 0.152.
 */
final class ceY
extends ceK<cre, bsj_0> {
    ceY() {
    }

    public boolean a(cre cre2) {
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dmV();
        boolean bl = bsj_02 != null && bsj_02.d() == cre2.bha();
        anp_2 anp_22 = cre2.bgh();
        aUV aUV2 = null;
        euz_1 euz_12 = cre2.ezA();
        if (euz_12 == null) {
            euz_12 = euz_1.rwp;
        }
        switch (euz_12) {
            case rwp: 
            case rwt: 
            case rwu: {
                aUV2 = new awf_0(cre2.caO(), cre2.eza().aJr(), cre2.avZ(), cre2.bha(), cre2.OO(), euz_12, anp_22, abi_1.wG(cre2.ezz()), bl);
                break;
            }
            case rwq: {
                int[] nArray = anp_22.bDX();
                acd_1 acd_12 = new acd_1(nArray);
                aUV2 = new awa_0(cre2.caO(), cre2.eza().aJr(), cre2.avZ(), cre2.bha(), cre2.OO(), acd_12);
                break;
            }
            case rwr: {
                int[] nArray = anp_22.bDX();
                acd_1 acd_13 = new acd_1(nArray);
                aUV2 = new aWB(cre2.caO(), cre2.eza().aJr(), cre2.avZ(), cre2.bha(), cre2.OO(), acd_13);
                break;
            }
            case rws: {
                int[] nArray = anp_22.bDX();
                acd_1 acd_14 = new acd_1(nArray);
                aUV2 = new aWD(cre2.caO(), cre2.eza().aJr(), cre2.avZ(), cre2.bha(), cre2.OO(), acd_14);
            }
        }
        aVi.cWF().a(cre2.bha(), aUV2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cre)aam_22);
    }
}

