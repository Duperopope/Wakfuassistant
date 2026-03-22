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
 * Renamed from bwe
 */
public final class bwe_0
implements aeh_2 {
    public static final String jww = "isLevelTooHigh";
    @NotNull
    final bfF jwx;
    private final boolean jwy;

    public bwe_0(@NotNull bwd bwd2, bfF bfF2) {
        this.jwx = bfF2;
        this.jwy = bwd2.jwo == bwf_0.jwz ? bwe_0.a(bfF2, bwd2.jwp) : bwe_0.a(bwd2.jwp, bfF2);
    }

    private static boolean a(bfF bfF2, bfF bfF3) {
        int n;
        int n2 = bfF3.dhd().am(cvu_2.eUm());
        return n2 < (n = eIp.d(cvu_2.eUm(), bfF2.wp()));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jww.equals(string)) {
            return this.jwy;
        }
        return this.jwx.eu(string);
    }

    @Override
    public String[] bxk() {
        return this.jwx.bxk();
    }

    @NotNull
    @Generated
    public bfF dLv() {
        return this.jwx;
    }

    @Generated
    public boolean dLw() {
        return this.jwy;
    }
}

