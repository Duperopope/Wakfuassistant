/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class eys {
    public static final eys piZ = new eys();
    final HashMap<Byte, eyr> pja = new HashMap();

    public static eys fid() {
        return piZ;
    }

    public final void a(eyr eyr2) {
        this.pja.put(eyr2.fic(), eyr2);
    }

    public Iterable<eyr> fie() {
        return this.pja.values();
    }
}

