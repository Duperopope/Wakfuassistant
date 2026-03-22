/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atF
 */
public class atf_1
implements atd_1 {
    protected final float ddn;
    protected final float ddo;

    public atf_1(float f2, float f3) {
        this.ddn = f2;
        this.ddo = f3;
    }

    @Override
    public final boolean a(atq_1 atq_12, Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.ceh;
        if (f3 < this.ddn) {
            return false;
        }
        float f4 = this.ddo - f3;
        if (f4 < 0.0f) {
            return true;
        }
        float f5 = f2 - this.ddn;
        float f6 = this.ddo - this.ddn;
        float f7 = Math.max(0.0f, f5 / f6);
        atq_12.a(f4 < f2 ? f4 : f2, f7, particle, particle2, particleSystem);
        return false;
    }
}

