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
 * Renamed from bUC
 */
public class buc_2
extends afr_1 {
    private static final buc_2 lrc = new buc_2();
    static final afe_1[] lrd = new afe_1[]{new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    static final afe_1[] lre = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    static final afe_1[] lrf = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("spellElement", null, aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    static final afe_1[] lrg = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("eventType", "see FightEventType.java", aff_2.dJx, false)};

    public static buc_2 eoq() {
        return lrc;
    }

    @Override
    public final String getName() {
        return "FightEvent";
    }

    @Override
    public String getDescription() {
        return "Callback are removed at end of fight";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bum_1(luaState), new bul_2(luaState), new bue_2(luaState), new bud_1(luaState), new buo_1(luaState), new bun_2(luaState), new buj_2(luaState), new bui_1(luaState), new buf_2(luaState), new bug_1(luaState), new buk_2(luaState), new buh_1(luaState), new buu_1(luaState), new but_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    private buc_2() {
    }

    static /* synthetic */ Logger aGh() {
        return dIl;
    }

    static /* synthetic */ Logger aGi() {
        return dIl;
    }

    static /* synthetic */ Logger aGj() {
        return dIl;
    }

    static /* synthetic */ Logger aGR() {
        return dIl;
    }
}

