/*
 * Decompiled with CFR 0.152.
 */
public class aUY
extends aUU {
    private final ero_0 hsl;

    public aUY(int n, int n2, int n3, int n4, ero_0 ero_02) {
        super(n, n2, n4, n3);
        this.hsl = ero_02;
    }

    @Override
    public long cbk() {
        if (this.hsl != null) {
            if (this.Qy() != 0L) {
                this.hsl.dj(this.Qy());
            }
            if (this.hsl.bbd() != null) {
                this.fg(this.hsl.bbd().Sn());
            }
            if (this.hsl.bbc() != null) {
                this.hB(this.hsl.bbc().Sn());
            }
            this.hsl.bbr();
        }
        return super.cbk();
    }

    @Override
    protected void caV() {
        qu_0 qu_02 = this.hsl.bbC() || this.hsl.aZD() ? this.hsl.bbc() : this.hsl.bbd();
        if ((this.hsl.Ty() || this.hsl.bbX()) && qu_02 != null && (this.hsl.aZQ() || this.hsl.bbX()) && qu_02.baz() != null) {
            qu_02.baz().p(this.hsl);
        }
        this.hsl.bbF();
        this.hsl.fHB();
    }

    public int cWC() {
        return this.hsl.getValue();
    }
}

