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
 * Renamed from yS
 */
public final class ys_2
extends GeneratedMessageV3.Builder<ys_2>
implements yt_2 {
    private int an;
    private int amL;
    private long amN;

    public static final Descriptors.Descriptor awh() {
        return yp_2.amH;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return yp_2.amI.ensureFieldAccessorsInitialized(yq_2.class, ys_2.class);
    }

    ys_2() {
        this.D();
    }

    ys_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (yq_2.cs()) {
            // empty if block
        }
    }

    public ys_2 awi() {
        super.clear();
        this.amL = 0;
        this.an &= 0xFFFFFFFE;
        this.amN = 0L;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return yp_2.amH;
    }

    public yq_2 awg() {
        return yq_2.awf();
    }

    public yq_2 awj() {
        yq_2 yq_22 = this.awk();
        if (!yq_22.isInitialized()) {
            throw ys_2.newUninitializedMessageException((Message)yq_22);
        }
        return yq_22;
    }

    public yq_2 awk() {
        yq_2 yq_22 = new yq_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            yq_22.amL = this.amL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            yq_22.amN = this.amN;
            n2 |= 2;
        }
        yq_22.an = n2;
        this.onBuilt();
        return yq_22;
    }

    public ys_2 awl() {
        return (ys_2)super.clone();
    }

    public ys_2 fK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ys_2)super.setField(fieldDescriptor, object);
    }

    public ys_2 cs(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ys_2)super.clearField(fieldDescriptor);
    }

    public ys_2 cs(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ys_2)super.clearOneof(oneofDescriptor);
    }

    public ys_2 cs(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ys_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ys_2 fL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ys_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ys_2 cs(Message message) {
        if (message instanceof yq_2) {
            return this.c((yq_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ys_2 c(yq_2 yq_22) {
        if (yq_22 == yq_2.awf()) {
            return this;
        }
        if (yq_22.avY()) {
            this.jW(yq_22.avZ());
        }
        if (yq_22.awa()) {
            this.bS(yq_22.awb());
        }
        this.fL(yq_2.b(yq_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.avY()) {
            return false;
        }
        return this.awa();
    }

    public ys_2 je(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        yq_2 yq_22 = null;
        try {
            yq_22 = (yq_2)yq_2.amP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            yq_22 = (yq_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (yq_22 != null) {
                this.c(yq_22);
            }
        }
        return this;
    }

    @Override
    public boolean avY() {
        return (this.an & 1) != 0;
    }

    @Override
    public int avZ() {
        return this.amL;
    }

    public ys_2 jW(int n) {
        this.an |= 1;
        this.amL = n;
        this.onChanged();
        return this;
    }

    public ys_2 awm() {
        this.an &= 0xFFFFFFFE;
        this.amL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean awa() {
        return (this.an & 2) != 0;
    }

    @Override
    public long awb() {
        return this.amN;
    }

    public ys_2 bS(long l) {
        this.an |= 2;
        this.amN = l;
        this.onChanged();
        return this;
    }

    public ys_2 awn() {
        this.an &= 0xFFFFFFFD;
        this.amN = 0L;
        this.onChanged();
        return this;
    }

    public final ys_2 fK(UnknownFieldSet unknownFieldSet) {
        return (ys_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ys_2 fL(UnknownFieldSet unknownFieldSet) {
        return (ys_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cs(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cs(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cs(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.awi();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.awl();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.je(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cs(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.awi();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cs(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.awl();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cs(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cs(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cs(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.je(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.awl();
    }

    public /* synthetic */ Message buildPartial() {
        return this.awk();
    }

    public /* synthetic */ Message build() {
        return this.awj();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cs(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.awi();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.je(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.awl();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.awk();
    }

    public /* synthetic */ MessageLite build() {
        return this.awj();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.awi();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.awg();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.awg();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.je(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.awl();
    }

    public /* synthetic */ Object clone() {
        return this.awl();
    }
}

