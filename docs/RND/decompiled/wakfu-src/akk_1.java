/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akK
 */
public class akk_1
extends alz_1<akl_1> {
    public static final String cDX = "setMusicMix";
    private static final afe_1[] cDY = new afe_1[]{new afe_1("targetGain", "Volume entre 0 et 100", aff_2.dJz, false), new afe_1("fadeOutTime", "Temps de transition", aff_2.dJz, true)};

    public akk_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDX;
    }

    @Override
    public String getDescription() {
        return "R\u00e8gle le volume auquel mettre la musique lorsqu'on joue les sons de combat, et le temps de transition vers ce volume";
    }

    @Override
    public afe_1[] bBg() {
        return cDY;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected akl_1 sJ(int n) {
        float f2 = (float)this.xq(0);
        if (n < 2) {
            return new akl_1(f2);
        }
        float f3 = (float)this.xq(1);
        return new akl_1(f2, f3);
    }

    @Override
    protected void a(akl_1 akl_12, afx_1 afx_12) {
        aiv_2.bBr().aX(akl_12.bBJ(), akl_12.bBK());
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sJ(n);
    }
}

