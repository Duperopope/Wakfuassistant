/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPF
 */
public class bpf_2
implements aeh_2 {
    public static final String kSo = "name";
    public static final String kSp = "description";
    private final String kSq;
    private final String kSr;

    public bpf_2(String string, String string2) {
        this.kSq = string;
        this.kSr = string2;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kSo)) {
            return this.kSq;
        }
        if (string.equals(kSp)) {
            return this.kSr;
        }
        return null;
    }
}

