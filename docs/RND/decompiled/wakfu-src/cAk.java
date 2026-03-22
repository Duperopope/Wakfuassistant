/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class cAk
implements aaq_2<cwa_0> {
    @Override
    public boolean a(cwa_0 cwa_02) {
        long l = cwa_02.KU();
        int n = cwa_02.bBE();
        int n2 = cwa_02.eEB();
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null && n != 0 && n2 != 0) {
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
            int n3 = freeParticleSystem.bLJ();
            if (cwa_02.eEC()) {
                freeParticleSystem.a(bgy2.ddI());
            } else {
                freeParticleSystem.e(bgy2.bcC(), bgy2.bcD(), bgy2.bcE());
            }
            agZ.bzy().b(freeParticleSystem);
            abg_2.bUP().a(() -> agZ.bzy().so(n3), n2 * 1000, 1);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13462;
    }
}

