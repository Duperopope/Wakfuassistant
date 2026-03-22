/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfZ
 */
final class cfz_0
extends ceK<crr, bsj_0> {
    cfz_0() {
    }

    public boolean a(crr crr2) {
        awk_0 awk_02 = new awk_0(crr2.caO(), crr2.eza().aJr(), crr2.avZ(), ((bsj_0)this.jkR).d(), crr2.ezQ());
        if (((bsj_0)this.jkR).fJB() || !cfC.lTb.lSZ) {
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)awk_02);
            aVi.cWF().m(this.jkR);
        } else {
            cfC.lTb.lTa.a(awk_02);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crr)aam_22);
    }
}

