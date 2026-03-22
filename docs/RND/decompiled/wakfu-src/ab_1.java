/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from ab
 */
public final class ab_1
extends GeneratedMessageV3.Builder<ab_1>
implements ac_2 {
    private S cb;
    private SingleFieldBuilderV3<S, u_0, ah_2> ce;
    private int bC = 0;

    public static final Descriptors.Descriptor dz() {
        return c_0.aT;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aU.ensureFieldAccessorsInitialized(Z.class, ab_1.class);
    }

    ab_1() {
        this.D();
    }

    ab_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (Z.B()) {
            // empty if block
        }
    }

    public ab_1 dA() {
        super.clear();
        if (this.ce == null) {
            this.cb = null;
        } else {
            this.cb = null;
            this.ce = null;
        }
        this.bC = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aT;
    }

    public Z dy() {
        return Z.dx();
    }

    public Z dB() {
        Z z = this.dC();
        if (!z.isInitialized()) {
            throw ab_1.newUninitializedMessageException((Message)z);
        }
        return z;
    }

    public Z dC() {
        Z z = new Z(this);
        z.cb = this.ce == null ? this.cb : (S)this.ce.build();
        z.bC = this.bC;
        this.onBuilt();
        return z;
    }

    public ab_1 dD() {
        return (ab_1)super.clone();
    }

    public ab_1 u(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_1)super.setField(fieldDescriptor, object);
    }

    public ab_1 k(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ab_1)super.clearField(fieldDescriptor);
    }

    public ab_1 k(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ab_1)super.clearOneof(oneofDescriptor);
    }

    public ab_1 k(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ab_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ab_1 v(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ab_1 k(Message message) {
        if (message instanceof Z) {
            return this.c((Z)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ab_1 c(Z z) {
        if (z == Z.dx()) {
            return this;
        }
        if (z.dd()) {
            this.g(z.de());
        }
        if (z.bC != 0) {
            this.o(z.cl());
        }
        this.v(Z.b(z));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ab_1 G(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Z z = null;
        try {
            z = (Z)Z.cj.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            z = (Z)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (z != null) {
                this.c(z);
            }
        }
        return this;
    }

    @Override
    public boolean dd() {
        return this.ce != null || this.cb != null;
    }

    @Override
    public S de() {
        if (this.ce == null) {
            return this.cb == null ? S.cO() : this.cb;
        }
        return (S)this.ce.getMessage();
    }

    public ab_1 f(S s) {
        if (this.ce == null) {
            if (s == null) {
                throw new NullPointerException();
            }
            this.cb = s;
            this.onChanged();
        } else {
            this.ce.setMessage((AbstractMessage)s);
        }
        return this;
    }

    public ab_1 b(u_0 u_02) {
        if (this.ce == null) {
            this.cb = u_02.cT();
            this.onChanged();
        } else {
            this.ce.setMessage((AbstractMessage)u_02.cT());
        }
        return this;
    }

    public ab_1 g(S s) {
        if (this.ce == null) {
            this.cb = this.cb != null ? S.a(this.cb).c(s).cU() : s;
            this.onChanged();
        } else {
            this.ce.mergeFrom((AbstractMessage)s);
        }
        return this;
    }

    public ab_1 dE() {
        if (this.ce == null) {
            this.cb = null;
            this.onChanged();
        } else {
            this.cb = null;
            this.ce = null;
        }
        return this;
    }

    public u_0 dr() {
        this.onChanged();
        return (u_0)this.ds().getBuilder();
    }

    @Override
    public ah_2 df() {
        if (this.ce != null) {
            return (ah_2)this.ce.getMessageOrBuilder();
        }
        return this.cb == null ? S.cO() : this.cb;
    }

    private SingleFieldBuilderV3<S, u_0, ah_2> ds() {
        if (this.ce == null) {
            this.ce = new SingleFieldBuilderV3((AbstractMessage)this.de(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.cb = null;
        }
        return this.ce;
    }

    @Override
    public int cl() {
        return this.bC;
    }

    public ab_1 o(int n) {
        this.bC = n;
        this.onChanged();
        return this;
    }

    @Override
    public p_0 cm() {
        p_0 p_02 = p_0.l(this.bC);
        return p_02 == null ? p_0.bI : p_02;
    }

    public ab_1 b(p_0 p_02) {
        if (p_02 == null) {
            throw new NullPointerException();
        }
        this.bC = p_02.getNumber();
        this.onChanged();
        return this;
    }

    public ab_1 dF() {
        this.bC = 0;
        this.onChanged();
        return this;
    }

    public final ab_1 u(UnknownFieldSet unknownFieldSet) {
        return (ab_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ab_1 v(UnknownFieldSet unknownFieldSet) {
        return (ab_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.v(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.u(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.v(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.k(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.k(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.k(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.u(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.dA();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.dD();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.v(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.G(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.k(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.dA();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.k(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.dD();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.v(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.u(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.v(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.k(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.k(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.k(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.u(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.G(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.dD();
    }

    public /* synthetic */ Message buildPartial() {
        return this.dC();
    }

    public /* synthetic */ Message build() {
        return this.dB();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.k(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.dA();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.G(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.dD();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.dC();
    }

    public /* synthetic */ MessageLite build() {
        return this.dB();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.dA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dy();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dy();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.G(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.dD();
    }

    public /* synthetic */ Object clone() {
        return this.dD();
    }
}

