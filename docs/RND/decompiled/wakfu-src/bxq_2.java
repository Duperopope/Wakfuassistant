/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXq
 */
public class bxq_2
extends afk_1 {
    public static final String lwO = "getPartInSight";
    public static final String lwP = "Retourne la partie du corps du mobile orient\u00e9 vers la position donn\u00e9e";
    private static final afe_1[] lwQ = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false)};
    private static final afe_1[] lwR = new afe_1[]{new afe_1("partId", null, aff_2.dJy, false)};

    public bxq_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lwQ;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lwR;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (!(adj_02 instanceof bdj_2)) {
            this.cah();
            return;
        }
        bdj_2 bdj_22 = (bdj_2)adj_02;
        bgy bgy2 = bdj_22.dcP();
        if (bgy2 == null) {
            this.cah();
            return;
        }
        so_0 so_02 = bgy2.baD().o(n2, n3, (short)0);
        this.xC(so_02.d());
    }

    @Override
    public String getName() {
        return lwO;
    }

    @Override
    public String getDescription() {
        return lwP;
    }
}

