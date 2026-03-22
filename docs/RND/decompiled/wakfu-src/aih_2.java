/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aih
 */
public class aih_2
extends afr_1 {
    static final Logger cyR = Logger.getLogger(aih_2.class);
    private static final boolean cyS = true;
    private static final aih_2 cyT = new aih_2();
    static int bIL = 0;
    private final TIntObjectHashMap<acf> cyU = new TIntObjectHashMap();
    private final TIntObjectHashMap<aaW> cyV = new TIntObjectHashMap();

    @Override
    public final String getName() {
        return "Light";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static aaW st(int n) {
        return (aaW)aih_2.cyT.cyV.get(n);
    }

    static void su(int n) {
        aih_2.cyT.cyV.remove(n);
    }

    static void a(int n, aaW aaW2) {
        aih_2.cyT.cyV.put(n, (Object)aaW2);
    }

    static acf sv(int n) {
        return (acf)aih_2.cyT.cyU.get(n);
    }

    static void sw(int n) {
        aih_2.cyT.cyU.remove(n);
    }

    static void a(int n, acf acf2) {
        aih_2.cyT.cyU.put(n, (Object)acf2);
    }

    public static aih_2 bBn() {
        return cyT;
    }

    private aih_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aij_2(luaState), new ail_2(luaState), new aio_2(luaState), new ain_2(luaState), new aip_1(luaState), new aii_2(luaState), new aik_2(luaState), new aim_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

