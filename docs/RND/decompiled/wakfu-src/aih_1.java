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
 * Renamed from aiH
 */
public class aih_1
extends afk_1 {
    private static final Logger czK = Logger.getLogger(aih_1.class);

    public aih_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMoveSpeedFactor";
    }

    @Override
    public String getDescription() {
        return "D?finit la vitesse ? laquelle la camera se d?place par rapport ? la vitesse de base";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("speedFactor", "Vitesse de d?placement", aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aaj_02.bqL().cC((float)this.xq(0));
        } else {
            this.a(czK, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

