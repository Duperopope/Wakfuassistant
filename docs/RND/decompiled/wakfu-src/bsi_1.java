/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/*
 * Renamed from bSI
 */
class bsi_1
implements FileFilter {
    private final Pattern lif = Pattern.compile("(accountPreferences|characterPreferences).*(.properties)");

    bsi_1(bsg_1 bsg_12) {
    }

    private boolean nC(String string) {
        return string.length() > 0 && this.lif.matcher(string).matches();
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || this.nC(file.getName());
    }
}

