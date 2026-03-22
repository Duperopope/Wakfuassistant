/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aia
 */
class aia_1
extends afk_1 {
    aia_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createSnowEffect";
    }

    @Override
    public String getDescription() {
        return "Active un effet de neige";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("numParticles", "Nombre de flocons ? l'?cran", aff_2.dJz, true), new afe_1("numParticlesPerSpawn", "Nombre de flocons a r?g?n?rer", aff_2.dJz, true), new afe_1("spawnFrequency", "On r?gen?re numParticlesPerSpawn toutes les spawnFrequency millisecondes", aff_2.dJz, true), new afe_1("particleLifeTime", "Dur\u00e9e de vie d'un flocon", aff_2.dJz, true), new afe_1("particleSize", "Taille d'un flocon", aff_2.dJz, true), new afe_1("particleVelocity", "Vitesse d'un flocon", aff_2.dJz, true), new afe_1("windSpeed", "Vitesse du vent", aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", "Id de l'effet", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = 512;
        float f2 = 10.0f;
        float f3 = 300.0f;
        float f4 = 20000.0f;
        float f5 = 3.0f;
        if (n >= 1) {
            n2 = this.xp(0);
        }
        if (n >= 2) {
            f2 = (float)this.xq(1);
        }
        if (n >= 3) {
            f3 = (float)this.xq(2);
        }
        if (n >= 4) {
            f4 = (float)this.xq(3);
        }
        if (n >= 5) {
            f5 = (float)this.xq(4);
        }
        abU abU2 = new abU();
        abU2.rw(n2);
        abU2.i(f2, f3, f4, f5);
        abU2.b(aht_0.brf());
        abU2.a(new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        ast_1.bJG().a(abU2);
        this.xC(abU2.d());
    }
}

