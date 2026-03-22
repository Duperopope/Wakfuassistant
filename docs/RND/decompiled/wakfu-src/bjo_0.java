/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bJo
 */
public class bjo_0
implements WT,
fnq_0 {
    static final Logger klq = Logger.getLogger(bjo_0.class);
    protected final bhJ klr;
    protected final fnl_0 kls;
    protected bjk_0 kle;
    protected bje_0 klt;
    protected final fns_0 klu = new bjp_0(this);

    public bjo_0(bhJ bhJ2, fnl_0 fnl_02) {
        this.klr = bhJ2;
        this.kls = fnl_02;
        this.aPg();
    }

    protected void aPg() {
        bdj_2 bdj_22 = this.klr.ddI();
        this.kle = new bjk_0(this.kls, bdj_22);
        int n = this.kls.agK();
        this.kle.lf(bjn_0.b(this.kls));
        this.kle.a(bdj_22.bcB());
        this.kle.dT("AnimStatique");
        this.kle.a(aeB.bww());
        this.kle.qR(afX.csq.byy());
        this.kle.at((byte)8);
        this.kle.setVisible(true);
        adn_0.bvh().g(this.kle);
        this.kle.a(this.kls.geM());
        Object r = fgD.fXh().Vd(n);
        if (r != null) {
            this.kle.Bx(((fhc_0)r).aVt());
        }
        bjn_0.a((ZC)this.kle, this.klr);
        this.kle.bpC();
        this.klt = new bje_0(this.kle);
        bdj_22.a(this.klt);
        bdj_22.a(this.klt);
        acd_1 acd_12 = bje_0.V(bdj_22.bvI(), bdj_22.bvJ(), bdj_22.bvK());
        this.kle.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        this.kls.a(this.klu);
    }

    public void eag() {
        adj_0 adj_02 = this.kle.bvb();
        if (adj_02 != null) {
            adj_02.e(this.kle);
        }
        adn_0.bvh().fL(this.kle.Sn());
        this.kle.bpI();
        this.kle = null;
        if (this.klr.dkO()) {
            bdj_2 bdj_22 = this.klr.ddI();
            bdj_22.b(this.klt);
            bdj_22.c(this.klt);
        }
        this.klt = null;
        this.kls.b(this.klu);
    }

    public fns_0 eal() {
        return this.klu;
    }

    @Override
    public void b(boolean bl, WU wU) {
        if (this.kle == null || wU != WU.bQg) {
            return;
        }
        boolean bl2 = this.kls.agM() > 0;
        boolean bl3 = this.kls.agT() <= 0 && this.kls.geP().bjv();
        this.kle.setVisible(bl && bl2 && bl3);
    }

    @Override
    public boolean adO() {
        return true;
    }

    @Override
    public fnl_0 ead() {
        return this.kls;
    }

    @Override
    public long LV() {
        return this.kle.Sn();
    }

    public bdf_1 eam() {
        return this.kle;
    }

    public String toString() {
        return "ServerPetHandlerListener{m_player=" + String.valueOf(this.klr) + "}";
    }
}

