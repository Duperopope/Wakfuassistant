/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bfC
implements aeh_2 {
    private static final String hUs = "level";
    private static final String[] hUt = new String[]{"level"};
    private final short hUu;

    public bfC(short s) {
        this.hUu = s;
    }

    @Override
    public String[] bxk() {
        return hUt;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hUs)) {
            return this.dgL();
        }
        return null;
    }

    public short cmL() {
        return this.hUu;
    }

    public String dgL() {
        return this.hUu <= 0 ? aum_0.cWf().c("aptitude.real.level", new Object[0]) : String.valueOf(this.hUu);
    }

    public String toString() {
        return "BuildSheetLevel{m_level=" + this.hUu + "}";
    }
}

