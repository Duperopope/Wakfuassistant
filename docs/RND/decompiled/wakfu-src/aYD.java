/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Objects;

public class aYD
implements afl {
    public void a(WL wL) {
        this.bGy();
        wL.b(this);
    }

    public void bGy() {
        aqb_1.bGD().a(new aMa(), aMa2 -> {
            int n = aMa2.d();
            int n2 = aMa2.cmX();
            if (n2 != 0) {
                bwz_0.jAA.a(n2, n, aMa2.aGN());
                return;
            }
            short s = aMa2.aVf();
            long l = aMa2.aqZ();
            short s2 = aMa2.cmS();
            String string = aMa2.cmY();
            short s3 = aMa2.cmZ();
            int n3 = aMa2.ayQ();
            int[] nArray = aMa2.cna();
            int[] nArray2 = aYD.x(nArray);
            bns_0 bns_02 = new bns_0(n, s, s2, l, aMa2.aGN(), aMa2.cmW(), aMa2.cmT(), aMa2.cmU(), aMa2.cmV(), string, s3, n3, nArray, nArray2);
            eId.quO.d(bns_02);
        });
    }

    private static int[] x(int[] nArray) {
        return Arrays.stream(nArray).mapToObj(n -> bja_1.drJ().bC((short)n)).filter(Objects::nonNull).filter(bjz_12 -> bjz_12.c(ezj_0.psW) || bjz_12.c(ezj_0.ptc)).mapToInt(eyi::aWP).toArray();
    }

    @Override
    public String getName() {
        return "";
    }
}

