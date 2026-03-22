/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class daI
extends dae_0 {
    private final fm_1 ocC;
    @Nullable
    private final Integer ocD;
    @Nullable
    private final Integer ocE;

    private daI(fm_1 fm_12, @Nullable Integer n, @Nullable Integer n2) {
        this.ocC = fm_12;
        this.ocD = n;
        this.ocE = n2;
    }

    public static daI c(fm_1 fm_12, int n) {
        return new daI(fm_12, n, null);
    }

    public static daI d(fm_1 fm_12, int n) {
        return new daI(fm_12, null, n);
    }

    public static daI y(fm_1 fm_12) {
        return new daI(fm_12, null, 0);
    }

    @Override
    public int d() {
        return 16263;
    }

    @Generated
    public fm_1 duW() {
        return this.ocC;
    }

    @Nullable
    @Generated
    public Integer fad() {
        return this.ocD;
    }

    @Nullable
    @Generated
    public Integer fae() {
        return this.ocE;
    }
}

