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
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zs
 */
public final class zs_2
extends GeneratedMessageV3.Builder<zs_2>
implements zt_2 {
    private int an;
    private int anS;
    private List<zy_2> anU = Collections.emptyList();
    private RepeatedFieldBuilderV3<zy_2, za_2, zb_2> aob;
    private List<zy_2> anW = Collections.emptyList();
    private RepeatedFieldBuilderV3<zy_2, za_2, zb_2> aoc;
    private int anY;

    public static final Descriptors.Descriptor ayx() {
        return zp_2.anM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anN.ensureFieldAccessorsInitialized(zq_2.class, zs_2.class);
    }

    zs_2() {
        this.D();
    }

    zs_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zq_2.cs()) {
            this.ayH();
            this.ayM();
        }
    }

    public zs_2 ayy() {
        super.clear();
        this.anS = 0;
        this.an &= 0xFFFFFFFE;
        if (this.aob == null) {
            this.anU = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.aob.clear();
        }
        if (this.aoc == null) {
            this.anW = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.aoc.clear();
        }
        this.anY = 0;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zp_2.anM;
    }

    public zq_2 ayw() {
        return zq_2.ayv();
    }

    public zq_2 ayz() {
        zq_2 zq_22 = this.ayA();
        if (!zq_22.isInitialized()) {
            throw zs_2.newUninitializedMessageException((Message)zq_22);
        }
        return zq_22;
    }

    public zq_2 ayA() {
        zq_2 zq_22 = new zq_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zq_22.anS = this.anS;
            n2 |= 1;
        }
        if (this.aob == null) {
            if ((this.an & 2) != 0) {
                this.anU = Collections.unmodifiableList(this.anU);
                this.an &= 0xFFFFFFFD;
            }
            zq_22.anU = this.anU;
        } else {
            zq_22.anU = this.aob.build();
        }
        if (this.aoc == null) {
            if ((this.an & 4) != 0) {
                this.anW = Collections.unmodifiableList(this.anW);
                this.an &= 0xFFFFFFFB;
            }
            zq_22.anW = this.anW;
        } else {
            zq_22.anW = this.aoc.build();
        }
        if ((n & 8) != 0) {
            zq_22.anY = this.anY;
            n2 |= 2;
        }
        zq_22.an = n2;
        this.onBuilt();
        return zq_22;
    }

    public zs_2 ayB() {
        return (zs_2)super.clone();
    }

    public zs_2 fW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zs_2)super.setField(fieldDescriptor, object);
    }

    public zs_2 cy(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zs_2)super.clearField(fieldDescriptor);
    }

    public zs_2 cy(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zs_2)super.clearOneof(oneofDescriptor);
    }

    public zs_2 cy(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zs_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zs_2 fX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zs_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zs_2 cy(Message message) {
        if (message instanceof zq_2) {
            return this.c((zq_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zs_2 c(zq_2 zq_22) {
        if (zq_22 == zq_2.ayv()) {
            return this;
        }
        if (zq_22.ayi()) {
            this.ky(zq_22.ayj());
        }
        if (this.aob == null) {
            if (!zq_22.anU.isEmpty()) {
                if (this.anU.isEmpty()) {
                    this.anU = zq_22.anU;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.ayD();
                    this.anU.addAll(zq_22.anU);
                }
                this.onChanged();
            }
        } else if (!zq_22.anU.isEmpty()) {
            if (this.aob.isEmpty()) {
                this.aob.dispose();
                this.aob = null;
                this.anU = zq_22.anU;
                this.an &= 0xFFFFFFFD;
                this.aob = zq_2.ju() ? this.ayH() : null;
            } else {
                this.aob.addAllMessages(zq_22.anU);
            }
        }
        if (this.aoc == null) {
            if (!zq_22.anW.isEmpty()) {
                if (this.anW.isEmpty()) {
                    this.anW = zq_22.anW;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.ayI();
                    this.anW.addAll(zq_22.anW);
                }
                this.onChanged();
            }
        } else if (!zq_22.anW.isEmpty()) {
            if (this.aoc.isEmpty()) {
                this.aoc.dispose();
                this.aoc = null;
                this.anW = zq_22.anW;
                this.an &= 0xFFFFFFFB;
                this.aoc = zq_2.Y() ? this.ayM() : null;
            } else {
                this.aoc.addAllMessages(zq_22.anW);
            }
        }
        if (zq_22.ayq()) {
            this.kF(zq_22.ayr());
        }
        this.fX(zq_2.b(zq_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.ayi()) {
            return false;
        }
        if (!this.ayq()) {
            return false;
        }
        for (n = 0; n < this.aym(); ++n) {
            if (this.ku(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.ayp(); ++n) {
            if (this.kw(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zs_2 jw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zq_2 zq_22 = null;
        try {
            zq_22 = (zq_2)zq_2.aoa.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zq_22 = (zq_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zq_22 != null) {
                this.c(zq_22);
            }
        }
        return this;
    }

    @Override
    public boolean ayi() {
        return (this.an & 1) != 0;
    }

    @Override
    public int ayj() {
        return this.anS;
    }

    public zs_2 ky(int n) {
        this.an |= 1;
        this.anS = n;
        this.onChanged();
        return this;
    }

    public zs_2 ayC() {
        this.an &= 0xFFFFFFFE;
        this.anS = 0;
        this.onChanged();
        return this;
    }

    private void ayD() {
        if ((this.an & 2) == 0) {
            this.anU = new ArrayList<zy_2>(this.anU);
            this.an |= 2;
        }
    }

    @Override
    public List<zy_2> ayk() {
        if (this.aob == null) {
            return Collections.unmodifiableList(this.anU);
        }
        return this.aob.getMessageList();
    }

    @Override
    public int aym() {
        if (this.aob == null) {
            return this.anU.size();
        }
        return this.aob.getCount();
    }

    @Override
    public zy_2 ku(int n) {
        if (this.aob == null) {
            return this.anU.get(n);
        }
        return (zy_2)this.aob.getMessage(n);
    }

    public zs_2 a(int n, zy_2 zy_22) {
        if (this.aob == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayD();
            this.anU.set(n, zy_22);
            this.onChanged();
        } else {
            this.aob.setMessage(n, (AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 a(int n, za_2 za_22) {
        if (this.aob == null) {
            this.ayD();
            this.anU.set(n, za_22.azD());
            this.onChanged();
        } else {
            this.aob.setMessage(n, (AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 a(zy_2 zy_22) {
        if (this.aob == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayD();
            this.anU.add(zy_22);
            this.onChanged();
        } else {
            this.aob.addMessage((AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 b(int n, zy_2 zy_22) {
        if (this.aob == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayD();
            this.anU.add(n, zy_22);
            this.onChanged();
        } else {
            this.aob.addMessage(n, (AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 a(za_2 za_22) {
        if (this.aob == null) {
            this.ayD();
            this.anU.add(za_22.azD());
            this.onChanged();
        } else {
            this.aob.addMessage((AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 b(int n, za_2 za_22) {
        if (this.aob == null) {
            this.ayD();
            this.anU.add(n, za_22.azD());
            this.onChanged();
        } else {
            this.aob.addMessage(n, (AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 as(Iterable<? extends zy_2> iterable) {
        if (this.aob == null) {
            this.ayD();
            AbstractMessageLite.Builder.addAll(iterable, this.anU);
            this.onChanged();
        } else {
            this.aob.addAllMessages(iterable);
        }
        return this;
    }

    public zs_2 ayE() {
        if (this.aob == null) {
            this.anU = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.aob.clear();
        }
        return this;
    }

    public zs_2 kz(int n) {
        if (this.aob == null) {
            this.ayD();
            this.anU.remove(n);
            this.onChanged();
        } else {
            this.aob.remove(n);
        }
        return this;
    }

    public za_2 kA(int n) {
        return (za_2)this.ayH().getBuilder(n);
    }

    @Override
    public zb_2 kv(int n) {
        if (this.aob == null) {
            return this.anU.get(n);
        }
        return (zb_2)this.aob.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zb_2> ayl() {
        if (this.aob != null) {
            return this.aob.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.anU);
    }

    public za_2 ayF() {
        return (za_2)this.ayH().addBuilder((AbstractMessage)zy_2.azz());
    }

    public za_2 kB(int n) {
        return (za_2)this.ayH().addBuilder(n, (AbstractMessage)zy_2.azz());
    }

    public List<za_2> ayG() {
        return this.ayH().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zy_2, za_2, zb_2> ayH() {
        if (this.aob == null) {
            this.aob = new RepeatedFieldBuilderV3(this.anU, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.anU = null;
        }
        return this.aob;
    }

    private void ayI() {
        if ((this.an & 4) == 0) {
            this.anW = new ArrayList<zy_2>(this.anW);
            this.an |= 4;
        }
    }

    @Override
    public List<zy_2> ayn() {
        if (this.aoc == null) {
            return Collections.unmodifiableList(this.anW);
        }
        return this.aoc.getMessageList();
    }

    @Override
    public int ayp() {
        if (this.aoc == null) {
            return this.anW.size();
        }
        return this.aoc.getCount();
    }

    @Override
    public zy_2 kw(int n) {
        if (this.aoc == null) {
            return this.anW.get(n);
        }
        return (zy_2)this.aoc.getMessage(n);
    }

    public zs_2 c(int n, zy_2 zy_22) {
        if (this.aoc == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayI();
            this.anW.set(n, zy_22);
            this.onChanged();
        } else {
            this.aoc.setMessage(n, (AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 c(int n, za_2 za_22) {
        if (this.aoc == null) {
            this.ayI();
            this.anW.set(n, za_22.azD());
            this.onChanged();
        } else {
            this.aoc.setMessage(n, (AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 b(zy_2 zy_22) {
        if (this.aoc == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayI();
            this.anW.add(zy_22);
            this.onChanged();
        } else {
            this.aoc.addMessage((AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 d(int n, zy_2 zy_22) {
        if (this.aoc == null) {
            if (zy_22 == null) {
                throw new NullPointerException();
            }
            this.ayI();
            this.anW.add(n, zy_22);
            this.onChanged();
        } else {
            this.aoc.addMessage(n, (AbstractMessage)zy_22);
        }
        return this;
    }

    public zs_2 b(za_2 za_22) {
        if (this.aoc == null) {
            this.ayI();
            this.anW.add(za_22.azD());
            this.onChanged();
        } else {
            this.aoc.addMessage((AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 d(int n, za_2 za_22) {
        if (this.aoc == null) {
            this.ayI();
            this.anW.add(n, za_22.azD());
            this.onChanged();
        } else {
            this.aoc.addMessage(n, (AbstractMessage)za_22.azD());
        }
        return this;
    }

    public zs_2 at(Iterable<? extends zy_2> iterable) {
        if (this.aoc == null) {
            this.ayI();
            AbstractMessageLite.Builder.addAll(iterable, this.anW);
            this.onChanged();
        } else {
            this.aoc.addAllMessages(iterable);
        }
        return this;
    }

    public zs_2 ayJ() {
        if (this.aoc == null) {
            this.anW = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.aoc.clear();
        }
        return this;
    }

    public zs_2 kC(int n) {
        if (this.aoc == null) {
            this.ayI();
            this.anW.remove(n);
            this.onChanged();
        } else {
            this.aoc.remove(n);
        }
        return this;
    }

    public za_2 kD(int n) {
        return (za_2)this.ayM().getBuilder(n);
    }

    @Override
    public zb_2 kx(int n) {
        if (this.aoc == null) {
            return this.anW.get(n);
        }
        return (zb_2)this.aoc.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zb_2> ayo() {
        if (this.aoc != null) {
            return this.aoc.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.anW);
    }

    public za_2 ayK() {
        return (za_2)this.ayM().addBuilder((AbstractMessage)zy_2.azz());
    }

    public za_2 kE(int n) {
        return (za_2)this.ayM().addBuilder(n, (AbstractMessage)zy_2.azz());
    }

    public List<za_2> ayL() {
        return this.ayM().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zy_2, za_2, zb_2> ayM() {
        if (this.aoc == null) {
            this.aoc = new RepeatedFieldBuilderV3(this.anW, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.anW = null;
        }
        return this.aoc;
    }

    @Override
    public boolean ayq() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ayr() {
        return this.anY;
    }

    public zs_2 kF(int n) {
        this.an |= 8;
        this.anY = n;
        this.onChanged();
        return this;
    }

    public zs_2 ayN() {
        this.an &= 0xFFFFFFF7;
        this.anY = 0;
        this.onChanged();
        return this;
    }

    public final zs_2 fW(UnknownFieldSet unknownFieldSet) {
        return (zs_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zs_2 fX(UnknownFieldSet unknownFieldSet) {
        return (zs_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cy(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cy(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cy(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ayy();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ayB();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cy(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ayy();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cy(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ayB();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cy(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cy(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cy(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ayB();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ayA();
    }

    public /* synthetic */ Message build() {
        return this.ayz();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cy(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ayy();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ayB();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ayA();
    }

    public /* synthetic */ MessageLite build() {
        return this.ayz();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ayy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ayw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ayw();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ayB();
    }

    public /* synthetic */ Object clone() {
        return this.ayB();
    }
}

