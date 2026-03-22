/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from aqa
 */
class aqa_2
implements FilenameFilter {
    aqa_2(apy_1 apy_12) {
    }

    @Override
    public boolean accept(File file, String string) {
        int n = string.lastIndexOf(".");
        if (n == -1) {
            return false;
        }
        String string2 = string.substring(n);
        if (".bdat".equalsIgnoreCase(string2)) {
            return true;
        }
        return ".bdat".equalsIgnoreCase(string2);
    }
}

