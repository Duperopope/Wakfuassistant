/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRu
 */
class eru_0
extends esx_0 {
    eru_0(eRt eRt2) {
    }

    @Override
    public fqP<fqE> a(exP exP2, esy_0 esy_02, short s) {
        fqP<fqE> fqP2 = esz_0.rkR.a(exP2, esy_02, s);
        frd frd2 = exP2.dnM();
        for (fqE fqE2 : fqP2) {
            short s2;
            short s3;
            if (frd2 != null) {
                s3 = frd2.tL() == -1 ? exP2.dnG() : frd2.tL();
                s2 = (short)Math.min(fqE2.cmL(), s3);
            } else {
                s2 = fqE2.cmL();
            }
            s3 = GC.a(s2, mh_1.aWP.aVf(), mh_1.aWP.aVe());
            fqE2.cj(s3);
        }
        return fqP2;
    }
}

