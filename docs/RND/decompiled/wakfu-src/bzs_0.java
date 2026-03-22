/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bzs
 */
public class bzs_0
extends bCA {
    protected static final Logger jDQ = Logger.getLogger(bzs_0.class);
    private final fi_1 jDR = new bzt_0(this, 3);

    protected bzs_0() {
    }

    @Override
    protected fi_1 bey() {
        return this.jDR;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(false);
        this.bi(true);
        this.jHv = false;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public rw_0[] dNf() {
        return rw_0.bly;
    }

    @Override
    public byte bcN() {
        return 4;
    }

    static /* synthetic */ void a(bzs_0 bzs_02, ayv_2 ayv_22) {
        bzs_02.a(ayv_22);
    }

    static /* synthetic */ short a(bzs_0 bzs_02, short s) {
        bzs_02.bmf = s;
        return bzs_02.bmf;
    }
}

