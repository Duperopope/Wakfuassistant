/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class aZN
implements afl {
    static final Logger hyv = Logger.getLogger(aZN.class);
    private static final aZN hyw = new aZN();

    public static aZN cYW() {
        return hyw;
    }

    private aZN() {
    }

    public void a(WL wL) {
        aqb_1.bGD().a(new anh_0(), new azo_0(this));
        fjt.syH.a(flF.sFP);
        wL.b(this);
    }

    static ArrayList<amx_1> s(String[] stringArray) {
        ArrayList<amx_1> arrayList = new ArrayList<amx_1>(stringArray.length);
        for (int i = 0; i < stringArray.length; ++i) {
            try {
                ArrayList<amx_1> arrayList2 = ehu_0.rW(stringArray[i]);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                    continue;
                }
                arrayList.add(null);
                continue;
            }
            catch (Exception exception) {
                hyv.error((Object)("Erreur lors de la compilation de Param\u00e8tres sur une loi : " + stringArray[i]), (Throwable)exception);
            }
        }
        return arrayList;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.citizen.rules", new Object[0]);
    }
}

