/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.ArrayList;
import java.util.BitSet;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from baY
 */
public final class bay_0
extends eSM
implements WO,
bbC {
    private int egP;
    private final bby hzJ;

    private bay_0() {
        this.hzJ = new bbB(this).daf();
    }

    public bay_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this);
        bbB2.lj(string3).lk(string4).li(string2).lh("");
        this.hzJ = bbB2.daf();
    }

    @Override
    public QQ bcv() {
        return new bay_0();
    }

    public bay_0 e(etj_0 etj_02) {
        bay_0 bay_02 = (bay_0)super.b(etj_02);
        bay_02.egP = this.egP;
        bay_02.hzJ.b(this.hzJ);
        bay_02.aPg();
        return bay_02;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    public int cbt() {
        return this.egP;
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
        String string = aum_0.cWf().a(6, (long)((int)this.bcw()), new Object[0]);
        if (StringUtils.isNotBlank((CharSequence)string)) {
            ahv_22.ceu().c(string).cev();
        }
        ArrayList<String> arrayList = eLL.a(new eLW(this, this.ejt, 0));
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ahv_22.ceH().c(arrayList.get(i));
        }
        return ahv_22.ceL();
    }

    @Override
    public bby cZE() {
        return this.hzJ;
    }

    @Override
    public void aZp() {
        super.aZp();
        cub_1.eSi().a(this);
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hzJ != null) {
            return this.hzJ.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.e(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.e((etj_0)qS);
    }
}

