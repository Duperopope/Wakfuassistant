/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKv
 */
public class bkv_2
implements aeh_2 {
    public static final String koC = "name";
    private final eym koD;

    protected bkv_2(eym eym2) {
        this.koD = eym2;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public eym dfW() {
        return this.koD;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(koC)) {
            return eyn.h(this.koD) ? aum_0.cWf().c("breed." + this.koD.aWP(), new Object[0]) : aum_0.cWf().c("allBreeds", new Object[0]);
        }
        return null;
    }
}

