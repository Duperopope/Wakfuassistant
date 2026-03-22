/*
 * Decompiled with CFR 0.152.
 */
class aZe
implements aqg_1<aoj_0> {
    aZe() {
    }

    public void a(aoj_0 aoj_02) {
        int n = aoj_02.d();
        aLD aLD2 = aoj_02.ckt();
        try {
            ang_2 ang_22 = ehu_0.rY(aoj_02.aGr());
            fda_0.rWI.a(new fdd_0(n, ang_22, aoj_02.clf(), aYY.b(aLD2), aYY.a(aLD2)));
        }
        catch (Exception exception) {
            aYY.hyd.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aoj_0)aqz_22);
    }
}

