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
 * Renamed from alB
 */
public class alb_1
extends afr_1 {
    private final Logger cFA = Logger.getLogger(alb_1.class);
    private final ZC cFB;

    public alb_1(ZC zC) {
        this.cFB = zC;
    }

    @Override
    public final String getName() {
        return "Sound";
    }

    @Override
    public String getDescription() {
        return "Library used for code in animations";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aln_1(this.cFB, luaState, this.cFA), new alk_1(this.cFB, luaState, this.cFA), new alm_1(this.cFB, luaState, this.cFA), new all_1(this.cFB, luaState, this.cFA), new ali_1(this.cFB, luaState, this.cFA), new alf_1(this.cFB, luaState, this.cFA), new alh_1(this.cFB, luaState, this.cFA), new alg_2(this.cFB, luaState, this.cFA), new alj_1(this.cFB, luaState, this.cFA), new alc_2(this.cFB, luaState, this.cFA), new ale_1(this.cFB, luaState, this.cFA)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

