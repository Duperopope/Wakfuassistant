/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bQL
implements Comparator<bQN> {
    bQL() {
    }

    public int a(bQN bQN2, bQN bQN3) {
        return bQN2.aYs() - bQN3.aYs();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bQN)object, (bQN)object2);
    }
}

