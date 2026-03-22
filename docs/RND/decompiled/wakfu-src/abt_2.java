/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aBt
 */
public class abt_2
implements abs_2 {
    @NotNull
    private final azb_2 dyM;
    private long dyN = 0L;
    private long dfi = -1L;
    private long dyO = -1L;

    public abt_2(@NotNull azb_2 azb_22) {
        this.dyM = azb_22;
    }

    public abt_2() {
        this.dyM = ayk_2.dtS;
    }

    public abt_2(long l) {
        this();
        this.dyN = l;
    }

    void start() {
        this.bVw();
        this.bVl();
    }

    public void fm(long l) {
        this.bVw();
        this.dyN = l;
        this.bVl();
    }

    private void bVl() {
        this.dfi = this.dyM.bjZ();
    }

    public void bhk() {
        if (!this.bVo()) {
            throw new abw_2();
        }
        this.dfi = -1L;
        this.dyO = -1L;
    }

    public void bVm() {
        if (!this.bVo() || this.isPaused()) {
            throw new abu_2();
        }
        this.dyO = this.dyM.bjZ();
    }

    public void bVn() {
        if (!this.bVo() || !this.isPaused()) {
            throw new abu_2();
        }
        this.dfi += this.bVx();
        this.dyO = -1L;
    }

    public boolean bVo() {
        return this.dfi >= 0L;
    }

    public boolean bVp() {
        return this.bVo() && this.bVu() >= 1.0;
    }

    public boolean isPaused() {
        return this.dyO != -1L;
    }

    public long bVq() {
        return this.bVo() ? this.bVr() : 0L;
    }

    private long bVr() {
        return this.isPaused() ? this.dyO - this.dfi : this.dyM.bjZ() - this.dfi;
    }

    public long bVs() {
        return this.bVo() ? this.bVt() : this.dyN;
    }

    private long bVt() {
        return this.dyN - this.bVr();
    }

    public double bVu() {
        return this.bVo() ? this.bVv() : 0.0;
    }

    private double bVv() {
        return (double)this.bVr() / (double)this.dyN;
    }

    private void bVw() {
        if (this.bVo()) {
            throw new abv_2();
        }
    }

    @Override
    public long atA() {
        return this.dfi + (this.isPaused() ? this.bVx() : 0L);
    }

    private long bVx() {
        return this.dyM.bjZ() - this.dyO;
    }

    @Override
    public long bVj() {
        return this.dyN;
    }

    @Override
    public boolean bVk() {
        throw new UnsupportedOperationException("onCoolDownExpired not implemented");
    }

    @Override
    @Deprecated
    public void hq(long l) {
        throw new UnsupportedOperationException("setStartTime not implemented");
    }
}

