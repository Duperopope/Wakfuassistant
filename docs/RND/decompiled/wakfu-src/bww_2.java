/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWw
 */
final class bww_2
extends bwo_2 {
    private static final String ltD = "getLevel";
    private static final String ltE = "Permet de r?cup?rer le niveau du sort ou du skill associ? ? l'action";
    private static final afe_1[] ltF = new afe_1[]{new afe_1("castLevel", null, aff_2.dJy, false)};

    bww_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltD;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return ltF;
    }

    @Override
    public void ss(int n) {
        this.xC(this.lta.cmL());
    }

    @Override
    public String getDescription() {
        return ltE;
    }
}

