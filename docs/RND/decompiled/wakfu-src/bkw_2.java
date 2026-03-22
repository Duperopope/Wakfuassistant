/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKw
 */
public class bkw_2
implements aeh_2 {
    public static final String koE = "name";
    public static final String koF = "enabled";
    public static final String koG = "value";
    public static final String koH = "style";
    final boolean koI;

    public bkw_2(boolean bl) {
        this.koI = bl;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public boolean dJd() {
        return this.koI;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(koE)) {
            return this.koI ? aum_0.cWf().c("pvp.ladder.filter.all", new Object[0]) : aum_0.cWf().c("pvp.ladder.filter.myGuild", new Object[0]);
        }
        if (string.equals(koF)) {
            return this.koI || aue_0.cVJ().cVK().Ya() > 0L;
        }
        if (string.equals(koG)) {
            return this.koI ? 0 : 1;
        }
        if (string.equals(koH)) {
            return this.koI ? "singleCharacterIcon" : "guild";
        }
        return null;
    }
}

