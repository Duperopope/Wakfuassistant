/*
 * Decompiled with CFR 0.152.
 */
public class eyt
extends eyr {
    private final float pjb;

    public eyt(byte by, float f2) {
        super(by);
        this.pjb = f2;
    }

    @Override
    public int OT(int n) {
        return (int)Math.floor((float)n * this.pjb);
    }
}

