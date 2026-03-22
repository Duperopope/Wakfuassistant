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
 * Renamed from aiA
 */
public class aia_2
extends afk_1 {
    private static final Logger czx = Logger.getLogger(aia_2.class);

    public aia_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getWorldTarget";
    }

    @Override
    public String getDescription() {
        return "Permet de r?cup?rer la position actuelle de la cam?ra";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("posX", "Position x", aff_2.dJz, false), new afe_1("posY", "Position y", aff_2.dJz, false), new afe_1("posZ", "Position z", aff_2.dJz, false)};
    }

    @Override
    public void ss(int n) {
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aag_0 aag_02 = aaj_02.bqL();
            this.dJ(aag_02.bsf());
            this.dJ(aag_02.bsg());
            this.dJ(aag_02.getAltitude());
        } else {
            this.a(czx, "Pas de scene associ? ? CameraFunctionsLibrary");
            this.cah();
            this.cah();
            this.cah();
        }
    }
}

