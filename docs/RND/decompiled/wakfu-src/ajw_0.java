/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.wakfu.client.alea.graphics.particle.WakfuFreeParticleSystem;
import java.io.FileNotFoundException;

/*
 * Renamed from aJW
 */
public class ajw_0
extends agY {
    public WakfuFreeParticleSystem m(String string, int n) {
        WakfuFreeParticleSystem wakfuFreeParticleSystem = new WakfuFreeParticleSystem(false);
        try {
            this.a(string, n, (ParticleSystem)wakfuFreeParticleSystem);
        }
        catch (FileNotFoundException fileNotFoundException) {
            cvh.error((Object)("FICHIER APS MANQUANT : " + string));
        }
        catch (Exception exception) {
            cvh.warn((Object)"Error during particle creation : ", (Throwable)exception);
        }
        return wakfuFreeParticleSystem;
    }

    @Override
    public boolean sm(int n) {
        if (n == -1) {
            return true;
        }
        return aJP.cig().yN(n);
    }

    @Override
    public /* synthetic */ FreeParticleSystem f(String string, int n) {
        return this.m(string, n);
    }
}

