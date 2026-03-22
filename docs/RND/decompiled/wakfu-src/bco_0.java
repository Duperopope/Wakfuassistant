/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bCo
 */
public class bco_0
extends bCA {
    static final Logger jHm = Logger.getLogger(bco_0.class);
    protected fre_0 jFc;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        Object Provider2 = frz.a(this.jFc);
        this.b(rw_02);
        switch (rw_02) {
            case bkJ: {
                ((frd_0)Provider2).b(this, (exP)((Object)rG));
                return true;
            }
            case blh: {
                ((frd_0)Provider2).a(this, (exP)((Object)rG));
                this.aq((bhJ)rG);
                return true;
            }
        }
        jHm.error((Object)("Impossible d'effectuer une action " + String.valueOf(rw_02) + " sur une machine de transport de type " + String.valueOf(this.jFc)), (Throwable)new IllegalArgumentException());
        return false;
    }

    @Override
    public rw_0 dNn() {
        zd_2 zd_22;
        if (this.jFc == fre_0.sZc) {
            return rw_0.bkJ;
        }
        long l = aue_0.cVJ().cVO().xl();
        switch (this.jFc) {
            case sYZ: {
                zd_22 = zd_2.aoC;
                break;
            }
            case sZa: {
                zd_22 = zd_2.aoD;
                break;
            }
            default: {
                return rw_0.bkJ;
            }
        }
        return frz.a(l, zd_22, (int)this.aXv) ? rw_0.bkJ : rw_0.blh;
    }

    @Override
    public byte bcN() {
        return 8;
    }

    @Override
    public rw_0[] dNf() {
        if (this.jFc == fre_0.sZc) {
            return new rw_0[]{rw_0.bkJ};
        }
        return new rw_0[]{rw_0.bkJ, rw_0.blh};
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
        assert (this.jFc == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jFc = null;
    }

    @Override
    public cpm_1[] dNh() {
        cqf_1 cqf_12;
        Object Info2 = frb_0.sYO.a(this.jFc, this.aXv);
        fqy_0 fqy_02 = fqz_0.giz().YY(((frk_0)Info2).clf());
        long l = aue_0.cVJ().cVO().xl();
        if (frz.a(l, this.jFc, (int)this.aXv)) {
            cqf_12 = (cqf_1)cps_1.njh.eLI();
            cqf_12.qb("desc.mru." + fqy_02.giw());
        } else {
            cqf_12 = (cqf_1)cps_1.niQ.eLI();
            cqf_12.qb("zaap.discover");
        }
        cqf_12.CV(fqy_02.giv());
        return new cpm_1[]{cqf_12};
    }

    @Override
    public String getName() {
        bNW bNW2 = (bNW)frz.a(this.jFc);
        return bNW2.a(this);
    }

    public fre_0 dQh() {
        return this.jFc;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    private void aq(bhJ bhJ2) {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800110);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(bhJ2.ddI());
            agZ.bzy().b(freeParticleSystem);
        }
    }

    @Nullable
    public String dQi() {
        bNW bNW2 = (bNW)frz.a(this.jFc);
        return bNW2.b(this);
    }

    public boolean C(bgt_0 bgt_02) {
        bNW bNW2 = (bNW)frz.a(this.jFc);
        return bNW2.a(bgt_02, this);
    }

    static /* synthetic */ void a(bco_0 bco_02, ayv_2 ayv_22) {
        bco_02.a(ayv_22);
    }
}

