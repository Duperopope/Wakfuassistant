/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdG
 */
public class bdg_2
extends beh_2 {
    public final String hMg;
    private final String hMh;
    bdf_1 hMi;
    bje_0 hMj;

    public bdg_2(enk_0 enk_02, String string, String string2) {
        super(enk_02);
        this.hMg = string;
        this.hMh = string2;
        this.hMi = null;
        this.hMj = null;
    }

    private bdg_2(bdg_2 bdg_22) {
        super(bdg_22.hMZ);
        this.hMg = bdg_22.hMg;
        this.hMh = bdg_22.hMh;
        this.hMi = null;
        this.hMj = null;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        if (bdj_22.dcP() != aue_0.cVJ().cVK()) {
            return;
        }
        if (bdj_22.dcP().djT() && bdj_22.dcP().dkZ().dGp() != etw_0.rqW) {
            return;
        }
        bdh_2 bdh_22 = new bdh_2(this, aym_2.bSE());
        bdh_22.lf(this.hMg);
        bdh_22.a(abi_1.dzk);
        bdh_22.dT("AnimStatique");
        bdh_22.qR(afX.csq.byy());
        bdh_22.a(aeB.bww());
        bdh_22.at((byte)4);
        bdh_22.e(bdj_22.bcC(), bdj_22.bcD(), bdj_22.bcE());
        adn_0.bvh().g(bdh_22);
        this.hMj = new bje_0(bdh_22, true);
        bdj_22.a(this.hMj);
        bdj_22.a(this.hMj);
        acd_1 acd_12 = bje_0.V(bdj_22.bvI(), bdj_22.bvJ(), bdj_22.bvK());
        bdh_22.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        this.hMi = bdh_22;
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
        bdg_2 bdg_22 = (bdg_2)object;
        if (this.hMh != null ? !this.hMh.equals(bdg_22.hMh) : bdg_22.hMh != null) {
            return false;
        }
        return !(this.hMg != null ? !this.hMg.equals(bdg_22.hMg) : bdg_22.hMg != null);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMg != null ? this.hMg.hashCode() : 0);
        n = 31 * n + (this.hMh != null ? this.hMh.hashCode() : 0);
        return n;
    }

    public bdg_2 ddZ() {
        return new bdg_2(this);
    }

    public bdf_1 dea() {
        return this.hMi;
    }

    public /* synthetic */ beh_2 deb() {
        return this.ddZ();
    }
}

