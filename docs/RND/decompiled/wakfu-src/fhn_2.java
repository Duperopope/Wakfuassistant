/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHN
 */
final class fhn_2
extends ftk_2 {
    final /* synthetic */ fhm_1 uzp;

    fhn_2(fhm_1 fhm_12, fey_2 fey_22) {
        this.uzp = fhm_12;
        super(fey_22);
    }

    @Override
    protected void a(String string, String string2, aeb_1 aeb_12) {
        String string3 = ftu_2.h(string, string2, "x");
        String string4 = ftu_2.h(string, string2, "y");
        aeb_12.k(string3, ((fes_2)this.vfF).getX() - (this.uzp.uzj ? this.uzp.uzn : 0));
        aeb_12.k(string4, ((fes_2)this.vfF).getY() - (this.uzp.uzk ? this.uzp.uzo : 0));
    }
}

