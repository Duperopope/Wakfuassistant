/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from aFu
 */
class afu_1
implements FilenameFilter {
    afu_1() {
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".lua");
    }
}

