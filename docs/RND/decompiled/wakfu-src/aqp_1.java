/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from aqP
 */
public class aqp_1
implements FilenameFilter {
    private final String cRj;

    public aqp_1(String string) {
        if (string == null) {
            throw new IllegalArgumentException("fileName null");
        }
        this.cRj = string;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.cRj.equals(string);
    }
}

