/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajt
 */
public final class ajt_1
extends afk_1
implements ajs_1 {
    private static final st_0 cAV = new st_0();
    private static final wz_0 cAW;
    private static final afe_1[] cAX;
    private static final afe_1[] cAY;

    public ajt_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "moveMobile";
    }

    @Override
    public String getDescription() {
        return "Starts a movement from the initial position to the given coordinates with the walk animation";
    }

    @Override
    public afe_1[] bBg() {
        return cAX;
    }

    @Override
    public afe_1[] bBh() {
        return cAY;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (!(adj_02 instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            this.dK(false);
            return;
        }
        ads_0 ads_02 = (ads_0)adj_02;
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        wa_0.a(adj_02.bcC(), adj_02.bcD(), n2, n3, cAW);
        sr_0 sr_02 = sr_0.bgd();
        ajt_1.cAV.bqM = ads_02.bvx() != 8;
        sr_02.a(cAV);
        sr_02.a((int)ads_02.aKu(), ads_02.bcO(), ads_02.bvy());
        sr_02.b(cAW);
        sr_02.p(adj_02.bcC(), adj_02.bcD(), (short)adj_02.getAltitude());
        sr_02.q(n2, n3, (short)n4);
        sr_02.bgj();
        anp_2 anp_22 = sr_02.bgh();
        cAW.reset();
        if (anp_22.bDV()) {
            ads_02.a(anp_22, true, true);
            this.dK(true);
        } else {
            this.dK(false);
        }
        sr_02.aZp();
        if (n > 4) {
            afx_1 afx_12 = this.cai();
            String string = this.xu(4);
            afq_2[] afq_2Array = this.cP(5, n);
            ads_02.b(new aju_1(this, afx_12, string, afq_2Array));
        }
    }

    static {
        ajt_1.cAV.bqM = true;
        ajt_1.cAV.bqN = 400;
        ajt_1.cAV.bqR = false;
        cAW = new wz_0();
        cAX = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("worldX", "Destination x", aff_2.dJy, false), new afe_1("worldY", "Destination y", aff_2.dJy, false), new afe_1("worldZ", "Destination z", aff_2.dJy, false), new afe_1("funcName", "Function to run when the mobile is arrived", aff_2.dJx, true), new afe_1("funcParams", "", aff_2.dJC, true)};
        cAY = new afe_1[]{new afe_1("pathFound", "Return true if the mobile have a valid path", aff_2.dJA, false)};
    }
}

