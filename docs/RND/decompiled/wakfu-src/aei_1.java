/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEi
 */
public abstract class aei_1 {
    private final URL dFa;
    private final AtomicReference<aek_2> dFb;
    private aej_1 dFc = null;
    private aeg_1 dFd = aeh_1.dEZ;

    public aei_1(@NotNull URL uRL) {
        this.dFa = uRL;
        this.dFb = new AtomicReference<aek_2>(aek_2.dFe);
    }

    public void a(aej_1 aej_12) {
        this.dFc = aej_12;
    }

    public void a(@NotNull aeg_1 aeg_12) {
        this.dFd = aeg_12;
        this.dFd.b(this);
    }

    public aeg_1 bZg() {
        return this.dFd;
    }

    public boolean bZh() {
        return this.dFd != null && this.dFd.isValid();
    }

    public aek_2 bZi() {
        return this.dFb.get();
    }

    abstract OutputStream bZj();

    abstract boolean dH(boolean var1);

    void a(aek_2 aek_22) {
        aek_2 aek_23 = this.dFb.getAndSet(aek_22);
        if (this.dFc != null && aek_23 != aek_22) {
            this.dFc.c(this);
        }
    }

    URL bZk() {
        return this.dFa;
    }

    protected abstract String bZl();

    public String toString() {
        return "{" + this.getClass().getSimpleName() + " " + String.valueOf(this.dFb) + " remote:" + String.valueOf(this.dFa) + " local:" + this.bZl() + "}";
    }
}

