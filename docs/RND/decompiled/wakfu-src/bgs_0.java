/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

/*
 * Renamed from bgS
 */
class bgs_0
implements FileFilter {
    bgs_0(bgr_0 bgr_02) {
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }
}

