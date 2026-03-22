/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashMap;
import java.util.Map;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFP
 */
public class afp_2 {
    private final String dJF;
    private final Map<String, Object> dJG = new HashMap<String, Object>();

    public afp_2() {
        this.dJF = null;
    }

    public afp_2(String string) {
        this.dJF = string;
    }

    public final void g(String string, Object object) {
        this.dJG.put(string, object);
    }

    public final String caM() {
        return this.dJF;
    }

    public final void d(LuaState luaState) {
        assert (this.dJF != null);
        if (this.dJF.length() == 0) {
            for (Map.Entry<String, Object> entry : this.dJG.entrySet()) {
                new afq_2(entry.getValue()).d(luaState);
                luaState.setGlobal(entry.getKey());
            }
        } else {
            luaState.newTable();
            for (Map.Entry<String, Object> entry : this.dJG.entrySet()) {
                luaState.pushString(entry.getKey());
                new afq_2(entry.getValue()).d(luaState);
                luaState.setTable(-3);
            }
            luaState.setGlobal(this.dJF);
        }
    }
}

