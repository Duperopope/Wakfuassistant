/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public abstract class Vd
extends ff_1 {
    protected final LinkedList<UZ> bxF = new LinkedList();

    public void a(UZ uZ) {
        this.bxF.add(uZ);
    }

    public boolean b(UZ uZ) {
        return this.bxF.remove(uZ);
    }

    public byte[] apI() {
        return this.a(this.zj());
    }
}

