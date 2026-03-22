/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bRI
 */
public class bri_2
extends fls_0 {
    private boolean lbT;
    private boolean lbU;
    private brg_2 lbV;
    private fpu_0 lbW;
    private boolean lbX;

    private bri_2(@NotNull fjm fjm2) {
        super(fjm2);
    }

    public static bri_2 b(@NotNull fjm fjm2) {
        bri_2 bri_22 = new bri_2(fjm2);
        bri_22.reset();
        bri_22.a(new brh_2(bri_22));
        return bri_22;
    }

    public void a(brg_2 brg_22) {
        this.lbV = brg_22;
    }

    public brg_2 ell() {
        return this.lbV;
    }

    @Override
    public void a(fjn_0 fjn_02) {
        super.a(fjn_02);
        this.lbV = new brh_2(this);
        this.lbT = fjn_02.elm();
        this.lbU = fjn_02.els();
    }

    @Override
    public void z(Collection<fkK> collection) {
        for (fkK fkK2 : collection) {
            if (fkK2 != fkK.sCk) continue;
            bqm_0.jbp.b(new brs_0());
            break;
        }
        super.z(collection);
    }

    @Override
    public void h(@NotNull fjo_0 fjo_02) {
        boolean bl;
        super.h(fjo_02);
        bgy bgy2 = (bgy)this.sEm;
        boolean bl2 = bl = bgy2 instanceof bgt_0 && bgy2.Xi() > 0L;
        if (bgy2.bvY() && bl && !fcK.rUe.as(bgy2.Xi(), bgy2.Sn())) {
            eKd eKd2;
            Optional optional = bbs_2.a(eva_1.owr);
            if (optional.isPresent() && (eKd2 = (eKd)optional.get()).dua() == this.sEm.Sn() && eKd2.Xt() != fjo_02.Xt()) {
                eKd2.Le(fjo_02.Xt());
            }
            brx_1.elI().h(fjo_02);
            Bz.aM(brx_1.elI().getName());
            fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "hasNation");
        }
        if (this.lbV != null) {
            this.lbV.g(fjo_02);
        }
    }

    @Override
    public void i(@NotNull fjo_0 fjo_02) {
        super.i(fjo_02);
        this.lbT = false;
        this.lbU = false;
    }

    @Override
    public void reset() {
        super.reset();
        this.sEn.clear();
        this.sEq = false;
        if (this.sEp != null) {
            this.sEp.reset();
            this.eln();
        }
    }

    @Override
    public boolean elm() {
        return this.lbT || super.elm();
    }

    public void iu(boolean bl) {
        this.lbT = bl;
        if (this.lbV != null) {
            this.lbV.elg();
        }
    }

    @Override
    public void Jo(int n) {
        this.sEo = n;
        if (this.sEp != null) {
            sEg.info((Object)"Cooldown de Purgation d\u00e9j\u00e0 d\u00e9marr\u00e9");
            return;
        }
        this.sEp = new brj_2(this);
        abg_2.bUP().a((Runnable)this.sEp, 1000L, -1);
        this.sEp.elv();
    }

    @Override
    public void eln() {
        abg_2.bUP().h(this.sEp);
        this.sEp = null;
        this.sEo = -1;
    }

    public void elo() {
        abg_2.bUP().h(this.sEp);
        this.sEp.elu();
        this.sEp = null;
        this.sEo = -1;
    }

    public void Jn(int n) {
        if (this.lbV != null) {
            this.lbV.Jn(n);
        }
    }

    public void dW(int n, int n2) {
        fkd_0 fkd_02 = fkf_0.gcc().WJ(n2);
        int n3 = this.sEn.get(n) - n2;
        ((bhJ)this.sEm).a(n, this, fkd_02, this.WA(n), n3);
        if (this.sEo == n) {
            if (this.sEp != null) {
                this.sEp.dX(n3, n2);
            } else {
                sEg.warn((Object)"Donn\u00e9es erron\u00e9es dans le client, on ne peut pas purger une peine de prison sans avoir de cooldown");
            }
        }
        if (this.lbV != null) {
            this.lbV.dW(n, n2);
        }
    }

    public fjm elp() {
        return this.sEm;
    }

    public void elh() {
        if (this.lbV != null) {
            this.lbV.elh();
        }
    }

    public void elq() {
        if (this.lbV != null) {
            this.lbV.elk();
        }
    }

    public void elr() {
        if (this.lbV != null) {
            this.lbV.djo();
        }
    }

    @Override
    public void iv(boolean bl) {
        super.iv(bl);
        if (this.lbV != null) {
            this.lbV.eli();
        }
    }

    @Override
    public boolean els() {
        return this.lbU;
    }

    public void iw(boolean bl) {
        this.lbU = bl;
    }

    @Override
    public void b(fkL fkL2) {
        super.b(fkL2);
        this.elr();
        if (this.sEm == aue_0.cVJ().cVK()) {
            aym_0.cYl().cYn();
        }
    }

    @Override
    public void c(fpu_0 fpu_02) {
        this.lbW = fpu_02;
    }

    @Override
    public fpu_0 dkC() {
        if (this.sEm instanceof bgt_0) {
            return ((bgt_0)this.sEm).dkC();
        }
        return this.lbW == null ? fpu_0.sRd : this.lbW;
    }

    @Override
    public void ix(boolean bl) {
        this.lbX = bl;
    }

    @Override
    public boolean elt() {
        return this.lbX;
    }
}

