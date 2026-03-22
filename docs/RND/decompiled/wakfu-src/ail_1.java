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
 * Renamed from aiL
 */
public class ail_1
extends afk_1 {
    private static final Logger czR = Logger.getLogger(ail_1.class);

    public ail_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setZoomFactor";
    }

    @Override
    public String getDescription() {
        return "D?fini le niveau de zoom de la cam?ra";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("zoomValue", "Float compris entre 0.9 et 1.9 indiquant le nouveau niveau de zoom de la cam?ra", aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        float f2 = this.xr(0);
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aaj_02.cy(f2);
        } else {
            this.a(czR, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

