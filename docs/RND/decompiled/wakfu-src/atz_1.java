/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from atz
 */
class atz_1
implements FilenameFilter {
    final /* synthetic */ aty_1 ddg;

    atz_1(aty_1 aty_12) {
        this.ddg = aty_12;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(this.ddg.bLX());
    }
}

