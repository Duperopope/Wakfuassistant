/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caV
 */
public class cav_1
extends caj_2 {
    @NotNull
    private final abi_1 lHU;

    public cav_1(@NotNull ftv_0 ftv_02) {
        this(ftv_02.gmj(), ftv_02.gmk(), ftv_02.gmd(), ftv_02.bkP(), ftv_02.bkQ());
    }

    public cav_1(long l, int n, @NotNull abi_1 abi_12, int n2, int n3) {
        super(l, n, n2, n3);
        this.lHU = abi_12;
        this.dZe();
    }

    public cav_1(long l, int n, @NotNull abi_1 abi_12, int n2, short s, short s2) {
        super(l, n, n2, s, s2);
        this.lHU = abi_12;
        this.dZe();
    }

    public cav_1(@NotNull cav_1 cav_12, int n, int n2) {
        this(cav_12.ZC(), cav_12.fRb(), cav_12.lHU, cav_12.azv(), (short)n, (short)n2);
    }

    public cav_1(@NotNull cav_1 cav_12, @NotNull abi_1 abi_12) {
        this(cav_12.ZC(), cav_12.fRb(), abi_12, cav_12.azv(), cav_12.fRc(), cav_12.fRd());
    }

    @NotNull
    public abi_1 bcB() {
        return this.lHU;
    }

    @Override
    public int conn() {
        if (this.lHU == null) {
            return -1;
        }
        return ftr_0.gmc().b(this.fRb(), this.lHU).orElse(0);
    }

    @Override
    public fbk_0 erN() {
        return caw_1.lHV;
    }
}

