/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ddE
extends afk_1 {
    private static final Logger oha = Logger.getLogger(ddE.class);

    ddE(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setCharacterSpeak";
    }

    @Override
    public String getDescription() {
        return "Display a message in the chat and the corresponding WakfuBubble will be displayed";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("translationKey", null, aff_2.dJx, false), new afe_1("translation parameters", null, aff_2.dJB, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        Object[] objectArray;
        adj_0 adj_02;
        long l = this.xs(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = null;
        boolean bl = false;
        if (n > 2) {
            if (this.xy(2)) {
                afq_2Array = this.xv(2);
            } else if (this.xB(2)) {
                bl = this.xx(2);
            }
        }
        if (n > 3) {
            bl = this.xx(3);
        }
        if ((adj_02 = adn_0.bvh().fM(l)) == null) {
            this.a(oha, "mobile inconnu " + l);
            return;
        }
        if (!(adj_02 instanceof bdj_2)) {
            this.a(oha, "le mobile " + l + " n'est pas valide");
            return;
        }
        bgy bgy2 = ((bdj_2)adj_02).dcP();
        if (afq_2Array != null) {
            objectArray = new String[afq_2Array.length];
            for (int i = 0; i < afq_2Array.length; ++i) {
                objectArray[i] = ddw_0.j((String)afq_2Array[i].getValue(), new Object[0]);
            }
        } else {
            objectArray = new String[]{};
        }
        String string2 = aum_0.cWf().c(string, objectArray);
        api_0 api_02 = new api_0(bgy2.getName(), l, string2);
        api_02.m(aPl.exq);
        api_02.eC(bl);
        aVj.n(() -> aPh.czg().d(api_02));
    }
}

