/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aig
 */
public interface aig_2 {
    public static final int cyN = 100;
    public static final float cyO = 1.0f;
    public static final int cyP = 1;
    public static final int cyQ = -1;

    @Nullable
    default public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2) {
        return this.a(l, f2, n, l2, l3, n2, -1);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, int n3) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2, n3);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2) {
        return this.a(l, f2, f3, n, l2, l3, n2, -1);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, long l2, long l3, int n, @Nullable agn_1 agn_12, int n2) {
        return this.a(l, f2, 1, l2, l3, n, agn_12, n2);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3) {
        return this.a(l, f2, f3, n, l2, l3, n2, n3, null, -1);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, long l2, long l3, int n, @Nullable agn_1 agn_12, int n2, boolean bl) {
        return this.a(l, f2, 1, l2, l3, n, agn_12, n2, bl);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, @Nullable agn_1 agn_12, int n3) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2, agn_12, n3);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, @Nullable agn_1 agn_12, int n3, boolean bl) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2, agn_12, n3, bl);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, @Nullable agn_1 agn_12, int n3) {
        return this.a(l, f2, f3, n, l2, l3, n2, agn_12, n3, true);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, @Nullable agn_1 agn_12, int n3, boolean bl) {
        return this.a(l, f2, f3, n, l2, l3, n2, -1, agn_12, n3, bl);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3, @Nullable agn_1 agn_12, int n4) {
        return this.a(l, f2, f3, n, l2, l3, n2, n3, agn_12, n4, true);
    }

    @Nullable
    default public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, int n3, @Nullable agn_1 agn_12, int n4, boolean bl) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2, n3, agn_12, n4, bl);
    }

    @Nullable
    public ahm_1 a(long var1, float var3, float var4, int var5, long var6, long var8, int var10, int var11, @Nullable agn_1 var12, int var13, boolean var14);

    public void a(long var1, @Nullable ahk_1 var3);

    public void ga(long var1);

    public void a(long var1, float var3);

    public void gb(long var1);

    public void b(long var1, float var3);

    public void bBk();

    public void bBl();

    public void aX(float var1, float var2);

    public void bBm();
}

