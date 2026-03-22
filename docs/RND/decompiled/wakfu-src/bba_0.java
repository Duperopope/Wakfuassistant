/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

/*
 * Renamed from bba
 */
public final class bba_0
extends eSO
implements WO,
bbC,
bbD {
    private int egP;
    private final bby hzM;

    private bba_0() {
        this.hzM = new bbB(this).daf();
    }

    public bba_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hzM = bbB2.daf();
    }

    @Override
    protected QQ bcv() {
        return new bba_0();
    }

    public bba_0 g(etj_0 etj_02) {
        bba_0 bba_02 = (bba_0)super.b(etj_02);
        bba_02.egP = this.egP;
        bba_02.hzM.b(this.hzM);
        bba_02.aPg();
        return bba_02;
    }

    @Override
    public void aPg() {
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public bby cZE() {
        return this.hzM;
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
    public String getName() {
        if (this.hzM != null) {
            return this.hzM.getName();
        }
        return "";
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
    public axb_2 bnf() {
        return awx_2.dnF;
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.g(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.g((etj_0)qS);
    }
}

