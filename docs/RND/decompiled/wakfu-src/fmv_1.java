/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from fMV
 */
public class fmv_1
extends aty_1<XulorParticleSystem> {
    private static final fmv_1 uJE = new fmv_1();
    private static final Logger uJF = Logger.getLogger(fmv_1.class);

    public static fmv_1 gEH() {
        return uJE;
    }

    public final XulorParticleSystem vW(String string) {
        return this.C(string, 1);
    }

    public XulorParticleSystem C(String string, int n) {
        XulorParticleSystem xulorParticleSystem = new XulorParticleSystem();
        try {
            this.a(string, n, (ParticleSystem)xulorParticleSystem);
        }
        catch (Exception exception) {
            uJF.error((Object)("erreur de cr\u00e9ation de particule " + string), (Throwable)exception);
            return null;
        }
        return xulorParticleSystem;
    }

    @Override
    public /* synthetic */ ParticleSystem eK(String string) {
        return this.vW(string);
    }
}

