/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eMs
 */
public class ems_0
implements enk_0 {
    private final QD<enk_0, eNl> qMO;

    public ems_0(QD<enk_0, eNl> qD) {
        this.qMO = qD;
    }

    @Override
    public byte fAl() {
        return this.qMO.bba().fAl();
    }

    @Override
    public float[] fAm() {
        return this.qMO.bba().fAm();
    }

    @Override
    public int fAn() {
        return this.qMO.bba().fAn();
    }

    @Override
    public int a(int n, short s, ene_0 ene_02) {
        int n2;
        if (this.qMO instanceof eok_0 && n == 0 ? (n2 = this.qMO.bba().a(0, s, ene_0.qPu)) == -1 || n2 == -2 : this.qMO instanceof eON && this.fAn() == 4 && n == 0) {
            return this.qMO.getValue();
        }
        return this.qMO.bba().a(n, s, ene_02);
    }

    @Override
    public float x(int n, short s) {
        float f2;
        if (this.qMO instanceof eok_0 && n == 0 ? (f2 = this.qMO.bba().x(0, s)) == -1.0f || f2 == -2.0f : this.qMO instanceof eON && this.fAn() == 4 && n == 0) {
            return this.qMO.getValue();
        }
        return this.qMO.bba().x(n, s);
    }

    @Override
    public float Rz(int n) {
        float f2;
        if (this.qMO instanceof eok_0 && n == 0 ? (f2 = this.qMO.bba().Rz(0)) == -1.0f || f2 == -2.0f : this.qMO instanceof eON && this.fAn() == 4 && n == 0) {
            return this.qMO.getValue();
        }
        return this.qMO.bba().Rz(n);
    }

    @Override
    public boolean fAo() {
        return this.qMO.bba().fAo();
    }

    @Override
    public boolean fAp() {
        return this.qMO.bba().fAp();
    }

    @Override
    public boolean fAq() {
        return this.qMO.bba().fAq();
    }

    @Override
    public boolean fAr() {
        return this.qMO.bba().fAr();
    }

    @Override
    public enk_0 fAs() {
        return this.qMO.bba().fAs();
    }

    @Override
    public boolean fAt() {
        return this.qMO.bba().fAt();
    }

    @Override
    public boolean beB() {
        return this.qMO.bba().beB();
    }

    @Override
    public boolean fAu() {
        return this.qMO.bba().fAu();
    }

    @Override
    public int fAv() {
        return this.qMO.bba().fAv();
    }

    @Override
    public int fAw() {
        return this.qMO.bba().fAw();
    }

    @Override
    public ang_2 fAx() {
        return this.qMO.bba().fAx();
    }

    @Override
    public float eb(short s) {
        return this.qMO.bba().eb(s);
    }

    @Override
    public float fAy() {
        return this.qMO.bba().fAy();
    }

    @Override
    public void a(Pf pf) {
    }

    @Override
    public void b(Pf pf) {
    }

    @Override
    public void c(Pf pf) {
    }

    @Override
    public void d(Pf pf) {
    }

    @Override
    public void e(Pf pf) {
    }

    @Override
    public Iterator<Pf> fAz() {
        return null;
    }

    @Override
    public Iterator<Pf> fAA() {
        return null;
    }

    @Override
    public aoh_1 fAB() {
        return null;
    }

    @Override
    public float cxm() {
        return 0.0f;
    }

    @Override
    public int cbj() {
        return 0;
    }

    @Override
    public void xV(int n) {
    }

    @Override
    public void lN(boolean bl) {
    }

    @Override
    public List<Pf> fAC() {
        return null;
    }

    @Override
    public boolean f(Pf pf) {
        return false;
    }

    @Override
    public boolean g(Pf pf) {
        return false;
    }

    @Override
    public boolean h(Pf pf) {
        return false;
    }

    @Override
    public boolean i(Pf pf) {
        return false;
    }

    @Override
    public boolean j(Pf pf) {
        return false;
    }

    @Override
    public void a(QB qB) {
    }

    @Override
    public void a(QC qC) {
    }

    @Override
    public void a(QA qA) {
    }

    @Override
    public void lO(boolean bl) {
    }

    @Override
    public boolean cxB() {
        return this.qMO.bba().cxB();
    }

    @Override
    public boolean cxC() {
        return this.qMO.bba().cxC();
    }

    @Override
    public void lP(boolean bl) {
    }

    @Override
    public int aZP() {
        return 0;
    }

    @Override
    public boolean aZz() {
        return this.qMO.bba().aZz();
    }

    @Override
    public boolean aZA() {
        return this.qMO.bba().aZA();
    }

    @Override
    public boolean aZB() {
        return false;
    }

    @Override
    public boolean aZC() {
        return false;
    }

    @Override
    public boolean aZD() {
        return false;
    }

    @Override
    public boolean aZE() {
        return false;
    }

    @Override
    public boolean aZF() {
        return false;
    }

    @Override
    public byte aZG() {
        return this.qMO.bba().aZG();
    }

    @Override
    public int aZH() {
        return this.qMO.bba().aZH();
    }

    @Override
    public int avZ() {
        return this.qMO.bba().avZ();
    }

    @Override
    public boolean df(long l) {
        return this.qMO.bba().df(l);
    }

    @Override
    public anx_1<qu_0> aZI() {
        return this.qMO.bba().aZI();
    }

    @Override
    public BitSet aZJ() {
        return null;
    }

    @Override
    public BitSet aZK() {
        return null;
    }

    @Override
    public BitSet aZL() {
        return null;
    }

    @Override
    public BitSet aZM() {
        return null;
    }

    @Override
    public BitSet aZN() {
        return null;
    }

    @Override
    public BitSet aZO() {
        return null;
    }

    @Override
    public boolean aZQ() {
        return false;
    }

    @Override
    public BitSet aZR() {
        return null;
    }

    @Override
    public qs_0 a(Qk qk, qu_0 qu_02, qm_0 qm_02, vd_0<? extends QD> vd_02, int n, int n2, short s, qu_0 qu_03, qr_0 qr_02, boolean bl) {
        return null;
    }

    @Override
    public aoh_1 aZS() {
        return this.qMO.bba().aZS();
    }

    @Override
    public boolean aZT() {
        return false;
    }

    @Override
    public long aZU() {
        return this.qMO.bba().aZU();
    }

    @Override
    public short aZV() {
        return this.qMO.bba().aZV();
    }

    @Override
    public void S(short s) {
    }

    @Override
    public boolean aZW() {
        return this.qMO.bba().aZW();
    }

    @Override
    public boolean aZX() {
        return this.qMO.bba().aZX();
    }

    @Override
    public QC aZY() {
        return this.qMO.bba().aZY();
    }

    @Override
    public QA aZZ() {
        return this.qMO.bba().aZZ();
    }

    @Override
    public boolean baa() {
        return this.qMO.bba().baa();
    }

    @Override
    public boolean fAD() {
        return this.qMO.bba().fAD();
    }

    @Override
    public boolean fAE() {
        return this.qMO.bba().fAE();
    }

    @Override
    public boolean fAF() {
        return this.qMO.bba().fAF();
    }

    @Override
    public boolean a(eNi eNi2) {
        return false;
    }

    public /* synthetic */ Object clone() {
        return this.fAs();
    }
}

