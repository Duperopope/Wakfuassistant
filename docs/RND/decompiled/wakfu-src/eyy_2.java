/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eYy
 */
public class eyy_2 {
    private final eye_2 rJU;

    public eyy_2(ezu_1 ezu_12) {
        this.rJU = (eye_2)ezu_12;
    }

    public void f(ezz_1 ezz_12) {
        if (this.rJU.jP(ezz_12.Sn()) == null) {
            this.rJU.f(ezz_12);
        }
    }

    public void rx(long l) {
        ezz_1 ezz_12 = this.rJU.jP(l);
        if (ezz_12 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        this.rJU.rx(l);
    }

    public void j(ezv_1 ezv_12) {
        if (this.rJU.Tu(ezv_12.tJ()) != null) {
            throw new fae("Bonus d\u00e9j\u00e0 pr\u00e9sent dans la guilde");
        }
        this.rJU.j(ezv_12);
    }

    public void Tl(int n) {
        ezv_1 ezv_12 = this.rJU.Tu(n);
        if (ezv_12 == null) {
            throw new fae("Bonus non-pr\u00e9sent dans la guilde");
        }
        this.rJU.Tl(n);
    }

    public void g(fab fab2) {
        if (this.rJU.jR(fab2.Sn()) != null) {
            throw new fae("Rank d\u00e9j\u00e0 pr\u00e9sent dans la guilde");
        }
        if (fab2.getName().length() > 16) {
            throw new fae("Le nom de rang demand\u00e9 est trop long");
        }
        this.rJU.g(fab2);
    }

    public void j(long l, short s) {
        fab fab2 = this.rJU.jR(l);
        if (fab2 == null) {
            throw new fae("Rang non-pr\u00e9sent dans la guilde");
        }
        this.rJU.j(l, s);
    }

    public void ry(long l) {
        fab fab2 = this.rJU.jR(l);
        if (fab2 == null) {
            throw new fae("Rang non-pr\u00e9sent dans la guilde");
        }
        if (l == this.rJU.drj()) {
            throw new fae("Impossible de supprimer le plus haut rang de la guilde");
        }
        if (l == this.rJU.dKs()) {
            throw new fae("Impossible de supprimer rang le plus bas de la guilde");
        }
        if (!this.rJU.I(new eyz_1(l))) {
            throw new fae("Des membres de la guildes ont encore ce rang assign\u00e9");
        }
        this.rJU.ry(l);
    }

    public void Tm(int n) {
        if (n < 0) {
            throw new fae("Impossible de retirer des points n\u00e9gatifs");
        }
        this.rJU.Tw((int)Math.max((long)(this.rJU.Yh() - n), 0L));
    }

    public void Tn(int n) {
        if (n < 0) {
            throw new fae("Impossible de retirer des points n\u00e9gatifs");
        }
        this.rJU.Tw((int)Math.max((long)(this.rJU.Yh() - n), 0L));
        this.rJU.Tv((int)Math.max((long)(this.rJU.Yj() - n), 0L));
    }

    public int To(int n) {
        if (n < 0) {
            throw new fae("Impossible d'ajouter des points n\u00e9gatifs");
        }
        if (this.rJU.Yl() <= 0) {
            this.ad(n, false);
            return n;
        }
        this.fPN();
        int n2 = this.rJU.Yl() - this.rJU.fPY();
        if (n2 <= 0) {
            return 0;
        }
        int n3 = Math.min(n, n2);
        this.ad(n3, false);
        return n3;
    }

    public int Tp(int n) {
        if (n < 0) {
            throw new fae("Cannot add negative points to guild");
        }
        this.ad(n, true);
        return n;
    }

    private void fPN() {
        int n;
        int n2 = this.rJU.Yp();
        if (n2 != (n = ue_0.bjV().get(3))) {
            this.rJU.Ty(n);
            this.rJU.Tx(0);
        }
    }

    void ad(int n, boolean bl) {
        this.rJU.Tw((int)Math.min((long)(n + this.rJU.Yh()), Long.MAX_VALUE));
        this.rJU.Tv((int)Math.min((long)(n + this.rJU.Yj()), Long.MAX_VALUE));
        if (!bl) {
            this.rJU.Tx(this.rJU.fPY() + n);
        }
    }

    public void Tq(int n) {
        this.rJU.Tq(n);
    }

    public void ev(short s) {
        if (s < 0) {
            throw new fae("Impossible d'appliquer un niveau n\u00e9gatif");
        }
        if (this.drl().cmL() >= s) {
            throw new fae("Mauvais level \u00e0 d\u00e9bloquer");
        }
        if (s > 10) {
            throw new fae("Impossible d'appliquer un niveau > 10");
        }
        this.rJU.bw(s);
    }

    public void st(String string) {
        this.rJU.cA(VV.bkY().g(string, true));
    }

    public void su(String string) {
        this.rJU.setName(string);
    }

    public void kH(long l) {
        this.rJU.jS(l);
    }

    public void sv(String string) {
        this.rJU.co(VV.bkY().g(string, true));
    }

    public void k(long l, String string) {
        eyj_2 eyj_22 = (eyj_2)this.rJU.jR(l);
        if (eyj_22 == null) {
            throw new fae("Rang non-pr\u00e9sent dans la guilde");
        }
        if (string.length() > 16) {
            throw new fae("Le nom de rang demand\u00e9 est trop long");
        }
        eyj_22.setName(string);
    }

    public void V(long l, long l2) {
        eyj_2 eyj_22 = (eyj_2)this.rJU.jR(l);
        if (eyj_22 == null) {
            throw new fae("Rang non-pr\u00e9sent dans la guilde");
        }
        if (l == this.rJU.drj() && l2 != eyh_2.rLf) {
            throw new fae("Impossible de modifier le plus haut rang de la guilde");
        }
        if (l == this.rJU.dKs() && l2 != eyh_2.rLg) {
            throw new fae("Impossible de modifier rang le plus bas de la guilde");
        }
        eyj_22.rN(l2);
    }

    public void e(long l, byte by) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.fU(by);
    }

