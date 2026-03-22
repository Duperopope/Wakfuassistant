/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fEF
 */
class fef_2
implements fis_1 {
    final /* synthetic */ fed_2 ung;

    fef_2(fed_2 fed_22) {
        this.ung = fed_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (!this.ung.unc) {
            this.ung.tVX = new Point(flp_22.x(this.ung.lAX.getContainer()), flp_22.y(this.ung.lAX.getContainer()));
        }
        int n = flp_22.x(this.ung.lAX.getContainer()) - this.ung.tVX.x;
        int n2 = flp_22.y(this.ung.lAX.getContainer()) - this.ung.tVX.y;
        int n3 = this.ung.lAX.getX() + this.ung.lAX.getWidth();
        int n4 = this.ung.lAX.getY() + this.ung.lAX.getHeight();
        int n5 = this.ung.lAX.getWidth();
        int n6 = this.ung.lAX.getHeight();
        int n7 = this.ung.lAX.getX();
        int n8 = this.ung.lAX.getY();
        switch (this.ung.unb) {
            case tLP: {
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() + n), this.ung.und.getWidth() - this.ung.lAX.getX());
                break;
            }
            case tLL: {
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() + n2), this.ung.und.getHeight() - this.ung.lAX.getY());
                break;
            }
            case tLR: {
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() - n2), n4);
                n8 = n4 - n6;
                break;
            }
            case tLM: {
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() + n), this.ung.und.getWidth() - this.ung.lAX.getX());
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() + n2), this.ung.und.getHeight() - this.ung.lAX.getY());
                break;
            }
            case tLK: {
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() + n2), this.ung.und.getHeight() - this.ung.lAX.getY());
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() - n), n3);
                n7 = n3 - n5;
                break;
            }
            case tLQ: {
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() - n), n3);
                n7 = n3 - n5;
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() - n2), n4);
                n8 = n4 - n6;
                break;
            }
            case tLS: {
                n6 = Math.min(this.ung.setCheckedHeight(this.ung.lAX.getHeight() - n2), n4);
                n8 = n4 - n6;
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() + n), this.ung.und.getWidth() - this.ung.lAX.getX());
                break;
            }
            case tLN: {
                n5 = Math.min(this.ung.setCheckedWidth(this.ung.lAX.getWidth() - n), n3);
                n7 = n3 - n5;
                break;
            }
        }
        this.ung.lAX.setSize(n5, n6);
        this.ung.lAX.setPosition(n7, n8);
        this.ung.tVX = new Point(flp_22.x(this.ung.lAX.getContainer()), flp_22.y(this.ung.lAX.getContainer()));
        if (this.ung.lAX.getContainer() != null) {
            this.ung.lAX.getContainer().gsm();
        }
        this.ung.unc = true;
        return false;
    }
}

