/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/*
 * Renamed from aqQ
 */
public class aqq_1
implements FilenameFilter {
    private final Pattern cRk;

    public aqq_1(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern null");
        }
        this.cRk = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.cRk.matcher(string).matches();
    }
}

