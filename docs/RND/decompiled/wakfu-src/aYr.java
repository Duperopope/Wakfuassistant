/*
 * Decompiled with CFR 0.152.
 */
class aYr
implements aqg_1<aLJ> {
    aYr(ayq_0 ayq_02) {
    }

    public void a(aLJ aLJ2) {
        int n = aLJ2.cmh();
        String string = aLJ2.clB();
        float f2 = aLJ2.cmi();
        float f3 = aLJ2.cmj();
        int n2 = aLJ2.getDuration();
        short s = aLJ2.blw();
        try {
            ang_2 ang_22 = ehu_0.rY(string);
            ejx_0.qzT.a(n, f2, f3, ang_22, n2, s);
        }
        catch (Exception exception) {
            ayq_0.hxC.error((Object)("Exception lev\u00e9e lors de l'interpr\u00e9tation du crit\u00e8re : " + string));
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aLJ)aqz_22);
    }
}

