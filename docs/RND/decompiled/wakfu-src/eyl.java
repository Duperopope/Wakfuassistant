/*
 * Decompiled with CFR 0.152.
 */
class eyl {
    private short eip;
    private short eiq;
    private short eir;

    eyl() {
    }

    eyl(short s, short s2, short s3) {
        this.eip = s;
        this.eiq = s2;
        this.eir = s3;
    }

    public short clG() {
        return this.eip;
    }

    public short clH() {
        return this.eiq;
    }

    public short clI() {
        return this.eir;
    }
}

