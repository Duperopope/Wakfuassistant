/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fnM
 */
public class fnm_0 {
    private final fnq_0 sKw;
    protected exP rZz;

    public fnm_0(fnq_0 fnq_02, exP exP2) {
        this.sKw = fnq_02;
        this.rZz = exP2;
    }

    public fnm_0(fnq_0 fnq_02) {
        this.sKw = fnq_02;
    }

    public final void sR(String string) {
        boolean bl;
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        if (string.equals(fnr_02.getName())) {
            throw new foD("Le changement de nom demand\u00e9 est identique \u00e0 l'ancien");
        }
        boolean bl2 = bl = !VV.bkY().dB(string);
        if (bl) {
            throw new foD("Nom de familier " + string + " invalid\u00e9 par le " + VV.class.getSimpleName());
        }
        fnr_02.setName(string);
    }

    public final void Xr(int n) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        fnr_02.lQ(n);
    }

    public final void ac(ux_0 ux_02) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        fnr_02.ac(ux_02);
    }

    public final void geR() {
        this.ad(ue_0.bjV().bjc());
    }

    public final void ad(ux_0 ux_02) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        fnr_02.ad(this.ae(ux_02));
    }

    private ux_0 ae(ux_0 ux_02) {
        uw_0 uw_02 = new uw_0(ux_02);
        uw_02.pI(23);
        uw_02.pH(59);
        uw_02.pG(59);
        return uw_02;
    }

    public final void Xs(int n) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        if (n > 0 && !fnm_0.a(n, fnr_02)) {
            throw new foD("We cannot equip the pet  " + fnr_02.geL().d() + " with item " + n);
        }
        fnr_02.Xz(n);
    }

    private static boolean a(int n, fnr_0 fnr_02) {
        boolean bl = fnr_02.geL().gfz();
        if (bl && fou_0.sLB.aA(n) != null) {
            return true;
        }
        if (!bl && foC.sLW.aF(n) != null) {
            return true;
        }
        return foy_0.sLJ.XS(n);
    }

    public final void geS() {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        if (fnr_02.agK() <= 0) {
            throw new foD("Le Familier n'a pas d'\u00e9quipement");
        }
        fnr_02.Xz(0);
    }

    public boolean Xt(int n) {
        evd_2 evd_22;
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        int n2 = fnr_02.agM();
        if (this.rZz != null && n2 > n && (evd_22 = ((eve_2)((Object)this.rZz)).dpL()).b(evv_1.oxp)) {
            return false;
        }
        fnr_02.Xx(n);
        return true;
    }

    public void Xu(int n) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        ((fnr_0)this.sKw.ead()).Xy(n);
    }

    public boolean Xv(int n) {
        fnl_0 fnl_02 = this.geW().ead();
        int n2 = fnl_02.agK();
        if (n2 <= 0) {
            return fnl_02.geL().XK(n);
        }
        if (foy_0.sLJ.XS(n2)) {
            Optional<fov_0> optional = foy_0.sLJ.XT(n2);
            return optional.map(fov_02 -> fov_02.XK(n)).orElse(false);
        }
        foA foA2 = foC.sLW.aF(n2);
        if (foA2 == null) {
            return false;
        }
        int n3 = foA2.ctm();
        fov_0 fov_03 = foy_0.sLJ.XQ(n3);
        if (fov_03 == null) {
            return false;
        }
        return fov_03.XK(n);
    }

    public int geT() {
        fnl_0 fnl_02 = this.geW().ead();
        if (fnl_02.agK() <= 0) {
            return fnl_02.geL().gfD();
        }
        if (foC.sLW.XI(fnl_02.agK())) {
            int n = foC.sLW.aF(fnl_02.agK()).ctm();
            fov_0 fov_02 = foy_0.sLJ.XQ(n);
            if (fov_02 == null) {
                return 0;
            }
            return fov_02.gfD();
        }
        Optional<fov_0> optional = foy_0.sLJ.XT(fnl_02.agK());
        return optional.map(fov_0::gfD).orElse(0);
    }

    public final void Xw(int n) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        if (fnr_02.geQ()) {
            throw new foD("Le familier est d\u00e9j\u00e0 endormi");
        }
        if (fnr_02.agT() > 0) {
            throw new foD("Le familier est d\u00e9j\u00e0 endormi par l'item " + fnr_02.agT());
        }
        if (!fnr_02.geL().XL(n)) {
            throw new foD("On ne peut pas endormir le familier avec l'item " + n);
        }
        fnr_02.Xw(n);
    }

    public final void af(ux_0 ux_02) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        if (fnr_02.geQ()) {
            throw new foD("Le familier est d\u00e9j\u00e0 endormi");
        }
        if (!fnr_02.geP().bjv()) {
            throw new foD("Le familier est d\u00e9j\u00e0 endormi depuis " + String.valueOf(fnr_02.geP()));
        }
        ux_0 ux_03 = ue_0.bjV().bjc();
        ua_0 ua_02 = fnr_02.geL().XM(fnr_02.agT());
        uw_0 uw_02 = new uw_0(ux_02);
        uw_02.a(ua_02);
        if (uw_02.g(ux_03)) {
            throw new foD("Impossible de red\u00e9finir une date se terminant dans le pass\u00e9");
        }
        fnr_02.af(ux_02);
    }

    public final void geU() {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        fnr_02.Xw(0);
    }

    public final void geV() {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        fnr_0 fnr_02 = (fnr_0)this.sKw.ead();
        fnr_02.af(uw_0.bvJ);
    }

    protected void c(fns_0 fns_02) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        this.sKw.ead().a(fns_02);
    }

    protected void d(fns_0 fns_02) {
        if (!this.sKw.adO()) {
            throw new foE("Il n'y a aucun pet avec lequel interagir");
        }
        this.sKw.ead().b(fns_02);
    }

    public fnq_0 geW() {
        return this.sKw;
    }

    public String toString() {
        return "PetController{m_petHolder=" + String.valueOf(this.sKw) + "}";
    }
}

