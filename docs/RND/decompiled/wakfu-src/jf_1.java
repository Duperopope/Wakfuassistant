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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jf
 */
public final class jf_1
extends GeneratedMessageV3.Builder<jf_1>
implements jg_1 {
    private int an;
    private long AH;
    private long nW;
    private Object bs = "";
    private int oq;
    private boolean Ba;
    private boolean Bc;
    private List<iv_2> AM = Collections.emptyList();
    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> AS;
    private jx_1 AO;
    private SingleFieldBuilderV3<jx_1, jz_1, ja_1> AT;
    private int Bg;
    private boolean Bi;

    public static final Descriptors.Descriptor Tg() {
        return iu_2.Ak;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Al.ensureFieldAccessorsInitialized(jd_1.class, jf_1.class);
    }

    jf_1() {
        this.D();
    }

    jf_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jd_1.el()) {
            this.SN();
            this.SQ();
        }
    }

    public jf_1 Th() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.an &= 0xFFFFFFFD;
        this.bs = "";
        this.an &= 0xFFFFFFFB;
        this.oq = 0;
        this.an &= 0xFFFFFFF7;
        this.Ba = false;
        this.an &= 0xFFFFFFEF;
        this.Bc = false;
        this.an &= 0xFFFFFFDF;
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFBF;
        } else {
            this.AS.clear();
        }
        if (this.AT == null) {
            this.AO = null;
        } else {
            this.AT.clear();
        }
        this.an &= 0xFFFFFF7F;
        this.Bg = 0;
        this.an &= 0xFFFFFEFF;
        this.Bi = false;
        this.an &= 0xFFFFFDFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Ak;
    }

    public jd_1 Tf() {
        return jd_1.Te();
    }

    public jd_1 Ti() {
        jd_1 jd_12 = this.Tj();
        if (!jd_12.isInitialized()) {
            throw jf_1.newUninitializedMessageException((Message)jd_12);
        }
        return jd_12;
    }

    public jd_1 Tj() {
        jd_1 jd_12 = new jd_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jd_12.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jd_12.nW = this.nW;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        jd_12.bs = this.bs;
        if ((n & 8) != 0) {
            jd_12.oq = this.oq;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            jd_12.Ba = this.Ba;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            jd_12.Bc = this.Bc;
            n2 |= 0x20;
        }
        if (this.AS == null) {
            if ((this.an & 0x40) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
                this.an &= 0xFFFFFFBF;
            }
            jd_12.AM = this.AM;
        } else {
            jd_12.AM = this.AS.build();
        }
        if ((n & 0x80) != 0) {
            jd_12.AO = this.AT == null ? this.AO : (jx_1)this.AT.build();
            n2 |= 0x40;
        }
        if ((n & 0x100) != 0) {
            jd_12.Bg = this.Bg;
            n2 |= 0x80;
        }
        if ((n & 0x200) != 0) {
            jd_12.Bi = this.Bi;
            n2 |= 0x100;
        }
        jd_12.an = n2;
        this.onBuilt();
        return jd_12;
    }

    public jf_1 Tk() {
        return (jf_1)super.clone();
    }

    public jf_1 dq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jf_1)super.setField(fieldDescriptor, object);
    }

    public jf_1 bi(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jf_1)super.clearField(fieldDescriptor);
    }

    public jf_1 bi(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jf_1)super.clearOneof(oneofDescriptor);
    }

    public jf_1 bi(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jf_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jf_1 dr(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jf_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jf_1 bi(Message message) {
        if (message instanceof jd_1) {
            return this.c((jd_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jf_1 c(jd_1 jd_12) {
        if (jd_12 == jd_1.Te()) {
            return this;
        }
        if (jd_12.oN()) {
            this.at(jd_12.Sn());
        }
        if (jd_12.xk()) {
            this.au(jd_12.xl());
        }
        if (jd_12.wq()) {
            this.an |= 4;
            this.bs = jd_12.bs;
            this.onChanged();
        }
        if (jd_12.xS()) {
            this.eZ(jd_12.xT());
        }
        if (jd_12.ST()) {
            this.K(jd_12.SU());
        }
        if (jd_12.SV()) {
            this.L(jd_12.SW());
        }
        if (this.AS == null) {
            if (!jd_12.AM.isEmpty()) {
                if (this.AM.isEmpty()) {
                    this.AM = jd_12.AM;
                    this.an &= 0xFFFFFFBF;
                } else {
                    this.SJ();
                    this.AM.addAll(jd_12.AM);
                }
                this.onChanged();
            }
        } else if (!jd_12.AM.isEmpty()) {
            if (this.AS.isEmpty()) {
                this.AS.dispose();
                this.AS = null;
                this.AM = jd_12.AM;
                this.an &= 0xFFFFFFBF;
                this.AS = jd_1.cs() ? this.SN() : null;
            } else {
                this.AS.addAllMessages(jd_12.AM);
            }
        }
        if (jd_12.St()) {
            this.d(jd_12.Su());
        }
        if (jd_12.SX()) {
            this.fb(jd_12.SY());
        }
        if (jd_12.SZ()) {
            this.M(jd_12.Ta());
        }
        this.dr(jd_1.b(jd_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.xk()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.xS()) {
            return false;
        }
        if (!this.ST()) {
            return false;
        }
        if (!this.SV()) {
            return false;
        }
        for (int i = 0; i < this.Ss(); ++i) {
            if (this.eS(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jf_1 fA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jd_1 jd_12 = null;
        try {
            jd_12 = (jd_1)jd_1.Bk.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jd_12 = (jd_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jd_12 != null) {
                this.c(jd_12);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public jf_1 at(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public jf_1 Tl() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public jf_1 au(long l) {
        this.an |= 2;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public jf_1 Tm() {
        this.an &= 0xFFFFFFFD;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
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

    public jf_1 H(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public jf_1 Tn() {
        this.an &= 0xFFFFFFFB;
        this.bs = jd_1.Te().getName();
        this.onChanged();
        return this;
    }

    public jf_1 cf(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 8) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public jf_1 eZ(int n) {
        this.an |= 8;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public jf_1 To() {
        this.an &= 0xFFFFFFF7;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ST() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean SU() {
        return this.Ba;
    }

    public jf_1 K(boolean bl) {
        this.an |= 0x10;
        this.Ba = bl;
        this.onChanged();
        return this;
    }

    public jf_1 Tp() {
        this.an &= 0xFFFFFFEF;
        this.Ba = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean SV() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean SW() {
        return this.Bc;
    }

    public jf_1 L(boolean bl) {
        this.an |= 0x20;
        this.Bc = bl;
        this.onChanged();
        return this;
    }

    public jf_1 Tq() {
        this.an &= 0xFFFFFFDF;
        this.Bc = false;
        this.onChanged();
        return this;
    }

    private void SJ() {
        if ((this.an & 0x40) == 0) {
            this.AM = new ArrayList<iv_2>(this.AM);
            this.an |= 0x40;
        }
    }

    @Override
    public List<iv_2> Sq() {
        if (this.AS == null) {
            return Collections.unmodifiableList(this.AM);
        }
        return this.AS.getMessageList();
    }

    @Override
    public int Ss() {
        if (this.AS == null) {
            return this.AM.size();
        }
        return this.AS.getCount();
    }

    @Override
    public iv_2 eS(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iv_2)this.AS.getMessage(n);
    }

    public jf_1 c(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.set(n, iv_22);
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public jf_1 c(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.set(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jf_1 e(iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)iv_22);
        }
        return this;
    }

    public jf_1 d(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(n, iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public jf_1 b(ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jf_1 d(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jf_1 H(Iterable<? extends iv_2> iterable) {
        if (this.AS == null) {
            this.SJ();
            AbstractMessageLite.Builder.addAll(iterable, this.AM);
            this.onChanged();
        } else {
            this.AS.addAllMessages(iterable);
        }
        return this;
    }

    public jf_1 Tr() {
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFBF;
            this.onChanged();
        } else {
            this.AS.clear();
        }
        return this;
    }

    public jf_1 fa(int n) {
        if (this.AS == null) {
            this.SJ();
            this.AM.remove(n);
            this.onChanged();
        } else {
            this.AS.remove(n);
        }
        return this;
    }

    public ix_2 eW(int n) {
        return (ix_2)this.SN().getBuilder(n);
    }

    @Override
    public iy_2 eT(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iy_2)this.AS.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends iy_2> Sr() {
        if (this.AS != null) {
            return this.AS.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.AM);
    }

    public ix_2 SL() {
        return (ix_2)this.SN().addBuilder((AbstractMessage)iv_2.Sb());
    }

    public ix_2 eX(int n) {
        return (ix_2)this.SN().addBuilder(n, (AbstractMessage)iv_2.Sb());
    }

    public List<ix_2> SM() {
        return this.SN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> SN() {
        if (this.AS == null) {
            this.AS = new RepeatedFieldBuilderV3(this.AM, (this.an & 0x40) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.AM = null;
        }
        return this.AS;
    }

    @Override
    public boolean St() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public jx_1 Su() {
        if (this.AT == null) {
            return this.AO == null ? jx_1.Wb() : this.AO;
        }
        return (jx_1)this.AT.getMessage();
    }

    public jf_1 c(jx_1 jx_12) {
        if (this.AT == null) {
            if (jx_12 == null) {
                throw new NullPointerException();
            }
            this.AO = jx_12;
            this.onChanged();
        } else {
            this.AT.setMessage((AbstractMessage)jx_12);
        }
        this.an |= 0x80;
        return this;
    }

    public jf_1 b(jz_1 jz_12) {
        if (this.AT == null) {
            this.AO = jz_12.Wf();
            this.onChanged();
        } else {
            this.AT.setMessage((AbstractMessage)jz_12.Wf());
        }
        this.an |= 0x80;
        return this;
    }

    public jf_1 d(jx_1 jx_12) {
        if (this.AT == null) {
            this.AO = (this.an & 0x80) != 0 && this.AO != null && this.AO != jx_1.Wb() ? jx_1.e(this.AO).g(jx_12).Wg() : jx_12;
            this.onChanged();
        } else {
            this.AT.mergeFrom((AbstractMessage)jx_12);
        }
        this.an |= 0x80;
        return this;
    }

    public jf_1 Ts() {
        if (this.AT == null) {
            this.AO = null;
            this.onChanged();
        } else {
            this.AT.clear();
        }
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public jz_1 SP() {
        this.an |= 0x80;
        this.onChanged();
        return (jz_1)this.SQ().getBuilder();
    }

    @Override
    public ja_1 Sv() {
        if (this.AT != null) {
            return (ja_1)this.AT.getMessageOrBuilder();
        }
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    private SingleFieldBuilderV3<jx_1, jz_1, ja_1> SQ() {
        if (this.AT == null) {
            this.AT = new SingleFieldBuilderV3((AbstractMessage)this.Su(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.AO = null;
        }
        return this.AT;
    }

    @Override
    public boolean SX() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int SY() {
        return this.Bg;
    }

    public jf_1 fb(int n) {
        this.an |= 0x100;
        this.Bg = n;
        this.onChanged();
        return this;
    }

    public jf_1 Tt() {
        this.an &= 0xFFFFFEFF;
        this.Bg = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean SZ() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public boolean Ta() {
        return this.Bi;
    }

    public jf_1 M(boolean bl) {
        this.an |= 0x200;
        this.Bi = bl;
        this.onChanged();
        return this;
    }

    public jf_1 Tu() {
        this.an &= 0xFFFFFDFF;
        this.Bi = false;
        this.onChanged();
        return this;
    }

    public final jf_1 dq(UnknownFieldSet unknownFieldSet) {
        return (jf_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jf_1 dr(UnknownFieldSet unknownFieldSet) {
        return (jf_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dr(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dr(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bi(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bi(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bi(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Th();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Tk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dr(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bi(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Th();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bi(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Tk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dr(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dr(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bi(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bi(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bi(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Tk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Tj();
    }

    public /* synthetic */ Message build() {
        return this.Ti();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bi(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Th();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Tk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Tj();
    }

    public /* synthetic */ MessageLite build() {
        return this.Ti();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Th();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Tf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Tf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Tk();
    }

    public /* synthetic */ Object clone() {
        return this.Tk();
    }
}

