/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from kl
 */
public final class kl_0
extends GeneratedMessageV3.Builder<kl_0>
implements km_0 {
    private int an;
    private Object EY = "";
    private long Fa;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private int Fe;

    public static final Descriptors.Descriptor aaJ() {
        return kb.EB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EC.ensureFieldAccessorsInitialized(kj_0.class, kl_0.class);
    }

    kl_0() {
        this.D();
    }

    kl_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kj_0.el()) {
            this.aaS();
        }
    }

    public kl_0 aaK() {
        super.clear();
        this.EY = "";
        this.an &= 0xFFFFFFFE;
        this.Fa = 0L;
        this.an &= 0xFFFFFFFD;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFB;
        this.Fe = 0;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kb.EB;
    }

    public kj_0 aaI() {
        return kj_0.aaH();
    }

    public kj_0 aaL() {
        kj_0 kj_02 = this.aaM();
        if (!kj_02.isInitialized()) {
            throw kl_0.newUninitializedMessageException((Message)kj_02);
        }
        return kj_02;
    }

    public kj_0 aaM() {
        kj_0 kj_02 = new kj_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        kj_02.EY = this.EY;
        if ((n & 2) != 0) {
            kj_02.Fa = this.Fa;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            kj_02.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            kj_02.Fe = this.Fe;
            n2 |= 8;
        }
        kj_02.an = n2;
        this.onBuilt();
        return kj_02;
    }

    public kl_0 aaN() {
        return (kl_0)super.clone();
    }

    public kl_0 dS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kl_0)super.setField(fieldDescriptor, object);
    }

    public kl_0 bw(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kl_0)super.clearField(fieldDescriptor);
    }

    public kl_0 bw(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kl_0)super.clearOneof(oneofDescriptor);
    }

    public kl_0 bw(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kl_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kl_0 dT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kl_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public kl_0 bw(Message message) {
        if (message instanceof kj_0) {
            return this.d((kj_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kl_0 d(kj_0 kj_02) {
        if (kj_02 == kj_0.aaH()) {
            return this;
        }
        if (kj_02.aau()) {
            this.an |= 1;
            this.EY = kj_02.EY;
            this.onChanged();
        }
        if (kj_02.aax()) {
            this.aP(kj_02.aay());
        }
        if (kj_02.aaz()) {
            this.c(kj_02.aaA());
        }
        if (kj_02.aaC()) {
            this.gA(kj_02.aaD());
        }
        this.dT(kj_0.c(kj_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aau()) {
            return false;
        }
        if (!this.aax()) {
            return false;
        }
        if (!this.aaz()) {
            return false;
        }
        if (!this.aaC()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public kl_0 gq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kj_0 kj_02 = null;
        try {
            kj_02 = (kj_0)kj_0.Fg.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kj_02 = (kj_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kj_02 != null) {
                this.d(kj_02);
            }
        }
        return this;
    }

    @Override
    public boolean aau() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aav() {
        Object object = this.EY;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.EY = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aaw() {
        Object object = this.EY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.EY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public kl_0 N(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.EY = string;
        this.onChanged();
        return this;
    }

    public kl_0 aaO() {
        this.an &= 0xFFFFFFFE;
        this.EY = kj_0.aaH().aav();
        this.onChanged();
        return this;
    }

    public kl_0 cD(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.EY = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aax() {
        return (this.an & 2) != 0;
    }

    @Override
    public long aay() {
        return this.Fa;
    }

    public kl_0 aP(long l) {
        this.an |= 2;
        this.Fa = l;
        this.onChanged();
        return this;
    }

    public kl_0 aaP() {
        this.an &= 0xFFFFFFFD;
        this.Fa = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 4) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public kl_0 b(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 4;
        return this;
    }

    public kl_0 b(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 4;
        return this;
    }

    public kl_0 c(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 4) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 4;
        return this;
    }

    public kl_0 aaQ() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public kY aaR() {
        this.an |= 4;
        this.onChanged();
        return (kY)this.aaS().getBuilder();
    }

    @Override
    public lh aaB() {
        if (this.Fh != null) {
            return (lh)this.Fh.getMessageOrBuilder();
        }
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    private SingleFieldBuilderV3<kW, kY, lh> aaS() {
        if (this.Fh == null) {
            this.Fh = new SingleFieldBuilderV3((AbstractMessage)this.aaA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fc = null;
        }
        return this.Fh;
    }

    @Override
    public boolean aaC() {
        return (this.an & 8) != 0;
    }

    @Override
    public int aaD() {
        return this.Fe;
    }

    public kl_0 gA(int n) {
        this.an |= 8;
        this.Fe = n;
        this.onChanged();
        return this;
    }

    public kl_0 aaT() {
        this.an &= 0xFFFFFFF7;
        this.Fe = 0;
        this.onChanged();
        return this;
    }

    public final kl_0 dS(UnknownFieldSet unknownFieldSet) {
        return (kl_0)super.setUnknownFields(unknownFieldSet);
    }

    public final kl_0 dT(UnknownFieldSet unknownFieldSet) {
        return (kl_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bw(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bw(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bw(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aaK();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aaN();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bw(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aaK();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bw(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aaN();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bw(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bw(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bw(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aaN();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aaM();
    }

    public /* synthetic */ Message build() {
        return this.aaL();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bw(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aaK();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aaN();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aaM();
    }

    public /* synthetic */ MessageLite build() {
        return this.aaL();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aaK();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aaI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aaI();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aaN();
    }

    public /* synthetic */ Object clone() {
        return this.aaN();
    }
}

