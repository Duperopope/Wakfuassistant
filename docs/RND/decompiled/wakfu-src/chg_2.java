/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHG
 */
class chg_2
implements Runnable {
    private final cie_1 nae;
    private final abi_1 naf;
    private final int nag;

    private chg_2(cie_1 cie_12, abi_1 abi_12, int n) {
        this.nae = cie_12;
        this.naf = abi_12;
        this.nag = n;
    }

    @Override
    public void run() {
        switch (this.naf) {
            case dzp: {
                this.nae.bB(0.0f, -30.0f);
                break;
            }
            case dzl: {
                this.nae.bB(0.0f, 30.0f);
                break;
            }
            case dzn: {
                this.nae.bB(30.0f, 0.0f);
                break;
            }
            case dzj: {
                this.nae.bB(-30.0f, 0.0f);
            }
        }
    }

    public boolean b(flp_2 flp_22) {
        switch (this.naf) {
            case dzp: {
                return flp_22.getScreenY() > this.nag;
            }
            case dzl: {
                return flp_22.getScreenY() < this.nag;
            }
            case dzn: {
                return flp_22.getScreenX() < this.nag;
            }
            case dzj: {
                return flp_22.getScreenX() > this.nag;
            }
        }
        return false;
    }
}

