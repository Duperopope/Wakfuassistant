/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akh
 */
public class akh_2
extends akg_2 {
    private static final Logger cCc = Logger.getLogger(akh_2.class);
    private static final String cCd = "addParticleSystemToIe";
    private static final afe_1[] cCe = new afe_1[]{new afe_1("particleFileId", "Id du systeme", aff_2.dJy, false), new afe_1("targetId", "Id de l'element interactif", aff_2.dJw, false), new afe_1("level", "Niveau du systeme", aff_2.dJy, true)};

    public akh_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCd;
    }

    @Override
    public String getDescription() {
        return "Ajoute un systeme de particule ? un element interactif";
    }

    @Override
    public afe_1[] bBg() {
        return cCe;
    }

    @Override
    protected ZC ge(long l) {
        return afh_0.bxU().fR(l);
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, ZC zC, int n) {
        freeParticleSystem.a(zC);
    }
}

