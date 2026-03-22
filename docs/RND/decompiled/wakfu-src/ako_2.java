/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ako
 */
public class ako_2
extends afk_1 {
    private static final Logger cCv = Logger.getLogger(ako_2.class);
    private static final String cCw = "setRemoveWhenFar";
    private static final afe_1[] cCx = new afe_1[]{new afe_1("id", "Id du systeme", aff_2.dJy, false), new afe_1("removeWhenFar", "Supprime la particule quand elle est trop loin ?", aff_2.dJA, false)};
    private static final afe_1[] cCy = null;

    public ako_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCw;
    }

    @Override
    public String getDescription() {
        return "si removeWhenFar=false, la particule ne sera pas supprim?e automatiquement quand on s'?loigne\n!!! ATTENTION!!! Penser ? la supprimer quand elle n'est plus utilis?e !!! ";
    }

    @Override
    public afe_1[] bBg() {
        return cCx;
    }

    @Override
    public final afe_1[] bBh() {
        return cCy;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        IsoParticleSystem isoParticleSystem = agZ.bzy().sn(n2);
        if (isoParticleSystem == null) {
            this.a(cCv, "pas de system d'id " + n2);
            return;
        }
        isoParticleSystem.cq(this.xx(1));
    }
}

