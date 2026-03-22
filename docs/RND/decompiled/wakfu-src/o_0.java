/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from O
 */
public final class o_0
extends GeneratedMessageV3.Builder<o_0>
implements R {
    private long bd;
    private long bA;
    private int bC = 0;

    public static final Descriptors.Descriptor ct() {
        return c_0.aP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aQ.ensureFieldAccessorsInitialized(M.class, o_0.class);
    }

    o_0() {
        this.D();
    }

    o_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (M.cs()) {
            // empty if block
        }
    }

    public o_0 cu() {
        super.clear();
        this.bd = 0L;
        this.bA = 0L;
        this.bC = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aP;
    }

    public M cr() {
        return M.cq();
    }

    public M cv() {
        M m = this.cw();
        if (!m.isInitialized()) {
            throw o_0.newUninitializedMessageException((Message)m);
        }
        return m;
    }

    public M cw() {
        M m = new M(this);
        m.bd = this.bd;
        m.bA = this.bA;
        m.bC = this.bC;
        this.onBuilt();
        return m;
    }

    public o_0 cx() {
        return (o_0)super.clone();
    }

    public o_0 o(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (o_0)super.setField(fieldDescriptor, object);
    }

    public o_0 h(Descriptors.FieldDescriptor fieldDescriptor) {
        return (o_0)super.clearField(fieldDescriptor);
    }

    public o_0 h(Descriptors.OneofDescriptor oneofDescriptor) {
        return (o_0)super.clearOneof(oneofDescriptor);
    }

    public o_0 h(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (o_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public o_0 p(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (o_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public o_0 h(Message message) {
        if (message instanceof M) {
            return this.c((M)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public o_0 c(M m) {
        if (m == M.cq()) {
            return this;
        }
        if (m.bu() != 0L) {
            this.e(m.bu());
        }
        if (m.bw() != 0L) {
            this.f(m.bw());
        }
        if (m.bC != 0) {
            this.k(m.cl());
        }
        this.p(M.b(m));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public o_0 x(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        M m = null;
        try {
            m = (M)M.bE.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            m = (M)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (m != null) {
                this.c(m);
            }
        }
        return this;
    }

    @Override
    public long bu() {
        return this.bd;
    }

    public o_0 e(long l) {
        this.bd = l;
        this.onChanged();
        return this;
    }

    public o_0 cy() {
        this.bd = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long bw() {
        return this.bA;
    }

    public o_0 f(long l) {
        this.bA = l;
        this.onChanged();
        return this;
    }

    public o_0 cz() {
        this.bA = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int cl() {
        return this.bC;
    }

    public o_0 k(int n) {
        this.bC = n;
        this.onChanged();
        return this;
    }

    @Override
    public p_0 cm() {
        p_0 p_02 = p_0.l(this.bC);
        return p_02 == null ? p_0.bI : p_02;
    }

    public o_0 a(p_0 p_02) {
        if (p_02 == null) {
            throw new NullPointerException();
        }
        this.bC = p_02.getNumber();
        this.onChanged();
        return this;
    }

    public o_0 cA() {
        this.bC = 0;
        this.onChanged();
        return this;
    }

    public final o_0 o(UnknownFieldSet unknownFieldSet) {
        return (o_0)super.setUnknownFields(unknownFieldSet);
    }

    public final o_0 p(UnknownFieldSet unknownFieldSet) {
        return (o_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.p(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.o(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.p(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.h(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.h(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.h(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.o(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.cu();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.cx();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.p(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.x(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.h(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.cu();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.h(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.cx();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.p(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.o(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.p(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.h(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.h(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.h(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.o(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.x(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.cx();
    }

    public /* synthetic */ Message buildPartial() {
        return this.cw();
    }

    public /* synthetic */ Message build() {
        return this.cv();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.h(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.cu();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.x(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.cx();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.cw();
    }

    public /* synthetic */ MessageLite build() {
        return this.cv();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.cu();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cr();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.x(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.cx();
    }

    public /* synthetic */ Object clone() {
        return this.cx();
    }
}

