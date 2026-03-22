/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class aaX
extends abl<aay_0> {
    private final aav ccN;

    public aaX(@NotNull aav aav2) {
        super(new aaY());
        this.ccN = aav2;
    }

    @Override
    public final void clear() {
        for (int i = 0; i < this.cdl.bTR(); ++i) {
            ((aay_0)this.cdl.vU(i)).a(this.ccN);
        }
        super.clear();
    }

    protected void a(aay_0 aay_02) {
        aay_02.a(this.ccN);
    }

    @Override
    protected /* synthetic */ void z(Object object) {
        this.a((aay_0)object);
    }
}

