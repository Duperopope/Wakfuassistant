/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from baV
 */
public class bav_0
extends eSJ
implements WO,
bbC,
bbD {
    private int egP;
    private final bby hzE;

    public bav_0() {
        this.hzE = new bbB(this).daf();
    }

    public bav_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hzE = bbB2.daf();
    }

    @Override
    protected QQ bcv() {
        return new bav_0();
    }

    public bav_0 a(etj_0 etj_02) {
        bav_0 bav_02 = (bav_0)super.b(etj_02);
        bav_02.egP = this.egP;
        bav_02.hzE.b(this.hzE);
        bav_02.aPg();
        return bav_02;
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
        if (this.hzE.dac() != null) {
            this.hzE.dac().a(this.bcB());
        }
    }

    @Override
    public int bnd() {
        return 0;
    }

    @Override
    public String bne() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(this.getName());
        ArrayList<String> arrayList = eLL.a(new eLW(this, this.ejt, 0));
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ahv_22.ceH().c(arrayList.get(i));
        }
        return ahv_22.ceL();
    }

    @Override
    public String getName() {
        if (this.hzE != null) {
            return this.hzE.getName();
        }
        return "";
    }

    @Override
    public axb_2 bnf() {
        return awx_2.dnF;
    }

    @Override
    public bby cZE() {
        return this.hzE;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.a(etj_02);
    }
}

