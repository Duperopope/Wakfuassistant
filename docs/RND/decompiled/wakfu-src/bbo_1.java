/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bBO
 */
public class bbo_1
extends bCA
implements eIy {
    static final Logger jGC = Logger.getLogger(bbo_1.class);
    long aDh;
    protected fdd_0 jGD;
    private final fi_1 jGE = new bbp_0(this, 8);

    @Override
    public void c(ng_1 ng_12) {
        jGC.info((Object)("[ON VIEW UPDATED] Stool : " + String.valueOf(ng_12)));
    }

    @Override
    public void aVI() {
        super.aVI();
        this.a(RJ.bmu);
        this.bf(false);
        this.bi(false);
        this.ht(false);
        this.aDh = 0L;
        assert (this.jGD == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGD = null;
    }

    @Override
    public void dNq() {
        if (BH.aU(this.baB)) {
            this.jGD = null;
            return;
        }
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jGC.error((Object)("[LD] L'IE de Stool " + this.aXv + " doit avoir 0 ou 1 param\u00e8tre"));
            return;
        }
        fdd_0 fdd_02 = (fdd_0)fda_0.rWI.a(fdv_0.rZd, Integer.valueOf(stringArray[0]));
        if (fdd_02 == null) {
            jGC.error((Object)("[LD] L'IE de Stool " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jGD = fdd_02;
    }

    @Override
    protected fi_1 bey() {
        return this.jGE;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        bhJ bhJ2 = (bhJ)rG;
        if (!this.ao(bhJ2)) {
            return true;
        }
        this.b(rw_02);
        switch (rw_02) {
            case bkP: 
            case bkQ: {
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        if (this.dPR() == 0L) {
            return rw_0.bkP;
        }
        return rw_0.bkR;
    }

    @Override
    public rw_0[] dNf() {
        if (this.dPR() == 0L) {
            return new rw_0[]{rw_0.bkP};
        }
        return rw_0.bly;
    }

    private long dPR() {
        if (this.aDh == 0L) {
            return 0L;
        }
        bgy bgy2 = bgg_0.dlO().ju(this.aDh);
        if (bgy2 == null) {
            this.aDh = 0L;
        }
        return this.aDh;
    }

    public void dPS() {
        this.aDh = 0L;
    }

    @Override
    public cpm_1[] dNh() {
        if (this.dPR() != 0L) {
            return cpm_1.nip;
        }
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        fqy_0 fqy_02 = this.dPU();
        if (fqy_02 != null) {
            cqf_12.CV(fqy_02.giv());
            cqf_12.qb("desc.mru." + fqy_02.giw());
        } else {
            cqf_12.CV(crc_2.nnv.nnW);
            cqf_12.qb("desc.mru.sit");
        }
        return new cpm_1[]{cqf_12};
    }

    @Override
    public boolean aVP() {
        return this.dPR() == 0L && this.jJq;
    }

    @Override
    public byte bcN() {
        return 2;
    }

    @Override
    public boolean isUsable() {
        return super.isUsable() && this.ao(aue_0.cVJ().cVK());
    }

    private boolean ao(bhJ bhJ2) {
        boolean bl = this.dQx().fwA();
        boolean bl2 = this.ap(bhJ2);
        if (!bl2) {
            jGC.error((Object)("Le perso doit poss\u00e9der l'anim " + this.dPT()));
        }
        boolean bl3 = this.jGD == null || this.jGD.fTE().b(bhJ2, this, null, bhJ2.bdV());
        return bl || bl2 && bl3;
    }

    private boolean ap(bhJ bhJ2) {
        aro_1 aro_12 = bhJ2.ddI().bqd();
        if (aro_12 == null) {
            return false;
        }
        return aro_12.dZ(this.dPT());
    }

    private String dPT() {
        return ZG.a(abi_1.dzk.dzy, this.aJi(), "-Assis");
    }

    public String aJi() {
        fqy_0 fqy_02 = this.dPU();
        if (fqy_02 == null || BH.aU(fqy_02.giu())) {
            jGC.error((Object)("Visuel sans anim pour le stool " + this.Sn()));
            return "";
        }
        return fqy_02.giu();
    }

    private fqy_0 dPU() {
        if (this.jGD == null) {
            jGC.error((Object)("Pas de visuel pour le stool " + this.Sn()));
            return null;
        }
        return fqz_0.giz().YY(this.jGD.clf());
    }

    @Override
    public eIw dNx() {
        return this.jGD;
    }

    public boolean dPV() {
        return this.baz == ry_0.blB.beb();
    }

    @Override
    public void a(abi_1 abi_12) {
        if (this.dPV() && abi_12 != abi_1.dzk && abi_12 != abi_1.dzm) {
            abi_12 = abi_1.dzk;
        }
        super.a(abi_12);
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDm(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    @Override
    public boolean dOf() {
        bgv_2 bgv_22 = this.duo();
        return bgv_22 != null;
    }

    @Nullable
    private bgv_2 duo() {
        Optional<Integer> optional = fdb.fSX().sE(this.dQA());
        return optional.map(n -> (bgv_2)bEm.dSb().Vd((int)n)).orElse(null);
    }

    @Override
    public String getName() {
        bgv_2 bgv_22 = this.duo();
        if (bgv_22 == null) {
            return super.getName();
        }
        return bgv_22.getName();
    }

    static /* synthetic */ void a(bbo_1 bbo_12, ayv_2 ayv_22) {
        bbo_12.a(ayv_22);
    }
}

