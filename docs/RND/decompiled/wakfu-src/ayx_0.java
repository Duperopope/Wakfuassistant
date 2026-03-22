/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from aYx
 */
public class ayx_0
implements afl {
    static final Logger hxF = Logger.getLogger(ayx_0.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new alq_0(), new ayy_0(this));
        ayx_0.cYr();
        wL.b(this);
    }

    private static void cYr() {
        eKQ.qEb.q(eKW2 -> {
            try {
                bmr_1.iEC.g((eKW)eKW2);
            }
            catch (Exception exception) {
                hxF.error((Object)"Exception raised", (Throwable)exception);
            }
        });
    }

    static eKW a(alq_0 alq_02) {
        eKW eKW2 = new eKW(alq_02.cms(), alq_02.cmt(), alq_02.cmu(), alq_02.cmv(), alq_02.cmw(), alq_02.cmx());
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
        aqb_1.bGD().a(new aOl(), "craft_id", eKW2.d(), new aYz(eKW2, tIntObjectHashMap2, tIntObjectHashMap, hashMap, hashMap2));
        eKW2.f((TIntObjectHashMap<ArrayList<eKR>>)tIntObjectHashMap);
        eKW2.g((TIntObjectHashMap<ArrayList<eKR>>)tIntObjectHashMap2);
        eKW2.I(hashMap);
        eKW2.J(hashMap2);
        return eKW2;
    }

    public static eKR a(aOl aOl2) {
        int[] nArray = aOl2.ckm();
        EnumSet<eKS> enumSet = EnumSet.noneOf(eKS.class);
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            aOm[] aOmArray = eKS.QY(n);
            if (aOmArray == null) {
                throw new Exception("Impossible de trouver la propri\u00e9t\u00e9 " + n + " de la recette " + aOl2.d());
            }
            if (enumSet.contains(aOmArray)) {
                throw new Exception("Duplication de la propri\u00e9t\u00e9 " + n + " sur la recette " + aOl2.d());
            }
            enumSet.add((eKS)aOmArray);
        }
        eKV eKV2 = Stream.of(aOl2.cuq()).findFirst().filter(aOo2 -> aOo2.bfd() > 0).map(aOo2 -> new eKV(aOo2.azv(), aOo2.bfd())).orElse(eKV.qEF);
        eKR eKR2 = new eKR(aOl2.d(), aOl2.cjd(), (short)aOl2.tL(), aOl2.Tz(), aOl2.cuj(), ehu_0.rY(aOl2.clB()), ehu_0.rY(aOl2.cuh()), aOl2.cui(), enumSet, eKV2, aOl2.cuo(), aOl2.cuk());
        for (aOm aOm2 : aOl2.cup()) {
            if (eKR2.QX(aOm2.azv())) {
                throw new Exception("Duplication d'ingredient " + aOm2.azv() + " sur la recette " + aOl2.d());
            }
            int n = aOm2.azv();
            eKR2.b(n, aOm2.bfd(), aOm2.cus());
        }
        return eKR2;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.craft", new Object[0]);
    }
}

