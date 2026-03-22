/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bLK
 */
public final class blk_2 {
    private static final int kuU = 110;
    private static final int kuV = 50;
    private static final int kuW = 1;
    private static boolean kuX;

    private blk_2() {
    }

    public static void a(fsm_1 fsm_12, fsm_1 fsm_13) {
        blh_2 blh_22;
        int n = blk_2.Ib(fsm_12.height);
        int n2 = blk_2.Ib(fsm_13.height);
        if (n2 != n && (blh_22 = cxx_2.eXH().dlG()) != null) {
            blh_22.HZ(n2);
        }
    }

    private static int Ib(int n) {
        return 1 + (n - 110 - 1) / 50;
    }

    public static void edK() {
        Optional<fey_2> optional = blk_2.edN();
        if (optional.isEmpty()) {
            return;
        }
        fey_2 fey_22 = optional.get();
        int n = fey_22.getHeight();
        int n2 = fey_22.getMaxSize().height;
        int n3 = 1 + n - (n - 110) % 50;
        fey_22.setHeight(GC.a(n3, 110, n2));
        blk_2.edL();
    }

    private static void edL() {
        blh_2 blh_22 = cxx_2.eXH().dlG();
        if (blh_22 == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        bsz_2 bsz_22 = ((bsg_1)aie_0.cfn().bmH()).M(bgt_02);
        bsz_22.k(bsn_1.liG.getKey(), blh_22.edl());
    }

    public static void J(@NotNull bgt_0 bgt_02) {
        bsz_2 bsz_22 = ((bsg_1)aie_0.cfn().bmH()).M(bgt_02);
        int n = GC.a(bsz_22.hF(bsn_1.liG.getKey()), 1, (int)fqt_0.sTc.fnx());
        bgt_02.dlG().HZ(n);
    }

    public static void edM() {
        Optional<fey_2> optional = blk_2.edN();
        if (optional.isEmpty()) {
            return;
        }
        fey_2 fey_22 = optional.get();
        blh_2 blh_22 = cxx_2.eXH().dlG();
        if (blh_22 == null) {
            return;
        }
        int n = blh_22.edl();
        int n2 = 111 + (n - 1) * 50;
        fey_22.setHeight(n2);
    }

    private static Optional<fey_2> edN() {
        fhv_1 fhv_12 = fyw_0.gqw().th("shortcutBarDialog");
        if (fhv_12 instanceof fey_2) {
            fey_2 fey_22 = (fey_2)fhv_12;
            return Optional.of(fey_22);
        }
        return Optional.empty();
    }

    public static void ib(boolean bl) {
        kuX = bl;
    }

    public static boolean edO() {
        return kuX;
    }
}

