/*
 * Decompiled with CFR 0.152.
 */
public abstract class aUS
extends aft_2 {
    private bsS efA;
    private final int hrW;

    protected aUS(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.hrW = n4;
    }

    private void cWr() {
        if (this.efA == null) {
            this.efA = bsU.dHk().Ft(this.hrW);
        }
    }

    public bsS cja() {
        this.cWr();
        return this.efA;
    }

    public boolean cWs() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        this.cWr();
        if (bgt_02.dmV() == null && this.efA == null) {
            return false;
        }
        return bgt_02.dmV() == this.efA;
    }

    public bsj_0 cWt() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            return bgt_02.dkZ();
        }
        return null;
    }

    public bgy iD(long l) {
        this.cWr();
        if (this.efA != null) {
            return this.efA.kq(l);
        }
        return bgg_0.dlO().ju(l);
    }

    public QR bai() {
        this.cWr();
        if (this.efA == null) {
            return null;
        }
        return this.efA.bai();
    }

    public qm_0 cWu() {
        this.cWr();
        if (this.efA != null) {
            return this.efA.bbh();
        }
        return bas_2.cZC();
    }

    @Override
    public final void run() {
        try {
            this.cWv();
        }
        catch (Exception exception) {
            dJP.error((Object)String.format("Erreur lors de l'ex\u00e9cution de la %s #%d", this.getClass().getSimpleName(), this.avZ()), (Throwable)exception);
        }
        finally {
            this.caT();
        }
    }

    protected abstract void cWv();
}

