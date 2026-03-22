/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

public class agY
extends aty_1<IsoParticleSystem> {
    protected static final Logger cvh = Logger.getLogger(agY.class);
    private static agY cvi = new agY();

    public static agY bzw() {
        return cvi;
    }

    public static void a(agY agY2) {
        cvi = agY2;
    }

    public final FreeParticleSystem sk(int n) {
        return this.eJ(this.uE(n));
    }

    public final FreeParticleSystem bF(int n, int n2) {
        return this.f(this.uE(n), n2);
    }

    public final FreeParticleSystem eJ(String string) {
        return this.f(string, 1);
    }

    public FreeParticleSystem f(String string, int n) {
        return this.a(string, n, false);
    }

    public FreeParticleSystem a(String string, int n, boolean bl) {
        FreeParticleSystem freeParticleSystem = new FreeParticleSystem(bl);
        try {
            this.a(string, n, (ParticleSystem)freeParticleSystem);
        }
        catch (Exception exception) {
            cvh.error((Object)("particle " + string), (Throwable)exception);
        }
        return freeParticleSystem;
    }

    public final CellParticleSystem sl(int n) {
        return this.bG(n, 1);
    }

    public CellParticleSystem bG(int n, int n2) {
        try {
            CellParticleSystem cellParticleSystem = this.bzx();
            this.a(n, n2, (ParticleSystem)cellParticleSystem);
            if (cellParticleSystem.getDuration() != 0) {
                cvh.error((Object)("Le systeme de particule attach\u00e9 \u00e0 la cellule " + cellParticleSystem.aSc() + "/" + cellParticleSystem.aSd() + " poss\u00e8de une dur\u00e9e."));
            }
            return cellParticleSystem;
        }
        catch (Exception exception) {
            cvh.error((Object)("Impossible de charger le syst\u00e8me de particule : " + n + " " + this.uE(n)), (Throwable)exception);
            return null;
        }
    }

    protected CellParticleSystem bzx() {
        return new CellParticleSystem(false);
    }

    public boolean sm(int n) {
        return true;
    }

    @Override
    public /* synthetic */ ParticleSystem eK(String string) {
        return this.eJ(string);
    }
}

