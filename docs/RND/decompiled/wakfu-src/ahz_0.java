/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahZ
 */
class ahz_0
extends afk_1 {
    ahz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createRainEffect";
    }

    @Override
    public String getDescription() {
        return "Active un effet de pluie";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("numParticles", "Nombre de gouttes ? l'?cran", aff_2.dJz, true), new afe_1("numParticlesPerSpawn", "Nombre de gouttes ? g?n?rer", aff_2.dJz, true), new afe_1("spawnFrequency", "On r?gen?re numParticlesPerSpawn toutes les spawnFrequency millisecondes", aff_2.dJz, true), new afe_1("particleLifeTime", "Dur\u00e9e de vie d'une goutte", aff_2.dJz, true), new afe_1("particleHeight", "Taille d'une goutte", aff_2.dJz, true), new afe_1("particleVelocity", "Vitesse de chute des gouttes", aff_2.dJz, true), new afe_1("particleAlpha", "Transparence des gouttes", aff_2.dJz, true), new afe_1("particleAngle", "Angle (en radian) selon lequel tombe les gouttes", aff_2.dJz, true), new afe_1("particleAngleRandom", "Al\u00e9atoire sur l'angle (en radian ? ajouter ? particleAngle)", aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", "Id de l'effet", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = 512;
        float f2 = 128.0f;
        float f3 = 100.0f;
        float f4 = 300.0f;
        float f5 = 4.0f;
        float f6 = -60.0f;
        float f7 = 0.25f;
        float f8 = -1.2566371f;
        float f9 = 0.15707964f;
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
        if (n >= 6) {
            f6 = (float)this.xq(5);
        }
        if (n == 7) {
            f7 = (float)this.xq(6);
        }
        if (n == 8) {
            f8 = (float)this.xq(7);
        }
        if (n == 9) {
            f9 = (float)this.xq(8);
        }
        abq_0 abq_02 = new abq_0();
        abq_02.rw(n2);
        abq_02.aJ(f8, f9);
        abq_02.c(1.0f, 1.0f, 1.0f, f7, 0.0f);
        abq_02.a(f2, f3, f4, f5, f6, 0.0f);
        abq_02.b(aht_0.brf());
        abq_02.a(new abg_1(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        ast_1.bJG().a(abq_02);
        this.xC(abq_02.d());
    }
}

