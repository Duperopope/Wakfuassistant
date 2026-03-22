/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axW
 */
class axw_1 {
    final String drN;
    int drO;
    int drP;

    axw_1(String string) {
        this.drN = string;
    }

    public String getName() {
        return this.drN;
    }

    public int aIs() {
        return this.drO;
    }

    public int bRI() {
        return this.drP;
    }

    public void bRJ() {
        ++this.drO;
        ++this.drP;
    }

    public void bRK() {
        this.drO = 0;
    }
}

