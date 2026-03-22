/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aTq
 */
public class atq_0
extends aRY {
    public static final int eRA = 0;
    public static final int eRB = 1;
    public static final int eRC = 2;
    public static final int eRD = 3;
    public static final int eRE = 4;
    private static final int eRF = -1;
    private final int eRG;
    private final Object[] eRH;

    public atq_0(int n, Object ... objectArray) {
        this.eRG = n;
        this.eRH = objectArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eRG) {
            case 0: {
                return this.eRH.length == 2 || this.eRH.length == 3;
            }
            case 1: 
            case 3: {
                return this.eRH.length == 1 && this.eRH[0] != null;
            }
            case 4: {
                return this.eRH.length == 1;
            }
            case 2: {
                return this.eRH.length == 3 || this.eRH.length == 4;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        switch (this.eRG) {
            case 0: {
                ns_02.Q((short)71);
                ns_02.nX((Integer)this.eRH[0]);
                ns_02.nX((Integer)this.eRH[1]);
                ns_02.aN(this.eRH.length >= 3 && (Boolean)this.eRH[2] != false);
                break;
            }
            case 1: {
                ns_02.Q((short)409);
                ns_02.cX((Long)this.eRH[0]);
                break;
            }
            case 2: {
                ns_02.Q((short)457);
                ns_02.nX((Integer)this.eRH[0]);
                ns_02.nX((Integer)this.eRH[1]);
                ns_02.cX((Long)this.eRH[2]);
                ns_02.aN(this.eRH.length >= 4 && (Boolean)this.eRH[3] != false);
                break;
            }
            case 3: {
                long l = atq_0.jV((String)this.eRH[0]);
                if (l == -1L) break;
                ns_02.Q((short)409);
                ns_02.cX(l);
                break;
            }
            case 4: {
                ns_02.C((byte)2);
                ns_02.Q((short)145);
                ns_02.R((short)165);
                ns_02.cT((String)this.eRH[0]);
            }
        }
        if (ns_02.aVZ() == 0) {
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static long jV(String string) {
        String string2 = BH.aT(string);
        StringBuilder stringBuilder = new StringBuilder("\nInstance(s) matching \"").append(string).append("\" :\r\n========\r\n");
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (bzq_2 bzq_22 : (bzq_2[])bzp_2.eqt().eqv().values((Object[])new bzq_2[bzp_2.eqt().eqv().size()])) {
            long l = bzq_22.lEo;
            String string3 = aum_0.cWf().b(77, l, new Object[0]);
            if (string3.equals(string2)) {
                return l;
            }
            if (!string3.contains(string2)) continue;
            String string4 = aum_0.cWf().a(77, l, new Object[0]);
            arrayList.add(l);
            stringBuilder.append(l).append(" : ").append(string4).append("\r\n");
        }
        if (arrayList.isEmpty()) {
            atq_0.jI("No instance found with name matching \"" + string + "\"!");
            return -1L;
        }
        if (arrayList.size() == 1) {
            return (Long)arrayList.get(0);
        }
        stringBuilder.append("========\r\n").append(arrayList.size()).append(" items found");
        aqh_0.cBI().n(stringBuilder.toString(), 0xFFFFFF);
        return -1L;
    }
}

