/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.jetbrains.annotations.Nullable;

public class bOa
extends bNW {
    @Override
    public void a(RH rH, exP exP2) {
        int n = (int)rH.Sn();
        long l = exP2.Xi();
        if (frz.a(l, fre_0.sYZ, n)) {
            return;
        }
        ((bCA)rH).c(rw_0.blh);
    }

    @Override
    public void b(RH rH, exP exP2) {
        czl_2.eYY().c((bco_0)rH);
        ((rx_0)((Object)rH)).c(rw_0.bkJ);
    }

    @Override
    public fry a(exP exP2, RH rH, long l) {
        frn_0 frn_02 = (frn_0)frb_0.sYO.a(fre_0.sYZ, l);
        if (!frn_02.bZ(exP2)) {
            return fry.sYC;
        }
        if (bOa.L((bgt_0)exP2) && fcI.aa(frn_02.clw(), frn_02.clw()) != eww.oHf) {
            return fry.sYI;
        }
        return fry.sYz;
    }

    private static boolean L(bgt_0 bgt_02) {
        if (fcL.rUh.sA(bgt_02.Xi()) > 1) {
            return true;
        }
        return bgt_02.dnQ().dKL() != null && !bgt_02.dnQ().dKL().pP(bgt_02.Xi()).isEmpty();
    }

    @Override
    protected void b(exP exP2, RH rH, long l) {
        this.egD();
        czl_2.eYY().eYZ();
        abg_2.bUP().a((Runnable)new bOb(this, rH, l), 500L, 1);
    }

    private void egD() {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800102);
        if (freeParticleSystem != null) {
            freeParticleSystem.a(aue_0.cVJ().cVK().bvp());
            agZ.bzy().b(freeParticleSystem);
        }
    }

    @Override
    public boolean a(bgt_0 bgt_02, bco_0 bco_02) {
        return !bgt_02.a(ezj_0.pun);
    }

    @Override
    public fre_0 egC() {
        return fre_0.sYZ;
    }

    @Override
    public String a(bco_0 bco_02) {
        return aum_0.cWf().a(36, (long)((int)bco_02.Sn()), new Object[0]);
    }

    @Override
    @Nullable
    public String b(bco_0 bco_02) {
        return null;
    }
}

