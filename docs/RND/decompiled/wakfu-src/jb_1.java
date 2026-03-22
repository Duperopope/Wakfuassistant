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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from jb
 */
public final class jb_1
extends GeneratedMessageV3.Builder<jb_1>
implements jc_1 {
    private int an;
    private long AH;
    private long AJ;
    private int oq;
    private List<iv_2> AM = Collections.emptyList();
    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> AS;
    private jx_1 AO;
    private SingleFieldBuilderV3<jx_1, jz_1, ja_1> AT;
    private int jq;

    public static final Descriptors.Descriptor SB() {
        return iu_2.Am;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.An.ensureFieldAccessorsInitialized(iz_2.class, jb_1.class);
    }

    jb_1() {
        this.D();
    }

    jb_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (iz_2.Y()) {
            this.SN();
            this.SQ();
        }
    }

    public jb_1 SC() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.AJ = 0L;
        this.an &= 0xFFFFFFFD;
        this.oq = 0;
        this.an &= 0xFFFFFFFB;
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFF7;
        } else {
            this.AS.clear();
        }
        if (this.AT == null) {
            this.AO = null;
        } else {
            this.AT.clear();
        }
        this.an &= 0xFFFFFFEF;
        this.jq = 0;
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Am;
    }

    public iz_2 SA() {
        return iz_2.Sz();
    }

    public iz_2 SD() {
        iz_2 iz_22 = this.SE();
        if (!iz_22.isInitialized()) {
            throw jb_1.newUninitializedMessageException((Message)iz_22);
        }
        return iz_22;
    }

    public iz_2 SE() {
        iz_2 iz_22 = new iz_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            iz_22.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            iz_22.AJ = this.AJ;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            iz_22.oq = this.oq;
            n2 |= 4;
        }
        if (this.AS == null) {
            if ((this.an & 8) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
                this.an &= 0xFFFFFFF7;
            }
            iz_22.AM = this.AM;
        } else {
            iz_22.AM = this.AS.build();
        }
        if ((n & 0x10) != 0) {
            iz_22.AO = this.AT == null ? this.AO : (jx_1)this.AT.build();
            n2 |= 8;
        }
        if ((n & 0x20) != 0) {
            iz_22.jq = this.jq;
            n2 |= 0x10;
        }
        iz_22.an = n2;
        this.onBuilt();
        return iz_22;
    }

    public jb_1 SF() {
        return (jb_1)super.clone();
    }

    public jb_1 do(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jb_1)super.setField(fieldDescriptor, object);
    }

    public jb_1 bh(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jb_1)super.clearField(fieldDescriptor);
    }

    public jb_1 bh(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jb_1)super.clearOneof(oneofDescriptor);
    }

    public jb_1 bh(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jb_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jb_1 dp(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jb_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jb_1 bh(Message message) {
        if (message instanceof iz_2) {
            return this.c((iz_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jb_1 c(iz_2 iz_22) {
        if (iz_22 == iz_2.Sz()) {
            return this;
        }
        if (iz_22.oN()) {
            this.ar(iz_22.Sn());
        }
        if (iz_22.So()) {
            this.as(iz_22.Sp());
        }
        if (iz_22.xS()) {
            this.eU(iz_22.xT());
        }
        if (this.AS == null) {
            if (!iz_22.AM.isEmpty()) {
                if (this.AM.isEmpty()) {
                    this.AM = iz_22.AM;
                    this.an &= 0xFFFFFFF7;
                } else {
                    this.SJ();
                    this.AM.addAll(iz_22.AM);
                }
                this.onChanged();
            }
        } else if (!iz_22.AM.isEmpty()) {
            if (this.AS.isEmpty()) {
                this.AS.dispose();
                this.AS = null;
                this.AM = iz_22.AM;
                this.an &= 0xFFFFFFF7;
                this.AS = iz_2.gG() ? this.SN() : null;
            } else {
                this.AS.addAllMessages(iz_22.AM);
            }
        }
        if (iz_22.St()) {
            this.b(iz_22.Su());
        }
        if (iz_22.oO()) {
            this.eY(iz_22.oP());
        }
        this.dp(iz_2.b(iz_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.xS()) {
            return false;
        }
        for (int i = 0; i < this.Ss(); ++i) {
            if (this.eS(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jb_1 fx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iz_2 iz_22 = null;
        try {
            iz_22 = (iz_2)iz_2.AR.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iz_22 = (iz_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iz_22 != null) {
                this.c(iz_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public jb_1 ar(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public jb_1 SG() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean So() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Sp() {
        return this.AJ;
    }

    public jb_1 as(long l) {
        this.an |= 2;
        this.AJ = l;
        this.onChanged();
        return this;
    }

    public jb_1 SH() {
        this.an &= 0xFFFFFFFD;
        this.AJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 4) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public jb_1 eU(int n) {
        this.an |= 4;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public jb_1 SI() {
        this.an &= 0xFFFFFFFB;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    private void SJ() {
        if ((this.an & 8) == 0) {
            this.AM = new ArrayList<iv_2>(this.AM);
            this.an |= 8;
        }
    }

    @Override
    public List<iv_2> Sq() {
        if (this.AS == null) {
            return Collections.unmodifiableList(this.AM);
        }
        return this.AS.getMessageList();
    }

    @Override
    public int Ss() {
        if (this.AS == null) {
            return this.AM.size();
        }
        return this.AS.getCount();
    }

    @Override
    public iv_2 eS(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iv_2)this.AS.getMessage(n);
    }

    public jb_1 a(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.set(n, iv_22);
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public jb_1 a(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.set(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jb_1 d(iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)iv_22);
        }
        return this;
    }

    public jb_1 b(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(n, iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public jb_1 a(ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jb_1 b(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public jb_1 G(Iterable<? extends iv_2> iterable) {
        if (this.AS == null) {
            this.SJ();
            AbstractMessageLite.Builder.addAll(iterable, this.AM);
            this.onChanged();
        } else {
            this.AS.addAllMessages(iterable);
        }
        return this;
    }

    public jb_1 SK() {
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFF7;
            this.onChanged();
        } else {
            this.AS.clear();
        }
        return this;
    }

    public jb_1 eV(int n) {
        if (this.AS == null) {
            this.SJ();
            this.AM.remove(n);
            this.onChanged();
        } else {
            this.AS.remove(n);
        }
        return this;
    }

    public ix_2 eW(int n) {
        return (ix_2)this.SN().getBuilder(n);
    }

    @Override
    public iy_2 eT(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iy_2)this.AS.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends iy_2> Sr() {
        if (this.AS != null) {
            return this.AS.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.AM);
    }

    public ix_2 SL() {
        return (ix_2)this.SN().addBuilder((AbstractMessage)iv_2.Sb());
    }

    public ix_2 eX(int n) {
        return (ix_2)this.SN().addBuilder(n, (AbstractMessage)iv_2.Sb());
    }

    public List<ix_2> SM() {
        return this.SN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> SN() {
        if (this.AS == null) {
            this.AS = new RepeatedFieldBuilderV3(this.AM, (this.an & 8) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.AM = null;
        }
        return this.AS;
    }

    @Override
    public boolean St() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public jx_1 Su() {
        if (this.AT == null) {
            return this.AO == null ? jx_1.Wb() : this.AO;
        }
        return (jx_1)this.AT.getMessage();
    }

    public jb_1 a(jx_1 jx_12) {
        if (this.AT == null) {
            if (jx_12 == null) {
                throw new NullPointerException();
            }
            this.AO = jx_12;
            this.onChanged();
        } else {
            this.AT.setMessage((AbstractMessage)jx_12);
        }
        this.an |= 0x10;
        return this;
    }

    public jb_1 a(jz_1 jz_12) {
        if (this.AT == null) {
            this.AO = jz_12.Wf();
            this.onChanged();
        } else {
            this.AT.setMessage((AbstractMessage)jz_12.Wf());
        }
        this.an |= 0x10;
        return this;
    }

    public jb_1 b(jx_1 jx_12) {
        if (this.AT == null) {
            this.AO = (this.an & 0x10) != 0 && this.AO != null && this.AO != jx_1.Wb() ? jx_1.e(this.AO).g(jx_12).Wg() : jx_12;
            this.onChanged();
        } else {
            this.AT.mergeFrom((AbstractMessage)jx_12);
        }
        this.an |= 0x10;
        return this;
    }

    public jb_1 SO() {
        if (this.AT == null) {
            this.AO = null;
            this.onChanged();
        } else {
            this.AT.clear();
        }
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public jz_1 SP() {
        this.an |= 0x10;
        this.onChanged();
        return (jz_1)this.SQ().getBuilder();
    }

    @Override
    public ja_1 Sv() {
        if (this.AT != null) {
            return (ja_1)this.AT.getMessageOrBuilder();
        }
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    private SingleFieldBuilderV3<jx_1, jz_1, ja_1> SQ() {
        if (this.AT == null) {
            this.AT = new SingleFieldBuilderV3((AbstractMessage)this.Su(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.AO = null;
        }
        return this.AT;
    }

    @Override
    public boolean oO() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public jb_1 eY(int n) {
        this.an |= 0x20;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public jb_1 SR() {
        this.an &= 0xFFFFFFDF;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    public final jb_1 do(UnknownFieldSet unknownFieldSet) {
        return (jb_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jb_1 dp(UnknownFieldSet unknownFieldSet) {
        return (jb_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dp(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.do(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dp(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bh(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bh(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bh(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.do(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.SC();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.SF();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dp(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bh(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.SC();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bh(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.SF();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dp(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.do(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dp(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bh(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bh(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bh(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.do(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.SF();
    }

    public /* synthetic */ Message buildPartial() {
        return this.SE();
    }

    public /* synthetic */ Message build() {
        return this.SD();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bh(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.SC();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.SF();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.SE();
    }

    public /* synthetic */ MessageLite build() {
        return this.SD();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.SC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.SA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.SA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fx(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.SF();
    }

    public /* synthetic */ Object clone() {
        return this.SF();
    }
}

