/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aEI
 */
public class aei_2
implements aeh_2 {
    private final String dGP;
    private final Object dGQ;

    public aei_2(String string, Object object) {
        this.dGP = string;
        this.dGQ = object;
    }

    @Override
    public String[] bxk() {
        return new String[]{this.dGP};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(this.dGP)) {
            return this.dGQ;
        }
        return null;
    }
}

