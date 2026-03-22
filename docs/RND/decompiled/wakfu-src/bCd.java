/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;

public class bCd
extends bCA
implements eIy {
    static final Logger jGS = Logger.getLogger(bCd.class);
    public static final ayw_2<bCd> jGT = new bCe();
    public static final TObjectProcedure<exP> jGU = new bcf_0();
    private fdf_0 jGV;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkJ: {
                fdg_0 fdg_02 = this.jGV.u(rG, rG, this, ((ru_0)((Object)rG)).bdV());
                return this.a(rG, fdg_02);
            }
        }
        jGS.error((Object)"Action invalide sur un teleporter", (Throwable)new IllegalArgumentException(rw_02.toString()));
        return false;
    }

    public boolean a(RG rG, fdg_0 fdg_02) {
        if (!(rG instanceof bgt_0)) {
            return false;
        }
        bDw bDw2 = new bDw(this.jGV, (bgt_0)rG);
        if (!bDw2.a(rG)) {
            return true;
        }
        if (!bDw2.b(fdg_02)) {
            return false;
        }
        this.b(this.bdZ());
        bgt_0 bgt_02 = (bgt_0)rG;
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bdj_22.bvF() != null) {
            bdj_22.b(new bcg_0(this, bdj_22, fdg_02));
            return true;
        }
        this.a(bdj_22, fdg_02);
        return true;
    }

    void a(bdj_2 bdj_22, fdg_0 fdg_02) {
        Object object;
        if (fdg_02.bBE() > 0 && (object = agY.bzw().sk(fdg_02.bBE())) != null) {
            ((ParticleSystem)object).r(this.getWorldX(), this.bcD(), this.bcE());
            agZ.bzy().b((IsoParticleSystem)object);
        }
        if ((object = fqz_0.giz().YY(fdg_02.clf())) != null) {
            blq_0.a(bdj_22, (fqy_0)object);
        }
        this.a(this.a(bdj_22, (fqy_0)object, fdg_02), fdg_02);
    }

    private int a(bdj_2 bdj_22, fqy_0 fqy_02, fdg_0 fdg_02) {
        int n;
        if (fqy_02 != null && fdg_02.cyf() == 0 && (n = bdj_22.dY(fqy_02.giu())) != 0 && n != Integer.MAX_VALUE) {
            return n;
        }
        return fdg_02.cyf();
    }

    private void a(int n, fdg_0 fdg_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.fZ(false);
        abg_2.bUP().a((Runnable)new bCh(this, bgt_02, fdg_02), n, 1);
    }

    void a(bgt_0 bgt_02, fdg_0 fdg_02) {
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        bgt_03.fZ(true);
        if (bgt_03.dnC()) {
            return;
        }
        bgt_02.ddI().dcK();
        clh clh2 = new clh();
        clh2.ng(this.Sn());
        clh2.Lc(fdg_02.d());
        clh2.jo(fdg_02.fTQ());
        clh2.Kl(fdg_02.GN());
        aue_0.cVJ().etu().d(clh2);
    }

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
        assert (this.jGV == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGV = null;
    }

    @Override
    public void dNq() {
        try {
            this.jGV = (fdf_0)fda_0.rWI.a(fdv_0.rZc, Integer.parseInt(this.baB));
        }
        catch (NumberFormatException numberFormatException) {
            jGS.error((Object)("Erreur de param\u00e9trage d'IE " + String.valueOf(this)), (Throwable)numberFormatException);
        }
        finally {
            if (this.jGV == null) {
                this.jGV = fdf_0.rWZ;
            }
        }
    }

    @Override
    public cpm_1[] dNh() {
        if (this.aVK().isEmpty()) {
            return cpm_1.nip;
        }
        Map<Integer, fdg_0> map = this.jGV.fTF();
        ArrayList<crs_1> arrayList = new ArrayList<crs_1>();
        for (fdg_0 fdg_02 : map.values()) {
            bDw bDw2 = new bDw(this.jGV, aue_0.cVJ().cVK());
            boolean bl = bDw2.a(fdg_02);
            if (fdg_02.clf() <= 0 || fdg_02.fTI() && bl) continue;
            fqy_0 fqy_02 = fqz_0.giz().YY(fdg_02.clf());
            int n = fdg_02.cyj();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            fia_0 fia_02 = bgt_02.dmD();
            fif_0 fif_02 = fia_02.VQ(n);
            eIb eIb2 = fif_02 == null ? null : eId.quO.PM(fif_02.fZN());
            crq_1 crq_12 = eIb2 == null ? new crs_1() : new cqo_2();
            arrayList.add(bDw2.a(crq_12, fqy_02, fdg_02));
        }
        cpm_1[] cpm_1Array = new cpm_1[arrayList.size()];
        arrayList.toArray(cpm_1Array);
        return cpm_1Array;
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(89, (long)this.jGV.d(), new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public eIw dNx() {
        return this.jGV;
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    public String toString() {
        return "Teleporter{m_info=" + String.valueOf(this.jGV) + ", m_position=" + String.valueOf(this.bmd) + "}";
    }

    static /* synthetic */ void a(bCd bCd2, ayv_2 ayv_22) {
        bCd2.a(ayv_22);
    }
}

