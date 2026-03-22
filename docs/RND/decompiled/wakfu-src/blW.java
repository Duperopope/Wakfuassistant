/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class blW
implements aeh_2 {
    public static final String ixX = "iconUrl";
    @NotNull
    private final fm_1 ixY;
    private final int ixZ;

    public blW(fm_1 fm_12, int n) {
        this.ixY = fm_12;
        this.ixZ = n;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ixX)) {
            return auc_0.cVq().zx(this.ixZ);
        }
        return null;
    }

    @NotNull
    public fm_1 duW() {
        return this.ixY;
    }

    @Override
    public String[] bxk() {
        return new String[]{ixX};
    }
}

