/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from atq
 */
public abstract class atq_1 {
    private static final Logger dbK = Logger.getLogger(atq_1.class);
    private static final atd_1 dbL = new atr_1();
    atd_1 dbM;

    public void a(atd_1 atd_12) {
        this.dbM = atd_12;
    }

    public void a(ats_1[] ats_1Array) {
        if (ats_1Array == null) {
            this.dbM = dbL;
        } else {
            this.dbM = null;
            float f2 = 0.0f;
            float f3 = Float.POSITIVE_INFINITY;
            aus_1 aus_12 = null;
            for (int i = 0; i < ats_1Array.length; ++i) {
                if (ats_1Array[i] instanceof aus_1) {
                    if (aus_12 != null) {
                        dbK.error((Object)"pas cool");
                    }
                    aus_12 = (aus_1)ats_1Array[i];
                    continue;
                }
                aur_1 aur_12 = (aur_1)ats_1Array[i];
                f2 = aur_12.dey.aSJ();
                f3 = aur_12.dey.aSK();
                if (!(f3 <= f2)) continue;
                f3 = Float.POSITIVE_INFINITY;
            }
            this.dbM = aus_12 != null ? new ate_1(f2, f3, aus_12) : (f3 != Float.POSITIVE_INFINITY ? new atf_1(f2, f3) : dbL);
        }
    }

    public final boolean a(float f2, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        return this.dbM.a(this, particle, particle2, f2, particleSystem);
    }

    public boolean bLi() {
        return false;
    }

    public abstract void a(float var1, float var2, Particle var3, Particle var4, ParticleSystem var5);
}

