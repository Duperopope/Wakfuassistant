/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHC
 */
public class bhc_1
implements aeh_2 {
    public static final String kbR = "name";
    public static final String kbS = "iconStyle";
    public static final String kbT = "minValue";
    public static final String kbU = "maxValue";
    @NotNull
    private final fja kbV;
    @Nullable
    private Integer kbW = null;
    @Nullable
    private Integer kbX = null;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "iconStyle": {
                return biJ.f(this.kbV.gaB());
            }
            case "minValue": {
                return this.kbW;
            }
            case "maxValue": {
                return this.kbX;
            }
        }
        return null;
    }

    public String getName() {
        return bha_1.b(this.kbV);
    }

    public void reset() {
        this.c(null, null);
    }

    public void c(@Nullable Integer n, @Nullable Integer n2) {
        this.kbW = n;
        this.kbX = n2;
        fse_1.gFu().a((aef_2)this, kbT, kbU);
    }

    @Override
    public String[] bxk() {
        return new String[]{kbR, kbS, kbT};
    }

    @NotNull
    @Generated
    public fja dWK() {
        return this.kbV;
    }

    @Nullable
    @Generated
    public Integer dWL() {
        return this.kbW;
    }

    @Nullable
    @Generated
    public Integer dWM() {
        return this.kbX;
    }

    @Generated
    public void ai(@Nullable Integer n) {
        this.kbW = n;
    }

    @Generated
    public void aj(@Nullable Integer n) {
        this.kbX = n;
    }

    @Generated
    public bhc_1(@NotNull fja fja2) {
        if (fja2 == null) {
            throw new NullPointerException("characteristic is marked non-null but is null");
        }
        this.kbV = fja2;
    }
}

