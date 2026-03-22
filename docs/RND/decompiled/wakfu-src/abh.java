/*
 * Decompiled with CFR 0.152.
 */
public final class abh
extends abl<aaq_0> {
    private boolean cda = true;

    public abh() {
        super(new abi());
    }

    protected void b(aaq_0 aaq_02) {
        if (this.cda) {
            aaq_02.bsK();
        }
    }

    @Override
    public void clear() {
        for (aaq_0 aaq_02 : this.cdl) {
            aaq_02.bsK();
        }
        super.clear();
    }

    public void bW(boolean bl) {
        this.cda = bl;
    }

    @Override
    protected /* synthetic */ void z(Object object) {
        this.b((aaq_0)object);
    }
}

