/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddz
 */
final class ddz_0
extends afk_1 {
    private static final Logger ogQ = Logger.getLogger(ddz_0.class);

    ddz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "closeBubbleAttachedTo";
    }

    @Override
    public String getDescription() {
        return "Hide all WakfuBubbles linked to a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZH zH = adn_0.bvh().fM(l);
        if (zH == null) {
            zH = afh_0.bxU().fR(l);
        }
        if (zH == null) {
            this.a(ogQ, "mobile ou IE " + l + " inexistant");
            return;
        }
        Collection<fem_1> collection = dds_0.fcD().b(zH);
        for (fem_1 fem_12 : collection) {
            ddy_0.Oa(fem_12.getAdviserId());
        }
        aPG.ik(l);
    }
}

