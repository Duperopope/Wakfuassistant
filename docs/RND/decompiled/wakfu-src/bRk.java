/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bRk
implements aeh_2,
Comparable<bRk> {
    public static final String kZJ = "iconUrl";
    private final int kZK;

    public bRk(int n) {
        this.kZK = n;
    }

    public int aVt() {
        return this.kZK;
    }

    public String byf() {
        return auc_0.cVq().a("pointsOfInterestIconPath", "defaultIconPath", this.kZK);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kZJ)) {
            return this.byf();
        }
        return null;
    }

    public int a(@NotNull bRk bRk2) {
        return bRk2.kZK - this.kZK;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bRk)object);
    }
}

