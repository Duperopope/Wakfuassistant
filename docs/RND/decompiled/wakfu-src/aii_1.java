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
 * Renamed from aiI
 */
public class aii_1
extends afk_1 {
    private static final Logger czL = Logger.getLogger(aii_1.class);

    public aii_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setUserZoomLocked";
    }

    @Override
    public String getDescription() {
        return "Emp?che l'utilisation de la molette pour zoomer";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("zoomLocked", "True pour bloquer, false sinon", aff_2.dJA, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 == null) {
            this.a(czL, "pas de scene associ? ? CameraFunctionsLibrary");
            return;
        }
        aag_0 aag_02 = aaj_02.bqL();
        if (aag_02 == null) {
            this.a(czL, "pas de camera associ? ? la scene");
            return;
        }
        aag_02.co(this.xx(0));
    }
}

