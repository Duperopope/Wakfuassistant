/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;

public final class J
extends GeneratedMessageV3.Builder<J>
implements k_0 {
    private Object bs = "";
    private Object bu = "";

    public static final Descriptors.Descriptor cd() {
        return c_0.aN;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aO.ensureFieldAccessorsInitialized(h_0.class, J.class);
    }

    J() {
        this.D();
    }

    J(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (h_0.aJ()) {
            // empty if block
        }
    }

    public J ce() {
        super.clear();
        this.bs = "";
        this.bu = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aN;
    }

    public h_0 cc() {
        return h_0.cb();
    }

    public h_0 cf() {
        h_0 h_02 = this.cg();
        if (!h_02.isInitialized()) {
            throw J.newUninitializedMessageException((Message)h_02);
        }
        return h_02;
    }

    public h_0 cg() {
        h_0 h_02 = new h_0(this);
        h_02.bs = this.bs;
        h_02.bu = this.bu;
        this.onBuilt();
        return h_02;
    }

    public J ch() {
        return (J)super.clone();
    }

    public J m(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (J)super.setField(fieldDescriptor, object);
    }

    public J g(Descriptors.FieldDescriptor fieldDescriptor) {
        return (J)super.clearField(fieldDescriptor);
    }

    public J g(Descriptors.OneofDescriptor oneofDescriptor) {
        return (J)super.clearOneof(oneofDescriptor);
    }

    public J g(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (J)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public J n(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (J)super.addRepeatedField(fieldDescriptor, object);
    }

    public J g(Message message) {
        if (message instanceof h_0) {
            return this.e((h_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public J e(h_0 h_02) {
        if (h_02 == h_0.cb()) {
            return this;
        }
        if (!h_02.getName().isEmpty()) {
            this.bs = h_02.bs;
            this.onChanged();
        }
        if (!h_02.getTag().isEmpty()) {
            this.bu = h_02.bu;
            this.onChanged();
        }
        this.n(h_0.d(h_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public J u(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        h_0 h_02 = null;
        try {
            h_02 = (h_0)h_0.bw.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            h_02 = (h_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (h_02 != null) {
                this.e(h_02);
            }
        }
        return this;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.bs = string;
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

    public J j(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bs = string;
        this.onChanged();
        return this;
    }

    public J ci() {
        this.bs = h_0.cb().getName();
        this.onChanged();
        return this;
    }

    public J y(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        h_0.k(byteString);
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String getTag() {
        Object object = this.bu;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.bu = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bX() {
        Object object = this.bu;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bu = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public J k(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bu = string;
        this.onChanged();
        return this;
    }

    public J cj() {
        this.bu = h_0.cb().getTag();
        this.onChanged();
        return this;
    }

    public J z(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        h_0.l(byteString);
        this.bu = byteString;
        this.onChanged();
        return this;
    }

    public final J m(UnknownFieldSet unknownFieldSet) {
        return (J)super.setUnknownFields(unknownFieldSet);
    }

    public final J n(UnknownFieldSet unknownFieldSet) {
        return (J)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.n(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.m(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.n(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.g(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.g(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.g(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.m(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ce();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ch();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.n(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.u(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.g(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ce();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.g(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ch();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.n(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.m(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.n(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.g(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.g(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.g(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.m(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.u(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ch();
    }

    public /* synthetic */ Message buildPartial() {
        return this.cg();
    }

    public /* synthetic */ Message build() {
        return this.cf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.g(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ce();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.u(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ch();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.cg();
    }

    public /* synthetic */ MessageLite build() {
        return this.cf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ce();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.u(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ch();
    }

    public /* synthetic */ Object clone() {
        return this.ch();
    }
}

