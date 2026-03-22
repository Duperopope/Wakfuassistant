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
 * Renamed from bWs
 */
final class bws_2
extends bwo_2 {
    private static final Logger ltl = Logger.getLogger(bws_2.class);
    private static final String ltm = "getCasterInformation";
    private static final String ltn = "Permet de r?cup?rer un objet contenant des informations sur le lanceur";
    private static final afe_1[] lto = new afe_1[]{new afe_1("casterInfo", null, aff_2.dJv, false)};

    bws_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltm;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lto;
    }

    @Override
    public String getDescription() {
        return ltn;
    }

    @Override
    public void ss(int n) {
        bgy bgy2 = this.lta.iD(this.lta.caQ());
        if (bgy2 != null) {
            bwt_2 bwt_22 = switch (bgy2.aFW()) {
                case 2 -> new bwt_2(bgy2.doV(), bgy2.bcN(), bgy2.aZk(), bgy2.aWO(), bgy2.aFW(), 0);
                case 0 -> new bwt_2(bgy2.doV(), bgy2.bcN(), bgy2.aZk(), bgy2.aWO(), bgy2.aFW(), 0);
                case 1, 5 -> new bwt_2(bgy2.doV(), bgy2.bcN(), bgy2.aZk(), bgy2.aWO(), bgy2.aFW(), ((bhx_0)bgy2).doG());
                default -> null;
            };
            if (bwt_22 != null) {
                this.ad(bwt_22);
            } else {
                ltl.error((Object)"pas de caster");
                this.cah();
            }
        }
    }
}

