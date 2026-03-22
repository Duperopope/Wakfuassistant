/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEK
 */
public class aek_1
extends afr_1 {
    static final Logger dGR = Logger.getLogger(aek_1.class);
    static final afe_1[] dGS = new afe_1[]{new afe_1("time", "Script execution duration (ms)", aff_2.dJy, false)};
    static final afe_1[] dGT = new afe_1[]{new afe_1("time", "Start time for action (ms)", aff_2.dJy, false), new afe_1("loopCount", "Call count", aff_2.dJy, false), new afe_1("funcName", "Called function", aff_2.dJx, false), new afe_1("funcParams", "Params for called function", aff_2.dJC, true)};
    static final afe_1[] dGU = new afe_1[]{new afe_1("taskId", "Task id (default = -1 <=> all waiting or timed tasks)", aff_2.dJy, true)};
    static final afe_1[] dGV = new afe_1[]{new afe_1("taskId", "Task id", aff_2.dJy, false)};
    static final afe_1[] dGW = new afe_1[]{new afe_1("fileName", "Script file name", aff_2.dJx, false)};
    static final afe_1[] dGX = new afe_1[]{new afe_1("libName", "Path to a script", aff_2.dJx, false)};
    static final afe_1[] dGY = new afe_1[]{new afe_1("time", "Delay between function call (ms)", aff_2.dJy, false), new afe_1("funcName", "Called function", aff_2.dJx, false), new afe_1("funcParams", "Params for called function", aff_2.dJC, true)};
    static final afe_1[] dGZ = new afe_1[]{new afe_1("taskId", "Task id", aff_2.dJy, false)};
    static final afe_1[] dHa = new afe_1[]{new afe_1("taskId", "Task id", aff_2.dJy, true)};
    static final afe_1[] dHb = new afe_1[]{new afe_1("message", "Logged string", aff_2.dJC, true)};
    static final afe_1[] dHc = new afe_1[]{new afe_1("param1", null, aff_2.dJw, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHd = new afe_1[]{new afe_1("result", null, aff_2.dJA, false)};
    static final afe_1[] dHe = new afe_1[]{new afe_1("param1", null, aff_2.dJw, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHf = new afe_1[]{new afe_1("result", null, aff_2.dJA, false)};
    static final afe_1[] dHg = new afe_1[]{new afe_1("param1", null, aff_2.dJw, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHh = new afe_1[]{new afe_1("result", null, aff_2.dJA, false)};
    static final afe_1[] dHi = new afe_1[]{new afe_1("param1", null, aff_2.dJw, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHj = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHk = new afe_1[]{new afe_1("param", null, aff_2.dJw, false)};
    static final afe_1[] dHl = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHm = new afe_1[]{new afe_1("param1", null, aff_2.dJw, false), new afe_1("param2", null, aff_2.dJw, false)};
    static final afe_1[] dHn = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHo = new afe_1[]{new afe_1("param1", null, aff_2.dJz, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHp = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHq = new afe_1[]{new afe_1("param1", null, aff_2.dJz, false), new afe_1("param2", null, aff_2.dJz, true)};
    static final afe_1[] dHr = new afe_1[]{new afe_1("result", null, aff_2.dJz, false)};
    static final afe_1[] dHs = new afe_1[]{new afe_1("param", null, aff_2.dJv, false)};
    static final afe_1[] dHt = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHu = new afe_1[]{new afe_1("x", null, aff_2.dJz, false), new afe_1("y", null, aff_2.dJz, false), new afe_1("z", null, aff_2.dJz, false)};
    static final afe_1[] dHv = new afe_1[]{new afe_1("result", null, aff_2.dJw, false)};
    static final afe_1[] dHw = new afe_1[]{new afe_1("x", null, aff_2.dJw, false)};
    static final afe_1[] dHx = new afe_1[]{new afe_1("x", null, aff_2.dJz, false), new afe_1("y", null, aff_2.dJz, false), new afe_1("z", null, aff_2.dJz, false)};
    static final afe_1[] dHy = new afe_1[]{new afe_1("param1", null, aff_2.dJC, false)};
    static final afe_1[] dHz = new afe_1[]{new afe_1("result", null, aff_2.dJx, false)};
    static final afe_1[] dHA = new afe_1[]{new afe_1("func", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    static final afe_1[] dHB = new afe_1[]{new afe_1("taskId", null, aff_2.dJy, false)};
    static final afe_1[] dHC = new afe_1[]{new afe_1("taskId", null, aff_2.dJy, false)};
    static final afe_1[] dHD = new afe_1[]{new afe_1("short 1", null, aff_2.dJy, false), new afe_1("short 2", null, aff_2.dJy, false)};
    static final afe_1[] dHE = new afe_1[]{new afe_1("integer", null, aff_2.dJy, false)};
    private static final aek_1 dHF = new aek_1();

    @Override
    @Nullable
    public final String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public static aek_1 cab() {
        return dHF;
    }

    @Override
    @Nullable
    public afk_1[] a(LuaState luaState) {
        return null;
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return new afk_1[]{new aep_1(luaState), new aes_2(luaState), new aen_1(luaState), new afe_2(luaState), new afi_2(luaState), new aer_1(luaState), new afd_2(luaState), new aeq_1(luaState), new aet_2(luaState), new aev_2(luaState), new aeu_2(luaState), new aff_1(luaState), new afa_2(luaState), new afb_1(luaState), new ael_1(luaState), new aey_2(luaState), new afh_1(luaState), new aez_2(luaState), new aex_2(luaState), new afg_1(luaState), new agh_2(luaState), new afc_2(luaState), new aem_1(luaState), new aew_2(luaState), new aeo_1(luaState)};
    }
}

