/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akR
 */
public final class akr_2
extends afk_1 {
    public akr_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removePictoAlpha";
    }

    @Override
    public String getDescription() {
        return "Retire les modifications d'alpha d'un picto dans le monde selon ces coordonn\u00e9es";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false), new afe_1("z", null, aff_2.dJy, false)};
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
        aah_0.brY().eX(l);
    }
}

