/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tR
 */
final class tr_1 {
    private long aba = 0L;
    private long Ut = 0L;
    private String abb = null;
    private long TL = 0L;
    private int abf = 0;
    private final ArrayList<ts_2> abM = new ArrayList(0);
    private final ArrayList<tq_1> abN = new ArrayList(0);
    final /* synthetic */ tp_2 abO;

    tr_1(tp_2 tp_22) {
        this.abO = tp_22;
    }

    public void avW() {
        this.abO.aba = this.aba;
        this.abO.Ut = this.Ut;
        this.abO.abb = this.abb;
        this.abO.TL = this.TL;
        this.abO.abf = this.abf;
        this.abO.abG.clear();
        this.abO.abG.ensureCapacity(this.abM.size());
        this.abO.abG.addAll(this.abM);
        this.abO.abH.clear();
        this.abO.abH.ensureCapacity(this.abN.size());
        this.abO.abH.addAll(this.abN);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean dh(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10005);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10005);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean dn(ByteBuffer byteBuffer) {
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10060001);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10060001);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abM.clear();
        this.abM.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.abM.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abN.clear();
        this.abN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.abN.add(tq_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 314) {
            boolean bl = this.cG(byteBuffer);
            return bl;
        }
        if (n < 315) {
            boolean bl = this.cH(byteBuffer);
            return bl;
        }
        if (n < 10003) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10005) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.dh(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.cM(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.cN(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.cO(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.cQ(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.cR(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.cS(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.cT(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cU(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10060001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.dn(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        return false;
    }
}

