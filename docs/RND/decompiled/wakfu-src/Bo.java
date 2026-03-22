/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class Bo {
    private Bo() {
    }

    public static void a(File file) {
        String[] stringArray;
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        for (String string : stringArray = file.list()) {
            Bo.a(new File(file.getPath(), string));
        }
    }
}

