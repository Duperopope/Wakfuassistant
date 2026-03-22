/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/*
 * Renamed from aqb
 */
class aqb_2
implements FilenameFilter {
    final /* synthetic */ Pattern cQi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aqb_2(apy_1 apy_12, Pattern pattern) {
        this.cQi = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.cQi.matcher(string).matches();
    }
}

