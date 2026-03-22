/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eKH
 */
public class ekh_0
implements eki_0 {
    @NotNull
    protected eki_0 qDC;
    @NotNull
    private final Set<ekz_0> qDD = new HashSet<ekz_0>();
    @NotNull
    private final ekz_0 qDE = new eKL(this.qDD);

    public ekh_0(@NotNull eki_0 eki_02) {
        this.qDC = eki_02;
        this.qDC.a(this.qDE);
    }

    public void a(@NotNull eki_0 eki_02) {
        this.qDC.b(this.qDE);
        this.qDC = eki_02;
        this.qDC.a(this.qDE);
    }

    @Override
    public void a(@NotNull ekz_0 ekz_02) {
        this.qDD.add(ekz_02);
    }

    @Override
    public void b(@NotNull ekz_0 ekz_02) {
        this.qDD.remove(ekz_02);
    }

    @Override
    @Generated
    public eka_0 i(eKW eKW2) {
        return this.qDC.i(eKW2);
    }

    @Override
    @Generated
    public eka_0 k(eKW eKW2) {
        return this.qDC.k(eKW2);
    }

    @Override
    @Generated
    public eka_0 fs(int n, int n2) {
        return this.qDC.fs(n, n2);
    }

    @Override
    @Generated
    public Set<Integer> QD(int n) {
        return this.qDC.QD(n);
    }

    @Override
    @Generated
    public Set<eKR> QS(int n) {
        return this.qDC.QS(n);
    }

    @Override
    @Generated
    public Set<eKR> fyI() {
        return this.qDC.fyI();
    }

    @Override
    @Generated
    public long d(int n, long l, long l2) {
        return this.qDC.d(n, l, l2);
    }

    @Override
    @Generated
    public long D(int n, long l) {
        return this.qDC.D(n, l);
    }

    @Override
    @Generated
    public void QE(int n) {
        this.qDC.QE(n);
    }

    @Override
    @Generated
    public void Y(int n, boolean bl) {
        this.qDC.Y(n, bl);
    }

    @Override
    @Generated
    public void t(int n, short s) {
        this.qDC.t(n, s);
    }

    @Override
    @Generated
    public void QF(int n) {
        this.qDC.QF(n);
    }

    @Override
    @Generated
    public boolean tX(int n) {
        return this.qDC.tX(n);
    }

    @Override
    @Generated
    public short PG(int n) {
        return this.qDC.PG(n);
    }

    @Override
    @Generated
    public double F(int n, long l) {
        return this.qDC.F(n, l);
    }

    @Override
    @Generated
    public double QG(int n) {
        return this.qDC.QG(n);
    }

    @Override
    @Generated
    public long QH(int n) {
        return this.qDC.QH(n);
    }

    @Override
    @Generated
    public long QI(int n) {
        return this.qDC.QI(n);
    }

    @Override
    @Generated
    public int QJ(int n) {
        return this.qDC.QJ(n);
    }

    @Override
    @Generated
    public int QK(int n) {
        return this.qDC.QK(n);
    }

    @Override
    @Generated
    public int QL(int n) {
        return this.qDC.QL(n);
    }

    @Override
    @Generated
    public int QM(int n) {
        return this.qDC.QM(n);
    }

    @Override
    @Generated
    public short QN(int n) {
        return this.qDC.QN(n);
    }

    @Override
    @Generated
    public boolean QO(int n) {
        return this.qDC.QO(n);
    }

    @Override
    @Generated
    public boolean fym() {
        return this.qDC.fym();
    }

    @Override
    @Generated
    public void lF(boolean bl) {
        this.qDC.lF(bl);
    }

    @Override
    @Generated
    public void Z(int n, boolean bl) {
        this.qDC.Z(n, bl);
    }

    @Override
    @Generated
    public void fu(int n, int n2) {
        this.qDC.fu(n, n2);
    }

    @Override
    @Generated
    public Set<Integer> fyp() {
        return this.qDC.fyp();
    }

    @Override
    @Generated
    public boolean fv(int n, int n2) {
        return this.qDC.fv(n, n2);
    }

    @Override
    @Generated
    public boolean h(eKR eKR2) {
        return this.qDC.h(eKR2);
    }

    @Override
    @Generated
    public Map<ekb_0, ekd_0> qg() {
        return this.qDC.qg();
    }

    @Override
    @Generated
    public boolean a(ekb_0 ekb_02, ekd_0 ekd_02) {
        return this.qDC.a(ekb_02, ekd_02);
    }

    @Override
    @Generated
    public void G(Map<ekb_0, ekd_0> map) {
        this.qDC.G(map);
    }

    @Override
    @Generated
    public Map<Integer, Integer> dyy() {
        return this.qDC.dyy();
    }

    @Override
    @Generated
    public boolean f(int n, Integer n2) {
        return this.qDC.f(n, n2);
    }

    @Override
    @Generated
    public void H(Map<Integer, Integer> map) {
        this.qDC.H(map);
    }

    @Override
    @Generated
    public boolean fyq() {
        return this.qDC.fyq();
    }

    @Override
    @Generated
    public boolean lG(boolean bl) {
        return this.qDC.lG(bl);
    }

    @Override
    @Generated
    public boolean fyr() {
        return this.qDC.fyr();
    }

    @Override
    @Generated
    public boolean lH(boolean bl) {
        return this.qDC.lH(bl);
    }

    @Override
    @Generated
    public int a(eKR eKR2, boolean bl) {
        return this.qDC.a(eKR2, bl);
    }

    @Override
    @Generated
    public void d(dt_2 dt_22) {
        this.qDC.d(dt_22);
    }

    @Override
    @Generated
    public void a(dt_2 dt_22, boolean bl) {
        this.qDC.a(dt_22, bl);
    }

    @Override
    @Generated
    public void f(gj_1 gj_12) {
        this.qDC.f(gj_12);
    }

    @Override
    @Generated
    public void a(gj_1 gj_12, boolean bl) {
        this.qDC.a(gj_12, bl);
    }

    @Override
    @Generated
    public void i(dn_2 dn_22) {
        this.qDC.i(dn_22);
    }

    @Override
    @Generated
    public void a(dn_2 dn_22, boolean bl) {
        this.qDC.a(dn_22, bl);
    }

    @Override
    @Generated
    public dt_2 fys() {
        return this.qDC.fys();
    }

    @Override
    @Generated
    public dz_2 fyt() {
        return this.qDC.fyt();
    }

    @Override
    @Generated
    public ga_2 fyu() {
        return this.qDC.fyu();
    }

    @Override
    @Generated
    public gj_1 fyv() {
        return this.qDC.fyv();
    }

    @Override
    @Generated
    public dn_2 fyw() {
        return this.qDC.fyw();
    }

    @Override
    @Generated
    public Map<Integer, Short> fyx() {
        return this.qDC.fyx();
    }
}

