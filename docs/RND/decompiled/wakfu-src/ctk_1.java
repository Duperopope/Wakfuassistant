/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from cTK
 */
class ctk_1
implements FilenameFilter {
    ctk_1(ctj_1 ctj_12) {
    }

    @Override
    public boolean accept(File file, String string) {
        return ctj_1.nKl.matcher(string).matches();
    }
}

