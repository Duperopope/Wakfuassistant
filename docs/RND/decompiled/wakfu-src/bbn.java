/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbn
extends eSX
implements bbC,
bbD {
    private static final short hAd = 1;
    private int egP;
    private final bby hAe;

    private bbn() {
        this.hAe = new bbB(this).daf();
        this.hAe.a(new bbd_0());
    }

    public bbn(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        bbB2.bf((short)1);
        this.hAe = bbB2.daf();
        this.hAe.a(new bbd_0());
    }

    @Override
    public QQ bcv() {
        return new bbn();
    }

    public bbn p(etj_0 etj_02) {
        bbn bbn2 = (bbn)super.b(etj_02);
        bbn2.egP = this.egP;
        bbn2.hAe.b(this.hAe);
        bbn2.aPg();
        return bbn2;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hAe.dac() != null) {
            this.hAe.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAe;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAe != null) {
            return this.hAe.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.p(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.p((etj_0)qS);
    }
}

