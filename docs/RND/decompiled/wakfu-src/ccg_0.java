/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ccg
 */
public abstract class ccg_0
extends cci_0 {
    private static final Logger lOm = Logger.getLogger(ccg_0.class);
    private String lOn;
    private String lOo;
    private String cKf;
    private boolean lOp;
    private String lOq;
    private int duh;

    public String etm() {
        return this.lOn;
    }

    public void oi(String string) {
        this.lOn = string;
    }

    public String etn() {
        return this.lOo;
    }

    public void oj(String string) {
        this.lOo = string;
    }

    public String bDO() {
        return this.cKf;
    }

    public void kS(String string) {
        this.cKf = string;
    }

    public String eto() {
        return this.lOq;
    }

    public boolean etp() {
        return this.lOp;
    }

    public void ja(boolean bl) {
        this.lOp = bl;
    }

    public int vY() {
        return this.duh;
    }

    public void zS(int n) {
        this.duh = n;
    }

    @Override
    public void bmW() {
        super.bmW();
        adu.buC().reset();
    }

    @Override
    public void bmX() {
        super.bmX();
        this.lOn = null;
        this.lOo = null;
        this.lOp = false;
        this.lOq = null;
    }

    public void etq() {
        if (!this.lOp && this.etu() != null && this.etu().bSp().bSr()) {
            this.cVV();
        }
    }

    public void etr() {
        if (this.etu() != null && this.etu().bSp().bSr()) {
            this.cVW();
        }
    }

    public void ets() {
        this.cVY();
    }

    public void ett() {
        this.cVZ();
    }

    protected abstract void cVU();

    protected abstract void cVV();

    protected abstract void cVW();

    protected abstract void cVY();

    protected abstract void cVZ();

    @Override
    protected void c(@NotNull aam_2 aam_22) {
    }
}

