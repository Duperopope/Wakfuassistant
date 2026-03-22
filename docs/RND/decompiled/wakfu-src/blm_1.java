/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blM
 */
public class blm_1
implements aeh_2 {
    private static final String iwh = "rank";
    private static final String iwi = "score";
    private final int iwj;
    private final long iwk;

    public blm_1(int n, long l) {
        this.iwj = n;
        this.iwk = l;
    }

    @Override
    public String[] bxk() {
        return new String[]{iwh, iwi};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (iwh.equals(string)) {
            return "Vous vous \u00eates class\u00e9 au rang : " + this.iwj;
        }
        if (iwi.equals(string)) {
            return "Votre score : " + this.iwk;
        }
        return null;
    }
}

