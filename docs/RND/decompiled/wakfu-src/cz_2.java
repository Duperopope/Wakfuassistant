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
 * Renamed from cz
 */
public final class cz_2
extends GeneratedMessageV3.Builder<cz_2>
implements ca_2 {
    private long fG;
    private Object bs = "";

    public static final Descriptors.Descriptor na() {
        return ae_1.fi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fj.ensureFieldAccessorsInitialized(cx_2.class, cz_2.class);
    }

    cz_2() {
        this.D();
    }

    cz_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cx_2.mZ()) {
            // empty if block
        }
    }

    public cz_2 nb() {
        super.clear();
        this.fG = 0L;
        this.bs = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fi;
    }

    public cx_2 mY() {
        return cx_2.mX();
    }

    public cx_2 nc() {
        cx_2 cx_22 = this.nd();
        if (!cx_22.isInitialized()) {
            throw cz_2.newUninitializedMessageException((Message)cx_22);
        }
        return cx_22;
    }

    public cx_2 nd() {
        cx_2 cx_22 = new cx_2(this);
        cx_22.fG = this.fG;
        cx_22.bs = this.bs;
        this.onBuilt();
        return cx_22;
    }

    public cz_2 ne() {
        return (cz_2)super.clone();
    }

    public cz_2 aC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cz_2)super.setField(fieldDescriptor, object);
    }

    public cz_2 O(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cz_2)super.clearField(fieldDescriptor);
    }

    public cz_2 O(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cz_2)super.clearOneof(oneofDescriptor);
    }

    public cz_2 O(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cz_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cz_2 aD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cz_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cz_2 O(Message message) {
        if (message instanceof cx_2) {
            return this.c((cx_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cz_2 c(cx_2 cx_22) {
        if (cx_22 == cx_2.mX()) {
            return this;
        }
        if (cx_22.fD() != 0L) {
            this.F(cx_22.fD());
        }
        if (!cx_22.getName().isEmpty()) {
            this.bs = cx_22.bs;
            this.onChanged();
        }
        this.aD(cx_2.b(cx_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cz_2 bs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cx_2 cx_22 = null;
        try {
            cx_22 = (cx_2)cx_2.io.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cx_22 = (cx_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cx_22 != null) {
                this.c(cx_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cz_2 F(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cz_2 nf() {
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

    public cz_2 v(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.bs = string;
        this.onChanged();
        return this;
    }

    public cz_2 ng() {
        this.bs = cx_2.mX().getName();
        this.onChanged();
        return this;
    }

    public cz_2 aw(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        cx_2.av(byteString);
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    public final cz_2 aC(UnknownFieldSet unknownFieldSet) {
        return (cz_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cz_2 aD(UnknownFieldSet unknownFieldSet) {
        return (cz_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.O(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.O(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.O(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.nb();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ne();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.O(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.nb();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.O(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ne();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.O(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.O(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.O(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ne();
    }

    public /* synthetic */ Message buildPartial() {
        return this.nd();
    }

    public /* synthetic */ Message build() {
        return this.nc();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.O(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.nb();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ne();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.nd();
    }

    public /* synthetic */ MessageLite build() {
        return this.nc();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.nb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mY();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mY();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ne();
    }

    public /* synthetic */ Object clone() {
        return this.ne();
    }
}

