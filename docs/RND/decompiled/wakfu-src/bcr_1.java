/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcR
 */
public class bcr_1
implements bug_0<bci_1> {
    private final csf_1 hJy;

    public bcr_1(csf_1 csf_12) {
        this.hJy = csf_12;
    }

    public boolean f(bci_1 bci_12) {
        switch (this.hJy) {
            case nEX: {
                return bci_12.apo() || bci_12.app();
            }
            case nEY: {
                return bci_12.apo() && !bci_12.app() && !bci_12.bqp();
            }
            case nEZ: {
                return bci_12.app();
            }
            case nFa: {
                return bci_12.bqp();
            }
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joy;
    }

    public csf_1 dcA() {
        return this.hJy;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.f((bci_1)object);
    }
}

