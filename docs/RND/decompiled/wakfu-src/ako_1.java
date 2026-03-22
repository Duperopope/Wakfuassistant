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
 * Renamed from akO
 */
public class ako_1
extends alz_1<alq_1> {
    private static final Logger cEf = Logger.getLogger(ako_1.class);
    public static final String cEg = "stopSound";
    private static final afe_1[] cEh = new afe_1[]{new afe_1("soundUID", "UID du fichier son", aff_2.dJw, false)};

    public ako_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return cEg;
    }

    @Override
    public String getDescription() {
        return "Stoppe un son au sein du monde.";
    }

    @Override
    public final afe_1[] bBg() {
        return cEh;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        return new alq_1(l);
    }

    @Override
    protected void a(alq_1 alq_12, afx_1 afx_12) {
        ahk_1 ahk_12 = ahn_1.ccT().hL(alq_12.aYj());
        aiv_2.bBr().a(alq_12.aYj(), ahk_12);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sD(n);
    }
}

