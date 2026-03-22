/*
 * Decompiled with CFR 0.152.
 */
class aZQ
implements aqg_1<aNI> {
    aZQ(aZP aZP2) {
    }

    public void a(aNI aNI2) {
        fkL fkL2 = fkL.ue(aNI2.d());
        if (fkL2 == null) {
            aZP.hyx.error((Object)("NationRank inconnu lors du chargement des binary storage : " + aNI2.d()));
            return;
        }
        float f2 = aNI2.ctb();
        String string = aNI2.clB();
        int n = aNI2.ctc();
        fkL2.fe(f2);
        fkL2.WQ(n);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aNI)aqz_22);
    }
}

