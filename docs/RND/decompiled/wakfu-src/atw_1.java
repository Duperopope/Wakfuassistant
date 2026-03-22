/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atW
 */
public class atw_1
extends atq_1 {
    private final li_2 ddJ;

    public atw_1(li_2 li_22) {
        this.ddJ = li_22;
    }

    public li_2 bMo() {
        return this.ddJ;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.aRg = particle2.dci + this.ddJ.aTa() * f3;
        particle2.aRh = particle2.dcj + this.ddJ.aTb() * f3;
        particle2.aRi = particle2.dck + this.ddJ.aTc() * f3;
    }
}

