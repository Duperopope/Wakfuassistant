/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aIg
 */
class aig_0
implements Uu {
    aig_0(aie_0 aie_02) {
    }

    @Override
    public void onCalendarEvent(Uv uv, ut_0 ut_02) {
        if (uv != Uv.bvA) {
            return;
        }
        ux_0 ux_02 = ut_02.bjc();
        new beJ(ux_02).f(ut_02);
        ut_02.b(this);
    }
}

