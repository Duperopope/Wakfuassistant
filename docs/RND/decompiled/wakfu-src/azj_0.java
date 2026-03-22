/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZj
 */
class azj_0
implements aqg_1<anj_0> {
    azj_0() {
    }

    public void a(anj_0 anj_02) {
        int n = anj_02.d();
        int n2 = anj_02.clf();
        int n3 = anj_02.cqq();
        int n4 = anj_02.cqr();
        int n5 = anj_02.cqs();
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(anj_02.clB());
        }
        catch (Exception exception) {
            aYY.hyd.error((Object)("coffre de loot " + n + "  " + exception.getMessage() + " (criteria='" + anj_02.clB() + "')"));
            return;
        }
        aLD aLD2 = anj_02.ckt();
        fdx_0 fdx_02 = new fdx_0(n, n2, Long.MIN_VALUE, n3, n4, n5, anj_02.cnO(), Short.MIN_VALUE, anj_02.cqu(), Long.MIN_VALUE, ang_22, aYY.b(aLD2), aYY.a(aLD2));
        fda_0.rWI.a(fdx_02);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((anj_0)aqz_22);
    }
}

