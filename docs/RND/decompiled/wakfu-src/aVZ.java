/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class aVZ
extends aUV {
    private static final bsT htR = new bsT();
    private static final long htS = 1000L;
    private final long[] htT;
    private final acd_1 htU;

    public aVZ(int n, int n2, int n3, int n4, long[] lArray, acd_1 acd_12) {
        super(n, n2, n3, n4);
        this.htT = lArray;
        this.htU = acd_12;
    }

    @Override
    public long cbk() {
        bgy bgy2 = this.iD(this.Qy());
        if (bgy2 != null) {
            if (this.cWs()) {
                Object object;
                if (bgy2 != aue_0.cVJ().cVK()) {
                    object = new StringBuilder(aum_0.cWf().c("fight.invisible.detected.by", bgy2.aZk()));
                    for (int n = 0; n < this.htT.length; n = (int)((byte)(n + 1))) {
                        bgy bgy3 = this.iD(this.htT[n]);
                        if (bgy3 == null) continue;
                        if (n > 0) {
                            ((StringBuilder)object).append(',');
                        }
                        ((StringBuilder)object).append(bgy3.aZk());
                    }
                    htR.ap(((StringBuilder)object).toString());
                } else {
                    object = aum_0.cWf().c("fight.invisible.detected", bgy2.aZk());
                    htR.ap(object);
                }
                object = agY.bzw().sk(78900);
                ((ParticleSystem)object).r(this.htU.getX(), this.htU.getY(), this.htU.bdi());
                ((ParticleSystem)object).setDuration(2000);
                ((FreeParticleSystem)object).pu(this.bha());
                agZ.bzy().b((IsoParticleSystem)object);
            }
            return 1000L;
        }
        return 0L;
    }
}

