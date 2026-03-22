/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;

public class XP {
    private static final XP bSS = new XP();
    private ByteBuffer bST;
    private final TIntIntHashMap bSU = new TIntIntHashMap();
    private Yd bSV;
    private final TIntObjectHashMap<XT> bSW = new TIntObjectHashMap();

    public static XP bnT() {
        return bSS;
    }

    private XP() {
    }

    public void a(String string, @NotNull Yd yd) {
        this.bSV = yd;
        this.ck(string);
    }

    private void ck(String string) {
        this.bST = this.dL(string);
        this.bnU();
    }

    private void bnU() {
        this.bST.position(0);
        this.bSU.clear();
        this.bSW.clear();
        int n = this.bST.getInt();
        for (int i = 0; i < n; ++i) {
            int n2 = this.bST.getInt();
            int n3 = this.bST.getInt();
            this.bSU.put(n2, n3);
        }
    }

    public final XT qG(int n) {
        try {
            this.i(n);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return (XT)this.bSW.get(n);
    }

    public final void i(int ... nArray) {
        this.bSW.clear();
        for (int n : nArray) {
            this.bSW.put(n, (Object)this.e(this.bST, n));
        }
    }

    public final void bnV() {
        this.i(this.bSU.keys());
    }

    private XT e(ByteBuffer byteBuffer, int n) {
        int n2 = this.bSU.get(n);
        if (n2 > 0) {
            byteBuffer.position(n2);
            XT xT = new XT(n);
            xT.a(byteBuffer, this.bSV);
            return xT;
        }
        return null;
    }

    public void a(Yd yd, ByteBuffer byteBuffer) {
        this.bSV = yd;
        this.bST = byteBuffer;
        this.bnU();
        this.i(this.bSU.keys());
    }

    private ByteBuffer dL(String string) {
        byte[] byArray = fo_0.by(string);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer;
    }

    public final int bnW() {
        return this.bSU.size();
    }

    public final int bnX() {
        return this.bSW.size();
    }

    public final void a(int n, ByteBuffer byteBuffer, Yd yd) {
        XT xT = (XT)this.bSW.get(n);
        if (xT != null) {
            xT.a(byteBuffer, yd);
        }
    }
}

