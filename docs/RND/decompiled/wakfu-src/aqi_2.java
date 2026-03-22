/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aqi
 */
public final class aqi_2
implements aqh_2,
ayx_2 {
    private static final Logger cQs = Logger.getLogger(aqi_2.class);
    public int cQj;
    public long cQt;
    public long cQu;
    public String cQv;
    private static final ObjectPool cQw = new ayv_2(new aqj_2());

    aqi_2() {
    }

    public aqi_2(String string, int n, long l, long l2) {
        this.cQv = string;
        this.cQj = n;
        this.cQt = l;
        this.cQu = l2;
    }

    @Override
    public void f(DataOutputStream dataOutputStream) {
        dataOutputStream.writeUTF(this.cQv);
        dataOutputStream.writeInt(this.cQj);
        dataOutputStream.writeLong(this.cQt);
        dataOutputStream.writeLong(this.cQu);
    }

    @Override
    public void d(DataInputStream dataInputStream) {
        this.cQv = dataInputStream.readUTF();
        this.cQj = dataInputStream.readInt();
        this.cQt = dataInputStream.readLong();
        this.cQu = dataInputStream.readLong();
    }

    public static aqi_2 a(String string, int n, long l, long l2) {
        aqi_2 aqi_22;
        try {
            aqi_22 = (aqi_2)cQw.borrowObject();
        }
        catch (Exception exception) {
            aqi_22 = new aqi_2();
            cQs.error((Object)"Erreur lors d'un checkout d'un IndexEntry", (Throwable)exception);
        }
        aqi_22.cQv = string;
        aqi_22.cQj = n;
        aqi_22.cQt = l;
        aqi_22.cQu = l2;
        return aqi_22;
    }

    public static aqi_2 bGs() {
        aqi_2 aqi_22;
        try {
            aqi_22 = (aqi_2)cQw.borrowObject();
        }
        catch (Exception exception) {
            aqi_22 = new aqi_2();
            cQs.error((Object)"Erreur lors d'un checkout d'un IndexEntry", (Throwable)exception);
        }
        return aqi_22;
    }

    public void aZp() {
        try {
            cQw.returnObject((Object)this);
        }
        catch (Exception exception) {
            cQs.error((Object)"Erreur lors d'un release d'un IndexEntry", (Throwable)exception);
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.cQv = null;
    }
}

