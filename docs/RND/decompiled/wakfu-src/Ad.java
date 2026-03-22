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

public final class Ad
extends GeneratedMessageV3.Builder<Ad>
implements Ae {
    private int an;
    private long apU;
    private int HC = 1;
    private long apX;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private Object aqa = "";

    public static final Descriptors.Descriptor aBP() {
        return zS.apB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apC.ensureFieldAccessorsInitialized(Ab.class, Ad.class);
    }

    Ad() {
        this.D();
    }

    Ad(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (Ab.aBO()) {
            this.aaS();
        }
    }

    public Ad aBQ() {
        super.clear();
        this.apU = 0L;
        this.an &= 0xFFFFFFFE;
        this.HC = 1;
        this.an &= 0xFFFFFFFD;
        this.apX = 0L;
        this.an &= 0xFFFFFFFB;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFF7;
        this.aqa = "";
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apB;
    }

    public Ab aBN() {
        return Ab.aBM();
    }

    public Ab aBR() {
        Ab ab = this.aBS();
        if (!ab.isInitialized()) {
            throw Ad.newUninitializedMessageException((Message)ab);
        }
        return ab;
    }

    public Ab aBS() {
        Ab ab = new Ab(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ab.apU = this.apU;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        ab.HC = this.HC;
        if ((n & 4) != 0) {
            ab.apX = this.apX;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            ab.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            n2 |= 0x10;
        }
        ab.aqa = this.aqa;
        ab.an = n2;
        this.onBuilt();
        return ab;
    }

    public Ad aBT() {
        return (Ad)super.clone();
    }

    public Ad gm(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ad)super.setField(fieldDescriptor, object);
    }

    public Ad cG(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Ad)super.clearField(fieldDescriptor);
    }

    public Ad cG(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Ad)super.clearOneof(oneofDescriptor);
    }

    public Ad cG(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Ad)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Ad gn(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ad)super.addRepeatedField(fieldDescriptor, object);
    }

    public Ad cG(Message message) {
        if (message instanceof Ab) {
            return this.c((Ab)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Ad c(Ab ab) {
        if (ab == Ab.aBM()) {
            return this;
        }
        if (ab.aBC()) {
            this.bW(ab.aBD());
        }
        if (ab.aeU()) {
            this.a(ab.aBE());
        }
        if (ab.oO()) {
            this.bX(ab.aBF());
        }
        if (ab.aaz()) {
            this.v(ab.aaA());
        }
        if (ab.aBG()) {
            this.an |= 0x10;
            this.aqa = ab.aqa;
            this.onChanged();
        }
        this.gn(Ab.b(ab));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aeU()) {
            return false;
        }
        if (!this.oO()) {
            return false;
        }
        return !this.aaz() || this.aaA().isInitialized();
    }

    public Ad jU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Ab ab = null;
        try {
            ab = (Ab)Ab.aqc.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ab = (Ab)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ab != null) {
                this.c(ab);
            }
        }
        return this;
    }

    @Override
    @Deprecated
    public boolean aBC() {
        return (this.an & 1) != 0;
    }

    @Override
    @Deprecated
    public long aBD() {
        return this.apU;
    }

    @Deprecated
    public Ad bW(long l) {
        this.an |= 1;
        this.apU = l;
        this.onChanged();
        return this;
    }

    @Deprecated
    public Ad aBU() {
        this.an &= 0xFFFFFFFE;
        this.apU = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public ax_0 aBE() {
        ax_0 ax_02 = ax_0.lH(this.HC);
        return ax_02 == null ? ax_0.arQ : ax_02;
    }

    public Ad a(ax_0 ax_02) {
        if (ax_02 == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.HC = ax_02.getNumber();
        this.onChanged();
        return this;
    }

    public Ad aBV() {
        this.an &= 0xFFFFFFFD;
        this.HC = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public long aBF() {
        return this.apX;
    }

    public Ad bX(long l) {
        this.an |= 4;
        this.apX = l;
        this.onChanged();
        return this;
    }

    public Ad aBW() {
        this.an &= 0xFFFFFFFB;
        this.apX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 8) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public Ad u(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 8;
        return this;
    }

    public Ad k(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 8;
        return this;
    }

    public Ad v(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 8) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 8;
        return this;
    }

    public Ad aBX() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public kY aaR() {
        this.an |= 8;
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
    public boolean aBG() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String aBH() {
        Object object = this.aqa;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aqa = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aBI() {
        Object object = this.aqa;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqa = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public Ad al(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.aqa = string;
        this.onChanged();
        return this;
    }

    public Ad aBY() {
        this.an &= 0xFFFFFFEF;
        this.aqa = Ab.aBM().aBH();
        this.onChanged();
        return this;
    }

    public Ad ei(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x10;
        this.aqa = byteString;
        this.onChanged();
        return this;
    }

    public final Ad gm(UnknownFieldSet unknownFieldSet) {
        return (Ad)super.setUnknownFields(unknownFieldSet);
    }

    public final Ad gn(UnknownFieldSet unknownFieldSet) {
        return (Ad)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gn(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gm(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gn(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cG(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cG(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cG(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gm(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aBQ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aBT();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gn(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cG(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aBQ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cG(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aBT();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gn(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gm(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gn(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cG(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cG(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cG(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gm(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aBT();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aBS();
    }

    public /* synthetic */ Message build() {
        return this.aBR();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cG(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aBQ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aBT();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aBS();
    }

    public /* synthetic */ MessageLite build() {
        return this.aBR();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aBQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aBN();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aBN();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aBT();
    }

    public /* synthetic */ Object clone() {
        return this.aBT();
    }
}

