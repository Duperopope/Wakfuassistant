/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fEC
 */
class fec_1
implements fis_1 {
    final /* synthetic */ fea_1 umZ;

    fec_1(fea_1 fea_12) {
        this.umZ = fea_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (!this.umZ.lAX.isMovable() || this.umZ.umS) {
            return false;
        }
        if (!this.umZ.umR) {
            this.umZ.umT = flp_22.x(this.umZ.lAX);
            this.umZ.umU = flp_22.y(this.umZ.lAX);
            this.umZ.umR = true;
        }
        int n = this.umZ.lAX.getX();
        int n2 = this.umZ.lAX.getY();
        if (this.umZ.tMi) {
            n = flp_22.x(this.umZ.lAX.getContainer()) - this.umZ.umT;
        }
        if (this.umZ.kuf) {
            n2 = flp_22.y(this.umZ.lAX.getContainer()) - this.umZ.umU;
        }
        if (this.umZ.lAX.isStickWithinRootContainer()) {
            int n3 = n - this.umZ.lAX.getX();
            int n4 = n2 - this.umZ.lAX.getY();
            int n5 = this.umZ.getX(this.umZ.umV);
            int n6 = this.umZ.getY(this.umZ.umV);
            int n7 = this.umZ.getX(this.umZ.lAX);
            int n8 = this.umZ.getY(this.umZ.lAX);
            int n9 = Math.min(50, this.umZ.ukt.width);
            int n10 = Math.min(50, this.umZ.ukt.height);
            if (this.umZ.tMi) {
                if (this.umZ.lAX.getStickFullyWithinRootContainer()) {
                    if (this.umZ.lAX.getX() + n3 < 0) {
                        n = 0;
                    } else if (this.umZ.lAX.getX() + this.umZ.lAX.getWidth() + n3 > this.umZ.umV.getWidth()) {
                        n = this.umZ.umV.getWidth() - this.umZ.lAX.getWidth();
                    }
                } else if (n5 + n3 + this.umZ.ukt.width - n9 < 0) {
                    n = -n7 - this.umZ.ukt.width + n9;
                } else if (n5 + n3 + n9 > this.umZ.umV.getWidth()) {
                    n = this.umZ.umV.getWidth() - (n7 + n9);
                }
            }
            if (this.umZ.kuf) {
                if (this.umZ.lAX.getStickFullyWithinRootContainer()) {
                    if (this.umZ.lAX.getY() + n4 < 0) {
                        n2 = 0;
                    } else if (this.umZ.lAX.getY() + this.umZ.lAX.getHeight() + n4 > this.umZ.umV.getHeight()) {
                        n2 = this.umZ.umV.getHeight() - this.umZ.lAX.getHeight();
                    }
                } else if (n6 + n4 + this.umZ.ukt.height - n10 < 0) {
                    n2 = -n8 - this.umZ.ukt.height + n10;
                } else if (n6 + n4 + n10 > this.umZ.umV.getHeight()) {
                    n2 = this.umZ.umV.getHeight() - (n8 + n10);
                }
            }
        }
        if (this.umZ.lAX.getStickData() != null) {
            Point point = new Point(n, n2);
            fkj_2.gCW().a(this.umZ.lAX, this.umZ.lAX.getX(), this.umZ.lAX.getY(), n, n2, point, fbj_1.getInstance().isShiftPressed());
            n = point.x;
            n2 = point.y;
            if (flp_22.x(this.umZ.lAX.getContainer()) <= 0) {
                this.umZ.lAX.h(new fmc_1(this.umZ.lAX, faa_2.tLN));
            } else if (flp_22.x(this.umZ.lAX.getContainer()) >= this.umZ.lAX.getContainer().getWidth()) {
                this.umZ.lAX.h(new fmc_1(this.umZ.lAX, faa_2.tLP));
            } else if (flp_22.y(this.umZ.lAX.getContainer()) <= 0) {
                this.umZ.lAX.h(new fmc_1(this.umZ.lAX, faa_2.tLR));
            } else if (flp_22.y(this.umZ.lAX.getContainer()) >= this.umZ.lAX.getContainer().getHeight()) {
                this.umZ.lAX.h(new fmc_1(this.umZ.lAX, faa_2.tLL));
            }
        }
        this.umZ.lAX.setPosition(n, n2);
        if (this.umZ.lAX.getContainer() != null) {
            this.umZ.lAX.getContainer().gsm();
        }
        return false;
    }
}

