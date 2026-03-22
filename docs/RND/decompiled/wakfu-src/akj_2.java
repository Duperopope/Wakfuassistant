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
 * Renamed from akj
 */
public class akj_2
extends akg_2 {
    private static final Logger cCi = Logger.getLogger(akj_2.class);
    private static final String cCj = "addParticleSystemToTarget";
    private static final afe_1[] cCk = new afe_1[]{new afe_1("particleFileId", "Id du systeme", aff_2.dJy, false), new afe_1("targetId", "Id du mobile", aff_2.dJw, false), new afe_1("level", "Niveau du systeme", aff_2.dJy, true)};

    public akj_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCj;
    }

    @Override
    public String getDescription() {
        return "Ajoute un systeme de particule ? un mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cCk;
    }

    @Override
    protected ZC ge(long l) {
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 != null) {
            return adj_02;
        }
        return ZM.bqw().fD(l);
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, ZC zC, int n) {
        freeParticleSystem.a(zC);
        this.c(freeParticleSystem);
    }
}

