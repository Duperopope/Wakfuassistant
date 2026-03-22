/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

public class ZN
implements ark_2<ei_2> {
    @Override
    public boolean a(arj_2 arj_22, ei_2 ei_22) {
        acx_0 acx_02;
        if (arj_22 instanceof ZC && !((ZC)(acx_02 = (ZC)arj_22)).bpk()) {
            return false;
        }
        acx_02 = agY.bzw().sk(ei_22.aJe());
        ((FreeParticleSystem)acx_02).pu(arj_22.bqo());
        agZ.bzy().b((IsoParticleSystem)acx_02);
        if (arj_22 instanceof ZC) {
            ZC zC = (ZC)arj_22;
            ((ParticleSystem)((Object)acx_02)).r(zC.getWorldX() + (float)ei_22.aJf(), zC.getWorldY() + (float)ei_22.aJg(), zC.bcE() + ei_22.aJh());
            agX.c((agV)((Object)acx_02));
        }
        return false;
    }
}

