/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

/*
 * Renamed from atv
 */
public class atv_1 {
    private int cRf;
    private final Particle[] dcq;
    private int dcr = 0;

    public atv_1(int n) {
        this.dcq = new Particle[n];
    }

    public final void b(Particle particle) {
        this.dcq[this.cRf++] = particle;
    }

    public final void ux(int n) {
        this.dcq[n] = null;
        ++this.dcr;
    }

    public final Particle uy(int n) {
        return this.dcq[n];
    }

    public final int bLz() {
        return this.cRf;
    }

    public final void bLA() {
        if (this.dcr == 0) {
            return;
        }
        int n = 1;
        block0: for (int i = 0; i < this.cRf - 1; ++i) {
            if (this.dcq[i] != null) {
                ++n;
                continue;
            }
            for (int j = n; j < this.cRf; ++j) {
                if (this.dcq[j] == null) continue;
                this.dcq[i] = this.dcq[j];
                this.dcq[j] = null;
                n = j + 1;
                continue block0;
            }
        }
        this.cRf -= this.dcr;
        this.dcr = 0;
    }

    public final void bLB() {
        this.cRf = 0;
        this.dcr = 0;
    }

    public final boolean bLC() {
        return this.cRf >= this.dcq.length;
    }
}

