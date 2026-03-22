/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bBu
 */
public class bbu_0
extends bCA {
    static final Logger jGh = Logger.getLogger(bbu_0.class);

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    @Override
    public cpm_1[] dNh() {
        cqf_1 cqf_12 = (cqf_1)cps_1.njk.eLI();
        cqf_12.CV(crc_2.nnP.nnW);
        cqf_12.qb("desc.mru.attachPhoenix");
        cpm_1[] cpm_1Array = new cpm_1[]{cqf_12};
        return cpm_1Array;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("desc.phoenix", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkJ: {
                this.b(rw_02);
                aue_0.cVJ().cVK().dng().YW((int)this.Sn());
                this.c(rw_02);
                bbu_0.bG((bgy)rG);
                aPd.f("soulLinked", new Object[0]);
                cAY.eHc().nP(600064L);
                return true;
            }
        }
        jGh.error((Object)("Impossible d'effectuer une action " + String.valueOf(rw_02) + " sur un phoenix"), (Throwable)new IllegalArgumentException());
        return false;
    }

    private static void bG(bgy bgy2) {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800110);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(bgy2.ddI());
            agZ.bzy().b(freeParticleSystem);
        }
    }

    static /* synthetic */ void a(bbu_0 bbu_02, ayv_2 ayv_22) {
        bbu_02.a(ayv_22);
    }
}

