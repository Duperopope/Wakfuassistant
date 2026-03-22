/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class TM
implements Ui<TO> {
    private final List<TO> btX = new ArrayList<TO>(4);
    private final List<TO> btY = new ArrayList<TO>(4);

    public void a(TO tO, boolean bl) {
        List<TO> list = bl ? this.btY : this.btX;
        list.add(tO);
        tO.a(this);
    }

    public Iterable<TO> bix() {
        return this.btY;
    }

    public Iterable<TO> biy() {
        return new ArrayList<TO>(this.btY);
    }

    public Iterable<TO> biz() {
        return this.btX;
    }

    public Iterable<TO> biA() {
        return new ArrayList<TO>(this.btX);
    }

    public int DN() {
        int n = 4;
        n += this.j(this.btY);
        return n += this.j(this.btX);
    }

    private int j(List<TO> list) {
        int n = 0;
        for (TO tO : list) {
            n += tO.DN();
        }
        return n;
    }

    public void as(ByteBuffer byteBuffer) {
        this.a(byteBuffer, this.btX);
        this.a(byteBuffer, this.btY);
    }

    private void a(ByteBuffer byteBuffer, List<TO> list) {
        byteBuffer.putShort((short)list.size());
        for (TO tO : list) {
            tO.as(byteBuffer);
        }
    }

    protected void a(Tz tz, ByteBuffer byteBuffer) {
        this.a(tz, byteBuffer, this.btX);
        this.a(tz, byteBuffer, this.btY);
    }

    private void a(Tz tz, ByteBuffer byteBuffer, List<TO> list) {
        short s = byteBuffer.getShort();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            list.add(TO.f(tz, byteBuffer));
        }
    }

    public static TM d(Tz tz, ByteBuffer byteBuffer) {
        TM tM = new TM();
        tM.a(tz, byteBuffer);
        return tM;
    }

    public void clear() {
        TO tO;
        int n;
        for (n = 0; n < this.btX.size(); ++n) {
            tO = this.btX.get(n);
            tO.clean();
        }
        this.btX.clear();
        for (n = 0; n < this.btY.size(); ++n) {
            tO = this.btY.get(n);
            tO.clean();
        }
        this.btY.clear();
    }

    public void a(TO tO) {
        this.btY.remove(tO);
        this.btX.remove(tO);
    }

    @Override
    public /* synthetic */ void b(Ug ug) {
        this.a((TO)ug);
    }
}

