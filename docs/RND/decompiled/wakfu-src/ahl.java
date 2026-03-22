/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ahl
implements afZ {
    private static final ahl cwC = new ahl();
    private final ArrayList<ahj> cwD = new ArrayList();

    public static ahl bzR() {
        return cwC;
    }

    public void b(ahj ahj2) {
        this.cwD.add(ahj2);
    }

    public void a(afV afV2, int n) {
        int n2 = this.cwD.size();
        for (int i = 0; i < n2; ++i) {
            this.cwD.get(i).qy(n);
        }
    }

    public void a(afV afV2, float f2, float f3) {
        Iterator<ahj> iterator = this.cwD.iterator();
        while (iterator.hasNext()) {
            ahj ahj2 = iterator.next();
            if (!ahj2.isRemovable()) continue;
            iterator.remove();
        }
    }
}

