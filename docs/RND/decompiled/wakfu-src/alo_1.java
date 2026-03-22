/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from alO
 */
public class alo_1<Data>
implements ali_2 {
    public static final float cGa = 1.0f;
    public static final float cGb = 1.0f;
    public static final boolean cGc = true;
    private final boolean cGd;
    private final Data cGe;
    private final float cGf;
    private final int cGg;
    private final float cGh;
    private final float cGi;

    public alo_1(Data Data) {
        this(Data, 100.0f);
    }

    public alo_1(boolean bl, Data Data) {
        this(bl, Data, 100.0f);
    }

    public alo_1(Data Data, float f2) {
        this(Data, f2, 1);
    }

    public alo_1(boolean bl, Data Data, float f2) {
        this(bl, Data, f2, 1);
    }

    public alo_1(Data Data, float f2, int n) {
        this(Data, f2, n, 1.0f, 1.0f);
    }

    public alo_1(boolean bl, Data Data, float f2, int n) {
        this(bl, Data, f2, n, 1.0f, 1.0f);
    }

    public alo_1(Data Data, float f2, float f3, float f4) {
        this(Data, f2, 1, f3, f4);
    }

    public alo_1(boolean bl, Data Data, float f2, float f3, float f4) {
        this(bl, Data, f2, 1, f3, f4);
    }

    public alo_1(Data Data, float f2, int n, float f3, float f4) {
        this(true, Data, f2, n, f3, f4);
    }

    public alo_1(boolean bl, Data Data, float f2, int n, float f3, float f4) {
        this.cGd = bl;
        this.cGe = Data;
        this.cGf = f2;
        this.cGg = n;
        this.cGh = f3;
        this.cGi = f4;
    }

    @Generated
    public boolean bBY() {
        return this.cGd;
    }

    @Generated
    public Data aHA() {
        return this.cGe;
    }

    @Generated
    public float bBt() {
        return this.cGf;
    }

    @Generated
    public int bBI() {
        return this.cGg;
    }

    @Override
    @Generated
    public float bBu() {
        return this.cGh;
    }

    @Override
    @Generated
    public float bBv() {
        return this.cGi;
    }
}

