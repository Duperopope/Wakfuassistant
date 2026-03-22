/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eRr
extends fi_1 {
    private vy_1 rhB;
    final /* synthetic */ eRq rhS;

    eRr(eRq eRq2) {
        this.rhS = eRq2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.rhB.aF(byteBuffer);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        exP exP2 = (exP)this.rhS.bbc();
        this.rhB = new vy_1();
        this.rhB.aG(byteBuffer);
        this.rhS.rhQ = exP2.dkB() == null ? eze_0.fmL().edU() : eze_0.fmL().d((short)100, exP2.dkB().beS(), exP2.dkB().beR(), false, false, false);
        this.rhS.rhQ.b(this.rhB);
    }

    @Override
    public int zt() {
        this.rhB = new vy_1();
        this.rhS.rhQ.a(this.rhB);
        return this.rhB.DN();
    }
}

