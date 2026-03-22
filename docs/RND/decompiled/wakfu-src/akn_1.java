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
 * Renamed from akN
 */
public class akn_1
extends alz_1<Void> {
    private static final Logger cEd = Logger.getLogger(akn_1.class);
    public static final String cEe = "stopMusic";

    public akn_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cEe;
    }

    @Override
    public String getDescription() {
        return "Stop une musique en cours de lecture";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    protected Void sI(int n) {
        return null;
    }

    @Override
    protected void a(Void void_, afx_1 afx_12) {
        this.a(cEd, "stop music not yet implemented");
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sI(n);
    }
}

