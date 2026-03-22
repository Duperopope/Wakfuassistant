/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akv
 */
public class akv_1
extends alz_1<alq_1> {
    public static final String cDa = "playFightMusic";
    private static final afe_1[] cDb = new afe_1[]{new afe_1("musicFileId", "Id du fichier \u00e0 jouer", aff_2.dJw, false), new afe_1("gainModification", "Modification du volume \u00e0 appliquer entre 0 et 200%", aff_2.dJy, true)};

    public akv_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDa;
    }

    @Override
    public String getDescription() {
        return "Joue une musique (son relativement long, et bouclant) en combat.";
    }

    @Override
    public afe_1[] bBg() {
        return cDb;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        if (n > 1) {
            return new alq_1(l, (float)this.xp(1) / 100.0f);
        }
        return new alq_1(l, -1.0f);
    }

    @Override
    protected void a(alq_1 alq_12, afx_1 afx_12) {
        float f2 = alq_12.bBt();
        if (f2 == -1.0f) {
            aiv_2.bBr().gb(alq_12.aYj());
        } else {
            aiv_2.bBr().b(alq_12.aYj(), f2);
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sD(n);
    }
}

