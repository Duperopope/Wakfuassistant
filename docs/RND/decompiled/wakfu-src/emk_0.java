/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eMK
 */
final class emk_0 {
    private static final Logger qNd = Logger.getLogger(emk_0.class);

    private emk_0() {
    }

    static void ax(exP exP2) {
        int n = emk_0.az(exP2);
        emk_0.aA(exP2);
        exP2.b(exP2.bdV(), false);
        emk_0.e(exP2, n);
    }

    static void a(exP exP2, fhk fhk2, int n, int n2) {
        int n3 = emk_0.az(exP2);
        emk_0.aA(exP2);
        emk_0.b(exP2, fhk2);
        emk_0.a(exP2, n == -1 ? (int)exP2.dnG() : n, n2 == -1 ? (int)exP2.dnG() : n2);
        exP2.b(exP2.bdV(), false);
        exP2.dlk();
        emk_0.e(exP2, n3);
    }

    static void ay(exP exP2) {
        int n = emk_0.az(exP2);
        exP2.ge(true);
        emk_0.e(exP2, n);
    }

    private static int az(exP exP2) {
        return exP2.e(exx_2.rGi).aYC();
    }

    private static void e(exP exP2, int n) {
        exP2.OC(Math.min(n, exP2.d(exx_2.rGi)));
    }

    private static void aA(exP exP2) {
        exP2.doc().Se(36);
    }

    private static void b(exP exP2, fhk fhk2) {
        if (fhk2 == null) {
            return;
        }
        exP2.d(fhk2);
        Map<ffS, Long> map = fhk2.fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            try {
                Optional<ffV> optional = fht.a(exP2, fhk2, entry.getKey());
                optional.ifPresent(ffV2 -> exP2.doc().i((Qk)ffV2));
            }
            catch (Exception exception) {
                qNd.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private static void a(exP exP2, int n, int n2) {
        ((eym)exP2.doV()).fhV().b(exP2.fgM(), GC.cu(n), GC.cu(n2));
    }
}

