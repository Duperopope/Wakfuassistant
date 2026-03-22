/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akY
 */
public class aky_2
extends afk_1 {
    private static final Logger cEy = Logger.getLogger(aky_2.class);

    public aky_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPictoColor";
    }

    @Override
    public String getDescription() {
        return "Modifie la couleur d'un picto dans le monde selon ces coordonn?es (en faisant un fondu)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false), new afe_1("z", null, aff_2.dJy, false), new afe_1("r", null, aff_2.dJz, false), new afe_1("g", null, aff_2.dJz, false), new afe_1("b", null, aff_2.dJz, false), new afe_1("alpha", null, aff_2.dJz, false), new afe_1("time", null, aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        long l = agx_0.E(n2, n3, n4);
        float f2 = this.xr(3);
        float f3 = this.xr(4);
        float f4 = this.xr(5);
        float f5 = this.xr(6);
        if (n == 8) {
            aah_0.brY().a(l, f2, f3, f4, f5, (float)this.xp(7));
        } else {
            aah_0.brY().a(l, f2, f3, f4, f5);
        }
    }
}

