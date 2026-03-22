/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXd
 */
final class bxd_2
extends bxo_2 {
    private static final String lwb = "getElementId";
    private static final String lwc = "Retourne l'id de l'\u00e9l\u00e9ment du sort, -1 si pas d'\u00e9l\u00e9ment";
    private static final afe_1[] lwd = new afe_1[]{new afe_1("elementId", null, aff_2.dJy, false)};

    bxd_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwb;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwd;
    }

    @Override
    public void ss(int n) {
        Optional<Byte> optional = this.lwK.cXp();
        if (optional.isPresent()) {
            this.ad(optional.get());
        } else {
            this.xC(-1);
        }
    }

    @Override
    public String getDescription() {
        return lwc;
    }
}

