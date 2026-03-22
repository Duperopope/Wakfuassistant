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
 * Renamed from fD
 */
public final class fd_2
extends GeneratedMessageV3.Builder<fd_2>
implements fe_2 {
    private int an;
    private int qB;
    private int qD;
    private int qF;

    public static final Descriptors.Descriptor AU() {
        return fl_1.pm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pn.ensureFieldAccessorsInitialized(fb_2.class, fd_2.class);
    }

    fd_2() {
        this.D();
    }

    fd_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fb_2.jh()) {
            // empty if block
        }
    }

    public fd_2 AV() {
        super.clear();
        this.qB = 0;
        this.an &= 0xFFFFFFFE;
        this.qD = 0;
        this.an &= 0xFFFFFFFD;
        this.qF = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.pm;
    }

    public fb_2 AT() {
        return fb_2.AS();
    }

    public fb_2 AW() {
        fb_2 fb_22 = this.AX();
        if (!fb_22.isInitialized()) {
            throw fd_2.newUninitializedMessageException((Message)fb_22);
        }
        return fb_22;
    }

    public fb_2 AX() {
        fb_2 fb_22 = new fb_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            fb_22.qB = this.qB;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            fb_22.qD = this.qD;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            fb_22.qF = this.qF;
            n2 |= 4;
        }
        fb_22.an = n2;
        this.onBuilt();
        return fb_22;
    }

    public fd_2 AY() {
        return (fd_2)super.clone();
    }

    public fd_2 bQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fd_2)super.setField(fieldDescriptor, object);
    }

    public fd_2 av(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fd_2)super.clearField(fieldDescriptor);
    }

    public fd_2 av(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fd_2)super.clearOneof(oneofDescriptor);
    }

    public fd_2 av(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fd_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fd_2 bR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fd_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fd_2 av(Message message) {
        if (message instanceof fb_2) {
            return this.e((fb_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fd_2 e(fb_2 fb_22) {
        if (fb_22 == fb_2.AS()) {
            return this;
        }
        if (fb_22.AJ()) {
            this.cv(fb_22.AK());
        }
        if (fb_22.AL()) {
            this.cw(fb_22.AM());
        }
        if (fb_22.AN()) {
            this.cx(fb_22.AO());
        }
        this.bR(fb_2.d(fb_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.AJ();
    }

    public fd_2 dn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fb_2 fb_22 = null;
        try {
            fb_22 = (fb_2)fb_2.qH.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fb_22 = (fb_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fb_22 != null) {
                this.e(fb_22);
            }
        }
        return this;
    }

    @Override
    public boolean AJ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    public fd_2 cv(int n) {
        this.an |= 1;
        this.qB = n;
        this.onChanged();
        return this;
    }

    public fd_2 AZ() {
        this.an &= 0xFFFFFFFE;
        this.qB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean AL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int AM() {
        return this.qD;
    }

    public fd_2 cw(int n) {
        this.an |= 2;
        this.qD = n;
        this.onChanged();
        return this;
    }

    public fd_2 Ba() {
        this.an &= 0xFFFFFFFD;
        this.qD = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean AN() {
        return (this.an & 4) != 0;
    }

    @Override
    public int AO() {
        return this.qF;
    }

    public fd_2 cx(int n) {
        this.an |= 4;
        this.qF = n;
        this.onChanged();
        return this;
    }

    public fd_2 Bb() {
        this.an &= 0xFFFFFFFB;
        this.qF = 0;
        this.onChanged();
        return this;
    }

    public final fd_2 bQ(UnknownFieldSet unknownFieldSet) {
        return (fd_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fd_2 bR(UnknownFieldSet unknownFieldSet) {
        return (fd_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.av(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.av(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.av(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.AV();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.AY();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.av(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.AV();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.av(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.AY();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.av(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.av(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.av(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.AY();
    }

    public /* synthetic */ Message buildPartial() {
        return this.AX();
    }

    public /* synthetic */ Message build() {
        return this.AW();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.av(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.AV();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.AY();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.AX();
    }

    public /* synthetic */ MessageLite build() {
        return this.AW();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.AV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.AT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.AT();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.AY();
    }

    public /* synthetic */ Object clone() {
        return this.AY();
    }
}

