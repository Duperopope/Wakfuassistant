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
 * Renamed from ar
 */
public final class ar_2
extends GeneratedMessageV3.Builder<ar_2>
implements as_2 {
    private int dL;
    private ByteString dN = ByteString.EMPTY;

    public static final Descriptors.Descriptor eJ() {
        return ak_1.dn;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.do.ensureFieldAccessorsInitialized(ap_2.class, ar_2.class);
    }

    ar_2() {
        this.D();
    }

    ar_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ap_2.aJ()) {
            // empty if block
        }
    }

    public ar_2 eK() {
        super.clear();
        this.dL = 0;
        this.dN = ByteString.EMPTY;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_1.dn;
    }

    public ap_2 eI() {
        return ap_2.eH();
    }

    public ap_2 eL() {
        ap_2 ap_22 = this.eM();
        if (!ap_22.isInitialized()) {
            throw ar_2.newUninitializedMessageException((Message)ap_22);
        }
        return ap_22;
    }

    public ap_2 eM() {
        ap_2 ap_22 = new ap_2(this);
        ap_22.dL = this.dL;
        ap_22.dN = this.dN;
        this.onBuilt();
        return ap_22;
    }

    public ar_2 eN() {
        return (ar_2)super.clone();
    }

    public ar_2 A(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ar_2)super.setField(fieldDescriptor, object);
    }

    public ar_2 n(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ar_2)super.clearField(fieldDescriptor);
    }

    public ar_2 n(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ar_2)super.clearOneof(oneofDescriptor);
    }

    public ar_2 n(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ar_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ar_2 B(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ar_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ar_2 n(Message message) {
        if (message instanceof ap_2) {
            return this.e((ap_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ar_2 e(ap_2 ap_22) {
        if (ap_22 == ap_2.eH()) {
            return this;
        }
        if (ap_22.d() != 0) {
            this.w(ap_22.d());
        }
        if (ap_22.eD() != ByteString.EMPTY) {
            this.H(ap_22.eD());
        }
        this.B(ap_2.d(ap_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ar_2 P(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ap_2 ap_22 = null;
        try {
            ap_22 = (ap_2)ap_2.dP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ap_22 = (ap_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ap_22 != null) {
                this.e(ap_22);
            }
        }
        return this;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public ar_2 w(int n) {
        this.dL = n;
        this.onChanged();
        return this;
    }

    public ar_2 eO() {
        this.dL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public ByteString eD() {
        return this.dN;
    }

    public ar_2 H(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.dN = byteString;
        this.onChanged();
        return this;
    }

    public ar_2 eP() {
        this.dN = ap_2.eH().eD();
        this.onChanged();
        return this;
    }

    public final ar_2 A(UnknownFieldSet unknownFieldSet) {
        return (ar_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ar_2 B(UnknownFieldSet unknownFieldSet) {
        return (ar_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.B(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.A(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.B(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.n(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.n(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.n(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.A(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.eK();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.eN();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.B(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.P(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.n(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.eK();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.n(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.eN();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.B(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.A(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.B(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.n(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.n(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.n(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.A(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.P(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.eN();
    }

    public /* synthetic */ Message buildPartial() {
        return this.eM();
    }

    public /* synthetic */ Message build() {
        return this.eL();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.n(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.eK();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.P(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.eN();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.eM();
    }

    public /* synthetic */ MessageLite build() {
        return this.eL();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.eK();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.eI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.eI();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.P(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.eN();
    }

    public /* synthetic */ Object clone() {
        return this.eN();
    }
}

