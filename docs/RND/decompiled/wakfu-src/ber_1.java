/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ber
 */
public class ber_1
extends beh_2 {
    public final String hNl;
    public final String hNm;
    public bdf_1 hNn;

    public ber_1(enk_0 enk_02, String string, String string2) {
        super(enk_02);
        this.hNl = string;
        this.hNm = string2;
        this.hNn = null;
    }

    private ber_1(ber_1 ber_12) {
        super(ber_12.hMZ);
        this.hNl = ber_12.hNl;
        this.hNm = ber_12.hNm;
        this.hNn = null;
    }

    private static abi_1 lr(String string) {
        if (string == null) {
            return null;
        }
        if (string.charAt(1) == '_') {
            try {
                int n = Integer.parseInt("" + string.charAt(0));
                return abi_1.wG(n);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return null;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        boolean bl;
        boolean bl2;
        bes_1 bes_12 = new bes_1(this, aym_2.bSE());
        bes_12.lf(this.hNl);
        abi_1 abi_12 = ber_1.lr(this.hNm);
        boolean bl3 = bl2 = abi_12 == null;
        if (bl2) {
            bes_12.a(bdj_22.bcB());
        } else {
            bes_12.a(abi_12);
        }
        bes_12.dT("AnimStatique");
        bes_12.qR(afX.csq.byy());
        bes_12.a(aez.bwu());
        bes_12.e(bdj_22.bcC(), bdj_22.bcD(), bdj_22.bcE());
        adn_0.bvh().g(bes_12);
        boolean bl4 = bl = this.hNm == null;
        if (!bl) {
            bes_12.dT(bl2 ? this.hNm : this.hNm.substring(2));
        }
        bdj_22.a(bes_12, bl, bl, bl2);
        this.hNn = bes_12;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ber_1 ber_12 = (ber_1)object;
        if (this.hNm != null ? !this.hNm.equals(ber_12.hNm) : ber_12.hNm != null) {
            return false;
        }
        return !(this.hNl != null ? !this.hNl.equals(ber_12.hNl) : ber_12.hNl != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hNl != null ? this.hNl.hashCode() : 0);
        n = 31 * n + (this.hNm != null ? this.hNm.hashCode() : 0);
        return n;
    }

    public ber_1 dev() {
        return new ber_1(this);
    }

    public /* synthetic */ beh_2 deb() {
        return this.dev();
    }
}

