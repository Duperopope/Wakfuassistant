/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class fgF
implements RU<ffV> {
    private static boolean sjV = false;
    private static final Logger sjW = Logger.getLogger(fgF.class);
    private final int[] sjX;
    private final RU<ffV> sjY;

    public fgF(int[] nArray, RU<ffV> rU) {
        this.sjX = nArray;
        this.sjY = rU;
    }

    @Override
    public int a(RS<ffV> rS, ffV ffV2) {
        if (!this.g(ffV2.fWi())) {
            return -3;
        }
        return this.sjY.a(rS, ffV2);
    }

    @Override
    public int a(RS<ffV> rS, ffV ffV2, short s) {
        if (!this.g(ffV2.fWi())) {
            return -3;
        }
        return this.sjY.a(rS, ffV2, (ffV)s);
    }

    @Override
    public int a(RS<ffV> rS, ffV ffV2, ffV ffV3) {
        if (!this.g(ffV3.fWi())) {
            return -3;
        }
        return this.sjY.a(rS, ffV2, ffV3);
    }

    @Override
    public int b(RS<ffV> rS, ffV ffV2) {
        return this.sjY.b(rS, ffV2);
    }

    @Override
    public boolean a(ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        return this.sjY.a(ffV2, qu_02, qm_02);
    }

    @Override
    public boolean a(RS<ffV> rS, qu_0 qu_02, qm_0 qm_02) {
        return this.sjY.a(rS, qu_02, qm_02);
    }

    private boolean g(fhy_0 fhy_02) {
        if (sjV) {
            return true;
        }
        if (this.sjX == null || this.sjX.length == 0) {
            return true;
        }
        do {
            if (!Bv.a(this.sjX, (int)fhy_02.aIi())) continue;
            return true;
        } while ((fhy_02 = fhy_02.fZm()) != null);
        return false;
    }

    public boolean cM(@NotNull ffV ffV2) {
        return ffV2.fWi() != null && this.g(ffV2.fWi());
    }

    public static void mX(boolean bl) {
        sjV = bl;
    }
}

