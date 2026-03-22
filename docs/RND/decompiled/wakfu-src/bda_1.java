/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.procedure.TObjectIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bdA
 */
public class bda_1 {
    private static final Logger hLY = Logger.getLogger(bda_1.class);
    private static final TByteObjectHashMap<bde_1> hLZ = new TByteObjectHashMap();

    private static bde_1 ddV() {
        bde_1 bde_12 = new bde_1();
        bdd_1 bdd_12 = new bdd_1(ffS.sgB, 1349907);
        bde_12.a(30, bdd_12, new bdd_1(ffS.sgO, 1329924));
        bde_12.a(31, bdd_12, new bdd_1(ffS.sgO, 1329925));
        bde_12.a(32, bdd_12, new bdd_1(ffS.sgO, 1329926));
        bde_12.a(33, bdd_12, new bdd_1(ffS.sgO, 13210733));
        return bde_12;
    }

    private static bde_1 ddW() {
        bde_1 bde_12 = new bde_1();
        bde_12.a(30, new bdd_1(ffS.sgO, 0x149919));
        bde_12.a(31, new bdd_1(ffS.sgO, 1349912));
        bde_12.a(32, new bdd_1(ffS.sgO, 1349911));
        bde_12.a(33, new bdd_1(ffS.sgO, 13410435));
        return bde_12;
    }

    private static bde_1 ddX() {
        bde_1 bde_12 = new bde_1();
        bde_12.a(30, new bdd_1(ffS.sgO, 1349909));
        bde_12.a(31, new bdd_1(ffS.sgO, 0x149914));
        bde_12.a(32, new bdd_1(ffS.sgO, 1349910));
        bde_12.a(33, new bdd_1(ffS.sgO, 13410434));
        return bde_12;
    }

    private static bde_1 a(bdd_1 ... bdd_1Array) {
        bde_1 bde_12 = new bde_1();
        bde_12.a(30, bdd_1Array);
        bde_12.a(31, bdd_1Array);
        bde_12.a(32, bdd_1Array);
        bde_12.a(33, bdd_1Array);
        return bde_12;
    }

    public static void a(fkL fkL2, int n, TObjectIntProcedure<ffS> tObjectIntProcedure) {
        bde_1 bde_12 = (bde_1)hLZ.get(fkL2.gcC());
        if (bde_12 == null) {
            hLY.error((Object)("Pas d'equiepement d\u00e9fini pour le rank " + String.valueOf(fkL2)));
            return;
        }
        bdd_1[] bdd_1Array = bde_12.BF(n);
        if (bdd_1Array == null) {
            hLY.error((Object)("Pas d'equiepement d\u00e9fini pour le rank " + String.valueOf(fkL2) + " pour la nation " + n));
            return;
        }
        int n2 = bdd_1Array.length;
        for (int i = 0; i < n2; ++i) {
            if (tObjectIntProcedure.execute((Object)bdd_1Array[i].hMc, bdd_1Array[i].hMd)) continue;
            return;
        }
    }

    public static int a(fkL fkL2) {
        if (fkL2 == null) {
            return -1;
        }
        switch (fkL2) {
            case sCr: {
                return 800205;
            }
            case sCs: {
                return 800216;
            }
            case sCu: {
                return 800215;
            }
            case sCt: {
                return 800214;
            }
            case sCw: {
                return 800217;
            }
            case sCx: {
                return 800218;
            }
            case sCv: {
                return 800219;
            }
            case sCA: {
                return 800221;
            }
        }
        return -1;
    }

    public static int[] ddY() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        hLZ.forEachValue((TObjectProcedure)new bdb_1(tIntHashSet));
        return tIntHashSet.toArray();
    }

    static {
        hLZ.put(fkL.sCr.gcC(), (Object)bda_1.ddV());
        hLZ.put(fkL.sCs.gcC(), (Object)bda_1.a(new bdd_1(ffS.sgB, 1349921)));
        hLZ.put(fkL.sCu.gcC(), (Object)bda_1.ddW());
        hLZ.put(fkL.sCt.gcC(), (Object)bda_1.ddX());
        hLZ.put(fkL.sCv.gcC(), (Object)bda_1.a(new bdd_1(ffS.sgB, 1349917)));
        hLZ.put(fkL.sCA.gcC(), (Object)bda_1.a(new bdd_1(ffS.sgB, 1349918)));
        hLZ.put(fkL.sCw.gcC(), (Object)bda_1.a(new bdd_1(ffS.sgB, 1349920)));
        hLZ.put(fkL.sCx.gcC(), (Object)bda_1.a(new bdd_1(ffS.sgB, 1349922)));
    }
}

