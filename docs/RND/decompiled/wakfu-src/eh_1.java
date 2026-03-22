/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Eh
 */
public final class eh_1 {
    private final eu_1 ayk;

    public eh_1(eu_1 eu_12) {
        this.ayk = eu_12;
    }

    public void b(fp_0 fp_02) {
        try {
            fp_02.k(this.ayk.aIi());
            fp_02.bo(this.ayk.getName());
            fp_02.mz(0);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to save import " + this.ayk.aIi(), iOException);
        }
    }
}

