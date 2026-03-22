/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atu
 */
public class atu_2 {
    public static final int dcb = 100;
    private final ast_2 dcc = asx_2.day.btu();

    public atu_2(auxx_1 auxx_12) {
        this.dcc.setEnabled(false);
        this.setColor(auxx_12.deG.aIU() * auxx_12.deG.aRB(), auxx_12.deG.aIV() * auxx_12.deG.aRB(), auxx_12.deG.aIW() * auxx_12.deG.aRB());
        this.aT(auxx_12.deG.aSL());
        assert (this.dcc != null);
    }

    public void a(float f2, Emitter emitter, ParticleSystem particleSystem) {
        Particle particle = emitter.dbY;
        particle.dbV = emitter.dbV;
        float f3 = particle.ceh - emitter.dbW.deD.aSo();
        this.dcc.setEnabled(f3 > 0.0f);
        particle.a(particleSystem, f2);
        this.dcc.bts().m(particle.aSc() + particleSystem.aSc(), particle.aSd() + particleSystem.aSd(), particle.aSe() + particleSystem.aSe());
        float f4 = particle.ayP;
        this.dcc.t(particle.axp * f4, particle.axq * f4, particle.axr * f4);
        this.dcc.u(particle.axp * f4, particle.axq * f4, particle.axr * f4);
        this.dcc.aT(GC.b(particle.aPU * particle.aPD, 0.0f, 5.0f));
        if (f3 >= particle.cei && particle.cei != Float.MAX_VALUE) {
            this.bLt();
        }
    }

    public void setColor(float f2, float f3, float f4) {
        this.dcc.u(f2, f3, f4);
    }

    public void aT(float f2) {
        this.dcc.aT(f2);
    }

    public void bLs() {
        asx_2.day.a(this.dcc);
    }

    public void bLt() {
        this.dcc.ut(100);
    }
}

