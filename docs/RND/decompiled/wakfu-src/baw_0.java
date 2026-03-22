/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from baW
 */
public final class baw_0
extends eSK
implements bbC,
bbD {
    private long ePP;
    private int egP;
    private final bby hzF;

    private baw_0() {
        this.hzF = new bbB(this).daf();
    }

    public baw_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hzF = bbB2.daf();
    }

    @Override
    public QQ bcv() {
        return new baw_0();
    }

    public baw_0 c(etj_0 etj_02) {
        baw_0 baw_02 = (baw_0)super.b(etj_02);
        baw_02.egP = this.egP;
        baw_02.hzF.b(this.hzF);
        baw_02.ePP = etj_02.Xi();
        baw_02.aPg();
        return baw_02;
    }

    @Override
    public void aPg() {
        super.aPg();
        if (this.biq != null && this.biq.bax() == 20) {
            this.hzF.g(((bgy)this.biq).ddI());
        }
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
        if (this.hzF.dac() != null) {
            this.hzF.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hzF;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hzF != null) {
            return this.hzF.getName();
        }
        return "";
    }

    public long Xi() {
        return this.ePP;
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.c(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.c((etj_0)qS);
    }
}

