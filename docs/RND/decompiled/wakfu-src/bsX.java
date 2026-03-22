/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bsX
implements aeh_2,
Runnable {
    private static final String jjM = "turnTimeProgressBar";
    private static final bsX jjN = new bsX();
    public static final String jjO = "remainingTime";
    public static final String jjP = "remainingTimeText";
    public static final String jjQ = "remainingFraction";
    public static final String jjR = "currentTurnColor";
    public static final String[] jjS = new String[]{"remainingTime", "remainingTimeText", "remainingFraction", "currentTurnColor"};
    private long cOZ;
    private long jjT;
    private long jjU;
    private long jjV;
    @NotNull
    private bsY jjW = bsY.jjY;
    private fka_1 jjX;

    public static bsX dHm() {
        return jjN;
    }

    private bsX() {
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jjP -> aum_0.cWf().c("seconds", this.jjV);
            case jjO -> Float.valueOf((float)Math.max(0L, this.jjU - this.jjT) / 1000.0f);
            case jjQ -> (double)Math.max(0L, this.jjU - this.jjT) / (double)(this.jjU - this.cOZ);
            case jjR -> this.jjW.jkb;
            default -> null;
        };
    }

    public void c(long l, @Nullable bgy bgy2) {
        if (l == 0L) {
            return;
        }
        this.jjT = this.cOZ = System.currentTimeMillis();
        this.jjV = this.dHo();
        this.jjU = this.cOZ + l;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.jjW = bgy2 == null || bgt_02 == null || bgy2.Xi() == bgt_02.Xi() ? bsY.jjY : (bgy2.bcP() == bgt_02.bcP() ? bsY.jjZ : bsY.jka);
        this.dHn();
    }

    public void d(long l, @Nullable bgy bgy2) {
        if (l == 0L) {
            return;
        }
        this.c(l, bgy2);
        abg_2.bUP().h(this);
        abg_2.bUP().a((Runnable)this, 200L);
        fse_1.gFu().f("fightTurnCountdown", this);
    }

    public void bhk() {
        abg_2.bUP().h(this);
        this.jjW = bsY.jjY;
        if (this.jjX != null) {
            this.jjX.aVH();
        }
        this.jjX = null;
    }

    private void dHn() {
        if (this.jjX == null) {
            fhv_1 fhv_12 = fyw_0.gqw().th("timePointBarDialog");
            if (fhv_12 == null) {
                return;
            }
            fhv_1 fhv_13 = fhv_12.getChildWithId(jjM);
            if (!(fhv_13 instanceof fce_2)) {
                return;
            }
            fce_2 fce_22 = (fce_2)fhv_13;
            this.jjX = new fka_1();
            this.jjX.aVI();
            this.jjX.setFile("6001089.xps");
            this.jjX.setApply3DTo2DProjection(true);
            fce_22.getAppearance().d(this.jjX);
        }
        this.jjX.setModulationColor(this.jjW.jkb);
    }

    @Override
    public void run() {
        this.jjT = System.currentTimeMillis();
        long l = this.dHo();
        if (l < this.jjV && l <= 5L) {
            cul_2.eST().eSU();
        }
        this.jjV = l;
        this.dHn();
        fse_1.gFu().a((aef_2)this, jjS);
    }

    private long dHo() {
        return Math.max(0L, Math.floorDiv(this.jjU - this.jjT, 1000));
    }

    @Override
    public String[] bxk() {
        return jjS;
    }
}

