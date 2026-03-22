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
 * Renamed from dl
 */
public final class dl_1
extends GeneratedMessageV3.Builder<dl_1>
implements dm_2 {
    private int an;
    private int ke;
    private int kg;
    private int ki;
    private int kk;

    public static final Descriptors.Descriptor pU() {
        return df_2.jz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jA.ensureFieldAccessorsInitialized(dj_2.class, dl_1.class);
    }

    dl_1() {
        this.D();
    }

    dl_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dj_2.pT()) {
            // empty if block
        }
    }

    public dl_1 pV() {
        super.clear();
        this.ke = 0;
        this.an &= 0xFFFFFFFE;
        this.kg = 0;
        this.an &= 0xFFFFFFFD;
        this.ki = 0;
        this.an &= 0xFFFFFFFB;
        this.kk = 0;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jz;
    }

    public dj_2 pS() {
        return dj_2.pR();
    }

    public dj_2 pW() {
        dj_2 dj_22 = this.pX();
        if (!dj_22.isInitialized()) {
            throw dl_1.newUninitializedMessageException((Message)dj_22);
        }
        return dj_22;
    }

    public dj_2 pX() {
        dj_2 dj_22 = new dj_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dj_22.ke = this.ke;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dj_22.kg = this.kg;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            dj_22.ki = this.ki;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            dj_22.kk = this.kk;
            n2 |= 8;
        }
        dj_22.an = n2;
        this.onBuilt();
        return dj_22;
    }

    public dl_1 pY() {
        return (dl_1)super.clone();
    }

    public dl_1 aS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dl_1)super.setField(fieldDescriptor, object);
    }

    public dl_1 W(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dl_1)super.clearField(fieldDescriptor);
    }

    public dl_1 W(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dl_1)super.clearOneof(oneofDescriptor);
    }

    public dl_1 W(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dl_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dl_1 aT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dl_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dl_1 W(Message message) {
        if (message instanceof dj_2) {
            return this.e((dj_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dl_1 e(dj_2 dj_22) {
        if (dj_22 == dj_2.pR()) {
            return this;
        }
        if (dj_22.pG()) {
            this.av(dj_22.pH());
        }
        if (dj_22.pI()) {
            this.aw(dj_22.pJ());
        }
        if (dj_22.pK()) {
            this.ax(dj_22.pL());
        }
        if (dj_22.pM()) {
            this.ay(dj_22.pN());
        }
        this.aT(dj_2.d(dj_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public dl_1 bQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dj_2 dj_22 = null;
        try {
            dj_22 = (dj_2)dj_2.km.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dj_22 = (dj_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dj_22 != null) {
                this.e(dj_22);
            }
        }
        return this;
    }

    @Override
    public boolean pG() {
        return (this.an & 1) != 0;
    }

    @Override
    public int pH() {
        return this.ke;
    }

    public dl_1 av(int n) {
        this.an |= 1;
        this.ke = n;
        this.onChanged();
        return this;
    }

    public dl_1 pZ() {
        this.an &= 0xFFFFFFFE;
        this.ke = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pI() {
        return (this.an & 2) != 0;
    }

    @Override
    public int pJ() {
        return this.kg;
    }

    public dl_1 aw(int n) {
        this.an |= 2;
        this.kg = n;
        this.onChanged();
        return this;
    }

    public dl_1 qa() {
        this.an &= 0xFFFFFFFD;
        this.kg = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int pL() {
        return this.ki;
    }

    public dl_1 ax(int n) {
        this.an |= 4;
        this.ki = n;
        this.onChanged();
        return this;
    }

    public dl_1 qb() {
        this.an &= 0xFFFFFFFB;
        this.ki = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pM() {
        return (this.an & 8) != 0;
    }

    @Override
    public int pN() {
        return this.kk;
    }

    public dl_1 ay(int n) {
        this.an |= 8;
        this.kk = n;
        this.onChanged();
        return this;
    }

    public dl_1 qc() {
        this.an &= 0xFFFFFFF7;
        this.kk = 0;
        this.onChanged();
        return this;
    }

    public final dl_1 aS(UnknownFieldSet unknownFieldSet) {
        return (dl_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dl_1 aT(UnknownFieldSet unknownFieldSet) {
        return (dl_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.W(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.W(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.W(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.pV();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.pY();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.W(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.pV();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.W(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.pY();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.W(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.W(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.W(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.pY();
    }

    public /* synthetic */ Message buildPartial() {
        return this.pX();
    }

    public /* synthetic */ Message build() {
        return this.pW();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.W(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.pV();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.pY();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.pX();
    }

    public /* synthetic */ MessageLite build() {
        return this.pW();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.pV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.pS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.pS();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.pY();
    }

    public /* synthetic */ Object clone() {
        return this.pY();
    }
}

