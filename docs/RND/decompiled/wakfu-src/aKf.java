/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

class aKf
implements afj {
    final /* synthetic */ aKe edr;

    aKf(aKe aKe2) {
        this.edr = aKe2;
    }

    @Override
    public boolean f(afh afh2, aeb_1 aeb_12) {
        return this.edr.edl.keySet().stream().map(aKj::ciA).map(aKk::ciD).map(bsn_1::eng).anyMatch(afh3 -> Objects.equals(afh3, (Object)afh2));
    }

    @Override
    public void g(afh afh2, aeb_1 aeb_12) {
        for (aKj aKj2 : this.edr.edk.keySet()) {
            bsn_1 bsn_12 = aKj2.ciA().ciD();
            if (bsn_12.eng() != afh2) {
                return;
            }
            aeb_12.a(bsn_12.getKey(), this.edr.edl.get(aKj2));
            this.edr.a(((bsg_1)aie_0.cfn().bmH()).a(bsn_12), aKj2);
        }
    }

    @Override
    public void h(afh afh2, aeb_1 aeb_12) {
        for (aKj aKj2 : this.edr.edk.keySet()) {
            bsn_1 bsn_12 = aKj2.ciA().ciD();
            if (bsn_12.eng() != afh2) {
                return;
            }
            aeb_12.b(bsn_12.getKey(), this.edr.edl.get(aKj2));
        }
    }
}

