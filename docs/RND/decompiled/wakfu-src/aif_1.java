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
 * Renamed from aiF
 */
public class aif_1
extends afk_1 {
    private static final Logger czF = Logger.getLogger(aif_1.class);

    public aif_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getDescription() {
        return "Positionne la cam?ra sur un point";
    }

    @Override
    public String getName() {
        return "setCamera";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("zoomFactor", "Niveau de zoom d?sir? (entre 0.9 et 1.9)", aff_2.dJz, false), new afe_1("x", "Position x d?sir?e", aff_2.dJz, false), new afe_1("y", "Position y d?sir?e", aff_2.dJz, false), new afe_1("z", "Position z d?sir?e", aff_2.dJz, false), new afe_1("funcName", "Fonction a appeler lorsque la cam?ra est centr? sur le point", aff_2.dJx, true), new afe_1("funcParams", "Param?tres de la fonction a appeler", aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        float f2 = (float)this.xq(0);
        float f3 = (float)this.xq(1);
        float f4 = (float)this.xq(2);
        float f5 = (float)this.xq(3);
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aag_0 aag_02 = aaj_02.bqL();
            aag_02.c(new afU(f3, f4, f5));
            aag_02.cy(f2);
            if (n > 4) {
                afx_1 afx_12 = this.cai();
                String string = this.xu(4);
                afq_2[] afq_2Array = this.cP(5, n);
                aag_02.a(new aig_1(this, aag_02, afx_12, string, afq_2Array));
            }
        } else {
            this.a(czF, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

