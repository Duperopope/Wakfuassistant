/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atL
 */
public class atl_1
extends atq_1 {
    public static final long ddw = 1000000L;
    private final ach_2 ddx;

    public atl_1(lu_2 lu_22) {
        this.ddx = atl_1.a(lu_22);
    }

    public atl_1(ach_2 ach_22) {
        this.ddx = ach_22;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        long l = (long)(1000000.0f * (particle2.ceh / particle2.cei));
        acp_1 acp_12 = this.ddx.fZ(l);
        if (particle.aNe) {
            particle2.aPY = acp_12.aPY + particleSystem.aSc();
            particle2.aPZ = acp_12.aPZ + particleSystem.aSd();
            particle2.aQa = acp_12.aQa + particleSystem.aSe();
        } else {
            particle2.aPY = acp_12.aPY + particle.aPY;
            particle2.aPZ = acp_12.aPZ + particle.aPZ;
            particle2.aQa = acp_12.aQa + particle.aQa;
        }
    }

    public acp_1 bMe() {
        return this.ddx.bzK();
    }

    public acp_1 bMf() {
        return this.ddx.bzL();
    }

    public acp_1 bMg() {
        return this.ddx.bzM();
    }

    public acp_1 bMh() {
        return this.ddx.bzN();
    }

    private static ach_2 a(lu_2 lu_22) {
        switch (lu_22.aSg()) {
            case aQd: {
                return new acc_2();
            }
            case aQe: {
                return new aca_2();
            }
            case aQf: {
                return new acz_2();
            }
        }
        throw new IllegalArgumentException("Unable to fin trajectory " + String.valueOf((Object)lu_22.aSg()));
    }
}

