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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from X
 */
public final class x_0
extends GeneratedMessageV3.Builder<x_0>
implements Y {
    private S cb;
    private SingleFieldBuilderV3<S, u_0, ah_2> ce;

    public static final Descriptors.Descriptor dl() {
        return c_0.aR;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aS.ensureFieldAccessorsInitialized(V.class, x_0.class);
    }

    x_0() {
        this.D();
    }

    x_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (V.Y()) {
            // empty if block
        }
    }

    public x_0 dm() {
        super.clear();
        if (this.ce == null) {
            this.cb = null;
        } else {
            this.cb = null;
            this.ce = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aR;
    }

    public V dk() {
        return V.dj();
    }

    public V dn() {
        V v = this.do();
        if (!v.isInitialized()) {
            throw x_0.newUninitializedMessageException((Message)v);
        }
        return v;
    }

    public V do() {
        V v = new V(this);
        v.cb = this.ce == null ? this.cb : (S)this.ce.build();
        this.onBuilt();
        return v;
    }

    public x_0 dp() {
        return (x_0)super.clone();
    }

    public x_0 s(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (x_0)super.setField(fieldDescriptor, object);
    }

    public x_0 j(Descriptors.FieldDescriptor fieldDescriptor) {
        return (x_0)super.clearField(fieldDescriptor);
    }

    public x_0 j(Descriptors.OneofDescriptor oneofDescriptor) {
        return (x_0)super.clearOneof(oneofDescriptor);
    }

    public x_0 j(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (x_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public x_0 t(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (x_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public x_0 j(Message message) {
        if (message instanceof V) {
            return this.c((V)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public x_0 c(V v) {
        if (v == V.dj()) {
            return this;
        }
        if (v.dd()) {
            this.e(v.de());
        }
        this.t(V.b(v));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public x_0 D(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        V v = null;
        try {
            v = (V)V.cd.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            v = (V)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (v != null) {
                this.c(v);
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

    public x_0 d(S s) {
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

    public x_0 a(u_0 u_02) {
        if (this.ce == null) {
            this.cb = u_02.cT();
            this.onChanged();
        } else {
            this.ce.setMessage((AbstractMessage)u_02.cT());
        }
        return this;
    }

    public x_0 e(S s) {
        if (this.ce == null) {
            this.cb = this.cb != null ? S.a(this.cb).c(s).cU() : s;
            this.onChanged();
        } else {
            this.ce.mergeFrom((AbstractMessage)s);
        }
        return this;
    }

    public x_0 dq() {
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

    public final x_0 s(UnknownFieldSet unknownFieldSet) {
        return (x_0)super.setUnknownFields(unknownFieldSet);
    }

    public final x_0 t(UnknownFieldSet unknownFieldSet) {
        return (x_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.t(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.s(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.t(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.j(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.j(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.j(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.s(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.dm();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.dp();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.t(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.D(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.j(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.dm();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.j(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.dp();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.t(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.s(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.t(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.j(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.j(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.j(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.s(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.D(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.dp();
    }

    public /* synthetic */ Message buildPartial() {
        return this.do();
    }

    public /* synthetic */ Message build() {
        return this.dn();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.j(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.dm();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.D(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.dp();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.do();
    }

    public /* synthetic */ MessageLite build() {
        return this.dn();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.dm();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dk();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dk();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.D(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.dp();
    }

    public /* synthetic */ Object clone() {
        return this.dp();
    }
}

