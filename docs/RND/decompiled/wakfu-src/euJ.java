/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

class euJ
extends euF {
    final /* synthetic */ int orA;
    final /* synthetic */ Consumer orB;
    final /* synthetic */ euG orC;

    euJ(euG euG2, int n, Consumer consumer) {
        this.orC = euG2;
        this.orA = n;
        this.orB = consumer;
    }

    @Override
    public void cZe() {
        this.orC.a(this.orA, (Consumer<euE>)this.orB);
    }

    @Override
    public void kW(String string) {
        this.orB.accept(euE.ork);
    }
}

