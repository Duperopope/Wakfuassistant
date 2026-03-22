/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czB
 */
public class czb_0
implements aaq_2<cjo> {
    @Override
    public boolean a(cjo cjo2) {
        fiu_1.uCW.N("heroBuildLock", true);
        if (cjo2.aHz()) {
            byi_1.a(byh_1.lAv, "build.error.delete.build", new Object[0]);
            return false;
        }
        cvu_2.eTO().d(cjo2.KU(), cjo2.evu());
        byi_1.c(byh_1.lAv, "build.deleted", new Object[0]);
        return false;
    }

    @Override
    public int bkq() {
        return 13113;
    }
}

