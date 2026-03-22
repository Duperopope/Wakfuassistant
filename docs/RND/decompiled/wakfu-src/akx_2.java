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
 * Renamed from akX
 */
public class akx_2
extends afk_1 {
    private static final Logger cEx = Logger.getLogger(akx_2.class);

    public akx_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPictoAlpha";
    }

    @Override
    public String getDescription() {
        return "Modifie l'alpha d'un picto dans le monde selon ces coordonn?es (en faisant un fondu)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false), new afe_1("z", null, aff_2.dJy, false), new afe_1("alpha", null, aff_2.dJy, false), new afe_1("time", null, aff_2.dJy, true)};
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
        int n5 = this.xp(3);
        if (n == 5) {
            aah_0.brY().a(l, 1.0f, 1.0f, 1.0f, (float)n5, (float)this.xp(4));
        } else {
            aah_0.brY().a(l, 1.0f, 1.0f, 1.0f, (float)n5);
        }
    }
}

