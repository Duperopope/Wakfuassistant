/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEB
 */
class feb_2
implements fis_1 {
    final /* synthetic */ fea_1 umY;

    feb_2(fea_1 fea_12) {
        this.umY = fea_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.umY.umR && this.umY.lAX.getStickData() != null) {
            fkj_2.gCW().b(this.umY.lAX, this.umY.lAX.getX(), this.umY.lAX.getY());
        }
        this.umY.umR = false;
        this.umY.umS = false;
        return false;
    }
}

