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
 * Renamed from aiy
 */
public class aiy_1
extends afk_1 {
    private static final Logger czr = Logger.getLogger(aiy_1.class);
    private static final boolean czs = true;

    public aiy_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "attachCameraToMobile";
    }

    @Override
    public String getDescription() {
        return "Attache la cam?ra ? un mobile. Quand le mobile se d?place, la cam?ra continue de le suivre.";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("mobileId", "id du mobile ? suivre", aff_2.dJw, false), new afe_1("funcName", "Fonction ? appeler lorsque la cam?ra est centr?e sur le mobile", aff_2.dJx, true), new afe_1("funcParams", "Param?tres de la fonction appel?e", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 != null) {
            aaj_0 aaj_02 = ahs_0.bBd().bBc();
            if (aaj_02 != null) {
                aag_0 aag_02 = aaj_02.bqL();
                aag_02.c(adj_02);
                if (n > 1) {
                    afx_1 afx_12 = this.cai();
                    String string = this.xu(1);
                    afq_2[] afq_2Array = this.cP(2, n);
                    aag_02.a(new aiz_1(this, aag_02, afx_12, string, afq_2Array));
                }
            } else {
                this.a(czr, "pas de camera associ?e ? CameraFunctionsLibrary");
            }
        } else {
            this.a(czr, "mobile inconnu " + l);
        }
    }
}

