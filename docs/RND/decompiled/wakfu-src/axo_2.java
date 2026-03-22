/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

/*
 * Renamed from axo
 */
public class axo_2
implements FileFilter {
    public static final axo_2 dpo = new axo_2();

    @Override
    public boolean accept(File file) {
        return file.getAbsolutePath().endsWith(".crd");
    }
}

