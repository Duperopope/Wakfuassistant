/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jV
 */
public final class jv_2
extends GeneratedMessageV3.Builder<jv_2>
implements jw_2 {
    private int an;
    private long DJ;
    private int mj;
    private long DM;
    private Object bs = "";
    private Object DP = "";
    private Object DR = "";
    private int DT;
    private int DV;
    private int DX;
    private int DZ;
    private int Eb;
    private List<jx_2> Ed = Collections.emptyList();
    private RepeatedFieldBuilderV3<jx_2, jz_2, ka_1> Ek;
    private List<jp_2> Ef = Collections.emptyList();
    private RepeatedFieldBuilderV3<jp_2, jr_2, js_2> El;
    private List<jl_2> Eh = Collections.emptyList();
    private RepeatedFieldBuilderV3<jl_2, jn_2, jo_2> Em;

    public static final Descriptors.Descriptor YE() {
        return jk_2.CQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CR.ensureFieldAccessorsInitialized(jt_2.class, jv_2.class);
    }

    jv_2() {
        this.D();
    }

    jv_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jt_2.aJ()) {
            this.YY();
            this.Zd();
            this.Zi();
        }
    }

    public jv_2 YF() {
        super.clear();
        this.DJ = 0L;
        this.an &= 0xFFFFFFFE;
        this.mj = 0;
        this.an &= 0xFFFFFFFD;
        this.DM = 0L;
        this.an &= 0xFFFFFFFB;
        this.bs = "";
        this.an &= 0xFFFFFFF7;
        this.DP = "";
        this.an &= 0xFFFFFFEF;
        this.DR = "";
        this.an &= 0xFFFFFFDF;
        this.DT = 0;
        this.an &= 0xFFFFFFBF;
        this.DV = 0;
        this.an &= 0xFFFFFF7F;
        this.DX = 0;
        this.an &= 0xFFFFFEFF;
        this.DZ = 0;
        this.an &= 0xFFFFFDFF;
        this.Eb = 0;
        this.an &= 0xFFFFFBFF;
        if (this.Ek == null) {
            this.Ed = Collections.emptyList();
            this.an &= 0xFFFFF7FF;
        } else {
            this.Ek.clear();
        }
        if (this.El == null) {
            this.Ef = Collections.emptyList();
            this.an &= 0xFFFFEFFF;
        } else {
            this.El.clear();
        }
        if (this.Em == null) {
            this.Eh = Collections.emptyList();
            this.an &= 0xFFFFDFFF;
        } else {
            this.Em.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jk_2.CQ;
    }

    public jt_2 YD() {
        return jt_2.YC();
    }

    public jt_2 YG() {
        jt_2 jt_22 = this.YH();
        if (!jt_22.isInitialized()) {
            throw jv_2.newUninitializedMessageException((Message)jt_22);
        }
        return jt_22;
    }

    public jt_2 YH() {
        jt_2 jt_22 = new jt_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jt_22.DJ = this.DJ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jt_22.mj = this.mj;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            jt_22.DM = this.DM;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        jt_22.bs = this.bs;
        if ((n & 0x10) != 0) {
            n2 |= 0x10;
        }
        jt_22.DP = this.DP;
        if ((n & 0x20) != 0) {
            n2 |= 0x20;
        }
        jt_22.DR = this.DR;
        if ((n & 0x40) != 0) {
            jt_22.DT = this.DT;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            jt_22.DV = this.DV;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            jt_22.DX = this.DX;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            jt_22.DZ = this.DZ;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            jt_22.Eb = this.Eb;
            n2 |= 0x400;
        }
        if (this.Ek == null) {
            if ((this.an & 0x800) != 0) {
                this.Ed = Collections.unmodifiableList(this.Ed);
                this.an &= 0xFFFFF7FF;
            }
            jt_22.Ed = this.Ed;
        } else {
            jt_22.Ed = this.Ek.build();
        }
        if (this.El == null) {
            if ((this.an & 0x1000) != 0) {
                this.Ef = Collections.unmodifiableList(this.Ef);
                this.an &= 0xFFFFEFFF;
            }
            jt_22.Ef = this.Ef;
        } else {
            jt_22.Ef = this.El.build();
        }
        if (this.Em == null) {
            if ((this.an & 0x2000) != 0) {
                this.Eh = Collections.unmodifiableList(this.Eh);
                this.an &= 0xFFFFDFFF;
            }
            jt_22.Eh = this.Eh;
        } else {
            jt_22.Eh = this.Em.build();
        }
        jt_22.an = n2;
        this.onBuilt();
        return jt_22;
    }

    public jv_2 YI() {
        return (jv_2)super.clone();
    }

    public jv_2 dK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jv_2)super.setField(fieldDescriptor, object);
    }

    public jv_2 bs(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jv_2)super.clearField(fieldDescriptor);
    }

    public jv_2 bs(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jv_2)super.clearOneof(oneofDescriptor);
    }

    public jv_2 bs(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jv_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jv_2 dL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jv_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public jv_2 bs(Message message) {
        if (message instanceof jt_2) {
            return this.c((jt_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jv_2 c(jt_2 jt_22) {
        if (jt_22 == jt_2.YC()) {
            return this;
        }
        if (jt_22.XZ()) {
            this.aK(jt_22.Ya());
        }
        if (jt_22.tK()) {
            this.fU(jt_22.tL());
        }
        if (jt_22.Yb()) {
            this.aL(jt_22.Yc());
        }
        if (jt_22.wq()) {
            this.an |= 8;
            this.bs = jt_22.bs;
            this.onChanged();
        }
        if (jt_22.Yd()) {
            this.an |= 0x10;
            this.DP = jt_22.DP;
            this.onChanged();
        }
        if (jt_22.Q()) {
            this.an |= 0x20;
            this.DR = jt_22.DR;
            this.onChanged();
        }
        if (jt_22.Yg()) {
            this.fV(jt_22.Yh());
        }
        if (jt_22.Yi()) {
            this.fW(jt_22.Yj());
        }
        if (jt_22.Yk()) {
            this.fX(jt_22.Yl());
        }
        if (jt_22.Ym()) {
            this.fY(jt_22.Yn());
        }
        if (jt_22.Yo()) {
            this.fZ(jt_22.Yp());
        }
        if (this.Ek == null) {
            if (!jt_22.Ed.isEmpty()) {
                if (this.Ed.isEmpty()) {
                    this.Ed = jt_22.Ed;
                    this.an &= 0xFFFFF7FF;
                } else {
                    this.YU();
                    this.Ed.addAll(jt_22.Ed);
                }
                this.onChanged();
            }
        } else if (!jt_22.Ed.isEmpty()) {
            if (this.Ek.isEmpty()) {
                this.Ek.dispose();
                this.Ek = null;
                this.Ed = jt_22.Ed;
                this.an &= 0xFFFFF7FF;
                this.Ek = jt_2.oB() ? this.YY() : null;
            } else {
                this.Ek.addAllMessages(jt_22.Ed);
            }
        }
        if (this.El == null) {
            if (!jt_22.Ef.isEmpty()) {
                if (this.Ef.isEmpty()) {
                    this.Ef = jt_22.Ef;
                    this.an &= 0xFFFFEFFF;
                } else {
                    this.YZ();
                    this.Ef.addAll(jt_22.Ef);
                }
                this.onChanged();
            }
        } else if (!jt_22.Ef.isEmpty()) {
            if (this.El.isEmpty()) {
                this.El.dispose();
                this.El = null;
                this.Ef = jt_22.Ef;
                this.an &= 0xFFFFEFFF;
                this.El = jt_2.fa() ? this.Zd() : null;
            } else {
                this.El.addAllMessages(jt_22.Ef);
            }
        }
        if (this.Em == null) {
            if (!jt_22.Eh.isEmpty()) {
                if (this.Eh.isEmpty()) {
                    this.Eh = jt_22.Eh;
                    this.an &= 0xFFFFDFFF;
                } else {
                    this.Ze();
                    this.Eh.addAll(jt_22.Eh);
                }
                this.onChanged();
            }
        } else if (!jt_22.Eh.isEmpty()) {
            if (this.Em.isEmpty()) {
                this.Em.dispose();
                this.Em = null;
                this.Eh = jt_22.Eh;
                this.an &= 0xFFFFDFFF;
                this.Em = jt_2.oV() ? this.Zi() : null;
            } else {
                this.Em.addAllMessages(jt_22.Eh);
            }
        }
        this.dL(jt_2.b(jt_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.XZ()) {
            return false;
        }
        if (!this.tK()) {
            return false;
        }
        if (!this.Yb()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.Yd()) {
            return false;
        }
        if (!this.Q()) {
            return false;
        }
        if (!this.Yg()) {
            return false;
        }
        if (!this.Yi()) {
            return false;
        }
        if (!this.Yk()) {
            return false;
        }
        if (!this.Ym()) {
            return false;
        }
        if (!this.Yo()) {
            return false;
        }
        for (n = 0; n < this.Ys(); ++n) {
            if (this.fO(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.Yv(); ++n) {
            if (this.fQ(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.Yy(); ++n) {
            if (this.fS(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jv_2 ge(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jt_2 jt_22 = null;
        try {
            jt_22 = (jt_2)jt_2.Ej.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jt_22 = (jt_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jt_22 != null) {
                this.c(jt_22);
            }
        }
        return this;
    }

    @Override
    public boolean XZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    public jv_2 aK(long l) {
        this.an |= 1;
        this.DJ = l;
        this.onChanged();
        return this;
    }

    public jv_2 YJ() {
        this.an &= 0xFFFFFFFE;
        this.DJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public jv_2 fU(int n) {
        this.an |= 2;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public jv_2 YK() {
        this.an &= 0xFFFFFFFD;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yb() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Yc() {
        return this.DM;
    }

    public jv_2 aL(long l) {
        this.an |= 4;
        this.DM = l;
        this.onChanged();
        return this;
    }

    public jv_2 YL() {
        this.an &= 0xFFFFFFFB;
        this.DM = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 8) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public jv_2 J(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public jv_2 YM() {
        this.an &= 0xFFFFFFF7;
        this.bs = jt_2.YC().getName();
        this.onChanged();
        return this;
    }

    public jv_2 cv(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yd() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String getDescription() {
        Object object = this.DP;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.DP = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString Ye() {
        Object object = this.DP;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DP = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public jv_2 K(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.DP = string;
        this.onChanged();
        return this;
    }

    public jv_2 YN() {
        this.an &= 0xFFFFFFEF;
        this.DP = jt_2.YC().getDescription();
        this.onChanged();
        return this;
    }

    public jv_2 cw(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.DP = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Q() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String getMessage() {
        Object object = this.DR;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.DR = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString Yf() {
        Object object = this.DR;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DR = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public jv_2 L(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.DR = string;
        this.onChanged();
        return this;
    }

    public jv_2 YO() {
        this.an &= 0xFFFFFFDF;
        this.DR = jt_2.YC().getMessage();
        this.onChanged();
        return this;
    }

    public jv_2 cx(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.DR = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yg() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int Yh() {
        return this.DT;
    }

    public jv_2 fV(int n) {
        this.an |= 0x40;
        this.DT = n;
        this.onChanged();
        return this;
    }

    public jv_2 YP() {
        this.an &= 0xFFFFFFBF;
        this.DT = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yi() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int Yj() {
        return this.DV;
    }

    public jv_2 fW(int n) {
        this.an |= 0x80;
        this.DV = n;
        this.onChanged();
        return this;
    }

    public jv_2 YQ() {
        this.an &= 0xFFFFFF7F;
        this.DV = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yk() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int Yl() {
        return this.DX;
    }

    public jv_2 fX(int n) {
        this.an |= 0x100;
        this.DX = n;
        this.onChanged();
        return this;
    }

    public jv_2 YR() {
        this.an &= 0xFFFFFEFF;
        this.DX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ym() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Yn() {
        return this.DZ;
    }

    public jv_2 fY(int n) {
        this.an |= 0x200;
        this.DZ = n;
        this.onChanged();
        return this;
    }

    public jv_2 YS() {
        this.an &= 0xFFFFFDFF;
        this.DZ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yo() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int Yp() {
        return this.Eb;
    }

    public jv_2 fZ(int n) {
        this.an |= 0x400;
        this.Eb = n;
        this.onChanged();
        return this;
    }

    public jv_2 YT() {
        this.an &= 0xFFFFFBFF;
        this.Eb = 0;
        this.onChanged();
        return this;
    }

    private void YU() {
        if ((this.an & 0x800) == 0) {
            this.Ed = new ArrayList<jx_2>(this.Ed);
            this.an |= 0x800;
        }
    }

    @Override
    public List<jx_2> Yq() {
        if (this.Ek == null) {
            return Collections.unmodifiableList(this.Ed);
        }
        return this.Ek.getMessageList();
    }

    @Override
    public int Ys() {
        if (this.Ek == null) {
            return this.Ed.size();
        }
        return this.Ek.getCount();
    }

    @Override
    public jx_2 fO(int n) {
        if (this.Ek == null) {
            return this.Ed.get(n);
        }
        return (jx_2)this.Ek.getMessage(n);
    }

    public jv_2 a(int n, jx_2 jx_22) {
        if (this.Ek == null) {
            if (jx_22 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.set(n, jx_22);
            this.onChanged();
        } else {
            this.Ek.setMessage(n, (AbstractMessage)jx_22);
        }
        return this;
    }

    public jv_2 a(int n, jz_2 jz_22) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.set(n, jz_22.Zt());
            this.onChanged();
        } else {
            this.Ek.setMessage(n, (AbstractMessage)jz_22.Zt());
        }
        return this;
    }

    public jv_2 a(jx_2 jx_22) {
        if (this.Ek == null) {
            if (jx_22 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.add(jx_22);
            this.onChanged();
        } else {
            this.Ek.addMessage((AbstractMessage)jx_22);
        }
        return this;
    }

    public jv_2 b(int n, jx_2 jx_22) {
        if (this.Ek == null) {
            if (jx_22 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.add(n, jx_22);
            this.onChanged();
        } else {
            this.Ek.addMessage(n, (AbstractMessage)jx_22);
        }
        return this;
    }

    public jv_2 a(jz_2 jz_22) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.add(jz_22.Zt());
            this.onChanged();
        } else {
            this.Ek.addMessage((AbstractMessage)jz_22.Zt());
        }
        return this;
    }

    public jv_2 b(int n, jz_2 jz_22) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.add(n, jz_22.Zt());
            this.onChanged();
        } else {
            this.Ek.addMessage(n, (AbstractMessage)jz_22.Zt());
        }
        return this;
    }

    public jv_2 N(Iterable<? extends jx_2> iterable) {
        if (this.Ek == null) {
            this.YU();
            AbstractMessageLite.Builder.addAll(iterable, this.Ed);
            this.onChanged();
        } else {
            this.Ek.addAllMessages(iterable);
        }
        return this;
    }

    public jv_2 YV() {
        if (this.Ek == null) {
            this.Ed = Collections.emptyList();
            this.an &= 0xFFFFF7FF;
            this.onChanged();
        } else {
            this.Ek.clear();
        }
        return this;
    }

    public jv_2 ga(int n) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.remove(n);
            this.onChanged();
        } else {
            this.Ek.remove(n);
        }
        return this;
    }

    public jz_2 gb(int n) {
        return (jz_2)this.YY().getBuilder(n);
    }

    @Override
    public ka_1 fP(int n) {
        if (this.Ek == null) {
            return this.Ed.get(n);
        }
        return (ka_1)this.Ek.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ka_1> Yr() {
        if (this.Ek != null) {
            return this.Ek.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ed);
    }

    public jz_2 YW() {
        return (jz_2)this.YY().addBuilder((AbstractMessage)jx_2.Zp());
    }

    public jz_2 gc(int n) {
        return (jz_2)this.YY().addBuilder(n, (AbstractMessage)jx_2.Zp());
    }

    public List<jz_2> YX() {
        return this.YY().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jx_2, jz_2, ka_1> YY() {
        if (this.Ek == null) {
            this.Ek = new RepeatedFieldBuilderV3(this.Ed, (this.an & 0x800) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ed = null;
        }
        return this.Ek;
    }

    private void YZ() {
        if ((this.an & 0x1000) == 0) {
            this.Ef = new ArrayList<jp_2>(this.Ef);
            this.an |= 0x1000;
        }
    }

    @Override
    public List<jp_2> Yt() {
        if (this.El == null) {
            return Collections.unmodifiableList(this.Ef);
        }
        return this.El.getMessageList();
    }

    @Override
    public int Yv() {
        if (this.El == null) {
            return this.Ef.size();
        }
        return this.El.getCount();
    }

    @Override
    public jp_2 fQ(int n) {
        if (this.El == null) {
            return this.Ef.get(n);
        }
        return (jp_2)this.El.getMessage(n);
    }

    public jv_2 a(int n, jp_2 jp_22) {
        if (this.El == null) {
            if (jp_22 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.set(n, jp_22);
            this.onChanged();
        } else {
            this.El.setMessage(n, (AbstractMessage)jp_22);
        }
        return this;
    }

    public jv_2 a(int n, jr_2 jr_22) {
        if (this.El == null) {
            this.YZ();
            this.Ef.set(n, jr_22.XH());
            this.onChanged();
        } else {
            this.El.setMessage(n, (AbstractMessage)jr_22.XH());
        }
        return this;
    }

    public jv_2 d(jp_2 jp_22) {
        if (this.El == null) {
            if (jp_22 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.add(jp_22);
            this.onChanged();
        } else {
            this.El.addMessage((AbstractMessage)jp_22);
        }
        return this;
    }

    public jv_2 b(int n, jp_2 jp_22) {
        if (this.El == null) {
            if (jp_22 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.add(n, jp_22);
            this.onChanged();
        } else {
            this.El.addMessage(n, (AbstractMessage)jp_22);
        }
        return this;
    }

    public jv_2 a(jr_2 jr_22) {
        if (this.El == null) {
            this.YZ();
            this.Ef.add(jr_22.XH());
            this.onChanged();
        } else {
            this.El.addMessage((AbstractMessage)jr_22.XH());
        }
        return this;
    }

    public jv_2 b(int n, jr_2 jr_22) {
        if (this.El == null) {
            this.YZ();
            this.Ef.add(n, jr_22.XH());
            this.onChanged();
        } else {
            this.El.addMessage(n, (AbstractMessage)jr_22.XH());
        }
        return this;
    }

    public jv_2 O(Iterable<? extends jp_2> iterable) {
        if (this.El == null) {
            this.YZ();
            AbstractMessageLite.Builder.addAll(iterable, this.Ef);
            this.onChanged();
        } else {
            this.El.addAllMessages(iterable);
        }
        return this;
    }

    public jv_2 Za() {
        if (this.El == null) {
            this.Ef = Collections.emptyList();
            this.an &= 0xFFFFEFFF;
            this.onChanged();
        } else {
            this.El.clear();
        }
        return this;
    }

    public jv_2 gd(int n) {
        if (this.El == null) {
            this.YZ();
            this.Ef.remove(n);
            this.onChanged();
        } else {
            this.El.remove(n);
        }
        return this;
    }

    public jr_2 ge(int n) {
        return (jr_2)this.Zd().getBuilder(n);
    }

    @Override
    public js_2 fR(int n) {
        if (this.El == null) {
            return this.Ef.get(n);
        }
        return (js_2)this.El.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends js_2> Yu() {
        if (this.El != null) {
            return this.El.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ef);
    }

    public jr_2 Zb() {
        return (jr_2)this.Zd().addBuilder((AbstractMessage)jp_2.XD());
    }

    public jr_2 gf(int n) {
        return (jr_2)this.Zd().addBuilder(n, (AbstractMessage)jp_2.XD());
    }

    public List<jr_2> Zc() {
        return this.Zd().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jp_2, jr_2, js_2> Zd() {
        if (this.El == null) {
            this.El = new RepeatedFieldBuilderV3(this.Ef, (this.an & 0x1000) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ef = null;
        }
        return this.El;
    }

    private void Ze() {
        if ((this.an & 0x2000) == 0) {
            this.Eh = new ArrayList<jl_2>(this.Eh);
            this.an |= 0x2000;
        }
    }

    @Override
    public List<jl_2> Yw() {
        if (this.Em == null) {
            return Collections.unmodifiableList(this.Eh);
        }
        return this.Em.getMessageList();
    }

    @Override
    public int Yy() {
        if (this.Em == null) {
            return this.Eh.size();
        }
        return this.Em.getCount();
    }

    @Override
    public jl_2 fS(int n) {
        if (this.Em == null) {
            return this.Eh.get(n);
        }
        return (jl_2)this.Em.getMessage(n);
    }

    public jv_2 a(int n, jl_2 jl_22) {
        if (this.Em == null) {
            if (jl_22 == null) {
                throw new NullPointerException();
            }
            this.Ze();
            this.Eh.set(n, jl_22);
            this.onChanged();
        } else {
            this.Em.setMessage(n, (AbstractMessage)jl_22);
        }
        return this;
    }

    public jv_2 a(int n, jn_2 jn_22) {
        if (this.Em == null) {
            this.Ze();
            this.Eh.set(n, jn_22.Xa());
            this.onChanged();
        } else {
            this.Em.setMessage(n, (AbstractMessage)jn_22.Xa());
        }
        return this;
    }

    public jv_2 d(jl_2 jl_22) {
        if (this.Em == null) {
            if (jl_22 == null) {
                throw new NullPointerException();
            }
            this.Ze();
            this.Eh.add(jl_22);
            this.onChanged();
        } else {
            this.Em.addMessage((AbstractMessage)jl_22);
        }
        return this;
    }

    public jv_2 b(int n, jl_2 jl_22) {
        if (this.Em == null) {
            if (jl_22 == null) {
                throw new NullPointerException();
            }
            this.Ze();
            this.Eh.add(n, jl_22);
            this.onChanged();
        } else {
            this.Em.addMessage(n, (AbstractMessage)jl_22);
        }
        return this;
    }

    public jv_2 a(jn_2 jn_22) {
        if (this.Em == null) {
            this.Ze();
            this.Eh.add(jn_22.Xa());
            this.onChanged();
        } else {
            this.Em.addMessage((AbstractMessage)jn_22.Xa());
        }
        return this;
    }

    public jv_2 b(int n, jn_2 jn_22) {
        if (this.Em == null) {
            this.Ze();
            this.Eh.add(n, jn_22.Xa());
            this.onChanged();
        } else {
            this.Em.addMessage(n, (AbstractMessage)jn_22.Xa());
        }
        return this;
    }

    public jv_2 P(Iterable<? extends jl_2> iterable) {
        if (this.Em == null) {
            this.Ze();
            AbstractMessageLite.Builder.addAll(iterable, this.Eh);
            this.onChanged();
        } else {
            this.Em.addAllMessages(iterable);
        }
        return this;
    }

    public jv_2 Zf() {
        if (this.Em == null) {
            this.Eh = Collections.emptyList();
            this.an &= 0xFFFFDFFF;
            this.onChanged();
        } else {
            this.Em.clear();
        }
        return this;
    }

    public jv_2 gg(int n) {
        if (this.Em == null) {
            this.Ze();
            this.Eh.remove(n);
            this.onChanged();
        } else {
            this.Em.remove(n);
        }
        return this;
    }

    public jn_2 gh(int n) {
        return (jn_2)this.Zi().getBuilder(n);
    }

    @Override
    public jo_2 fT(int n) {
        if (this.Em == null) {
            return this.Eh.get(n);
        }
        return (jo_2)this.Em.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jo_2> Yx() {
        if (this.Em != null) {
            return this.Em.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Eh);
    }

    public jn_2 Zg() {
        return (jn_2)this.Zi().addBuilder((AbstractMessage)jl_2.WW());
    }

    public jn_2 gi(int n) {
        return (jn_2)this.Zi().addBuilder(n, (AbstractMessage)jl_2.WW());
    }

    public List<jn_2> Zh() {
        return this.Zi().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jl_2, jn_2, jo_2> Zi() {
        if (this.Em == null) {
            this.Em = new RepeatedFieldBuilderV3(this.Eh, (this.an & 0x2000) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Eh = null;
        }
        return this.Em;
    }

    public final jv_2 dK(UnknownFieldSet unknownFieldSet) {
        return (jv_2)super.setUnknownFields(unknownFieldSet);
    }

    public final jv_2 dL(UnknownFieldSet unknownFieldSet) {
        return (jv_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bs(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bs(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bs(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.YF();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.YI();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ge(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bs(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.YF();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bs(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.YI();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bs(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bs(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bs(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ge(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.YI();
    }

    public /* synthetic */ Message buildPartial() {
        return this.YH();
    }

    public /* synthetic */ Message build() {
        return this.YG();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bs(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.YF();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ge(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.YI();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.YH();
    }

    public /* synthetic */ MessageLite build() {
        return this.YG();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.YF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.YD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.YD();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ge(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.YI();
    }

    public /* synthetic */ Object clone() {
        return this.YI();
    }
}

