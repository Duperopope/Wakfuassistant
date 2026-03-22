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
 *  com.google.protobuf.Internal$LongList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class kI
extends GeneratedMessageV3.Builder<kI>
implements kN {
    private int an;
    private long wX;
    private int Gx;
    private int ws;
    private int GA;
    private List<kJ> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<kJ, kL, kM> jm;
    private Internal.LongList GD = kG.acF();
    private int GF;

    public static final Descriptors.Descriptor acH() {
        return kF.Gk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gl.ensureFieldAccessorsInitialized(kG.class, kI.class);
    }

    kI() {
        this.D();
    }

    kI(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kG.nU()) {
            this.oL();
        }
    }

    public kI acI() {
        super.clear();
        this.wX = 0L;
        this.an &= 0xFFFFFFFE;
        this.Gx = 0;
        this.an &= 0xFFFFFFFD;
        this.ws = 0;
        this.an &= 0xFFFFFFFB;
        this.GA = 0;
        this.an &= 0xFFFFFFF7;
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFEF;
        } else {
            this.jm.clear();
        }
        this.GD = kG.acE();
        this.an &= 0xFFFFFFDF;
        this.GF = 0;
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gk;
    }

    public kG acD() {
        return kG.acC();
    }

    public kG acJ() {
        kG kG2 = this.acK();
        if (!kG2.isInitialized()) {
            throw kI.newUninitializedMessageException((Message)kG2);
        }
        return kG2;
    }

    public kG acK() {
        kG kG2 = new kG(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kG2.wX = this.wX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kG2.Gx = this.Gx;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            kG2.ws = this.ws;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            kG2.GA = this.GA;
            n2 |= 8;
        }
        if (this.jm == null) {
            if ((this.an & 0x10) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFEF;
            }
            kG2.jj = this.jj;
        } else {
            kG2.jj = this.jm.build();
        }
        if ((this.an & 0x20) != 0) {
            this.GD.makeImmutable();
            this.an &= 0xFFFFFFDF;
        }
        kG2.GD = this.GD;
        if ((n & 0x40) != 0) {
            kG2.GF = this.GF;
            n2 |= 0x10;
        }
        kG2.an = n2;
        this.onBuilt();
        return kG2;
    }

    public kI acL() {
        return (kI)super.clone();
    }

    public kI ec(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kI)super.setField(fieldDescriptor, object);
    }

    public kI bB(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kI)super.clearField(fieldDescriptor);
    }

    public kI bB(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kI)super.clearOneof(oneofDescriptor);
    }

    public kI bB(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kI)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kI ed(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kI)super.addRepeatedField(fieldDescriptor, object);
    }

    public kI bB(Message message) {
        if (message instanceof kG) {
            return this.c((kG)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kI c(kG kG2) {
        if (kG2 == kG.acC()) {
            return this;
        }
        if (kG2.LU()) {
            this.aU(kG2.LV());
        }
        if (kG2.acr()) {
            this.gM(kG2.acs());
        }
        if (kG2.Ly()) {
            this.gN(kG2.Lz());
        }
        if (kG2.act()) {
            this.gO(kG2.acu());
        }
        if (this.jm == null) {
            if (!kG2.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = kG2.jj;
                    this.an &= 0xFFFFFFEF;
                } else {
                    this.oH();
                    this.jj.addAll(kG2.jj);
                }
                this.onChanged();
            }
        } else if (!kG2.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = kG2.jj;
                this.an &= 0xFFFFFFEF;
                this.jm = kG.ok() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(kG2.jj);
            }
        }
        if (!kG2.GD.isEmpty()) {
            if (this.GD.isEmpty()) {
                this.GD = kG2.GD;
                this.an &= 0xFFFFFFDF;
            } else {
                this.acR();
                this.GD.addAll((Collection)kG2.GD);
            }
            this.onChanged();
        }
        if (kG2.acx()) {
            this.gQ(kG2.acy());
        }
        this.ed(kG.b(kG2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.LU()) {
            return false;
        }
        if (!this.acr()) {
            return false;
        }
        if (!this.Ly()) {
            return false;
        }
        if (!this.act()) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.gk(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public kI gF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kG kG2 = null;
        try {
            kG2 = (kG)kG.GH.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kG2 = (kG)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kG2 != null) {
                this.c(kG2);
            }
        }
        return this;
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    public kI aU(long l) {
        this.an |= 1;
        this.wX = l;
        this.onChanged();
        return this;
    }

    public kI acM() {
        this.an &= 0xFFFFFFFE;
        this.wX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public kI gM(int n) {
        this.an |= 2;
        this.Gx = n;
        this.onChanged();
        return this;
    }

    public kI acN() {
        this.an &= 0xFFFFFFFD;
        this.Gx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ly() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public kI gN(int n) {
        this.an |= 4;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public kI acO() {
        this.an &= 0xFFFFFFFB;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean act() {
        return (this.an & 8) != 0;
    }

    @Override
    public int acu() {
        return this.GA;
    }

    public kI gO(int n) {
        this.an |= 8;
        this.GA = n;
        this.onChanged();
        return this;
    }

    public kI acP() {
        this.an &= 0xFFFFFFF7;
        this.GA = 0;
        this.onChanged();
        return this;
    }

    private void oH() {
        if ((this.an & 0x10) == 0) {
            this.jj = new ArrayList<kJ>(this.jj);
            this.an |= 0x10;
        }
    }

    @Override
    public List<kJ> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public kJ gk(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kJ)this.jm.getMessage(n);
    }

    public kI c(int n, kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, kJ2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kJ2);
        }
        return this;
    }

    public kI c(int n, kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, kL2.adc());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kL2.adc());
        }
        return this;
    }

    public kI b(kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(kJ2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kJ2);
        }
        return this;
    }

    public kI d(int n, kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, kJ2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kJ2);
        }
        return this;
    }

    public kI b(kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(kL2.adc());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kL2.adc());
        }
        return this;
    }

    public kI d(int n, kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, kL2.adc());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kL2.adc());
        }
        return this;
    }

    public kI V(Iterable<? extends kJ> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public kI acQ() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public kI gP(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public kL go(int n) {
        return (kL)this.oL().getBuilder(n);
    }

    @Override
    public kM gl(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kM)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kM> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public kL ZQ() {
        return (kL)this.oL().addBuilder((AbstractMessage)kJ.acY());
    }

    public kL gp(int n) {
        return (kL)this.oL().addBuilder(n, (AbstractMessage)kJ.acY());
    }

    public List<kL> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kJ, kL, kM> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    private void acR() {
        if ((this.an & 0x20) == 0) {
            this.GD = kG.b(this.GD);
            this.an |= 0x20;
        }
    }

    @Override
    public List<Long> acv() {
        return (this.an & 0x20) != 0 ? Collections.unmodifiableList(this.GD) : this.GD;
    }

    @Override
    public int acw() {
        return this.GD.size();
    }

    @Override
    public long gL(int n) {
        return this.GD.getLong(n);
    }

    public kI b(int n, long l) {
        this.acR();
        this.GD.setLong(n, l);
        this.onChanged();
        return this;
    }

    public kI aV(long l) {
        this.acR();
        this.GD.addLong(l);
        this.onChanged();
        return this;
    }

    public kI W(Iterable<? extends Long> iterable) {
        this.acR();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.GD);
        this.onChanged();
        return this;
    }

    public kI acS() {
        this.GD = kG.acG();
        this.an &= 0xFFFFFFDF;
        this.onChanged();
        return this;
    }

    @Override
    public boolean acx() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int acy() {
        return this.GF;
    }

    public kI gQ(int n) {
        this.an |= 0x40;
        this.GF = n;
        this.onChanged();
        return this;
    }

    public kI acT() {
        this.an &= 0xFFFFFFBF;
        this.GF = 0;
        this.onChanged();
        return this;
    }

    public final kI ec(UnknownFieldSet unknownFieldSet) {
        return (kI)super.setUnknownFields(unknownFieldSet);
    }

    public final kI ed(UnknownFieldSet unknownFieldSet) {
        return (kI)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ed(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ec(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ed(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bB(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bB(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bB(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ec(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.acI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.acL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ed(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bB(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.acI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bB(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.acL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ed(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ec(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ed(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bB(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bB(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bB(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ec(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.acL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.acK();
    }

    public /* synthetic */ Message build() {
        return this.acJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bB(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.acI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.acL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.acK();
    }

    public /* synthetic */ MessageLite build() {
        return this.acJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.acI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acD();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.acL();
    }

    public /* synthetic */ Object clone() {
        return this.acL();
    }
}

