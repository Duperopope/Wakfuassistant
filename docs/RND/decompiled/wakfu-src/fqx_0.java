/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqx
 */
public class fqx_0
implements RU<fqr_0> {
    @Override
    public int a(RS rS, fqr_0 fqr_02) {
        if (fqr_02.gih() != fqu_0.sTq && fqr_02.gih() != fqu_0.sTs && fqr_02.gih() != fqu_0.sTr) {
            return -3;
        }
        return 0;
    }

    @Override
    public int a(RS rS, fqr_0 fqr_02, short s) {
        return this.a(rS, fqr_02);
    }

    @Override
    public int a(RS rS, fqr_0 fqr_02, fqr_0 fqr_03) {
        return this.a(rS, fqr_03);
    }

    @Override
    public int b(RS rS, fqr_0 fqr_02) {
        return this.a(rS, fqr_02);
    }

    @Override
    public boolean a(fqr_0 fqr_02, qu_0 qu_02, qm_0 qm_02) {
        return false;
    }

    @Override
    public boolean a(RS rS, qu_0 qu_02, qm_0 qm_02) {
        return false;
    }
}

