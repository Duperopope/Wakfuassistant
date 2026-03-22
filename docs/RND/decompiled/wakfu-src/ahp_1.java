/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHp
 */
public class ahp_1
implements ahm_1 {
    private long dOX;
    private final long dPL;
    private final float dPM;
    private final float dPN;
    private final int dPO;
    private final long dPP;
    private final long dPQ;
    private final int dPR;
    @Nullable
    private final agn_1 dPS;
    private final int dPT;
    private final boolean dPU;
    private final int dPV;

    public ahp_1(long l, long l2, float f2, float f3, int n, long l3, long l4, int n2, int n3, @Nullable agn_1 agn_12, int n4, boolean bl) {
        this.dOX = l;
        this.dPL = l2;
        this.dPM = f2;
        this.dPN = f3;
        this.dPO = n;
        this.dPP = l3;
        this.dPQ = l4;
        this.dPR = n2;
        this.dPS = agn_12;
        this.dPT = n4;
        this.dPU = bl;
        this.dPV = n3;
    }

    @Override
    public long aYj() {
        return this.dPL;
    }

    public float bBt() {
        return this.dPM;
    }

    public float ccI() {
        return this.dPN;
    }

    public int bBI() {
        return this.dPO;
    }

    public long ccY() {
        return this.dPP;
    }

    public long ccZ() {
        return this.dPQ;
    }

    public int bha() {
        return this.dPR;
    }

    @Nullable
    public agn_1 cda() {
        return this.dPS;
    }

    public int cdb() {
        return this.dPT;
    }

    public boolean cdc() {
        return this.dPU;
    }

    public void hF(long l) {
        this.dOX = l;
    }

    @Override
    public long ccq() {
        return this.dOX;
    }

    public boolean cdd() {
        return this.dPV > -1;
    }

    public int cde() {
        return this.dPV;
    }
}

