/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bgh
implements Comparable<bgh> {
    private static final Logger hZt = Logger.getLogger(bgh.class);
    private final int hZu;
    private final int hZv;
    private final short hZw;
    private final int hZx;
    private final int hZy;
    private final boolean hZz;
    private final byte hZA;

    public bgh(int n, int n2, short s, int n3, int n4, boolean bl, byte by) {
        this.hZu = n;
        this.hZv = n2;
        this.hZw = s;
        this.hZx = n3;
        this.hZy = n4;
        this.hZz = bl;
        this.hZA = by;
    }

    public int aGx() {
        return this.hZy;
    }

    public int d() {
        return this.hZu;
    }

    public int azv() {
        return this.hZv;
    }

    public short bfd() {
        return this.hZw;
    }

    public boolean aGv() {
        return this.hZz;
    }

    public byte aGu() {
        return this.hZA;
    }

    public int a(@NotNull bgh bgh2) {
        return this.hZA - bgh2.hZA;
    }

    public int agN() {
        return this.hZx;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bgh)object);
    }
}

