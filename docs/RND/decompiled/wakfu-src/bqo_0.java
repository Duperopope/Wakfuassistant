/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TIntHash
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.hash.TIntHash;
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bqO
 */
public final class bqo_0 {
    private static final Logger jbs = Logger.getLogger(bqo_0.class);
    public static final String jbt = "( \\d+,)*";

    public static void dEF() {
        TIntHashSet tIntHashSet;
        TIntHashSet tIntHashSet2;
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        String string = bsg_12.f(bsn_1.ljP);
        String string2 = bsg_12.f(bsn_1.ljQ);
        try {
            tIntHashSet2 = bqo_0.mn(string);
            tIntHashSet = bqo_0.mn(string2);
        }
        catch (Exception exception) {
            jbs.error((Object)"Exception levee, on reinitialise \u00e0 0 les pr\u00e9f\u00e9rences", (Throwable)exception);
            bsg_12.a((afe)bsn_1.ljP, "");
            bsg_12.a((afe)bsn_1.ljQ, "");
            return;
        }
        bqo_0.a(tIntHashSet2, bsn_1.ljP);
        bqo_0.a(tIntHashSet, bsn_1.ljQ);
        bqo_0.b(tIntHashSet2, tIntHashSet);
        bqo_0.a((TIntHash)tIntHashSet2, true);
        bqo_0.a((TIntHash)tIntHashSet, false);
    }

    private static void a(TIntHash tIntHash, boolean bl) {
        tIntHash.forEach((TIntProcedure)new bqp_0(bl));
    }

    private static void b(TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            int n = tIntIterator.next();
            if (!tIntHashSet2.contains(n)) continue;
            tIntIterator.remove();
            tIntHashSet2.remove(n);
            bqo_0.d(bsn_1.ljP, bqo_0.Fj(n));
            bqo_0.d(bsn_1.ljQ, bqo_0.Fj(n));
        }
    }

    private static void a(TIntHashSet tIntHashSet, afe afe2) {
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            int n = tIntIterator.next();
            if (bqm_0.jbp.Fi(n) != null) continue;
            bqo_0.d(afe2, bqo_0.Fj(n));
            tIntIterator.remove();
        }
    }

    private static TIntHashSet mn(String string) {
        boolean bl;
        boolean bl2 = bl = string == null || string.matches(jbt);
        if (!bl) {
            throw new IllegalArgumentException("Mauvais formatage des pr\u00e9f\u00e9rences");
        }
        String[] stringArray = string != null && string.length() > 0 ? string.split(",") : new String[]{};
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i].replaceAll(" ", "");
            int n = Integer.parseInt(string2);
            tIntHashSet.add(n);
        }
        return tIntHashSet;
    }

    public static void c(bql_0 bql_02) {
        String string = bqo_0.Fj(bql_02.d());
        if (bql_02.apo()) {
            bqo_0.c(bsn_1.ljP, string);
            bqo_0.d(bsn_1.ljQ, string);
        } else {
            bqo_0.c(bsn_1.ljQ, string);
            bqo_0.d(bsn_1.ljP, string);
        }
    }

    private static String Fj(int n) {
        return " " + Integer.toString(n) + ",";
    }

    private static void c(afe afe2, String string) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        String string2 = bsg_12.f(afe2);
        if (string2 == null || string2.length() == 0) {
            bsg_12.a(afe2, string);
        } else if (!string2.contains(string)) {
            String string3 = string2.concat(string);
            bsg_12.a(afe2, string3);
        }
    }

    private static void d(afe afe2, String string) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        String string2 = bsg_12.f(afe2);
        if (string2 == null || string2.length() == 0) {
            return;
        }
        if (!string2.contains(string)) {
            return;
        }
        String string3 = string2.replaceAll(string, "");
        bsg_12.a(afe2, string3);
    }

    public static void main(String[] stringArray) {
        String string = jbt;
        String string2 = "";
        bqo_0.ag(jbt, "");
        bqo_0.ag(jbt, "qsfd");
        bqo_0.ag(jbt, "125");
        bqo_0.ag(jbt, "125, 123");
        bqo_0.ag(jbt, "125, 1231,");
        bqo_0.ag(jbt, "125, 1231, ");
        bqo_0.ag(jbt, " 125, 1231, ");
        bqo_0.ag(jbt, " 125, 1231,");
        bqo_0.ag(jbt, "125, 1231, n, ");
    }

    private static void ag(String string, String string2) {
        System.err.println(string2 + " -> " + string2.matches(string));
    }
}

