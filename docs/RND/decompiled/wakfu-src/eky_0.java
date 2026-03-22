/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eKy
 */
public class eky_0
implements eki_0 {
    private static final Logger qCr = Logger.getLogger(eky_0.class);
    protected final Map<Integer, eku_0> qCs = new HashMap<Integer, eku_0>();
    protected final List<ekz_0> qCt = new ArrayList<ekz_0>();
    protected boolean qCk;
    protected final Map<ekb_0, ekd_0> qCu = new EnumMap<ekb_0, ekd_0>(ekb_0.class);
    protected final Map<Integer, Integer> qCv = new HashMap<Integer, Integer>();
    protected boolean qCw;
    protected boolean qCx;

    @Override
    @NotNull
    public eka_0 i(@NotNull eKW eKW2) {
        if (this.qCs.containsKey(eKW2.d())) {
            return eka_0.qCD;
        }
        this.qCs.put(eKW2.d(), new eku_0());
        this.j(eKW2);
        return eka_0.qCy;
    }

    protected void j(@NotNull eKW eKW2) {
        for (ekz_0 ekz_02 : this.qCt) {
            try {
                ekz_02.d(eKW2);
            }
            catch (Exception exception) {
                qCr.error((Object)String.format("Error occured for following class of craftListener : %s during call of onCraftLearned with following args : %s", ekz_02.getClass(), eKW2));
            }
        }
    }

    @Override
    @NotNull
    public eka_0 k(@NotNull eKW eKW2) {
        eku_0 eku_02 = this.qCs.remove(eKW2.d());
        if (eku_02 == null) {
            return eka_0.qCA;
        }
        return eka_0.qCy;
    }

    @Override
    @NotNull
    public eka_0 fs(int n, int n2) {
        eku_0 eku_02 = this.qCs.get(n);
        if (eku_02 == null) {
            return eka_0.qCE;
        }
        boolean bl = eku_02.Qx(n2);
        if (!bl) {
            return eka_0.qCy;
        }
        this.ft(n, n2);
        return eka_0.qCy;
    }

    protected void ft(int n, int n2) {
        for (ekz_0 ekz_02 : this.qCt) {
            try {
                ekz_02.du(n, n2);
            }
            catch (Exception exception) {
                qCr.error((Object)String.format("Error occured for following class of craftListener : %s during call of onRecipeLearned with following args : %s, %s", ekz_02.getClass(), n, n2));
            }
        }
    }

    @Override
    @NotNull
    public Set<Integer> QD(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        if (eku_02 == null) {
            return Collections.emptySet();
        }
        return eku_02.fyo();
    }

    @Override
    public long D(int n, long l) {
        long l2;
        if (n == 0) {
            return 0L;
        }
        if (this.PG(n) >= 200) {
            return this.QI(n);
        }
        eku_0 eku_02 = this.qCs.get(n);
        if (eku_02 == null) {
            qCr.error((Object)("Tentative d'ajout d'XP \u00e0 un m\u00e9tier inconnu " + n), (Throwable)new IllegalArgumentException());
            return 0L;
        }
        long l3 = eku_02.pf();
        if (l3 != (l2 = eku_02.qf(l))) {
            this.E(n, l);
        }
        return l2;
    }

    protected void E(int n, long l) {
        for (ekz_0 ekz_02 : this.qCt) {
            try {
                ekz_02.t(n, l);
            }
            catch (Exception exception) {
                qCr.error((Object)String.format("Error occured for following class of craftListener : %s during call of onCraftXpGained with following args : %s, %s", ekz_02.getClass(), n, l));
            }
        }
    }

    @Override
    public void QE(int n) {
        if (n == 0) {
            return;
        }
        this.qCs.get(n).fyf();
        this.QF(n);
    }

    @Override
    public void Y(int n, boolean bl) {
        if (n == 0) {
            return;
        }
        this.qCs.get(n).lE(bl);
        this.QF(n);
    }

    @Override
    public void t(int n, short s) {
        if (n == 0) {
            return;
        }
        this.qCs.get(n).dQ(s);
        this.QF(n);
    }

    @Override
    public void QF(int n) {
        for (ekz_0 ekz_02 : this.qCt) {
            try {
                ekz_02.Ef(n);
            }
            catch (Exception exception) {
                qCr.error((Object)String.format("Error occured for following class of craftListener : %s during call of notifyCraftSuccess with following args : %s", ekz_02.getClass(), n));
            }
        }
    }

    @Override
    public boolean tX(int n) {
        if (n == 0) {
            return true;
        }
        return this.qCs.containsKey(n);
    }

    @Override
    public short PG(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eKX.qi(eku_02.pf()) : (short)0;
    }

    @Override
    public double F(int n, long l) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eKX.qj(l) : 0.0;
    }

    @Override
    public double QG(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eKX.qj(eku_02.pf()) : 0.0;
    }

    @Override
    public long QH(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eKX.qg(eku_02.pf()) : 0L;
    }

    @Override
    public long QI(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.pf() : 0L;
    }

    @Override
    public int QJ(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.pH() : 0;
    }

    @Override
    public int QK(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.fyk() : 0;
    }

    @Override
    public int QL(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.fyl() : 0;
    }

    @Override
    public int QM(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.pN() : 0;
    }

    @Override
    public short QN(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null ? eku_02.fyn() : (short)0;
    }

    @Override
    public boolean QO(int n) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null && eku_02.fym();
    }

    @Override
    public boolean fym() {
        return this.qCk;
    }

    @Override
    public void lF(boolean bl) {
        this.qCk = bl;
    }

    @Override
    public void Z(int n, boolean bl) {
        eku_0 eku_02 = this.qCs.get(n);
        if (eku_02 == null) {
            return;
        }
        eku_02.lF(bl);
    }

    @Override
    public void fu(int n, int n2) {
        eku_0 eku_02 = this.qCs.get(n);
        if (eku_02 == null) {
            return;
        }
        eku_02.dR((short)n2);
    }

    @Override
    public @Unmodifiable @NotNull Set<Integer> fyp() {
        return Collections.unmodifiableSet(this.qCs.keySet());
    }

    @Override
    public boolean fv(int n, int n2) {
        eku_0 eku_02 = this.qCs.get(n);
        return eku_02 != null && eku_02.Qy(n2);
    }

    protected boolean QP(int n) {
        return n >= 0 && n <= 2000000000;
    }

    protected boolean a(@NotNull ekd_0 ekd_02) {
        return this.QP(ekd_02.fyG()) && this.QP(ekd_02.fyF());
    }

    @Override
    public @Unmodifiable @NotNull Map<ekb_0, ekd_0> qg() {
        return Collections.unmodifiableMap(this.qCu);
    }

    @Override
    public boolean a(ekb_0 ekb_02, @Nullable ekd_0 ekd_02) {
        @Nullable ekd_0 ekd_03 = this.qCu.get((Object)ekb_02);
        if (Objects.equals(ekd_03, ekd_02)) {
            return false;
        }
        if (ekd_02 != null) {
            if (!this.a(ekd_02)) {
                return false;
            }
            this.qCu.put(ekb_02, ekd_02);
        } else {
            this.qCu.remove((Object)ekb_02);
        }
        return true;
    }

    @Override
    public void G(Map<ekb_0, ekd_0> map) {
        this.qCu.clear();
        this.qCu.putAll(map);
    }

    @Override
    public @Unmodifiable @NotNull Map<Integer, Integer> dyy() {
        return Collections.unmodifiableMap(this.qCv);
    }

    @Override
    public boolean f(int n, @Nullable Integer n2) {
        if (!eKK.fyJ().QT(n)) {
            return false;
        }
        @Nullable Integer n3 = this.qCv.get(n);
        if (Objects.equals(n3, n2)) {
            return false;
        }
        if (n2 != null) {
            if (!this.QP(n2)) {
                return false;
            }
            this.qCv.put(n, n2);
        } else {
            this.qCv.remove(n);
        }
        return true;
    }

    @Override
    public void H(@NotNull Map<Integer, Integer> map) {
        this.qCv.clear();
        map.forEach((n, n2) -> {
            if (!this.QP((int)n2) || !eKK.fyJ().QT((int)n)) {
                return;
            }
            this.qCv.put((Integer)n, (Integer)n2);
        });
    }

    @Override
    public boolean fyq() {
        return this.qCw;
    }

    @Override
    public boolean lG(boolean bl) {
        if (this.qCw == bl) {
            return false;
        }
        this.qCw = bl;
        return true;
    }

    @Override
    public boolean fyr() {
        return this.qCx;
    }

    @Override
    public boolean lH(boolean bl) {
        if (this.qCx == bl) {
            return false;
        }
        this.qCx = bl;
        return true;
    }

    @Override
    public int a(@NotNull eKR eKR2, boolean bl) {
        if (bl && !this.qCw) {
            return 0;
        }
        if (this.qCv.containsKey(eKR2.d())) {
            return this.qCv.get(eKR2.d());
        }
        ekb_0 ekb_02 = eKR2.fyW();
        ekd_0 ekd_02 = ekb_02.a(this.qCu, this.qCx).getValue();
        if (ekd_02 == null) {
            return 0;
        }
        return ekd_02.d(eKR2);
    }

    @Override
    public void a(@NotNull ekz_0 ekz_02) {
        if (!this.qCt.contains(ekz_02)) {
            this.qCt.add(ekz_02);
        }
    }

    @Override
    public void b(@NotNull ekz_0 ekz_02) {
        this.qCt.remove(ekz_02);
    }

    @Override
    public void a(@NotNull dt_2 dt_22, boolean bl) {
        boolean bl2 = dt_22.qN();
        this.qCk = bl2 && dt_22.qO().getEnabled();
        aaf_1 aaf_12 = new aaf_1(dt_22.qK());
        this.qCs.clear();
        for (Map.Entry<Integer, dg_1> entry : dt_22.qM().entrySet()) {
            this.qCs.put(entry.getKey(), eku_0.a(entry.getValue(), bl2 ? dt_22.qO().a(entry.getKey(), null) : null));
            aaf_12.wm(entry.getKey());
        }
        eKQ.qEb.p(eKW2 -> {
            if (!aaf_12.vZ(eKW2.d())) {
                this.qCs.put(eKW2.d(), eky_0.l(eKW2));
            }
        });
        if (dt_22.qQ()) {
            this.a(dt_22.qR(), bl);
        }
    }

    @Override
    public void a(@NotNull gj_1 gj_12, boolean bl) {
        this.qCs.clear();
        aaf_1 aaf_12 = new aaf_1(gj_12.qK());
        for (Map.Entry<Integer, gf_2> entry : gj_12.qM().entrySet()) {
            this.qCs.put(entry.getKey(), eku_0.d(entry.getValue()));
            aaf_12.wm(entry.getKey());
        }
        eKQ.qEb.p(eKW2 -> {
            if (!aaf_12.vZ(eKW2.d())) {
                this.qCs.put(eKW2.d(), eky_0.l(eKW2));
            }
        });
        if (gj_12.qQ()) {
            this.a(gj_12.qR(), bl);
        }
    }

    @Override
    public void a(@NotNull dn_2 dn_22, boolean bl) {
        this.qCu.clear();
        for (Map.Entry<Integer, dm_1> entry : dn_22.qh().entrySet()) {
            ekb_0 ekb_02 = ekb_0.dT(entry.getKey().shortValue());
            if (ekb_02 == null) continue;
            dm_1 dm_12 = entry.getValue();
            ekd_0 ekd_02 = new ekd_0(dm_12.sl(), dm_12.sn());
            if (bl && !this.a(ekd_02)) continue;
            this.qCu.put(ekb_02, ekd_02);
        }
        if (bl) {
            this.H(dn_22.ql());
        } else {
            this.qCv.clear();
            this.qCv.putAll(dn_22.ql());
        }
        this.qCw = dn_22.qn();
        this.qCx = dn_22.qp();
    }

    @Override
    @NotNull
    public dt_2 fys() {
        dv_2 dv_22 = dt_2.qU();
        db_1 db_12 = dz_2.rt().c(this.qCk);
        for (Map.Entry<Integer, eku_0> entry : this.qCs.entrySet()) {
            eku_0 eku_02 = entry.getValue();
            dv_22.b(entry.getKey(), eku_02.fyh());
            db_12.b(entry.getKey(), eku_02.fyi());
        }
        dv_22.a(db_12.rz());
        dv_22.d(this.fyw());
        return dv_22.ra();
    }

    @Override
    @NotNull
    public dz_2 fyt() {
        db_1 db_12 = dz_2.rt().c(this.qCk);
        for (Map.Entry<Integer, eku_0> entry : this.qCs.entrySet()) {
            eku_0 eku_02 = entry.getValue();
            db_12.b(entry.getKey(), eku_02.fyi());
        }
        return db_12.rz();
    }

    @Override
    @NotNull
    public ga_2 fyu() {
        return ga_2.CX().a(this.fyv()).f(this.fyt()).Dd();
    }

    @Override
    @NotNull
    public gj_1 fyv() {
        gl_1 gl_12 = gj_1.DB();
        for (Map.Entry<Integer, eku_0> entry : this.qCs.entrySet()) {
            eku_0 eku_02 = entry.getValue();
            gl_12.b(entry.getKey(), eku_02.fyj());
        }
        gl_12.f(this.fyw());
        return gl_12.DH();
    }

    @Override
    @NotNull
    public dn_2 fyw() {
        dp_1 dp_12 = dn_2.qr();
        for (Map.Entry<ekb_0, ekd_0> entry : this.qCu.entrySet()) {
            ekd_0 ekd_02 = entry.getValue();
            dp_12.b((int)entry.getKey().aIi(), dm_1.sp().aN(ekd_02.fyF()).aO(ekd_02.fyG()).sv());
        }
        dp_12.c(this.qCv);
        dp_12.a(this.qCw);
        dp_12.b(this.qCx);
        return dp_12.qx();
    }

    @Override
    @NotNull
    public Map<Integer, Short> fyx() {
        HashMap<Integer, Short> hashMap = new HashMap<Integer, Short>();
        for (Map.Entry<Integer, eku_0> entry : this.qCs.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().cmL());
        }
        return hashMap;
    }

    @NotNull
    public static eku_0 l(@NotNull eKW eKW2) {
        if (eKW2.cmw()) {
            return eKQ.qEb.QW(eKW2.d());
        }
        return new eku_0();
    }

    public Map<Integer, eku_0> qL() {
        return this.qCs;
    }
}

