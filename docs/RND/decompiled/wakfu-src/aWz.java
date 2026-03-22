/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class aWz
extends aUV {
    private static final bsT hvk = new bsT();

    public aWz(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long cbk() {
        String string;
        bgy bgy2 = this.iD(this.Qy());
        if (bgy2 == null) {
            return 0L;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.ddf();
        if (this.cWs()) {
            string = aum_0.cWf().c("fight.tackled", bgy2.aZk());
            hvk.ap(string);
        }
        string = bdj_22.dcX().dHI();
        bdj_22.dT(string);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkZ() == null || bgt_02.bqo() == this.bha()) {
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(800021);
            if (freeParticleSystem != null) {
                freeParticleSystem.a(bdj_22);
                freeParticleSystem.pu(this.bha());
                agZ.bzy().b(freeParticleSystem);
            }
            if (bgt_02 == bgy2) {
                bqm_0.jbp.b(new brl_0());
            }
        }
        if (bgy2.a((pt_0)exx_2.rGk)) {
            bgy2.e(exx_2.rGk).aYP();
        }
        return bdj_22.dY(string);
    }
}

