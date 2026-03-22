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
 * Renamed from aiN
 */
public class ain_1
extends afk_1 {
    private static final Logger czT = Logger.getLogger(ain_1.class);

    public ain_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getDescription() {
        return "Zoom sur un point pendant un certain temps puis revient ? sa position d'origine";
    }

    @Override
    public String getName() {
        return "zoomOn";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("zoomFactor", "Niveau de zoom de la cam?ra (compris entre 0.9 et 1.9)", aff_2.dJz, false), new afe_1("time", "Temps au bout duquel la cam?ra devra revenir ? sa position d'origine", aff_2.dJy, false), new afe_1("x", "Position x", aff_2.dJz, false), new afe_1("y", "Position y", aff_2.dJz, false), new afe_1("z", "Position z", aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        float f2 = this.xr(0);
        int n2 = this.xp(1);
        float f3 = this.xr(2);
        float f4 = this.xr(3);
        float f5 = this.xr(4);
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        if (aaj_02 != null) {
            aag_0 aag_02 = aaj_02.bqL();
            afW afW2 = aag_02.byR();
            float f6 = afW2.getWorldX();
            float f7 = afW2.getWorldY();
            float f8 = afW2.getAltitude();
            float f9 = aag_02.getZoomFactor();
            aag_02.c(new afU(f3, f4, f5));
            aaj_02.cy(f2);
            afx_1 afx_12 = this.cai();
            if (afW2 instanceof adj_0) {
                long l = ((adj_0)afW2).Sn();
                afq_2[] afq_2Array = new afq_2[]{new afq_2(l)};
                afx_12.a(n2, 1, "Camera.attachCameraToMobile", afq_2Array);
                afq_2[] afq_2Array2 = new afq_2[]{new afq_2(Float.valueOf(f9))};
                afx_12.a(n2, 1, "Camera.setZoomFactor", afq_2Array2);
            } else {
                afq_2[] afq_2Array = new afq_2[]{new afq_2(Float.valueOf(f9)), new afq_2(Float.valueOf(f6)), new afq_2(Float.valueOf(f7)), new afq_2(Float.valueOf(f8))};
                afx_12.a(n2, 1, "Camera.setCamera", afq_2Array);
            }
        } else {
            this.a(czT, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

