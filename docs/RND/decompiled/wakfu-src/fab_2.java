/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAB
 */
class fab_2
implements Runnable {
    final /* synthetic */ faa_1 tOT;

    fab_2(faa_1 faa_12) {
        this.tOT = faa_12;
    }

    @Override
    public void run() {
        this.tOT.setPixmap(this.tOT.tOR.get(this.tOT.crT));
        this.tOT.crT = (this.tOT.crT + 1) % this.tOT.tOR.size();
    }
}

