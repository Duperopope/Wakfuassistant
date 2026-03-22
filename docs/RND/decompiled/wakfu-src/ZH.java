/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ZH
extends ZG
implements WP {
    protected static final Logger bWl = Logger.getLogger(ZH.class);
    public static final short bWm = 6;
    private boolean bWn = false;
    private boolean bWo = false;
    protected boolean bWp = false;
    protected final ArrayList<adi_0> bWq = new ArrayList();

    public ZH() {
    }

    public ZH(long l) {
        super(l);
    }

    public ZH(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public ZH(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    @Override
    public void aq(short s) {
        this.bVV = s;
    }

    public boolean bqr() {
        return this.bWn;
    }

    @Override
    public void setSelected(boolean bl) {
        if (bl != this.bWn) {
            this.bWn = bl;
            this.bWp = true;
        }
    }

    public void bJ(boolean bl) {
        if (bl != this.bWo) {
            this.bWo = bl;
            this.bWp = true;
        }
    }

    public boolean bqs() {
        return true;
    }

    public void a(adi_0 adi_02) {
        if (!this.bWq.contains(adi_02)) {
            this.bWq.add(adi_02);
        }
    }

    public void b(adi_0 adi_02) {
        this.bWq.remove(adi_02);
    }

    public void bqt() {
        this.bWq.clear();
    }

    @Override
    public boolean b(afV afV2, int n) {
        boolean bl = super.b(afV2, n);
        if (this.bWp) {
            this.bqu();
        }
        return bl;
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        super.a(aaj_02, n);
        if (this.bWp) {
            this.bqu();
        }
    }

    private void bqu() {
        for (adi_0 adi_02 : this.bWq) {
            adi_02.a(this, this.bqr(), this.bWo);
        }
        this.bWp = false;
    }

    @Override
    public int bnd() {
        return -1;
    }

    @Override
    public axb_2 bnf() {
        return awx_2.dnF;
    }

    @Override
    public String bne() {
        return "";
    }
}

