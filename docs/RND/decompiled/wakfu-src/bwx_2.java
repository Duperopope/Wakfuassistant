/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWx
 */
final class bwx_2
extends bwo_2 {
    private static final String ltG = "getPosition";
    private static final String ltH = "Permet de r?cup?rer les coordonn?es de la cellule cibl?e par l'action";
    private static final afe_1[] ltI = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bwx_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltG;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return ltI;
    }

    @Override
    public void ss(int n) {
        this.xC(this.lta.getX());
        this.xC(this.lta.getY());
        this.xC(this.lta.bdi());
    }

    @Override
    public String getDescription() {
        return ltH;
    }
}

