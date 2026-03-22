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
 * Renamed from av
 */
public final class av_1
extends GeneratedMessageV3.Builder<av_1>
implements aw_2 {
    private int dS;
    private ap_2 dU;
    private SingleFieldBuilderV3<ap_2, ar_2, as_2> dX;

    public static final Descriptors.Descriptor fb() {
        return ak_1.dp;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.dq.ensureFieldAccessorsInitialized(at_1.class, av_1.class);
    }

    av_1() {
        this.D();
    }

    av_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (at_1.fa()) {
            // empty if block
        }
    }

    public av_1 fc() {
        super.clear();
        this.dS = 0;
        if (this.dX == null) {
            this.dU = null;
        } else {
            this.dU = null;
            this.dX = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_1.dp;
    }

    public at_1 eZ() {
        return at_1.eY();
    }

    public at_1 fd() {
        at_1 at_12 = this.fe();
        if (!at_12.isInitialized()) {
            throw av_1.newUninitializedMessageException((Message)at_12);
        }
        return at_12;
    }

    public at_1 fe() {
        at_1 at_12 = new at_1(this);
        at_12.dS = this.dS;
        at_12.dU = this.dX == null ? this.dU : (ap_2)this.dX.build();
        this.onBuilt();
        return at_12;
    }

    public av_1 ff() {
        return (av_1)super.clone();
    }

    public av_1 C(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (av_1)super.setField(fieldDescriptor, object);
    }

    public av_1 o(Descriptors.FieldDescriptor fieldDescriptor) {
        return (av_1)super.clearField(fieldDescriptor);
    }

    public av_1 o(Descriptors.OneofDescriptor oneofDescriptor) {
        return (av_1)super.clearOneof(oneofDescriptor);
    }

    public av_1 o(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (av_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public av_1 D(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (av_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public av_1 o(Message message) {
        if (message instanceof at_1) {
            return this.e((at_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public av_1 e(at_1 at_12) {
        if (at_12 == at_1.eY()) {
            return this;
        }
        if (at_12.eR() != 0) {
            this.x(at_12.eR());
        }
        if (at_12.eS()) {
            this.g(at_12.eT());
        }
        this.D(at_1.d(at_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public av_1 S(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        at_1 at_12 = null;
        try {
            at_12 = (at_1)at_1.dW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            at_12 = (at_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (at_12 != null) {
                this.e(at_12);
            }
        }
        return this;
    }

    @Override
    public int eR() {
        return this.dS;
    }

    public av_1 x(int n) {
        this.dS = n;
        this.onChanged();
        return this;
    }

    public av_1 fg() {
        this.dS = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean eS() {
        return this.dX != null || this.dU != null;
    }

    @Override
    public ap_2 eT() {
        if (this.dX == null) {
            return this.dU == null ? ap_2.eH() : this.dU;
        }
        return (ap_2)this.dX.getMessage();
    }

    public av_1 f(ap_2 ap_22) {
        if (this.dX == null) {
            if (ap_22 == null) {
                throw new NullPointerException();
            }
            this.dU = ap_22;
            this.onChanged();
        } else {
            this.dX.setMessage((AbstractMessage)ap_22);
        }
        return this;
    }

    public av_1 b(ar_2 ar_22) {
        if (this.dX == null) {
            this.dU = ar_22.eL();
            this.onChanged();
        } else {
            this.dX.setMessage((AbstractMessage)ar_22.eL());
        }
        return this;
    }

    public av_1 g(ap_2 ap_22) {
        if (this.dX == null) {
            this.dU = this.dU != null ? ap_2.c(this.dU).e(ap_22).eM() : ap_22;
            this.onChanged();
        } else {
            this.dX.mergeFrom((AbstractMessage)ap_22);
        }
        return this;
    }

    public av_1 fh() {
        if (this.dX == null) {
            this.dU = null;
            this.onChanged();
        } else {
            this.dU = null;
            this.dX = null;
        }
        return this;
    }

    public ar_2 fi() {
        this.onChanged();
        return (ar_2)this.fj().getBuilder();
    }

    @Override
    public as_2 eU() {
        if (this.dX != null) {
            return (as_2)this.dX.getMessageOrBuilder();
        }
        return this.dU == null ? ap_2.eH() : this.dU;
    }

    private SingleFieldBuilderV3<ap_2, ar_2, as_2> fj() {
        if (this.dX == null) {
            this.dX = new SingleFieldBuilderV3((AbstractMessage)this.eT(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.dU = null;
        }
        return this.dX;
    }

    public final av_1 C(UnknownFieldSet unknownFieldSet) {
        return (av_1)super.setUnknownFields(unknownFieldSet);
    }

    public final av_1 D(UnknownFieldSet unknownFieldSet) {
        return (av_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.D(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.C(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.D(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.o(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.o(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.o(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.C(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.fc();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ff();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.D(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.S(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.o(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.fc();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.o(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ff();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.D(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.C(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.D(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.o(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.o(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.o(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.C(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.S(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ff();
    }

    public /* synthetic */ Message buildPartial() {
        return this.fe();
    }

    public /* synthetic */ Message build() {
        return this.fd();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.o(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.fc();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.S(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ff();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.fe();
    }

    public /* synthetic */ MessageLite build() {
        return this.fd();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.fc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.eZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.eZ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.S(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ff();
    }

    public /* synthetic */ Object clone() {
        return this.ff();
    }
}

