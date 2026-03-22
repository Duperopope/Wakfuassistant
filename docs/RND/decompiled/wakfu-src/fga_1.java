/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from fGa
 */
final class fga_1
extends Record {
    final VertexBufferPCT usb;
    final VertexBufferPCT usc;

    fga_1(VertexBufferPCT vertexBufferPCT, VertexBufferPCT vertexBufferPCT2) {
        this.usb = vertexBufferPCT;
        this.usc = vertexBufferPCT2;
    }

    void ub(int n) {
        this.usb.ub(fga_1.abi(n));
        this.usc.ub(fga_1.abh(n));
    }

    void bIH() {
        this.usb.bIH();
        this.usc.bIH();
    }

    void bIi() {
        this.usb.bIi();
        this.usc.bIi();
    }

    static int abh(int n) {
        return 2 * n;
    }

    static int abi(int n) {
        return 4 * n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fga_1.class, "insideBuffer;borderBuffer", "usb", "usc"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fga_1.class, "insideBuffer;borderBuffer", "usb", "usc"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fga_1.class, "insideBuffer;borderBuffer", "usb", "usc"}, this, object);
    }

    public VertexBufferPCT gxp() {
        return this.usb;
    }

    public VertexBufferPCT gxq() {
        return this.usc;
    }
}

