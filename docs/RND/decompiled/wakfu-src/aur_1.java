/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from aur
 */
public class aur_1
implements ats_1 {
    public final la_2 dey;

    public aur_1(la_2 la_22) {
        this.dey = la_22;
    }

    @Override
    public boolean a(Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.ceh;
        if (f3 > this.dey.aSK() && f3 - f2 < this.dey.aSJ()) {
            return true;
        }
        return f3 >= this.dey.aSJ() && f3 <= this.dey.aSK();
    }
}

