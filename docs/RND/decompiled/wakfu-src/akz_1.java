/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akz
 */
public class akz_1
extends alz_1<alq_1> {
    private static final afe_1[] cDp = new afe_1[]{new afe_1("musicFileId", "Id du fichier \u00e0 jouer", aff_2.dJw, false)};

    public akz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "playMusic";
    }

    @Override
    public String getDescription() {
        return "Joue une musique (son relativement long, et bouclant) au sein du monde.";
    }

    @Override
    public afe_1[] bBg() {
        return cDp;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        return new alq_1(l);
    }

    @Override
    protected void a(alq_1 alq_12, afx_1 afx_12) {
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sD(n);
    }
}

