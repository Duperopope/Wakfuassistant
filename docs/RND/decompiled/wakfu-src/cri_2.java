/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from cRI
 */
public class cri_2 {
    private static final cri_2 noy = new cri_2();
    private final Set<Short> noz = new HashSet<Short>();

    public static cri_2 eMM() {
        return noy;
    }

    private void bkZ() {
        this.noz.add((short)19129);
        this.noz.add((short)16690);
        this.noz.add((short)16935);
        this.noz.add((short)19636);
        this.noz.add((short)17213);
    }

    public boolean tX(int n) {
        if (this.noz.isEmpty()) {
            this.bkZ();
        }
        return this.noz.contains((short)n);
    }
}

