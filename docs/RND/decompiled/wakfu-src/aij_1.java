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
 * Renamed from aiJ
 */
public class aij_1
extends afk_1 {
    private static final Logger czM = Logger.getLogger(aij_1.class);

    public aij_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setWorldTarget";
    }

    @Override
    public String getDescription() {
        return "permet de d?finir la position de la cam?ra";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("coordX", "Position x", aff_2.dJz, false), new afe_1("coordY", "Position y", aff_2.dJz, false), new afe_1("altitude", "Position z", aff_2.dJz, false), new afe_1("funcName", "Fonction a appeler lorsque la cam?ra est centr?", aff_2.dJx, true), new afe_1("funcParams", "Param?tres de la fonction a appeler", aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        float f2 = this.xr(0);
        float f3 = this.xr(1);
        float f4 = this.xr(2);
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aag_0 aag_02 = aaj_02.bqL();
            aag_02.c(new afU(f2, f3, f4));
            if (n > 3) {
                afx_1 afx_12 = this.cai();
                String string = this.xu(3);
                afq_2[] afq_2Array = this.cP(4, n);
                aag_02.a(new aik_1(this, aag_02, afx_12, string, afq_2Array));
            }
        } else {
            this.a(czM, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

