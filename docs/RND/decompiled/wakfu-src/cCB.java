/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cCB {
    private static final Logger mAx = Logger.getLogger(cCB.class);
    private final ArrayList<cCA> mAy = new ArrayList();
    private final ArrayList<cCz> mAz = new ArrayList();

    public ArrayList<cCA> eJC() {
        return this.mAy;
    }

    public void b(cCA cCA2) {
        this.mAy.add(cCA2);
    }

    public void c(cCA cCA2) {
        this.mAy.remove(cCA2);
    }

    public ArrayList<cCz> eJD() {
        return this.mAz;
    }

    public void e(cCz cCz2) {
        this.mAz.add(cCz2);
    }

    public void f(cCz cCz2) {
        this.mAz.remove(cCz2);
    }

    public void a(@NotNull apl_1 apl_12) {
        Object object;
        int n;
        int n2 = apl_12.aIA();
        this.mAy.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cCA();
            ((cCA)object).a(apl_12);
            this.mAy.add((cCA)object);
        }
        n2 = apl_12.aIA();
        this.mAz.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cCz();
            try {
                ((cCz)object).a(apl_12);
                this.mAz.add((cCz)object);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                mAx.error((Object)("Error while loading sound container id : " + ((cCz)object).o + " name : " + ((cCz)object).p), (Throwable)illegalArgumentException);
            }
        }
    }

    public void b(@NotNull fs_0 fs_02) {
        int n;
        fs_02.mz(this.mAy.size());
        int n2 = this.mAy.size();
        for (n = 0; n < n2; ++n) {
            this.mAy.get(n).b(fs_02);
        }
        fs_02.mz(this.mAz.size());
        n2 = this.mAz.size();
        for (n = 0; n < n2; ++n) {
            this.mAz.get(n).b(fs_02);
        }
    }

    public void F(@NotNull apl_1 apl_12) {
        Object object;
        int n;
        int n2 = apl_12.aIA();
        this.mAy.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cCA();
            ((cCA)object).F(apl_12);
            this.mAy.add((cCA)object);
        }
        n2 = apl_12.aIA();
        this.mAz.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new cCz();
            ((cCz)object).F(apl_12);
            this.mAz.add((cCz)object);
        }
    }

    public void r(@NotNull fs_0 fs_02) {
        int n;
        fs_02.mz(this.mAy.size());
        int n2 = this.mAy.size();
        for (n = 0; n < n2; ++n) {
            this.mAy.get(n).r(fs_02);
        }
        fs_02.mz(this.mAz.size());
        n2 = this.mAz.size();
        for (n = 0; n < n2; ++n) {
            this.mAz.get(n).r(fs_02);
        }
    }

    public cCz LO(int n) {
        for (int i = this.mAz.size() - 1; i >= 0; --i) {
            cCz cCz2 = this.mAz.get(i);
            if (cCz2.o != n) continue;
            return cCz2;
        }
        return null;
    }

    public cCA LP(int n) {
        for (int i = this.mAy.size() - 1; i >= 0; --i) {
            cCA cCA2 = this.mAy.get(i);
            if (cCA2.o != n) continue;
            return cCA2;
        }
        return null;
    }
}

