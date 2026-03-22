/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from bbc
 */
public final class bbc_0
extends eSR
implements WO,
bbC,
bbD {
    private int egP;
    private final bby hzP;

    private bbc_0() {
        this.hzP = new bbB(this).daf();
    }

    public bbc_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hzP = bbB2.daf();
    }

    @Override
    public QQ bcv() {
        return new bbc_0();
    }

    public bbc_0 i(etj_0 etj_02) {
        bbc_0 bbc_02 = (bbc_0)super.b(etj_02);
        bbc_02.egP = this.egP;
        bbc_02.hzP.b(this.hzP);
        bbc_02.aPg();
        return bbc_02;
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
        if (this.hzP.dac() != null) {
            this.hzP.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hzP;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public int bnd() {
        return 0;
    }

    @Override
    public axb_2 bnf() {
        return awx_2.dnF;
    }

    @Override
    public String bne() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(aum_0.cWf().a(6, (long)((int)this.bcw()), new Object[0])).cev();
        ArrayList<String> arrayList = eLL.a(new eLW(this, this.ejt, 0));
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ahv_22.ceH().c(arrayList.get(i));
        }
        return ahv_22.ceL();
    }

    @Override
    public String getName() {
        if (this.hzP != null) {
            return this.hzP.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.i(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.i((etj_0)qS);
    }
}

