/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHq
 */
public class ahq_1 {
    private static final Logger dPW = Logger.getLogger(ahq_1.class);
    private static final int dPX = 500;
    private final ahu_1 dPY;
    private final int dPZ;
    private final int[] dQa = new int[]{0};
    private final float dQb;
    private final float dQc;
    private final TLongArrayList dQd = new TLongArrayList();
    float czn;
    float dMO;
    private boolean bYX;
    private ahs_1 dQe;

    public ahq_1(float f2, float f3, int n, @NotNull ahu_1 ahu_12, boolean bl) {
        this.dPY = ahu_12;
        this.dPZ = n;
        this.bYX = bl;
        this.dQb = f2;
        this.dQc = f3;
        this.czn = this.bYX ? 1.0f : f2;
        this.dMO = this.bYX ? 1.0f : f3;
    }

    public void cdf() {
        this.dPY.cds().alGenFilters(this.dQa.length, this.dQa, 0);
        this.dPY.cdp();
        this.dPY.cds().alFilteri(this.dQa[0], 32769, 1);
        this.dPY.cdp();
        this.bu(this.czn, this.dMO);
    }

    public void cdg() {
        if (this.dQa[0] != 0) {
            this.dPY.cdp();
            this.dPY.cds().alDeleteFilters(this.dQa.length, this.dQa, 0);
            this.dPY.cdp();
            this.dQa[0] = 0;
        }
    }

    public void ec(boolean bl) {
        if (this.bYX == bl) {
            return;
        }
        this.bYX = bl;
        this.dQe = this.bYX ? new ahs_1(this, 1.0f, 1.0f, 500) : new ahs_1(this, this.dQb, this.dQc, 500);
    }

    public int bqh() {
        return this.dPZ;
    }

    public int bEF() {
        return this.dQa[0];
    }

    public void hM(long l) {
        if (this.dQe != null && !this.dQe.hQ(l)) {
            this.dQe = null;
        }
    }

    void bu(float f2, float f3) {
        this.dPY.cds().alFilterf(this.dQa[0], 1, f2);
        this.dPY.cdp();
        this.dPY.cds().alFilterf(this.dQa[0], 2, f3);
        this.dPY.cdp();
        for (int i = this.dQd.size() - 1; i >= 0; --i) {
            this.hN(this.dQd.get(i));
        }
    }

    private void hN(long l) {
        ahk_1 ahk_12 = ahn_1.ccT().hL(l);
        if (ahk_12 != null) {
            ahk_12.yf(this.dQa[0]);
        }
    }

    public void hO(long l) {
        if (!this.dQd.contains(l)) {
            this.dQd.add(l);
            this.hN(l);
        }
    }

    public void hP(long l) {
        aeb_2.b(this.dQd, l);
        if (this.dQd.isEmpty()) {
            this.cdh();
        }
    }

    private void cdh() {
        if (this.dPY != null) {
            this.dPY.yi(this.dPZ);
        }
    }
}

