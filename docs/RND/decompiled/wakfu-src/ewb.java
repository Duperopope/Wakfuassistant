/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public final class ewb
extends ewa {
    ewd[] oxR = null;

    public ewb(ewd[] ewdArray) {
        this.oxR = ewdArray;
    }

    public ewb() {
    }

    ewb(apl_1 apl_12) {
        this.a(apl_12);
    }

    @Nullable
    public abi_1 ai(int n, int n2, short s) {
        if (this.oxR == null) {
            return null;
        }
        for (int i = 0; i < this.oxR.length; ++i) {
            ewd ewd2 = this.oxR[i];
            if (ewd2.oxT != n || ewd2.oxU != n2 || ewd2.oxV != s) continue;
            return ewd2.oxW;
        }
        return null;
    }

    @Override
    public boolean chv() {
        return true;
    }

    @Override
    public void clear() {
        this.oxR = null;
    }

    @Override
    public void a(apl_1 apl_12) {
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            this.oxR = null;
        } else {
            this.oxR = new ewd[n];
            for (int i = 0; i < n; ++i) {
                this.oxR[i] = new ewd(apl_12);
            }
        }
    }

    @Override
    public void b(fs_0 fs_02) {
        if (this.oxR == null) {
            fs_02.g((byte)0);
        } else {
            fs_02.g((byte)this.oxR.length);
            for (int i = 0; i < this.oxR.length; ++i) {
                this.oxR[i].b(fs_02);
            }
        }
    }

    @Override
    protected final void d(ewa ewa2) {
        ewb ewb2 = (ewb)ewa2;
        this.clear();
        if (ewb2.oxR != null) {
            this.oxR = (ewd[])ewb2.oxR.clone();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ewb)) {
            return false;
        }
        ewb ewb2 = (ewb)object;
        return Arrays.equals(this.oxR, ewb2.oxR);
    }

    public int hashCode() {
        return this.oxR != null ? Arrays.hashCode(this.oxR) : 0;
    }
}

