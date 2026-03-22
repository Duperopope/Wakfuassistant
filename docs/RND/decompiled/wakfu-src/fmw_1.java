/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Renamed from fMW
 */
public class fmw_1 {
    public static final fmw_1 uJG = new fmw_1();
    private final LinkedList<ParticleSystem> uJH = new LinkedList();
    private volatile boolean cvt = true;

    private fmw_1() {
    }

    public void cr(boolean bl) {
        this.cvt = bl;
    }

    public boolean bzz() {
        return this.cvt;
    }

    public void a(ParticleSystem particleSystem) {
        this.uJH.add(particleSystem);
        agr.ctK.a(particleSystem);
    }

    public void qy(int n) {
        if (!this.cvt) {
            return;
        }
        float f2 = (float)n / 1000.0f;
        Iterator iterator = this.uJH.iterator();
        while (iterator.hasNext()) {
            ParticleSystem particleSystem = (ParticleSystem)iterator.next();
            if (particleSystem.bSW() < 0) {
                agr.ctK.b(particleSystem);
                iterator.remove();
                continue;
            }
            particleSystem.ca(f2);
        }
    }
}

