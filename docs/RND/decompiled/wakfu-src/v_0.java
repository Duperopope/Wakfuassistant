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

/*
 * Renamed from v
 */
public final class v_0
extends GeneratedMessageV3.Builder<v_0>
implements w {
    private Object R = "";
    private long as;
    private Object V = "";

    public static final Descriptors.Descriptor aK() {
        return g_0.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.D.ensureFieldAccessorsInitialized(t_0.class, v_0.class);
    }

    v_0() {
        this.D();
    }

    v_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (t_0.aJ()) {
            // empty if block
        }
    }

    public v_0 aL() {
        super.clear();
        this.R = "";
        this.as = 0L;
        this.V = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.C;
    }

    public t_0 aI() {
        return t_0.aH();
    }

    public t_0 aM() {
        t_0 t_02 = this.aN();
        if (!t_02.isInitialized()) {
            throw v_0.newUninitializedMessageException((Message)t_02);
        }
        return t_02;
    }

    public t_0 aN() {
        t_0 t_02 = new t_0(this);
        t_02.R = this.R;
        t_02.as = this.as;
        t_02.V = this.V;
        this.onBuilt();
        return t_02;
    }

    public v_0 aO() {
        return (v_0)super.clone();
    }

    public v_0 g(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (v_0)super.setField(fieldDescriptor, object);
    }

    public v_0 d(Descriptors.FieldDescriptor fieldDescriptor) {
        return (v_0)super.clearField(fieldDescriptor);
    }

    public v_0 d(Descriptors.OneofDescriptor oneofDescriptor) {
        return (v_0)super.clearOneof(oneofDescriptor);
    }

    public v_0 d(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (v_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public v_0 h(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (v_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public v_0 d(Message message) {
        if (message instanceof t_0) {
            return this.c((t_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public v_0 c(t_0 t_02) {
        if (t_02 == t_0.aH()) {
            return this;
        }
        if (!t_02.n().isEmpty()) {
            this.R = t_02.R;
            this.onChanged();
        }
        if (t_02.aD() != 0L) {
            this.b(t_02.aD());
        }
        if (!t_02.q().isEmpty()) {
            this.V = t_02.V;
            this.onChanged();
        }
        this.h(t_0.b(t_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public v_0 l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        t_0 t_02 = null;
        try {
            t_02 = (t_0)t_0.av.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            t_02 = (t_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (t_02 != null) {
                this.c(t_02);
            }
        }
        return this;
    }

    @Override
    public String n() {
        Object object = this.R;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.R = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString o() {
        Object object = this.R;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.R = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public v_0 d(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.R = string;
        this.onChanged();
        return this;
    }

    public v_0 aP() {
        this.R = t_0.aH().n();
        this.onChanged();
        return this;
    }

    public v_0 m(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        t_0.k(byteString);
        this.R = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public long aD() {
        return this.as;
    }

    public v_0 b(long l) {
        this.as = l;
        this.onChanged();
        return this;
    }

    public v_0 aQ() {
        this.as = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public String q() {
        Object object = this.V;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.V = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString r() {
        Object object = this.V;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.V = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public v_0 e(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.V = string;
        this.onChanged();
        return this;
    }

    public v_0 aR() {
        this.V = t_0.aH().q();
        this.onChanged();
        return this;
    }

    public v_0 n(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        t_0.l(byteString);
        this.V = byteString;
        this.onChanged();
        return this;
    }

    public final v_0 g(UnknownFieldSet unknownFieldSet) {
        return (v_0)super.setUnknownFields(unknownFieldSet);
    }

    public final v_0 h(UnknownFieldSet unknownFieldSet) {
        return (v_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.h(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.g(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.h(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.d(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.d(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.d(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.g(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aL();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aO();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.h(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.l(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.d(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aL();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.d(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aO();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.h(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.g(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.h(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.d(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.d(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.d(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.g(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.l(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aO();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aN();
    }

    public /* synthetic */ Message build() {
        return this.aM();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.d(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aL();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.l(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aO();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aN();
    }

    public /* synthetic */ MessageLite build() {
        return this.aM();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aI();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.l(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aO();
    }

    public /* synthetic */ Object clone() {
        return this.aO();
    }
}

