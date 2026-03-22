/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atw
 */
public abstract class atw_2 {
    private boolean dcs = true;

    protected atw_2() {
    }

    public Particle d(ParticleSystem particleSystem) {
        Particle particle = (Particle)Particle.dce.bSK();
        particle.dcn = this;
        return particle;
    }

    public abstract void c(Particle var1);

    public boolean bLD() {
        return this.dcs;
    }

    public void cV(boolean bl) {
        this.dcs = bl;
    }

    public abstract boolean bLE();

    public abstract int aPA();
}

