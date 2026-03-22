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
 * Renamed from aiB
 */
public class aib_2
extends afk_1 {
    private static final Logger czy = Logger.getLogger(aib_2.class);

    public aib_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getZoomFactor";
    }

    @Override
    public String getDescription() {
        return "R?cup?re le niveau de zoom actuel de la cam?ra";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("zoomValue", "le niveau de zoom actuel de la cam?ra, entre 0.9 et 1.9", aff_2.dJz, false)};
    }

    @Override
    public void ss(int n) {
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            float f2 = aaj_02.byw();
            this.dJ(f2);
        } else {
            this.a(czy, "pas de camera associ?e ? CameraFunctionsLibrary");
            this.cah();
        }
    }
}

