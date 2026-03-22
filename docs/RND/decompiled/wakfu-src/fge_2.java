/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGE
 */
public class fge_2
extends fgb_2 {
    public fge_2() {
        this.a(fgc_2.uui);
        this.abr(1);
    }

    @Override
    public int aPs() {
        return 1;
    }

    @Override
    public void a(fgk_2 fgk_22) {
        super.a(fgk_22);
    }

    public fgl_2 gyZ() {
        return (fgl_2)this.uuf;
    }

    public awg_1 getPixmap() {
        if (this.uuf != null) {
            return this.gyZ().getPixmap();
        }
        return null;
    }

    public int bwO() {
        return this.gyZ().getHeight();
    }

    @Override
    public int getHeight() {
        return Math.max(super.getHeight(), this.gyZ().getHeight());
    }

    @Override
    public int getWidth() {
        return Math.max(super.getWidth(), this.gyZ().getWidth());
    }

    @Override
    public int a(awx_1 awx_12, int n) {
        return 0;
    }

    @Override
    public int b(awx_1 awx_12, int n) {
        return 0;
    }

    @Override
    public int c(awx_1 awx_12, int n) {
        return this.getWidth();
    }

    @Override
    public /* synthetic */ fgk_2 gyW() {
        return this.gyZ();
    }
}

