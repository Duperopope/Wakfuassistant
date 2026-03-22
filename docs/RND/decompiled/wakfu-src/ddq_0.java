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
 * Renamed from ddq
 */
final class ddq_0
extends afk_1 {
    private static final Logger ogE = Logger.getLogger(ddq_0.class);

    ddq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "attachToMobile";
    }

    @Override
    public String getDescription() {
        return "Applique une bulle ? un mobile";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("mobileId", "Id du mobile auquel lier la bulle", aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        chj_2 chj_22 = dds_0.fcD().NV(n2);
        if (chj_22 == null) {
            this.a(ogE, "pas de bulle de texte " + n2);
            return;
        }
        long l = this.xs(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 != null) {
            chj_22.setTarget(adj_02);
            chj_22.a(adj_02, adj_02.getScreenX(), adj_02.getScreenY(), adj_02.bng());
        } else {
            this.a(ogE, "mobile inconnu " + l);
        }
        ogE.info((Object)("attachtoMobile " + String.valueOf(chj_22) + " " + l));
    }
}

