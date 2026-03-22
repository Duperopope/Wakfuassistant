/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUO
 */
public class auo_0
implements aeh_2 {
    public static final String hrI = "text";
    public static final String hrJ = "iconUrl";
    final Mv hrK;

    auo_0(Mv mv) {
        this.hrK = mv;
    }

    @Override
    @Nullable
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hrJ)) {
            return aum_0.n(this.hrK);
        }
        if (string.equals(hrI)) {
            return this.hrK.aUK().toUpperCase();
        }
        return null;
    }

    public Mv aUXX() {
        return this.hrK;
    }

    public String toString() {
        return "LanguageView{m_language=" + String.valueOf((Object)this.hrK) + "}";
    }
}

