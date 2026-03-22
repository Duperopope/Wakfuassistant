/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXx
 */
public final class bxx_1
extends afk_1 {
    public static final String lxa = "getLanguageId";
    public static final afe_1[] lxb = new afe_1[0];
    public static final afe_1[] lxc;

    public bxx_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lxa;
    }

    @Override
    public String getDescription() {
        return "Return the id of language used by current client";
    }

    @Override
    public afe_1[] bBg() {
        return lxb;
    }

    @Override
    public afe_1[] bBh() {
        return lxc;
    }

    @Override
    protected void ss(int n) {
        Mv mv = My.aUV().aUXX();
        if (mv.aUN()) {
            this.xC(mv.aJr());
        } else {
            this.xC(Mv.aVy.aJr());
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder("The language used by client with related id, see available bellow :");
        for (Mv mv : Mv.aVA) {
            stringBuilder.append("\n").append(mv.name()).append(" (").append(mv.getName()).append(")").append(" -> ").append(mv.aJr());
        }
        lxc = new afe_1[]{new afe_1("language id", stringBuilder.toString(), aff_2.dJz, false)};
    }
}

