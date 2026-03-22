/*
 * Decompiled with CFR 0.152.
 */
class aZF
implements aqg_1<aNz> {
    aZF(aze_0 aze_02) {
    }

    public void a(aNz aNz2) {
        int n = aNz2.cqy();
        int n2 = aNz2.csD();
        eyv eyv2 = eyw.fik().OW(n);
        if (eyv2 == null) {
            aze_0.hyp.error((Object)("On ajoute un nuisible \u00e0 une famille de monstre inconnue : familyId=" + n));
            return;
        }
        eyv2.OV(n2);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aNz)aqz_22);
    }
}

