/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;
import java.nio.ByteBuffer;
import java.util.List;

class Uo
implements TShortObjectProcedure<List<TO>> {
    private final azg_1 buI;

    Uo(azg_1 azg_12) {
        this.buI = azg_12;
    }

    public boolean a(short s, List<TO> list) {
        this.b(s, list);
        return true;
    }

    private void b(short s, List<TO> list) {
        this.buI.aG(s);
        this.buI.vC(list.size());
        for (TO tO : list) {
            int n = tO.DN();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n);
            tO.as(byteBuffer);
            this.buI.vC(n);
            this.buI.dH(byteBuffer.array());
        }
    }

    public /* synthetic */ boolean execute(short s, Object object) {
        return this.a(s, (List)object);
    }
}

