/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ain
 */
class ain_2
extends afk_1 {
    ain_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPointLightColor";
    }

    @Override
    public String getDescription() {
        return "Change la couleur d'une lumi?re ponctuelle";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", "Id de la lumi?re", aff_2.dJy, false), new afe_1("red", "Teinte de rouge", aff_2.dJz, false), new afe_1("green", "Teinte de vert", aff_2.dJz, false), new afe_1("blue", "Teinte de bleu", aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        acf acf2 = aih_2.sv(this.xp(0));
        if (acf2 != null) {
            acf2.v(this.xr(1), this.xr(2), this.xr(3));
        } else {
            this.a(aih_2.cyR, "La lumi?re n'existe pas");
        }
    }
}

