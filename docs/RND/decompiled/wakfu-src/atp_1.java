/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atP
 */
public class atp_1
extends atq_1 {
    private final lz_1 ddE;

    public atp_1(lz_1 lz_12) {
        this.ddE = lz_12;
    }

    public lz_1 bMj() {
        return this.ddE;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = 1.0f - this.ddE.aSI() * f2;
        particle2.ceb *= f4;
        particle2.cec *= f4;
        particle2.ced *= f4;
    }
}

