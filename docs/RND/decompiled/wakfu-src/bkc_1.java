/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bkc
 */
public abstract class bkc_1
extends cpl_1
implements bkb_1 {
    private FreeParticleSystem iaE;
    protected adh_0 iqe;

    @Override
    public void dsk() {
        ZG zG = this.dsC();
        zG.a(this);
        this.iaE = agY.bzw().bF(800255, 0);
        this.iaE.a(zG, 1.0f, 2);
        agZ.bzy().b(this.iaE);
    }

    @Override
    public void dsl() {
        ZG zG = this.dsC();
        zG.b(this);
        agZ.bzy().so(this.iaE.bLJ());
    }

    @Override
    public void b(boolean bl, WU wU) {
        this.iaE.setVisible(bl);
    }
}

