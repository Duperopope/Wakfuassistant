/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akM
 */
public class akm_1
extends alz_1<Void> {
    public static final String cEb = "stopForcedMusic";
    private static final afe_1[] cEc = new afe_1[0];

    public akm_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cEb;
    }

    @Override
    public String getDescription() {
        return "Ne force plus la musique courante";
    }

    @Override
    public afe_1[] bBg() {
        return cEc;
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
        aiv_2.bBr().bBk();
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sI(n);
    }
}

