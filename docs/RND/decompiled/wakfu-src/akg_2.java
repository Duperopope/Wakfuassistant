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
 * Renamed from akg
 */
public abstract class akg_2
extends afk_1 {
    private static final Logger cCb = Logger.getLogger(akg_2.class);

    protected akg_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("systemId", null, aff_2.dJy, false)};
    }

    protected abstract ZC ge(long var1);

    protected abstract void a(FreeParticleSystem var1, ZC var2, int var3);

    protected final void c(FreeParticleSystem freeParticleSystem) {
        int n = this.cai().bha();
        if (n != -1) {
            freeParticleSystem.pu(n);
        }
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(1);
        ZC zC = this.ge(l);
        if (zC != null && !agY.bzw().sm(zC.bqo())) {
            this.xC(0);
            return;
        }
        int n2 = this.xp(0);
        FreeParticleSystem freeParticleSystem = n >= 3 ? agY.bzw().bF(n2, this.xp(2)) : agY.bzw().sk(n2);
        if (zC != null) {
            this.a(freeParticleSystem, zC, n);
            agZ.bzy().b(freeParticleSystem);
            this.xC(freeParticleSystem.bLJ());
        } else {
            this.a(cCb, "pas d'?l?ment interactif trouv? " + l);
            this.cah();
        }
    }
}

