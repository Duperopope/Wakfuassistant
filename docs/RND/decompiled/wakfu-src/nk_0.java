/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Nk
 */
public abstract class nk_0
implements aav_1<nr_0> {
    private static final int aYd = 4;
    private static final int aYe = 2;
    private static final int aYf = 6;
    protected static final Logger aYg = Logger.getLogger(nk_0.class);

    @Nullable
    public nr_0 eI(ByteBuffer byteBuffer) {
        nr_0 nr_02;
        byteBuffer.mark();
        int n = byteBuffer.remaining();
        if (n < 6) {
            byteBuffer.reset();
            return null;
        }
        int n2 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (byteBuffer.remaining() < n2 - 6 || n2 < 6) {
            byteBuffer.reset();
            return null;
        }
        switch (s) {
            case 304: {
                nr_0 nr_03 = new nq_0();
                break;
            }
            case 348: {
                nr_0 nr_03 = new nt_0();
                break;
            }
            case 336: {
                nr_0 nr_03 = new nu_1();
                break;
            }
            case 353: {
                nr_0 nr_03 = new nb_1();
                break;
            }
            case 367: {
                nr_0 nr_03 = new nx_1();
                break;
            }
            case 338: {
                nr_0 nr_03 = new Nm();
                break;
            }
            case 303: {
                nr_0 nr_03 = new nz_0();
                break;
            }
            case 37: {
                nr_0 nr_03 = new No();
                break;
            }
            case 28: {
                nr_0 nr_03 = new nl_0();
                break;
            }
            case 15: {
                nr_0 nr_03 = new ny_0();
                break;
            }
            default: {
                nr_0 nr_03 = nr_02 = this.nW(s);
            }
        }
        if (nr_02 == null) {
            int n3 = byteBuffer.position() + n2 - 6;
            byteBuffer.position(n3);
            aYg.error((Object)("Message with id " + s + " is not defined in the message decoder !"));
        }
        if (nr_02 != null && byteBuffer.remaining() != 0) {
            byte[] byArray = new byte[n2 - 6];
            byteBuffer.get(byArray);
            try {
                nr_02.dn(byArray);
            }
            catch (Throwable throwable) {
                aYg.error((Object)("Exception during decode for message " + s), throwable);
            }
        }
        return nr_02;
    }

    protected abstract nr_0 nW(int var1);

    @Override
    @Nullable
    public /* synthetic */ aam_2 eJ(ByteBuffer byteBuffer) {
        return this.eI(byteBuffer);
    }
}

