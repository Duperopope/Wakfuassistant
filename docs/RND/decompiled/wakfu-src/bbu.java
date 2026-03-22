/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbu
extends etb_0
implements bbC,
bbD {
    private int egP;
    private bby hzE;

    private bbu() {
    }

    public bbu(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hzE = bbB2.daf();
    }

    protected bbu cZL() {
        return new bbu();
    }

    public bbu u(etj_0 etj_02) {
        bbu bbu2 = (bbu)super.b(etj_02);
        bbu2.egP = this.egP;
        bbu2.hzE = new bbB(bbu2).daf();
        bbu2.hzE.b(this.hzE);
        bbu2.aPg();
        return bbu2;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hzE.dac() != null) {
            this.hzE.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hzE;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hzE != null) {
            return this.hzE.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.u(etj_02);
    }

    @Override
    protected /* synthetic */ QQ bcv() {
        return this.cZL();
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.u((etj_0)qS);
    }
}

