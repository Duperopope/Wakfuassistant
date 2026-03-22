/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWy
 */
final class bwy_2
extends bwo_2 {
    private static final String ltJ = "getValidInputGatePosition";
    private static final String ltK = "Renvoie la position d'un portail d'entr\u00e9e valide";
    private static final afe_1[] ltL = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bwy_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[0];
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return ltL;
    }

    @Override
    protected void ss(int n) {
        QQ qQ = this.lta.cWz();
        if (qQ == null) {
            this.cah();
            this.cah();
            this.cah();
            return;
        }
        acd_1 acd_12 = qQ.aZw();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getName() {
        return ltJ;
    }

    @Override
    public String getDescription() {
        return ltK;
    }
}

