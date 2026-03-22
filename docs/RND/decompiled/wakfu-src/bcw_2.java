/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcW
 */
public class bcw_2
implements bug_0<bci_1> {
    private final bbz_2 hJA;

    public bcw_2(bbz_2 bbz_22) {
        this.hJA = bbz_22;
    }

    public boolean f(bci_1 bci_12) {
        return bci_12.daS().dav() == this.hJA;
    }

    @Override
    public boolean isValid() {
        return this.hJA != bbz_2.hCS;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jow;
    }

    public bbz_2 dcB() {
        return this.hJA;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.f((bci_1)object);
    }
}

