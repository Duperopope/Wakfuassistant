/*
 * Decompiled with CFR 0.152.
 */
import java.util.TreeMap;

public class eyG
extends eyr {
    private final TreeMap<Integer, Integer> pjZ = new TreeMap();

    public eyG(byte by) {
        super(by);
    }

    public void fh(int n, int n2) {
        this.pjZ.put(n2, n);
    }

    @Override
    public int OT(int n) {
        int n2 = this.pjZ.headMap(n + 1).lastKey();
        return this.pjZ.get(n2);
    }
}

