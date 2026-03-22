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
 * Renamed from aX
 */
public final class ax_2
extends GeneratedMessageV3.Builder<ax_2>
implements ay_2 {
    private long fG;
    private Object bs = "";

    public static final Descriptors.Descriptor gU() {
        return ae_1.eM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eN.ensureFieldAccessorsInitialized(av_2.class, ax_2.class);
    }

    ax_2() {
        this.D();
    }

    ax_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (av_2.aq()) {
            // empty if block
        }
    }

    public ax_2 gV() {
        super.clear();
        this.fG = 0L;
        this.bs = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eM;
    }

    public av_2 gT() {
        return av_2.gS();
    }

    public av_2 gW() {
        av_2 av_22 = this.gX();
        if (!av_22.isInitialized()) {
            throw ax_2.newUninitializedMessageException((Message)av_22);
        }
        return av_22;
    }

    public av_2 gX() {
        av_2 av_22 = new av_2(this);
        av_22.fG = this.fG;
        av_22.bs = this.bs;
        this.onBuilt();
        return av_22;
    }

    public ax_2 gY() {
        return (ax_2)super.clone();
    }

    public ax_2 O(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ax_2)super.setField(fieldDescriptor, object);
    }

    public ax_2 u(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ax_2)super.clearField(fieldDescriptor);
    }

    public ax_2 u(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ax_2)super.clearOneof(oneofDescriptor);
    }

    public ax_2 u(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ax_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ax_2 P(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ax_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ax_2 u(Message message) {
        if (message instanceof av_2) {
            return this.c((av_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ax_2 c(av_2 av_22) {
        if (av_22 == av_2.gS()) {
            return this;
        }
        if (av_22.fD() != 0L) {
            this.o(av_22.fD());
        }
        if (!av_22.getName().isEmpty()) {
            this.bs = av_22.bs;
            this.onChanged();
        }
        this.P(av_2.b(av_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ax_2 ak(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        av_2 av_22 = null;
        try {
            av_22 = (av_2)av_2.gh.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            av_22 = (av_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (av_22 != null) {
                this.c(av_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public ax_2 o(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public ax_2 gZ() {
        this.fG = 0L;
        this.onChanged();
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

    public ax_2 m(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bs = string;
        this.onChanged();
        return this;
    }

    public ax_2 ha() {
        this.bs = av_2.gS().getName();
        this.onChanged();
        return this;
    }

    public ax_2 Q(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        av_2.P(byteString);
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    public final ax_2 O(UnknownFieldSet unknownFieldSet) {
        return (ax_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ax_2 P(UnknownFieldSet unknownFieldSet) {
        return (ax_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.P(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.O(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.P(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.u(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.u(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.u(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.O(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.gV();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.gY();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.P(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ak(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.u(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.gV();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.u(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.gY();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.P(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.O(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.P(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.u(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.u(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.u(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.O(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ak(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.gY();
    }

    public /* synthetic */ Message buildPartial() {
        return this.gX();
    }

    public /* synthetic */ Message build() {
        return this.gW();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.u(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.gV();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ak(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.gY();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.gX();
    }

    public /* synthetic */ MessageLite build() {
        return this.gW();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.gV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gT();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ak(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.gY();
    }

    public /* synthetic */ Object clone() {
        return this.gY();
    }
}

