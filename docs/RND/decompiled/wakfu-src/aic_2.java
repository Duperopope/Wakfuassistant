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
 * Renamed from aiC
 */
public class aic_2
extends afk_1 {
    private static final Logger czz = Logger.getLogger(aic_2.class);

    public aic_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "scrollTo";
    }

    @Override
    public String getDescription() {
        return "Permet de d?finir la position de la cam?ra en effectuant un scrolling r?gulier";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("x", "Position x d?sir?e", aff_2.dJz, false), new afe_1("y", "Position y d?sir?e", aff_2.dJz, false), new afe_1("z", "Position z d?sir?e", aff_2.dJz, false), new afe_1("function Name", "Fonction ? appeler lorsque la cam?ra est ariv? a destination", aff_2.dJx, true), new afe_1("function Params", "Param?tres de la fonction ? appeler", aff_2.dJC, true)};
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
            aag_02.a(agj_0.cuI);
            aag_02.c(new afU(f2, f3, f4));
            aag_02.a(new aid_1(this, aag_02));
            if (n > 3) {
                afx_1 afx_12 = this.cai();
                String string = this.xu(3);
                afq_2[] afq_2Array = this.cP(4, n);
                aag_02.a(new aie_1(this, aag_02, afx_12, string, afq_2Array));
            }
        } else {
            this.a(czz, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

