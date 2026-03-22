/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

/*
 * Renamed from cWC
 */
class cwc_2
extends FileFilter {
    cwc_2() {
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }

    @Override
    public String getDescription() {
        return "R\u00e9pertoire";
    }
}

