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
 * Renamed from hA
 */
public final class ha_1
extends GeneratedMessageV3.Builder<ha_1>
implements hb_1 {
    private int an;
    private int uU;
    private int uW = 1;
    private long uY;
    private int va;
    private long vc;
    private int ve;
    private int vg;
    private hi_1 vi;
    private SingleFieldBuilderV3<hi_1, hk_1, hq_1> vr;
    private long vk;
    private int vm;
    private int vo;

    public static final Descriptors.Descriptor Jp() {
        return hh_1.tS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tT.ensureFieldAccessorsInitialized(hy_1.class, ha_1.class);
    }

    ha_1() {
        this.D();
    }

    ha_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hy_1.aJ()) {
            this.JD();
        }
    }

    public ha_1 Jq() {
        super.clear();
        this.uU = 0;
        this.an &= 0xFFFFFFFE;
        this.uW = 1;
        this.an &= 0xFFFFFFFD;
        this.uY = 0L;
        this.an &= 0xFFFFFFFB;
        this.va = 0;
        this.an &= 0xFFFFFFF7;
        this.vc = 0L;
        this.an &= 0xFFFFFFEF;
        this.ve = 0;
        this.an &= 0xFFFFFFDF;
        this.vg = 0;
        this.an &= 0xFFFFFFBF;
        if (this.vr == null) {
            this.vi = null;
        } else {
            this.vr.clear();
        }
        this.an &= 0xFFFFFF7F;
        this.vk = 0L;
        this.an &= 0xFFFFFEFF;
        this.vm = 0;
        this.an &= 0xFFFFFDFF;
        this.vo = 0;
        this.an &= 0xFFFFFBFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hh_1.tS;
    }

    public hy_1 Jo() {
        return hy_1.Jn();
    }

    public hy_1 Jr() {
        hy_1 hy_12 = this.Js();
        if (!hy_12.isInitialized()) {
            throw ha_1.newUninitializedMessageException((Message)hy_12);
        }
        return hy_12;
    }

    public hy_1 Js() {
        hy_1 hy_12 = new hy_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            hy_12.uU = this.uU;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        hy_12.uW = this.uW;
        if ((n & 4) != 0) {
            hy_12.uY = this.uY;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            hy_12.va = this.va;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            hy_12.vc = this.vc;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            hy_12.ve = this.ve;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            hy_12.vg = this.vg;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            hy_12.vi = this.vr == null ? this.vi : (hi_1)this.vr.build();
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            hy_12.vk = this.vk;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            hy_12.vm = this.vm;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            hy_12.vo = this.vo;
            n2 |= 0x400;
        }
        hy_12.an = n2;
        this.onBuilt();
        return hy_12;
    }

    public ha_1 Jt() {
        return (ha_1)super.clone();
    }

    public ha_1 cE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ha_1)super.setField(fieldDescriptor, object);
    }

    public ha_1 aP(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ha_1)super.clearField(fieldDescriptor);
    }

    public ha_1 aP(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ha_1)super.clearOneof(oneofDescriptor);
    }

    public ha_1 aP(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ha_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ha_1 cF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ha_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ha_1 aP(Message message) {
        if (message instanceof hy_1) {
            return this.c((hy_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ha_1 c(hy_1 hy_12) {
        if (hy_12 == hy_1.Jn()) {
            return this;
        }
        if (hy_12.IN()) {
            this.dF(hy_12.IO());
        }
        if (hy_12.IP()) {
            this.a(hy_12.IQ());
        }
        if (hy_12.IR()) {
            this.Z(hy_12.IS());
        }
        if (hy_12.IT()) {
            this.dG(hy_12.IU());
        }
        if (hy_12.IV()) {
            this.aa(hy_12.IW());
        }
        if (hy_12.IX()) {
            this.dH(hy_12.IY());
        }
        if (hy_12.IZ()) {
            this.dI(hy_12.Ja());
        }
        if (hy_12.Jb()) {
            this.e(hy_12.Jc());
        }
        if (hy_12.Je()) {
            this.ab(hy_12.Jf());
        }
        if (hy_12.Jg()) {
            this.dJ(hy_12.Jh());
        }
        if (hy_12.Ji()) {
            this.dK(hy_12.Jj());
        }
        this.cF(hy_1.b(hy_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.IN()) {
            return false;
        }
        return !this.Jb() || this.Jc().isInitialized();
    }

    public ha_1 ev(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hy_1 hy_12 = null;
        try {
            hy_12 = (hy_1)hy_1.vq.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hy_12 = (hy_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hy_12 != null) {
                this.c(hy_12);
            }
        }
        return this;
    }

    @Override
    public boolean IN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int IO() {
        return this.uU;
    }

    public ha_1 dF(int n) {
        this.an |= 1;
        this.uU = n;
        this.onChanged();
        return this;
    }

    public ha_1 Ju() {
        this.an &= 0xFFFFFFFE;
        this.uU = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IP() {
        return (this.an & 2) != 0;
    }

    @Override
    public hr_1 IQ() {
        hr_1 hr_12 = hr_1.dw(this.uW);
        return hr_12 == null ? hr_1.uw : hr_12;
    }

    public ha_1 a(hr_1 hr_12) {
        if (hr_12 == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.uW = hr_12.getNumber();
        this.onChanged();
        return this;
    }

    public ha_1 Jv() {
        this.an &= 0xFFFFFFFD;
        this.uW = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IR() {
        return (this.an & 4) != 0;
    }

    @Override
    public long IS() {
        return this.uY;
    }

    public ha_1 Z(long l) {
        this.an |= 4;
        this.uY = l;
        this.onChanged();
        return this;
    }

    public ha_1 Jw() {
        this.an &= 0xFFFFFFFB;
        this.uY = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IT() {
        return (this.an & 8) != 0;
    }

    @Override
    public int IU() {
        return this.va;
    }

    public ha_1 dG(int n) {
        this.an |= 8;
        this.va = n;
        this.onChanged();
        return this;
    }

    public ha_1 Jx() {
        this.an &= 0xFFFFFFF7;
        this.va = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IV() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long IW() {
        return this.vc;
    }

    public ha_1 aa(long l) {
        this.an |= 0x10;
        this.vc = l;
        this.onChanged();
        return this;
    }

    public ha_1 Jy() {
        this.an &= 0xFFFFFFEF;
        this.vc = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IX() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int IY() {
        return this.ve;
    }

    public ha_1 dH(int n) {
        this.an |= 0x20;
        this.ve = n;
        this.onChanged();
        return this;
    }

    public ha_1 Jz() {
        this.an &= 0xFFFFFFDF;
        this.ve = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IZ() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int Ja() {
        return this.vg;
    }

    public ha_1 dI(int n) {
        this.an |= 0x40;
        this.vg = n;
        this.onChanged();
        return this;
    }

    public ha_1 JA() {
        this.an &= 0xFFFFFFBF;
        this.vg = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Jb() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public hi_1 Jc() {
        if (this.vr == null) {
            return this.vi == null ? hi_1.HB() : this.vi;
        }
        return (hi_1)this.vr.getMessage();
    }

    public ha_1 d(hi_1 hi_12) {
        if (this.vr == null) {
            if (hi_12 == null) {
                throw new NullPointerException();
            }
            this.vi = hi_12;
            this.onChanged();
        } else {
            this.vr.setMessage((AbstractMessage)hi_12);
        }
        this.an |= 0x80;
        return this;
    }

    public ha_1 a(hk_1 hk_12) {
        if (this.vr == null) {
            this.vi = hk_12.HF();
            this.onChanged();
        } else {
            this.vr.setMessage((AbstractMessage)hk_12.HF());
        }
        this.an |= 0x80;
        return this;
    }

    public ha_1 e(hi_1 hi_12) {
        if (this.vr == null) {
            this.vi = (this.an & 0x80) != 0 && this.vi != null && this.vi != hi_1.HB() ? hi_1.a(this.vi).c(hi_12).HG() : hi_12;
            this.onChanged();
        } else {
            this.vr.mergeFrom((AbstractMessage)hi_12);
        }
        this.an |= 0x80;
        return this;
    }

    public ha_1 JB() {
        if (this.vr == null) {
            this.vi = null;
            this.onChanged();
        } else {
            this.vr.clear();
        }
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public hk_1 JC() {
        this.an |= 0x80;
        this.onChanged();
        return (hk_1)this.JD().getBuilder();
    }

    @Override
    public hq_1 Jd() {
        if (this.vr != null) {
            return (hq_1)this.vr.getMessageOrBuilder();
        }
        return this.vi == null ? hi_1.HB() : this.vi;
    }

    private SingleFieldBuilderV3<hi_1, hk_1, hq_1> JD() {
        if (this.vr == null) {
            this.vr = new SingleFieldBuilderV3((AbstractMessage)this.Jc(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.vi = null;
        }
        return this.vr;
    }

    @Override
    public boolean Je() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long Jf() {
        return this.vk;
    }

    public ha_1 ab(long l) {
        this.an |= 0x100;
        this.vk = l;
        this.onChanged();
        return this;
    }

    public ha_1 JE() {
        this.an &= 0xFFFFFEFF;
        this.vk = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Jg() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Jh() {
        return this.vm;
    }

    public ha_1 dJ(int n) {
        this.an |= 0x200;
        this.vm = n;
        this.onChanged();
        return this;
    }

    public ha_1 JF() {
        this.an &= 0xFFFFFDFF;
        this.vm = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ji() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int Jj() {
        return this.vo;
    }

    public ha_1 dK(int n) {
        this.an |= 0x400;
        this.vo = n;
        this.onChanged();
        return this;
    }

    public ha_1 JG() {
        this.an &= 0xFFFFFBFF;
        this.vo = 0;
        this.onChanged();
        return this;
    }

    public final ha_1 cE(UnknownFieldSet unknownFieldSet) {
        return (ha_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ha_1 cF(UnknownFieldSet unknownFieldSet) {
        return (ha_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aP(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aP(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aP(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Jq();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Jt();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ev(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aP(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Jq();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aP(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Jt();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aP(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aP(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aP(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ev(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Jt();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Js();
    }

    public /* synthetic */ Message build() {
        return this.Jr();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aP(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Jq();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ev(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Jt();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Js();
    }

    public /* synthetic */ MessageLite build() {
        return this.Jr();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Jq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Jo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Jo();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ev(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Jt();
    }

    public /* synthetic */ Object clone() {
        return this.Jt();
    }
}

