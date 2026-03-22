/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akw
 */
public class akw_1
extends alz_1<alq_1> {
    public static final String cDc = "playForcedMusic";
    private static final afe_1[] cDd = new afe_1[]{new afe_1("musicFileId", "Id du fichier \u00e0 jouer", aff_2.dJw, false), new afe_1("gainModification", "Modificateur de volume \u00e0 appliquer \u00e0 la musique, compris entre 0 et 200%. Le gain total ne pourra pas d\u00e9passer 1.", aff_2.dJy, true)};

    public akw_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDc;
    }

    @Override
    public String getDescription() {
        return "Force la musique courante";
    }

    @Override
    public afe_1[] bBg() {
        return cDd;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected alq_1 sD(int n) {
        long l = this.xs(0);
        if (n == 2) {
            return new alq_1(l, (float)this.xp(1) / 100.0f);
        }
        return new alq_1(l);
    }

    @Override
    protected void a(alq_1 alq_12, afx_1 afx_12) {
        float f2 = alq_12.bBt();
        if (f2 == 100.0f) {
            aiv_2.bBr().ga(alq_12.aYj());
        } else {
            aiv_2.bBr().a(alq_12.aYj(), f2);
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sD(n);
    }
}

