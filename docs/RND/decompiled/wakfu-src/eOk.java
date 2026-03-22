/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class eOk
extends ero_0 {
    private static final Logger raK = Logger.getLogger(eOk.class);
    private static final aox_1 raL = new enz_0(new eny_0("Shortcut to add", new enx_0("barNumber", eNA.qYD), new enx_0("barSlot (-1 for auto)", eNA.qYD), new enx_0("spellId", eNA.qYD), new enx_0("spellLevel (-1 for player level)", eNA.qYD)));
    private byte raM = (byte)-1;
    private short raN = (short)-1;
    private int eGx = -1;
    private short raO = (short)-1;
    private fqE<? extends fqD> raP;
    private fqr_0 raQ;

    @Override
    public aox_1 bEt() {
        return raL;
    }

    public eOk fCf() {
        return new eOk();
    }

    @Override
    public void E(QD qD) {
        if (!this.bbt()) {
            return;
        }
        if (this.bgF == null) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        this.raM = (byte)((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.raN = (short)((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        this.eGx = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu);
        this.raO = (short)((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
        short s = this.raO == -1 ? ((exP)this.bgF).cmL() : this.raO;
        this.raP = (fqE)fqF.giR().i(this.eGx, s).bff();
        if (this.raP == null) {
            raK.error((Object)("Impossible de cr\u00e9er le sort d'id " + this.eGx + " pour le level " + s));
            return;
        }
        this.raP.di(this.raP.avr());
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fCg();
    }

    public void fCg() {
        if (this.bgF == null) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        if (this.raP == null) {
            return;
        }
        exP exP2 = (exP)this.bgF;
        fqP<? extends fqE> fqP2 = exP2.dkB();
        if (fqP2 == null) {
            return;
        }
        try {
            if (!fqP2.f(this.raP)) {
                ((Sg)fqP2).b(this.raP);
            }
        }
        catch (Exception exception) {
            raK.error((Object)("Failed to add spell " + this.eGx + " with level " + this.raO), (Throwable)exception);
            this.raP = null;
        }
        frd frd2 = exP2.dnM();
        if (frd2 != null) {
            frd2.aG(this.eGx);
        }
        this.raQ = exP2.a(this.raM, this.raN, this.raP);
    }

    @Override
    public void bbS() {
        if (this.raP == null) {
            return;
        }
        if (!(this.bgF instanceof exP)) {
            return;
        }
        exP exP2 = (exP)this.bgF;
        fqP<? extends fqE> fqP2 = exP2.dkB();
        if (fqP2 == null) {
            return;
        }
        fqP2.c(this.raP);
        frd frd2 = exP2.dnM();
        if (frd2 != null) {
            frd2.aH(this.eGx);
        }
        exP2.a(this.raM, this.raN, this.raQ);
        super.bbS();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.raM = (byte)-1;
        this.raN = (short)-1;
        this.eGx = -1;
        this.raO = (short)-1;
        this.raP = null;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ek(this.eGx).en(this.raO).ep(this.raM).eq(this.raN));
    }

    @Override
    protected void f(im_1 im_12) {
        if (!im_12.Qz()) {
            return;
        }
        if (((exP)this.bgF).dkB() == null) {
            return;
        }
        ii_1 ii_12 = im_12.QA();
        this.eGx = ii_12.getValue();
        this.raO = GC.cu(ii_12.tL());
        this.raM = GC.ct(ii_12.Mg());
        this.raN = GC.cu(ii_12.Mi());
        short s = this.raO == -1 ? ((exP)this.bgF).cmL() : this.raO;
        this.raP = (fqE)fqF.giR().i(this.eGx, s).bff();
        this.raP.di(this.raP.avr());
    }

    public byte fCh() {
        return this.raM;
    }

    public short fCi() {
        return this.raN;
    }

    public int axA() {
        return this.eGx;
    }

    public short fCj() {
        return this.raO;
    }

    public fqE<? extends fqD> fCk() {
        return this.raP;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCf();
    }
}

