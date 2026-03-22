/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bfB
implements aeh_2 {
    public static final String hUo = "iconUrl";
    public static final String hUp = "iconId";
    private final int hUq;
    public static final String[] hUr = new String[]{"iconUrl", "iconId"};

    public bfB(int n) {
        this.hUq = n;
    }

    @Override
    public String[] bxk() {
        return hUr;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hUo)) {
            return auc_0.cVq().kv(String.valueOf(this.hUq));
        }
        if (string.equals(hUp)) {
            return this.hUq;
        }
        return null;
    }

    public int bnd() {
        return this.hUq;
    }
}

