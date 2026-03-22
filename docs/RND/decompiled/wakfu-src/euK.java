/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

class euK
extends euF {
    final /* synthetic */ String orD;
    final /* synthetic */ Consumer orE;
    final /* synthetic */ euG orF;

    euK(euG euG2, String string, Consumer consumer) {
        this.orF = euG2;
        this.orD = string;
        this.orE = consumer;
    }

    @Override
    public void cZe() {
        this.orF.a(this.orD, (Consumer<euE>)this.orE);
    }

    @Override
    public void kW(String string) {
        this.orE.accept(euE.ork);
    }
}

