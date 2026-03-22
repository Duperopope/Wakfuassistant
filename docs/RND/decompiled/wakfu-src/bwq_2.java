/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWq
 */
class bwq_2
extends bwo_2 {
    private static final String lte = "getCaster";
    private static final String ltf = "Permet de r?cup?rer l'id du lanceur de l'action";
    private static final afe_1[] ltg = new afe_1[]{new afe_1("casterId", null, aff_2.dJw, false)};

    bwq_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return lte;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return ltg;
    }

    @Override
    public void ss(int n) {
        this.hA(this.lta.caQ());
    }

    @Override
    public String getDescription() {
        return ltf;
    }
}

