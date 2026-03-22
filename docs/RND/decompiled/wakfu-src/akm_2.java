/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akm
 */
public class akm_2
extends afk_1 {
    private static final String cCr = "clearParticleSystemOnMobile";
    private static final afe_1[] cCs = new afe_1[]{new afe_1("mobileId", "L'Id unique du mobile", aff_2.dJw, false)};

    public akm_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cCr;
    }

    @Override
    public String getDescription() {
        return "D?truit les syst?mes de particules attach?s ? un mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cCs;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            return;
        }
        agZ.bzy().e(adj_02);
    }
}

