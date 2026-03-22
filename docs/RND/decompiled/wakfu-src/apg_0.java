/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPg
 */
final class apg_0 {
    private final int ewL;
    private final String ewM;
    private final String ewN;

    apg_0(int n, String string, String string2) {
        this.ewL = n;
        this.ewM = string;
        this.ewN = string2;
    }

    public int wp() {
        return this.ewL;
    }

    public String getIdentifier() {
        return this.ewM;
    }

    public String getName() {
        return this.ewN;
    }

    public String toString() {
        return String.format("InsertedObject(index=%s, identifier=%s, name=%s)", this.ewL, this.ewM, this.ewN);
    }
}

