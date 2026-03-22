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
 * Renamed from aiM
 */
public class aim_1
extends afk_1 {
    private static final Logger czS = Logger.getLogger(aim_1.class);

    public aim_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setZoomSpeedFactor";
    }

    @Override
    public String getDescription() {
        return "D?finit la vitesse ? laquelle une modification de zoom s'applique";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("speed", "Float d?finissant la vitesse ? laquelle le zoom se modifie par rapport ? la vitesse de base", aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aaj_02.bqL().cB((float)this.xq(0));
        } else {
            this.a(czS, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

