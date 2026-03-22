/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import java.util.ArrayList;
import java.util.BitSet;

public final class bbi
extends eST
implements bbC,
bbD,
bbp_2 {
    private static final short hzX = 6;
    private int egP;
    private final bby hzY;
    private CellParticleSystem hzZ;

    private bbi() {
        this.hzY = new bbB(this).bf((short)6).daf();
        this.hzY.a(new bbj());
    }

    public bbi(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string).bf((short)6);
        this.hzY = bbB2.daf();
        this.hzY.a(new bbj());
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        if (this.hzY.dac() != null) {
            this.hzY.dac().e(n, n2, s);
        }
    }

    @Override
    public QQ bcv() {
        return new bbi();
    }

    public bbi j(etj_0 etj_02) {
        bbi bbi2 = (bbi)super.k(etj_02);
        bbi2.egP = this.egP;
        bbi2.hzY.b(this.hzY);
        bbi2.rlV = this.rlV;
        bbi2.aPg();
        return bbi2;
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
        if (this.hzY.dac() != null) {
            this.hzY.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hzY;
    }

    @Override
    public boolean la(String string) {
        if ("AnimMort".equals(string)) {
            return true;
        }
        if ("AnimAttaque".equals(string)) {
            return true;
        }
        if ("AnimHit".equals(string)) {
            return this.a(exx_2.rGi);
        }
        return false;
    }

    @Override
    public void fg(boolean bl) {
        super.fg(bl);
        switch (this.fIN()) {
            case 1: {
                if (this.bci() == aue_0.cVJ().cVK()) break;
                bsS bsS2 = akj_0.ciY().cja();
                if (bsS2 == null) {
                    return;
                }
                QR qR = bsS2.bai();
                if (qR == null) {
                    return;
                }
                ArrayList<eSW> arrayList = new ArrayList<eSW>();
                for (QQ qQ : qR.bdh()) {
                    eSW eSW2;
                    if (qQ.aeV() != etm_0.rnr.aHp() || (eSW2 = (eSW)qQ).bci() != this.bci()) continue;
                    arrayList.add(eSW2);
                }
                for (int i = 0; i < arrayList.size(); ++i) {
                    if (bl) {
                        akj_0.ciY().a((QQ)arrayList.get(i), bsS2);
                        continue;
                    }
                    akj_0.ciY().o((QQ)arrayList.get(i));
                }
                akj_0.ciY().aPc();
                break;
            }
        }
    }

    @Override
    public void bcK() {
        super.bcK();
        bbq_2.dao().a(this.Sn(), this);
    }

    @Override
    public void bcL() {
        super.bcL();
    }

    @Override
    public void aB(float f2, float f3) {
    }

    @Override
    public void e(float f2, float f3, float f4) {
    }

    @Override
    public float bpZ() {
        return 0.0f;
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public String getName() {
        if (this.hzY != null) {
            return this.hzY.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eST k(etj_0 etj_02) {
        return this.j(etj_02);
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.j(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.j((etj_0)qS);
    }
}

