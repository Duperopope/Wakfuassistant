/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bso
 */
public class bso_0
extends RZ<ffV, bsp_0>
implements aeh_2 {
    public static final String jgf = "exchangeId";
    public static final String jgg = "localItemsExchange";
    public static final String jgh = "remoteItemsExchange";
    public static final String jgi = "localMoneyExchange";
    public static final String jgj = "remoteMoneyExchange";
    public static final String jgk = "remoteUserState";
    public static final String jgl = "localUserState";
    public static final String jgm = "kamaValueHasChanged";
    public static final String[] jgn = new String[]{"exchangeId", "localItemsExchange", "remoteItemsExchange", "localMoneyExchange", "remoteMoneyExchange", "remoteUserState", "localUserState", "kamaValueHasChanged"};
    @Nullable
    private fik_2 jgo = null;
    private static final NumberFormat jgp = DecimalFormat.getIntegerInstance();
    private ett_0 jgq = ett_0.rqv;
    protected long jgr;
    private long jgs;

    public bso_0(long l, bsp_0 bsp_02, bsp_0 bsp_03) {
        super(l, bsp_02, bsp_03);
    }

    protected boolean a(bsp_0 bsp_02) {
        bsp_02.cXb().i(true, false);
        bkq_2 bkq_22 = new bkq_2(this);
        if (bkq_22.dsn()) {
            bsp_02.a(bkq_22);
            bkq_22.bIH();
            return true;
        }
        return false;
    }

    protected void b(bsp_0 bsp_02) {
        bkq_2 bkq_22 = bsp_02.dFJ();
        if (bkq_22 != null) {
            bsp_02.dFL();
        }
    }

    public void kl(long l) {
        this.jgr = l;
    }

    public long dFv() {
        return this.jgr;
    }

    public void a(@NotNull fik_2 fik_22) {
        this.jgo = fik_22;
    }

    @Nullable
    public fik_2 dFw() {
        return this.jgo;
    }

    public boolean dFx() {
        return ((bsp_0)this.bnp).bvY();
    }

    @Override
    protected boolean bfs() {
        return true;
    }

    @Override
    protected boolean bft() {
        return true;
    }

    @Override
    protected boolean bfw() {
        return this.jgq == ett_0.rqv;
    }

    @Override
    protected boolean bfv() {
        return false;
    }

    public void r(long l, long l2) {
        bsp_0 bsp_02 = (bsp_0)this.dP(l);
        if (bsp_02 == null) {
            bno.error((Object)"[Trade] On essaye de modifier les kamas d'un echange pour un utilisateur qui n'y est pas");
            return;
        }
        if (l2 < 0L) {
            bno.error((Object)("[Trade] Impossible de placer une quantit\u00e9 n\u00e9gative de kamas dans l'\u00e9change. La quantit\u00e9 de monnaie donn\u00e9e par " + bsp_02.getName() + " n'a pas \u00e9t\u00e9 mise a jour"));
            return;
        }
        ((bsp_0)this.bnp).bj(false);
        ((bsp_0)this.bnq).bj(false);
        long l3 = l2;
        if (bsp_02.bvY()) {
            l3 = bsp_02.beL() - l2;
        }
        bsp_02.dH(l2);
        bno.info((Object)("[Trade] Le joueur " + bsp_02.getName() + " mets la somme de kamas \u00e0 " + l2));
        this.b(etr_0.a((RZ)this, Sy.boQ, l, l3));
    }

    @Override
    public void a(bsp_0 bsp_02, ffV ffV2, short s) {
        this.a(bsp_02, ffV2, s, false);
        bno.info((Object)("[Trade] Le joueur " + bsp_02.getName() + " ajoute " + s + "x" + ffV2.getName() + " (refId=" + ffV2.avr() + ")"));
    }

    @Override
    public void a(bsp_0 bsp_02, ffV ffV2, short s, boolean bl) {
        if (!this.d(bsp_02)) {
            return;
        }
        if (s < 1) {
            bno.error((Object)("[Trade] Cannot add less than 1 of an item, but got " + s));
            return;
        }
        ((bsp_0)this.bnp).bj(false);
        ((bsp_0)this.bnq).bj(false);
        ffV ffV3 = (ffV)bsp_02.dE(ffV2.LV());
        int n = Optional.ofNullable(ffV3).map(ffV::bfd).orElse((short)0) + s;
        if (this.bfv() && n > ffV2.bfd()) {
            bno.warn((Object)String.format("[Trade] %d is adding too many items to exchange: %d but only has %d", bsp_02.Sn(), n, ffV2.bfd()));
            return;
        }
        if (ffV3 != null) {
            if (bl) {
                ffV3.ak(s);
            } else {
                ffV3.al(s);
            }
        } else {
            ffV ffV4 = ffV2.fVU();
            ffV4.ak(s);
            bsp_02.a(ffV4.LV(), ffV4);
        }
        if (!bl) {
            this.b(Sw.a(this, Sy.boR, bsp_02.Sn(), ffV2, s));
        }
    }

    @Override
    public void b(bsp_0 bsp_02, ffV ffV2, short s) {
        super.b(bsp_02, ffV2, s);
        bno.info((Object)("[Trade] Le joueur " + bsp_02.getName() + " retire " + s + "x" + ffV2.getName() + " (refId=" + ffV2.avr() + ")"));
    }

    @Override
    protected void bfx() {
        bsp_0 bsp_02 = this.dFG();
        bsp_0 bsp_03 = this.dFH();
        assert (bsp_02 != null && bsp_03 != null);
        bno.info((Object)"[Trade] Fin de l'\u00e9change");
        String string = "[Trade] le joueur " + bsp_02.getName() + " donne : " + bsp_02.beL() + "K ; ";
        if (!bsp_02.beJ()) {
            for (Object object : bsp_02.beW()) {
                string = string + ((ffV)object).bfd() + "x" + ((ffV)object).getName() + " (refId=" + ((ffV)object).avr() + ") ";
            }
        }
        string = string + "\nle joueur " + bsp_03.getName() + " donne : " + bsp_03.beL() + "K ; ";
        if (!bsp_03.beJ()) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            for (ffV ffV2 : bsp_03.beW()) {
                string = string + ffV2.bfd() + "x" + ffV2.getName() + " (refId=" + ffV2.avr() + ") ";
                ffV ffV3 = ffV2.fVU();
                ffs_0 ffs_02 = bgt_02.dno().cw(ffV3);
                if (ffs_02 != null) continue;
                bno.error((Object)("[Trade] On a pas pu ajouter les " + ffV2.bfd() + "de " + ffV2.getName() + " a l'inventaire local"));
            }
        }
        bno.info((Object)string);
    }

    @Override
    public boolean dT(long l) {
        return ((bsp_0)this.bnp).dF(l) || ((bsp_0)this.bnq).dF(l);
    }

    @Override
    public String[] bxk() {
        return jgn;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jgf)) {
            return this.Sn();
        }
        if (string.equals(jgl)) {
            return this.jgq == ett_0.rqv ? (this.dFG().aLB() ? 1 : 0) : -1;
        }
        if (string.equals(jgk)) {
            return this.jgq == ett_0.rqv ? (this.dFH().aLB() ? 1 : 0) : -1;
        }
        if (string.equals(jgg)) {
            return this.c(this.dFG());
        }
        if (string.equals(jgh)) {
            return this.c(this.dFH());
        }
        if (string.equals(jgi)) {
            return this.jgs == 0L ? "" : aum_0.cWf().cQ(this.jgs);
        }
        if (string.equals(jgj)) {
            return jgp.format(this.dFH().beL());
        }
        if (jgm.equals(string)) {
            return this.dFG().beL() != this.jgs;
        }
        return null;
    }

    private Collection<ffV> c(bsp_0 bsp_02) {
        if (!bsp_02.beJ()) {
            ArrayList<ffV> arrayList = new ArrayList<ffV>();
            for (ffV ffV2 : bsp_02.beW()) {
                if (ffV2.bfd() <= 0) continue;
                arrayList.add(ffV2);
            }
            return arrayList;
        }
        return null;
    }

    public void dFy() {
        fse_1.gFu().a((aef_2)this, jgg);
    }

    public void dFz() {
        fse_1.gFu().a((aef_2)this, jgh);
    }

    public void dFA() {
        fse_1.gFu().a((aef_2)this, jgi);
    }

    public void dFB() {
        fse_1.gFu().a((aef_2)this, jgj);
    }

    public void dFC() {
        fse_1.gFu().a((aef_2)this, jgl);
    }

    public void dFD() {
        fse_1.gFu().a((aef_2)this, jgk);
    }

    public ett_0 dFE() {
        return this.jgq;
    }

    public void a(ett_0 ett_02) {
        this.jgq = ett_02;
    }

    public String dFF() {
        return aum_0.cWf().c("exchange.error." + String.valueOf((Object)this.jgq), new Object[0]);
    }

    public bsp_0 dFG() {
        return (bsp_0)this.dP(aue_0.cVJ().cVK().Sn());
    }

    public bsp_0 dFH() {
        return this.e(this.dFG());
    }

    public void km(long l) {
        fgj_0 fgj_02 = aue_0.cVJ().cVK().cWp();
        this.jgs = fgj_02 != null ? Math.min(fgj_02.exS(), l) : l;
        fse_1.gFu().a((aef_2)this, jgm, jgi);
    }

    public long dFI() {
        return this.jgs;
    }

    @Override
    protected /* synthetic */ void c(RQ rQ) {
        this.b((bsp_0)rQ);
    }

    @Override
    protected /* synthetic */ boolean b(RQ rQ) {
        return this.a((bsp_0)rQ);
    }
}

