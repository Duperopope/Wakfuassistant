/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class ewc
extends ewa {
    ewe oxS = null;

    public ewc(ewe ewe2) {
        this.oxS = ewe2;
    }

    ewc() {
    }

    ewc(apl_1 apl_12) {
        this.a(apl_12);
    }

    public ewe feJ() {
        return this.oxS;
    }

    @Override
    public boolean chv() {
        return false;
    }

    @Override
    public void clear() {
        this.oxS = null;
    }

    @Override
    public final void a(apl_1 apl_12) {
        this.oxS = ewe.H(apl_12);
    }

    @Override
    public void b(fs_0 fs_02) {
        ewe.a(this.oxS, fs_02);
    }

    @Override
    protected final void d(ewa ewa2) {
        ewc ewc2 = (ewc)ewa2;
        this.clear();
        if (ewc2.oxS != null) {
            this.oxS = new ewe(ewc2.oxS);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ewc)) {
            return false;
        }
        ewc ewc2 = (ewc)object;
        return Objects.equals(this.oxS, ewc2.oxS);
    }

    public int hashCode() {
        return this.oxS != null ? this.oxS.hashCode() : 0;
    }
}

