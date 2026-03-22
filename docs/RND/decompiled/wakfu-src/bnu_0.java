/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnU
 */
public class bnu_0
implements aeh_2 {
    public static final String iKw = "name";
    public static final String iKx = "value";
    private final bnt_0 iKy;

    public bnu_0(bnt_0 bnt_02) {
        this.iKy = bnt_02;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iKw)) {
            return this.iKy.getName();
        }
        if (string.equals(iKx)) {
            return this.iKy;
        }
        return null;
    }

    public bnt_0 dzF() {
        return this.iKy;
    }
}

