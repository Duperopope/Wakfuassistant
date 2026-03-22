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
 * Renamed from akZ
 */
public class akz_2
extends afk_1 {
    private static final Logger cEz = Logger.getLogger(akz_2.class);

    public akz_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPictoLayerAlpha";
    }

    @Override
    public String getDescription() {
        return "Modifie l'alpha d'un layer de pictos dans le monde (en faisant un fondu)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("layer", null, aff_2.dJy, false), new afe_1("alpha", null, aff_2.dJy, false), new afe_1("time", null, aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        short s = (short)this.xp(0);
        int n2 = this.xp(1);
        if (n == 3) {
            aah_0.brY().a(s, 1.0f, 1.0f, 1.0f, (float)n2, (float)this.xp(2));
        } else {
            aah_0.brY().a(s, 1.0f, 1.0f, 1.0f, (float)n2);
        }
    }
}

