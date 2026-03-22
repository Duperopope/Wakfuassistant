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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from tH
 */
final class th_2 {
    private long aba = 0L;
    private long Ut = 0L;
    private String abb = null;
    private long TL = 0L;
    private short abc = 0;
    private long abd = 0L;
    private final ArrayList<ti_2> abj = new ArrayList(0);
    private int abf = 0;
    private tk_2 abg = null;
    private final tw_1 abk = new tw_1();
    @Deprecated
    private final tc_2 abl = new tc_2();
    private boolean abi = false;
    final /* synthetic */ tg_1 abm;

    th_2(tg_1 tg_12) {
        this.abm = tg_12;
    }

    public void avW() {
        this.abm.aba = this.aba;
        this.abm.Ut = this.Ut;
        this.abm.abb = this.abb;
        this.abm.TL = this.TL;
        this.abm.abc = this.abc;
        this.abm.abd = this.abd;
        this.abm.abe.clear();
        this.abm.abe.ensureCapacity(this.abj.size());
        this.abm.abe.addAll(this.abj);
        this.abm.abf = this.abf;
        this.abm.abg = this.abg;
        this.abm.abh.abX = this.abk.abX;
        this.abm.abh.abY.clear();
        this.abm.abh.abY.ensureCapacity(this.abk.abY.size());
        this.abm.abh.abY.addAll(this.abk.abY);
        this.abm.abh.abZ.clear();
        this.abm.abh.abZ.ensureCapacity(this.abk.abZ.size());
        this.abm.abh.abZ.addAll(this.abk.abZ);
        this.abm.abi = this.abi;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 1);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 1);
    }

    private boolean dg(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 309);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 309);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 309);
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 313);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 313);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 313);
    }

    private boolean cH(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 314);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 314);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 314);
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 315);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 315);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 315);
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10003);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10003);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10003);
    }

    private boolean dh(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10005);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10005);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10005);
    }

    private boolean di(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10014);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10014);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10014);
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10023);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10023);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10023);
    }

    private boolean dj(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 1027001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 1027001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 1027001);
    }

    private boolean dk(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 1027002);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 1027002);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 1027002);
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10028000);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10028000);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10028000);
    }

    private boolean cN(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10029000);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10029000);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10029000);
    }

    private boolean cO(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10032003);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10032003);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10032003);
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10035004);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10035004);
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10035007);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10035007);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10035007);
    }

    private boolean cR(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10036004);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10036004);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10036004);
    }

    private boolean cS(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10037001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10037001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10037001);
    }

    private boolean dl(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10037002);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10037002);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10037002);
    }

    private boolean cT(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10040005);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10040005);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10040005);
    }

    private boolean cU(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10045010);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10045010);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10045010);
    }

    private boolean cC(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            boolean bl2 = ti_22.b(byteBuffer, 10048000);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10048000);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        return bl = this.abk.b(byteBuffer, 10048000);
    }

    private boolean dm(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10051000);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10051000);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10051000))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10051000);
        return bl2;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10055001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10055001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10055001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10055001);
        return bl2;
    }

    private boolean dn(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10060001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10060001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10060001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10060001);
        return bl2;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10064001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10064001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10064001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10064001);
        return bl2;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10066001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10066001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10066001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10066001);
        return bl2;
    }

    private boolean do(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 0x999C39);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 0x999C39);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 0x999C39))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 0x999C39);
        return bl2;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10069001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10069001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10069001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10069001);
        return bl2;
    }

    private boolean dp(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10085001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10085001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10085001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10085001);
        return bl2;
    }

    private boolean dq(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.abj.clear();
        this.abj.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ti_2 ti_22 = new ti_2();
            bl2 = ti_22.b(byteBuffer, 10086001);
            if (!bl2) {
                return false;
            }
            this.abj.add(ti_22);
        }
        this.abf = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.abg = new tk_2();
            boolean bl3 = this.abg.b(byteBuffer, 10086001);
            if (!bl3) {
                return false;
            }
        } else {
            this.abg = null;
        }
        if (!(bl = this.abk.b(byteBuffer, 10086001))) {
            return false;
        }
        bl2 = this.abl.b(byteBuffer, 10086001);
        if (!bl2) {
            return false;
        }
        this.abi = byteBuffer.get() == 1;
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
        if (n < 309) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.dg(byteBuffer);
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
        if (n < 10014) {
            boolean bl = this.dh(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.di(byteBuffer);
            return bl;
        }
        if (n < 1027001) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 1027002) {
            boolean bl = this.dj(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.dk(byteBuffer);
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
        if (n < 10037002) {
            boolean bl = this.cS(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.dl(byteBuffer);
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
        if (n < 10051000) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.dm(byteBuffer);
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
        if (n < 0x999C39) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.do(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.cY(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.dp(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.dq(byteBuffer);
            return bl;
        }
        return false;
    }
}

