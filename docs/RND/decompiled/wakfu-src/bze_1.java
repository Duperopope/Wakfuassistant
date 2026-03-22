/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bZe
 */
public class bze_1
extends abb_0 {
    private FreeParticleSystem hNt;
    private int cbx = Integer.MAX_VALUE;

    @Override
    public void rz(int n) {
        super.rz(n);
        this.dsl();
    }

    @Override
    public void clear() {
        this.dsl();
    }

    @Override
    public void reset() {
        super.reset();
        this.dsl();
    }

    private void dsl() {
        if (this.hNt != null) {
            agZ.bzy().so(this.hNt.bLJ());
            this.hNt = null;
        }
        this.cbx = Integer.MAX_VALUE;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        int n2 = GC.a((int)this.bnY() * 100, 0, 100);
        if (this.cbx != n2) {
            this.dsl();
            this.cbx = n2;
            this.JH(n2);
        }
        if (this.hNt != null) {
            this.hNt.pu(aue_0.cVJ().cVK().dmW());
            this.hNt.setVisible(bzt_1.lCY.epW());
        }
    }

    private void JH(int n) {
        FreeParticleSystem freeParticleSystem = ajw_0.bzw().bF(7000074, n);
        agb agb2 = aie_0.cfn().bmC().byu();
        freeParticleSystem.a(agb2.byM());
        agZ.bzy().b(freeParticleSystem);
        this.hNt = freeParticleSystem;
    }

    @Override
    public void b(art_1 art_12) {
    }
}

