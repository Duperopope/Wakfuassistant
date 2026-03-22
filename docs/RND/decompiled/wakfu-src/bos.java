/*
 * Decompiled with CFR 0.152.
 */
class bos {
    private final short iPy;
    private boolean aJj;
    private final String iPz;
    private final byte iPA;

    bos(short s, String string, boolean bl, byte by) {
        this.iPy = s;
        this.aJj = bl;
        this.iPz = string;
        this.iPA = by;
    }

    public short aIi() {
        return this.iPy;
    }

    public String getName() {
        return this.iPz;
    }

    public boolean aOY() {
        return this.aJj;
    }

    public void az(boolean bl) {
        this.aJj = bl;
    }

    public byte dAR() {
        return this.iPA;
    }

    public String toString() {
        return "TutorialPart{m_id=" + this.iPy + ", m_activated=" + this.aJj + ", m_name='" + this.iPz + "', m_eventId=" + this.iPA + "}";
    }
}

