/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

class aKg
implements afj {
    final /* synthetic */ aKe eds;

    aKg(aKe aKe2) {
        this.eds = aKe2;
    }

    @Override
    public boolean f(afh afh2, aeb_1 aeb_12) {
        return this.eds.edm.keySet().stream().map(aKj::ciA).map(aKk::ciE).map(bsn_1::eng).anyMatch(afh3 -> Objects.equals(afh3, (Object)afh2));
    }

    @Override
    public void g(afh afh2, aeb_1 aeb_12) {
        for (aKj aKj2 : this.eds.edk.keySet()) {
            bsn_1 bsn_12 = aKj2.ciA().ciE();
            if (bsn_12.eng() != afh2) {
                return;
            }
            aeb_12.a(bsn_12.getKey(), this.eds.edm.get(aKj2));
            this.eds.b(((bsg_1)aie_0.cfn().bmH()).a(bsn_12), aKj2);
        }
    }

    @Override
    public void h(afh afh2, aeb_1 aeb_12) {
        for (aKj aKj2 : this.eds.edk.keySet()) {
            bsn_1 bsn_12 = aKj2.ciA().ciE();
            if (bsn_12.eng() != afh2) {
                return;
            }
            aeb_12.b(bsn_12.getKey(), this.eds.edm.get(aKj2));
        }
    }
}