    public void B(long l, int n) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.lS(n);
    }

    public void W(long l, long l2) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.ij(l2);
    }

    public void ad(long l, int n) {
        if (this.rJU.fPU() <= 0) {
            return;
        }
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.Le(n);
    }

    public void l(long l, String string) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.setName(string);
    }

    public void p(long l, short s) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.aT(s);
    }

    public void f(long l, byte by) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.aQ(by);
    }

    public void t(long l, long l2) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        fab fab2 = this.rJU.jR(l2);
        if (fab2 == null) {
            throw new fae("Le rank demand\u00e9 n'existe pas");
        }
        eyd_22.rE(l2);
    }

    public void w(long l, boolean bl) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Membre non-pr\u00e9sent dans la guilde");
        }
        eyd_22.rF(ue_0.bjV().bjc().bjB());
        eyd_22.jJ(bl);
    }

    public void d(int n, ux_0 ux_02) {
        eyx_2 eyx_22 = (eyx_2)this.rJU.Tu(n);
        if (eyx_22 == null) {
            throw new fae("Bonus non-pr\u00e9sent dans la guilde");
        }
        if (eyx_22.fPK().i(eyx_22.fPJ())) {
            throw new fae("Bonus " + n + " is already active for guild " + this.rJU.Sn());
        }
        eyx_22.U(ux_02);
        if (eyx_22.fPL()) {
            eyx_22.cCb();
        }
    }

    public void a(long l, List<Mv> list, vb_0 vb_02) {
        eyd_2 eyd_22 = (eyd_2)this.rJU.jP(l);
        if (eyd_22 == null) {
            throw new fae("Unknown guild member " + l + " in guild " + this.rJU.Sn());
        }
        eyd_22.l(list);
        eyd_22.b(vb_02);
    }

    public void Tr(int n) {
        this.rJU.Tr(n);
    }

    public ezu_1 drl() {
        return this.rJU;
    }

    public String toString() {
        return "GuildController{m_guild=" + String.valueOf(this.rJU) + "}";
    }
}

