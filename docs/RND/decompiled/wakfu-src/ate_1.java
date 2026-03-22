/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atE
 */
public class ate_1
implements atd_1 {
    protected final float ddk;
    protected final float ddl;
    private final aus_1[] ddm;

    public ate_1(float f2, float f3, aus_1 ... aus_1Array) {
        this.ddk = f2;
        this.ddl = f3;
        this.ddm = aus_1Array;
    }

    @Override
    public final boolean a(atq_1 atq_12, Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.ceh;
        if (f3 < this.ddk) {
            return false;
        }
        float f4 = this.ddl - f3;
        if (f4 < 0.0f) {
            return true;
        }
        for (int i = 0; i < this.ddm.length; ++i) {
            if (this.ddm[i].a(particle, particle2, f2, particleSystem)) continue;
            return false;
        }
        float f5 = f2 - this.ddk;
        float f6 = this.ddl - this.ddk;
        float f7 = Math.max(0.0f, f5 / f6);
        atq_12.a(f4 < f2 ? f4 : f2, f7, particle, particle2, particleSystem);
        return false;
    }
}

