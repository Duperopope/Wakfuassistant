/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from cDW
 */
class cdw_1
implements Runnable {
    final /* synthetic */ int mUo;
    final /* synthetic */ fax_1 mUp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdw_1(int n, fax_1 fax_12) {
        this.mUo = n;
        this.mUp = fax_12;
    }

    @Override
    public void run() {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(this.mUo);
        freeParticleSystem.a(this.mUp.getAnimatedElement());
        agZ.bzy().b(freeParticleSystem);
    }
}

