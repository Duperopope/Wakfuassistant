/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

/*
 * Renamed from auxx
 */
public class auxx_1
extends att_2 {
    public final lb_2 deG;

    public auxx_1(lb_2 lb_22) {
        this.deG = lb_22;
    }

    public Particle bMr() {
        Particle particle = (Particle)Particle.dce.bSK();
        particle.axp = this.deG.aIU();
        particle.axq = this.deG.aIV();
        particle.axr = this.deG.aIW();
        particle.ayP = this.deG.aRB();
        particle.aPU = this.deG.aSL();
        particle.aPV = this.deG.aSL();
        particle.aPD = 1.0f;
        return particle;
    }
}

