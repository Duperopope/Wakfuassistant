/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXr
 */
public class bxr_2
extends afk_1 {
    private static final Logger lwS = Logger.getLogger(bxr_2.class);
    private static final String lwT = "createAnimatedElement";
    private static final String lwU = "Create an AnimatedElementWithDirection at the specified position (client only)";
    private static final afe_1[] lwV = new afe_1[]{new afe_1("type", null, aff_2.dJx, false), new afe_1("spriteName", null, aff_2.dJx, false), new afe_1("worldX", null, aff_2.dJy, false), new afe_1("worldY", null, aff_2.dJy, false), new afe_1("altitude", null, aff_2.dJy, false), new afe_1("direction", null, aff_2.dJy, false), new afe_1("animName", null, aff_2.dJx, true)};
    private static final afe_1[] lwW = new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};

    public bxr_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lwT;
    }

    @Override
    public String getDescription() {
        return lwU;
    }

    @Override
    public afe_1[] bBg() {
        return lwV;
    }

    @Override
    public final afe_1[] bBh() {
        return lwW;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        String string2 = this.xu(1);
        int n2 = this.xp(2);
        int n3 = this.xp(3);
        int n4 = this.xp(4);
        int n5 = this.xp(5);
        String string3 = n >= 7 ? this.xu(6) : "AnimStatique_1";
        long l = bxr_2.Sn();
        while (ZM.bqw().fD(l) != null) {
            lwS.warn((Object)("There is already an element with this id " + l));
            l = bxr_2.Sn();
        }
        ZG zG = new ZG(l, n2, n3, n4);
        try {
            zG.k(bxr_2.aj(string, string2), true);
        }
        catch (IOException iOException) {
            lwS.error((Object)"", (Throwable)iOException);
            this.cah();
            return;
        }
        abi_1 abi_12 = abi_1.wG(n5);
        if (abi_12 == abi_1.dzt) {
            abi_12 = abi_1.dzk;
        }
        zG.a(abi_12);
        zG.dP(string + "/" + string2);
        zG.qR(afX.csq.byy());
        zG.dT(string3);
        ZM.bqw().c(zG);
        this.hA(l);
    }

    private static long Sn() {
        return aym_2.bSE();
    }

    private static String nL(String string) {
        if (string.equals("interactives")) {
            return "ANMInteractiveElementPath";
        }
        if (string.equals("resources")) {
            return "ANMResourcePath";
        }
        if (string.equals("npcs")) {
            return "npcGfxPath";
        }
        if (string.equals("pets")) {
            return "petGfxPath";
        }
        if (string.equals("players")) {
            return "playerGfxPath";
        }
        if (string.equals("dynamics")) {
            return "ANMDynamicElementPath";
        }
        return null;
    }

    public static String aj(String string, String string2) {
        String string3 = bxr_2.nL(string.toLowerCase());
        try {
            if (string3 != null) {
                String string4 = auc_0.cVq().bS(string3);
                return String.format(string4, string2);
            }
        }
        catch (fu_0 fu_02) {
            lwS.error((Object)("Problem with type " + string), (Throwable)fu_02);
        }
        lwS.error((Object)("Unknown type : " + string));
        return string + "/" + string2;
    }
}

