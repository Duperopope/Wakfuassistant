/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atK
 */
public class atk_1
extends atq_1 {
    private final lt_2 ddv;

    public atk_1(lt_2 lt_22) {
        this.ddv = lt_22;
    }

    public lt_2 bMd() {
        return this.ddv;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.ddv.aSa() * f2;
        particle2.axp -= (particle2.axp - this.ddv.aIU()) * f4;
        particle2.axq -= (particle2.axq - this.ddv.aIV()) * f4;
        particle2.axr -= (particle2.axr - this.ddv.aIW()) * f4;
        particle2.ayP -= (particle2.ayP - this.ddv.aIX()) * f4;
    }
}

